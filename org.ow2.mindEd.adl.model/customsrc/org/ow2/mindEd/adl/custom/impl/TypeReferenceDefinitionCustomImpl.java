package org.ow2.mindEd.adl.custom.impl;

import org.ow2.mindEd.adl.impl.TypeReferenceDefinitionImpl;

/**
 * <b>Class</b> <i>TypeReferenceDefinitionCustomImpl</i>
 * <p>
 * This class extends generated class TypeReferenceDefinitionImpl to provides custom functions.
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.ow2.mindEd.adl.custom.impl.TypeReferenceDefinitionCustomImpl#getNameFQN <em>getNameFQN</em>}</li>
 * <li>{@link org.ow2.mindEd.adl.custom.impl.TypeReferenceDefinitionCustomImpl#setReferenceName <em>setReferenceName</em>}</li>
 * <li>{@link org.ow2.mindEd.adl.custom.impl.TypeReferenceDefinitionCustomImpl#getHelper <em>getHelper</em>}</li>
 * </ul>
 * </p>
 * 
 * @author proustr
 * @model kind="custom implementation"
 * @extends TypeReferenceDefinitionImpl
 */
public class TypeReferenceDefinitionCustomImpl extends TypeReferenceDefinitionImpl {

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.ComponentReferenceImpl#getNameFQN()
	 */
	@Override
	public String getNameFQN() {
		if (nameFQN == null || !nameFQN.contains(".")) {
			nameFQN = getHelper().getNameFQN();
		}
		return super.getNameFQN();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.ComponentReferenceImpl#setReferenceName(java.lang.String)
	 */
	@Override
	public void setReferenceName(String newReferenceName) {
		boolean changed = false;
		if (newReferenceName != null && !newReferenceName.equals(referenceName)) {
			changed = true;
		}
		super.setReferenceName(newReferenceName);
		if (changed) {
			nameFQN = getHelper().getNameFQN();
		}
	}


}
