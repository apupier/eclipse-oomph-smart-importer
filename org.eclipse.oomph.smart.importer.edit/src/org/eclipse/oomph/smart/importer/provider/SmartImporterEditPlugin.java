/**
 */
package org.eclipse.oomph.smart.importer.provider;

import org.eclipse.oomph.base.provider.BaseEditPlugin;
import org.eclipse.oomph.p2.provider.P2EditPlugin;
import org.eclipse.oomph.predicates.provider.PredicatesEditPlugin;
import org.eclipse.oomph.resources.provider.ResourcesEditPlugin;
import org.eclipse.oomph.setup.provider.SetupEditPlugin;
import org.eclipse.oomph.targlets.provider.TargletEditPlugin;
import org.eclipse.oomph.workingsets.provider.WorkingSetsEditPlugin;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;

/**
 * This is the central singleton for the SmartImporter edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class SmartImporterEditPlugin extends EMFPlugin
{
  /**
   * Keep track of the singleton.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final SmartImporterEditPlugin INSTANCE = new SmartImporterEditPlugin();

  /**
   * Keep track of the singleton.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static Implementation plugin;

  /**
   * Create the instance.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmartImporterEditPlugin()
  {
    super(new ResourceLocator[] { BaseEditPlugin.INSTANCE, P2EditPlugin.INSTANCE, PredicatesEditPlugin.INSTANCE, ResourcesEditPlugin.INSTANCE,
        SetupEditPlugin.INSTANCE, TargletEditPlugin.INSTANCE, WorkingSetsEditPlugin.INSTANCE, });
  }

  /**
   * Returns the singleton instance of the Eclipse plugin.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the singleton instance.
   * @generated
   */
  @Override
  public ResourceLocator getPluginResourceLocator()
  {
    return plugin;
  }

  /**
   * Returns the singleton instance of the Eclipse plugin.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the singleton instance.
   * @generated
   */
  public static Implementation getPlugin()
  {
    return plugin;
  }

  /**
   * The actual implementation of the Eclipse <b>Plugin</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static class Implementation extends EclipsePlugin
  {
    /**
     * Creates an instance.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Implementation()
    {
      super();

      // Remember the static instance.
      //
      plugin = this;
    }
  }

}
