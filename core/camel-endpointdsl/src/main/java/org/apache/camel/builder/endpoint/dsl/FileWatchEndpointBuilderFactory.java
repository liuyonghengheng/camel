/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * The file-watch is used to monitor file events in directory using
 * java.nio.file.WatchService
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface FileWatchEndpointBuilderFactory {


    /**
     * Builder for endpoint for the file-watch component.
     */
    public interface FileWatchEndpointBuilder extends EndpointConsumerBuilder {
        default AdvancedFileWatchEndpointBuilder advanced() {
            return (AdvancedFileWatchEndpointBuilder) this;
        }
    }

    /**
     * Advanced builder for endpoint for the file-watch component.
     */
    public interface AdvancedFileWatchEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default FileWatchEndpointBuilder basic() {
            return (FileWatchEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedFileWatchEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedFileWatchEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedFileWatchEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedFileWatchEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.file.watch.constants.FileEventEnum</code> enum.
     */
    enum FileEventEnum {
        CREATE,
        DELETE,
        MODIFY;
    }
    /**
     * file-watch (camel-file-watch)
     * The file-watch is used to monitor file events in directory using
     * java.nio.file.WatchService
     * 
     * Category: file
     * Available as of version: 3.0
     * Maven coordinates: org.apache.camel:camel-file-watch
     * 
     * Syntax: <code>file-watch:path</code>
     * 
     * Path parameter: path (required)
     * Path of directory to consume events from.
     */
    default FileWatchEndpointBuilder fileWatch(String path) {
        class FileWatchEndpointBuilderImpl extends AbstractEndpointBuilder implements FileWatchEndpointBuilder, AdvancedFileWatchEndpointBuilder {
            public FileWatchEndpointBuilderImpl(String path) {
                super("file-watch", path);
            }
        }
        return new FileWatchEndpointBuilderImpl(path);
    }
}