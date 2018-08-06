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
package com.github.jinahya.openfire.user;

import com.github.jinahya.openfire.OpenfireEvent;
import com.github.jinahya.openfire.OpenfireEventNamespace;
import com.github.jinahya.openfire.user.PresenceEventIdentifier;

public abstract class PresenceEvent extends OpenfireEvent<PresenceEventIdentifier> {

    // -----------------------------------------------------------------------------------------------------------------
    public PresenceEvent(final PresenceEventIdentifier identifier) {
        super(OpenfireEventNamespace.OPENFIRE_USER_PRESENCE, identifier);
    }
}