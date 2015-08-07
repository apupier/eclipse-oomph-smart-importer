/**
 */
package org.eclipse.oomph.smart.importer;

import org.eclipse.oomph.setup.SetupPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.oomph.smart.importer.SmartImporterFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore schemaLocation='https://raw.githubusercontent.com/apupier/eclipse-oomph-smart-importer/master/org.eclipse.oomph.smart.importer/model/Importer-1.0.ecore'"
 * @generated
 */
public interface SmartImporterPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "importer";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/oomph/smart/importer/1.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "importer";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SmartImporterPackage eINSTANCE = org.eclipse.oomph.smart.importer.impl.SmartImporterPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.oomph.smart.importer.impl.SmartImporterTaskImpl <em>Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.oomph.smart.importer.impl.SmartImporterTaskImpl
   * @see org.eclipse.oomph.smart.importer.impl.SmartImporterPackageImpl#getSmartImporterTask()
   * @generated
   */
  int SMART_IMPORTER_TASK = 0;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMART_IMPORTER_TASK__ANNOTATIONS = SetupPackage.SETUP_TASK__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMART_IMPORTER_TASK__ID = SetupPackage.SETUP_TASK__ID;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMART_IMPORTER_TASK__DESCRIPTION = SetupPackage.SETUP_TASK__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Scope Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMART_IMPORTER_TASK__SCOPE_TYPE = SetupPackage.SETUP_TASK__SCOPE_TYPE;

  /**
   * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMART_IMPORTER_TASK__EXCLUDED_TRIGGERS = SetupPackage.SETUP_TASK__EXCLUDED_TRIGGERS;

  /**
   * The feature id for the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMART_IMPORTER_TASK__DISABLED = SetupPackage.SETUP_TASK__DISABLED;

  /**
   * The feature id for the '<em><b>Predecessors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMART_IMPORTER_TASK__PREDECESSORS = SetupPackage.SETUP_TASK__PREDECESSORS;

  /**
   * The feature id for the '<em><b>Successors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMART_IMPORTER_TASK__SUCCESSORS = SetupPackage.SETUP_TASK__SUCCESSORS;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMART_IMPORTER_TASK__RESTRICTIONS = SetupPackage.SETUP_TASK__RESTRICTIONS;

  /**
   * The feature id for the '<em><b>Source Locators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMART_IMPORTER_TASK__SOURCE_LOCATORS = SetupPackage.SETUP_TASK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMART_IMPORTER_TASK_FEATURE_COUNT = SetupPackage.SETUP_TASK_FEATURE_COUNT + 1;

  /**
   * Returns the meta object for class '{@link org.eclipse.oomph.smart.importer.SmartImporterTask <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task</em>'.
   * @see org.eclipse.oomph.smart.importer.SmartImporterTask
   * @generated
   */
  EClass getSmartImporterTask();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.oomph.smart.importer.SmartImporterTask#getSourceLocators <em>Source Locators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Source Locators</em>'.
   * @see org.eclipse.oomph.smart.importer.SmartImporterTask#getSourceLocators()
   * @see #getSmartImporterTask()
   * @generated
   */
  EReference getSmartImporterTask_SourceLocators();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SmartImporterFactory getSmartImporterFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.oomph.smart.importer.impl.SmartImporterTaskImpl <em>Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.oomph.smart.importer.impl.SmartImporterTaskImpl
     * @see org.eclipse.oomph.smart.importer.impl.SmartImporterPackageImpl#getSmartImporterTask()
     * @generated
     */
    EClass SMART_IMPORTER_TASK = eINSTANCE.getSmartImporterTask();

    /**
     * The meta object literal for the '<em><b>Source Locators</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMART_IMPORTER_TASK__SOURCE_LOCATORS = eINSTANCE.getSmartImporterTask_SourceLocators();

  }

} // SmartImporterPackage
