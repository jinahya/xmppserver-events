/*
 * Copyright 2018 Jin Kwon &lt;onacit at gmail.com&gt;.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.jinahya.openfire.component;

import com.github.jinahya.openfire.OpenfireEvent;

public abstract class ExternalComponentManagerEvent extends OpenfireEvent {

    // -----------------------------------------------------------------------------------------------------------------
    public static final String NAMESPACE = "OPENFIRE_COMPONENT_EXTERNAL_COMPONENT_MANAGER";

    // -----------------------------------------------------------------------------------------------------------------
    public ExternalComponentManagerEvent(final String identifier) {
        super(NAMESPACE, identifier);
    }
}