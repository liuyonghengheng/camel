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
package org.apache.camel.component.amqp;

/**
 * AMQP constants
 */
public final class AMQPConstants {

    /**
     * AMQP message annotation prefix
     */
    public static final String JMS_AMQP_MA_PREFIX = "JMS_AMQP_MA_";

    /**
     * AMQP message delivery prefix
     */
    public static final String JMS_AMQP_DA_PREFIX = "JMS_AMQP_DA_";

    private AMQPConstants() {
        // utility class
    }
}