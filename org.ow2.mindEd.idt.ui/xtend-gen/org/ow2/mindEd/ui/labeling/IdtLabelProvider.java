/**
 * generated by Xtext
 */
package org.ow2.mindEd.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
@SuppressWarnings("all")
public class IdtLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public IdtLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
}
