/**
 */
package org.eclipse.oomph.smart.importer.importer.impl;

import org.eclipse.oomph.resources.SourceLocator;
import org.eclipse.oomph.setup.SetupTaskContext;
import org.eclipse.oomph.setup.impl.SetupTaskImpl;
import org.eclipse.oomph.smart.importer.importer.ImporterPackage;
import org.eclipse.oomph.smart.importer.importer.SmartImporterTask;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.IWorkingSet;
import org.eclipse.ui.internal.wizards.datatransfer.EasymportJob;

import java.io.File;
import java.util.Collection;
import java.util.Collections;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Smart Importer Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.oomph.smart.importer.importer.impl.SmartImporterTaskImpl#getSourceLocators <em>Source Locators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SmartImporterTaskImpl extends SetupTaskImpl implements SmartImporterTask
{
  /**
   * The cached value of the '{@link #getSourceLocators() <em>Source Locators</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceLocators()
   * @generated
   * @ordered
   */
  protected EList<SourceLocator> sourceLocators;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SmartImporterTaskImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ImporterPackage.Literals.SMART_IMPORTER_TASK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SourceLocator> getSourceLocators()
  {
    if (sourceLocators == null)
    {
      sourceLocators = new EObjectContainmentEList<SourceLocator>(SourceLocator.class, this, ImporterPackage.SMART_IMPORTER_TASK__SOURCE_LOCATORS);
    }
    return sourceLocators;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ImporterPackage.SMART_IMPORTER_TASK__SOURCE_LOCATORS:
        return ((InternalEList<?>)getSourceLocators()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ImporterPackage.SMART_IMPORTER_TASK__SOURCE_LOCATORS:
        return getSourceLocators();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ImporterPackage.SMART_IMPORTER_TASK__SOURCE_LOCATORS:
        getSourceLocators().clear();
        getSourceLocators().addAll((Collection<? extends SourceLocator>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ImporterPackage.SMART_IMPORTER_TASK__SOURCE_LOCATORS:
        getSourceLocators().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ImporterPackage.SMART_IMPORTER_TASK__SOURCE_LOCATORS:
        return sourceLocators != null && !sourceLocators.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /*
   * (non-Javadoc)
   * @see org.eclipse.oomph.setup.SetupTask#isNeeded(org.eclipse.oomph.setup.SetupTaskContext)
   */
  public boolean isNeeded(SetupTaskContext context) throws Exception
  {
    return true;
  }

  /*
   * (non-Javadoc)
   * @see org.eclipse.oomph.setup.SetupTask#perform(org.eclipse.oomph.setup.SetupTaskContext)
   */
  public void perform(SetupTaskContext context) throws Exception
  {
    System.out.println("Starting smart import...");
    EList<SourceLocator> sourceLocators = getSourceLocators();
    int size = sourceLocators.size();

    IProgressMonitor monitor = context.getProgressMonitor(true);
    monitor.beginTask("", 2 * size);

    for (SourceLocator sourceLocator : sourceLocators)
    {
      System.out.println("Smart import of folder: " + sourceLocator.getRootFolder());
      new EasymportJob(new File(sourceLocator.getRootFolder()), Collections.<IWorkingSet> emptySet(), true, true).schedule();
    }

  }

} // SmartImporterTaskImpl
