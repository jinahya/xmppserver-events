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

import com.github.jinahya.xmpp.packet.IqValue;
import org.xmpp.packet.IQ;

import static java.util.Optional.ofNullable;

public class ComponentEventComponentInfoReceived extends ComponentEvent {

    public static final String IDENTIFIER = "COMPONENT_INFO_RECEIVED";

    // -------------------------------------------------------------------------
    public static ComponentEventComponentInfoReceived of(final IQ iq) {
        final ComponentEventComponentInfoReceived instance = new ComponentEventComponentInfoReceived();
        instance.setIq(ofNullable(iq).map(IqValue::of).orElse(null));
        return instance;
    }

    // -------------------------------------------------------------------------
    public ComponentEventComponentInfoReceived() {
        super(IDENTIFIER);
    }

    // ---------------------------------------------------------------------- iq
    public IqValue getIq() {
        return iq;
    }

    void setIq(final IqValue iq) {
        this.iq = iq;
    }

    // -------------------------------------------------------------------------
    private IqValue iq;
}