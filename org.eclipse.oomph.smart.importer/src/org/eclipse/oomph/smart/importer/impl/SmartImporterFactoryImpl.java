/**
 */
package org.eclipse.oomph.smart.importer.impl;

import org.eclipse.oomph.smart.importer.SmartImporterFactory;
import org.eclipse.oomph.smart.importer.SmartImporterPackage;
import org.eclipse.oomph.smart.importer.SmartImporterTask;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmartImporterFactoryImpl extends EFactoryImpl implements SmartImporterFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SmartImporterFactory init()
  {
    try
    {
      SmartImporterFactory theSmartImporterFactory = (SmartImporterFactory)EPackage.Registry.INSTANCE.getEFactory(SmartImporterPackage.eNS_URI);
      if (theSmartImporterFactory != null)
      {
        return theSmartImporterFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SmartImporterFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmartImporterFactoryImpl()
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
    case SmartImporterPackage.SMART_IMPORTER_TASK:
      return createSmartImporterTask();
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
  public SmartImporterPackage getSmartImporterPackage()
  {
    return (SmartImporterPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SmartImporterPackage getPackage()
  {
    return SmartImporterPackage.eINSTANCE;
  }

} // SmartImporterFactoryImpl
