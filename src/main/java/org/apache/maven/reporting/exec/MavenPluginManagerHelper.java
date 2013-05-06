package org.apache.maven.reporting.exec;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import java.util.List;

import org.apache.maven.execution.MavenSession;
import org.apache.maven.model.Plugin;
import org.apache.maven.plugin.InvalidPluginDescriptorException;
import org.apache.maven.plugin.MavenPluginManager;
import org.apache.maven.plugin.PluginContainerException;
import org.apache.maven.plugin.PluginDescriptorParsingException;
import org.apache.maven.plugin.PluginResolutionException;
import org.apache.maven.plugin.descriptor.PluginDescriptor;

/**
 * {@link MavenPluginManager} helper to deal with API changes between Maven 3.0.x and 3.1.x.
 * 
 * @author Hervé Boutemy
 * @since 1.1
 */
public interface MavenPluginManagerHelper
{
    PluginDescriptor getPluginDescriptor( Plugin plugin, MavenSession session )
        throws PluginResolutionException, PluginDescriptorParsingException, InvalidPluginDescriptorException;

    void setupPluginRealm( PluginDescriptor pluginDescriptor, MavenSession session, ClassLoader parent,
                                  List<String> imports, List<String> excludeArtifactIds )
        throws PluginResolutionException, PluginContainerException;
}
