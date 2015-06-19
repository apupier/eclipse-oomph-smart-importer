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
package org.eclipse.oomph.smart.importer;

import org.eclipse.oomph.resources.SourceLocator;
import org.eclipse.oomph.setup.SetupTask;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Smart Importer Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.oomph.smart.importer.SmartImporterTask#getSourceLocators <em>Source Locators</em>}</li>
 * </ul>
 *
 * @see org.eclipse.oomph.smart.importer.SmartImporterPackage#getSmartImporterTask()
 * @model annotation="http://www.eclipse.org/oomph/setup/Enablement variableName='p2.smart.importer' repository='http://download.eclipse.org/oomph/smart/importer/updates' installableUnits='org.eclipse.oomph.smart.importer.feature.group'"
 *        annotation="http://www.eclipse.org/oomph/setup/ValidTriggers triggers='STARTUP MANUAL'"
 * @generated
 */
public interface SmartImporterTask extends SetupTask
{

  /**
   * Returns the value of the '<em><b>Source Locators</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.oomph.resources.SourceLocator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Locators</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Locators</em>' reference list.
   * @see org.eclipse.oomph.smart.importer.SmartImporterPackage#getSmartImporterTask_SourceLocators()
   * @model required="true"
   * @generated
   */
  EList<SourceLocator> getSourceLocators();

} // SmartImporterTask
