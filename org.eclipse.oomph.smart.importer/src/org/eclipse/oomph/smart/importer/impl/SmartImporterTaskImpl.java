/*
 * Copyright (c) 2014 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Eike Stepper - initial API and implementation
 */
package org.eclipse.oomph.smart.importer.impl;

import org.eclipse.oomph.resources.SourceLocator;
import org.eclipse.oomph.setup.SetupTaskContext;
import org.eclipse.oomph.setup.impl.SetupTaskImpl;
import org.eclipse.oomph.smart.importer.SmartImporterPackage;
import org.eclipse.oomph.smart.importer.SmartImporterTask;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

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
 *   <li>{@link org.eclipse.oomph.smart.importer.impl.SmartImporterTaskImpl#getSourceLocators <em>Source Locators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SmartImporterTaskImpl extends SetupTaskImpl implements SmartImporterTask
{
  /**
   * The cached value of the '{@link #getSourceLocators() <em>Source Locators</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceLocators()
   * @generated
   * @ordered
   */
  protected EList<SourceLocator> sourceLocators;

  private static final int PRIORITY = PRIORITY_DEFAULT;

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
    return SmartImporterPackage.Literals.SMART_IMPORTER_TASK;
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
      sourceLocators = new EObjectResolvingEList<SourceLocator>(SourceLocator.class, this, SmartImporterPackage.SMART_IMPORTER_TASK__SOURCE_LOCATORS);
    }
    return sourceLocators;
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
    case SmartImporterPackage.SMART_IMPORTER_TASK__SOURCE_LOCATORS:
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
    case SmartImporterPackage.SMART_IMPORTER_TASK__SOURCE_LOCATORS:
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
    case SmartImporterPackage.SMART_IMPORTER_TASK__SOURCE_LOCATORS:
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
    case SmartImporterPackage.SMART_IMPORTER_TASK__SOURCE_LOCATORS:
      return sourceLocators != null && !sourceLocators.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  @Override
  public int getPriority()
  {
    return PRIORITY;
  }

  public boolean isNeeded(SetupTaskContext context) throws Exception
  {
    // TODO Implement SmartImporterTaskImpl.isNeeded()
    return true;
  }

  public void perform(SetupTaskContext context) throws Exception
  {
    EList<SourceLocator> sourceLocators = getSourceLocators();
    int size = sourceLocators.size();

    IProgressMonitor monitor = context.getProgressMonitor(true);
    monitor.beginTask("", 2 * size);

    for (SourceLocator sourceLocator : sourceLocators)
    {
      new EasymportJob(new File(sourceLocator.getRootFolder()), Collections.<IWorkingSet> emptySet(), true).schedule();
    }
  }

} // SmartImporterTaskImpl
