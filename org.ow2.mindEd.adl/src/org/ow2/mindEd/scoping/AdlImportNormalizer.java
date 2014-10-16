package org.ow2.mindEd.scoping;

import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;

/**
 * Our own ImportNormalizer that rejects relative sub-packages names for sub-components.
 * For example, if we have the following components in a project:<br>
 * - pkg.Composite<br>
 * - pkg.Primitive1<br>
 * - pkg.subpkg.Primitive2<br>
 * <br>
 * In pkg.Composite, we want to tolerate only:<br>
 * "contains pkg.Primitive1 as someInstanceName;"<br>
 * or<br>
 * "contains pkg.subpkg.Primitive2 as someInstanceName;"<br>
 * but NEVER:<br>
 * "contains subpkg.Primitive2"<br>
 * <br>
 * However, the basic {@link ImportNormalizer} resolve and deresolve methods allow such naming.
 * That's what we fix with our class.
 */
public class AdlImportNormalizer extends ImportNormalizer {

	public AdlImportNormalizer(QualifiedName importedNamespace,
			boolean wildCard, boolean ignoreCase) {
		super(importedNamespace, wildCard, ignoreCase);
	}

	/**
	 * Our resolve version only allows immediate segments (relativeName.getSegmentCount() == 1), and forbids relative sub-packages.
	 */
	@Override
	public QualifiedName resolve(QualifiedName relativeName) {
		if (relativeName.isEmpty())
			return null;
		// Our modification
		if (hasWildCard() && relativeName.getSegmentCount() == 1) {
			return getImportedNamespacePrefix().append(relativeName);
		} else {
			if (!isIgnoreCase()) {
				if (relativeName.getSegmentCount()==1 && relativeName.getLastSegment().equals(getImportedNamespacePrefix().getLastSegment())) {
					return getImportedNamespacePrefix();
				}
			} else {
				if (relativeName.getSegmentCount()==1 && relativeName.getLastSegment().equalsIgnoreCase(getImportedNamespacePrefix().getLastSegment())) {
					return getImportedNamespacePrefix().skipLast(1).append(relativeName.getLastSegment());
				}
			}
		}
		return null;
	}
	
	/**
	 * Deresolve only names compatible with our convention.
	 * {@link ImportNormalizer#deresolve(QualifiedName)} to see the difference: We like local (1 segment) or absolute.
	 */
	@Override
	public QualifiedName deresolve(QualifiedName fullyQualifiedName) {
		if (hasWildCard()) {
			if (!isIgnoreCase()) {
				if (fullyQualifiedName.startsWith(getImportedNamespacePrefix())) {
					if (fullyQualifiedName.getSegmentCount() == getImportedNamespacePrefix().getSegmentCount() + 1)
						return QualifiedName.create(fullyQualifiedName.getLastSegment());
					else
						return fullyQualifiedName;
				}
			} else {
				if (fullyQualifiedName.startsWithIgnoreCase(getImportedNamespacePrefix())) {
					if (fullyQualifiedName.getSegmentCount() == getImportedNamespacePrefix().getSegmentCount() + 1)
						return QualifiedName.create(fullyQualifiedName.getLastSegment());
					else
						return fullyQualifiedName;
				}
			}
		} else {
			if (!isIgnoreCase()) {
				if (fullyQualifiedName.equals(getImportedNamespacePrefix()))
					return QualifiedName.create(fullyQualifiedName.getLastSegment());
			} else {
				if (fullyQualifiedName.equalsIgnoreCase(getImportedNamespacePrefix()))
					return QualifiedName.create(fullyQualifiedName.getLastSegment());
			}
		}
		return null;
	}

	

}
