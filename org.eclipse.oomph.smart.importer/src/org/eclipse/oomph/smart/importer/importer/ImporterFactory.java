/**
 */
package org.eclipse.oomph.smart.importer.importer;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.oomph.smart.importer.importer.ImporterPackage
 * @generated
 */
public interface ImporterFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ImporterFactory eINSTANCE = org.eclipse.oomph.smart.importer.importer.impl.ImporterFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Smart Importer Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Smart Importer Task</em>'.
   * @generated
   */
  SmartImporterTask createSmartImporterTask();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ImporterPackage getImporterPackage();

} //ImporterFactory
