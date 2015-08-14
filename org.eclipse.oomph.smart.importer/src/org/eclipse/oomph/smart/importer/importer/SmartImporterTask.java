/**
 */
package org.eclipse.oomph.smart.importer.importer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.oomph.resources.SourceLocator;

import org.eclipse.oomph.setup.SetupTask;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Smart Importer Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.oomph.smart.importer.importer.SmartImporterTask#getSourceLocators <em>Source Locators</em>}</li>
 * </ul>
 *
 * @see org.eclipse.oomph.smart.importer.importer.ImporterPackage#getSmartImporterTask()
 * @model annotation="http://www.eclipse.org/oomph/setup/ValidTriggers triggers='STARTUP MANUAL'"
 * @generated
 */
public interface SmartImporterTask extends SetupTask
{
  /**
   * Returns the value of the '<em><b>Source Locators</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.oomph.resources.SourceLocator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Locators</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Locators</em>' containment reference list.
   * @see org.eclipse.oomph.smart.importer.importer.ImporterPackage#getSmartImporterTask_SourceLocators()
   * @model containment="true" required="true"
   *        annotation="http://org/eclipse/emf/ecore/util/ExtendedMetaData name='sourceLocator'"
   * @generated
   */
  EList<SourceLocator> getSourceLocators();

} // SmartImporterTask
