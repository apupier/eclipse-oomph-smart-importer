# eclipse-oomph-smart-importer

The goal is to use the Eclipse Smart Importer [1] inside Eclipse Oomph [2]

To use it:

1. Install in your Oomph Setup IDE:
     * the feature org.eclipse.oomph.smart.importer.feature.group from http://update-site.bonitasoft.com/oomph/
     * the feature org.eclipse.e4.ui.importer from http://download.eclipse.org/eclipse/updates/4.5
2. In your *.setup file: 
 * Add a "Smart Importer" task and specify the location of the source
 * Add a "P2 Director" task
     * with the features/plugins:
         - org.eclipse.e4.core.tools.feature.source.feature.group
         - org.jboss.tools.playground.easymport.maven
         - org.eclipse.e4.ui.importer
         - org.eclipse.e4.ui.importer.java
         -  (and whatever smart importer extension you want/need)
     * with the repositories:
        - http://download.jboss.org/jbosstools/mars/snapshots/builds/jbosstools-playground_master/
        - http://download.eclipse.org/eclipse/updates/4.5
        - http://update-site.bonitasoft.com/oomph/

3. Install in your Oomph installer:
     * the feature org.eclipse.oomph.smart.importer.feature.group from http://update-site.bonitasoft.com/oomph/
     * the feature org.eclipse.e4.ui.importer from http://download.eclipse.org/eclipse/updates/4.5

References:
[1] https://wiki.eclipse.org/E4/UI/Smart_Import
[2] https://projects.eclipse.org/projects/tools.oomph
