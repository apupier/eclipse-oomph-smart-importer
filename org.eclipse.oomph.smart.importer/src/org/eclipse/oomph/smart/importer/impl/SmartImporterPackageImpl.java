/**
 */
package org.eclipse.oomph.smart.importer.impl;

import org.eclipse.oomph.resources.ResourcesPackage;
import org.eclipse.oomph.setup.SetupPackage;
import org.eclipse.oomph.smart.importer.SmartImporterFactory;
import org.eclipse.oomph.smart.importer.SmartImporterPackage;
import org.eclipse.oomph.smart.importer.SmartImporterTask;
import org.eclipse.oomph.targlets.TargletPackage;
import org.eclipse.oomph.workingsets.WorkingSetsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmartImporterPackageImpl extends EPackageImpl implements SmartImporterPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smartImporterTaskEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipse.oomph.smart.importer.SmartImporterPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SmartImporterPackageImpl()
  {
    super(eNS_URI, SmartImporterFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link SmartImporterPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SmartImporterPackage init()
  {
    if (isInited)
    {
      return (SmartImporterPackage)EPackage.Registry.INSTANCE.getEPackage(SmartImporterPackage.eNS_URI);
    }

    // Obtain or create and register package
    SmartImporterPackageImpl theSmartImporterPackage = (SmartImporterPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SmartImporterPackageImpl
        ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SmartImporterPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    SetupPackage.eINSTANCE.eClass();
    TargletPackage.eINSTANCE.eClass();
    WorkingSetsPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theSmartImporterPackage.createPackageContents();

    // Initialize created meta-data
    theSmartImporterPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSmartImporterPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SmartImporterPackage.eNS_URI, theSmartImporterPackage);
    return theSmartImporterPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSmartImporterTask()
  {
    return smartImporterTaskEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSmartImporterTask_SourceLocators()
  {
    return (EReference)smartImporterTaskEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmartImporterFactory getSmartImporterFactory()
  {
    return (SmartImporterFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated)
    {
      return;
    }
    isCreated = true;

    // Create classes and their features
    smartImporterTaskEClass = createEClass(SMART_IMPORTER_TASK);
    createEReference(smartImporterTaskEClass, SMART_IMPORTER_TASK__SOURCE_LOCATORS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized)
    {
      return;
    }
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    SetupPackage theSetupPackage = (SetupPackage)EPackage.Registry.INSTANCE.getEPackage(SetupPackage.eNS_URI);
    ResourcesPackage theResourcesPackage = (ResourcesPackage)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    smartImporterTaskEClass.getESuperTypes().add(theSetupPackage.getSetupTask());

    // Initialize classes and features; add operations and parameters
    initEClass(smartImporterTaskEClass, SmartImporterTask.class, "SmartImporterTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSmartImporterTask_SourceLocators(), theResourcesPackage.getSourceLocator(), null, "sourceLocators", null, 1, -1, SmartImporterTask.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource("http://www.eclipse.org/oomph/smart/importer/schemas/Importer-1.0.ecore");

    // Create annotations
    // http://www.eclipse.org/emf/2002/Ecore
    createEcoreAnnotations();
    // http://www.eclipse.org/oomph/setup/Enablement
    createEnablementAnnotations();
    // http://www.eclipse.org/oomph/setup/ValidTriggers
    createValidTriggersAnnotations();
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEcoreAnnotations()
  {
    String source = "http://www.eclipse.org/emf/2002/Ecore";
    addAnnotation(this, source, new String[] { "schemaLocation", "http://www.eclipse.org/oomph/smart/importer/schemas/Importer-1.0.ecore" });
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/oomph/setup/Enablement</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEnablementAnnotations()
  {
    String source = "http://www.eclipse.org/oomph/setup/Enablement";
    addAnnotation(smartImporterTaskEClass, source, new String[] { "variableName", "p2.smart.importer", "repository",
        "http://download.eclipse.org/oomph/smart/importer/updates", "installableUnits", "org.eclipse.oomph.smart.importer.feature.group" });
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/oomph/setup/ValidTriggers</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createValidTriggersAnnotations()
  {
    String source = "http://www.eclipse.org/oomph/setup/ValidTriggers";
    addAnnotation(smartImporterTaskEClass, source, new String[] { "triggers", "STARTUP MANUAL" });
  }

} // SmartImporterPackageImpl
