/**
 */
package org.eclipse.oomph.smart.importer.importer.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.oomph.smart.importer.importer.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImporterFactoryImpl extends EFactoryImpl implements ImporterFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ImporterFactory init()
  {
    try
    {
      ImporterFactory theImporterFactory = (ImporterFactory)EPackage.Registry.INSTANCE.getEFactory(ImporterPackage.eNS_URI);
      if (theImporterFactory != null)
      {
        return theImporterFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ImporterFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImporterFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ImporterPackage.SMART_IMPORTER_TASK: return createSmartImporterTask();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmartImporterTask createSmartImporterTask()
  {
    SmartImporterTaskImpl smartImporterTask = new SmartImporterTaskImpl();
    return smartImporterTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImporterPackage getImporterPackage()
  {
    return (ImporterPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ImporterPackage getPackage()
  {
    return ImporterPackage.eINSTANCE;
  }

} //ImporterFactoryImpl
