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
package com.github.jinahya.openfire.muc.muc;

import com.github.jinahya.xmpp.packet.JidValue;
import static java.util.Optional.ofNullable;
import org.xmpp.packet.JID;

/**
 *
 * @author Jin Kwon &lt;onacit at gmail.com&gt;
 */
public class MessageDestroyed extends MUCEvent {

    // -------------------------------------------------------------------------
    public static MessageDestroyed of(final JID roomJID) {
        final MessageDestroyed instance = new MessageDestroyed();
        instance.setRoomJID(ofNullable(roomJID).map(JidValue::of).orElse(null));
        return instance;
    }

    // ----------------------------------------------------------------- roomJID
    public JidValue getRoomJID() {
        return roomJID;
    }

    public void setRoomJID(final JidValue roomJID) {
        this.roomJID = roomJID;
    }

    // -------------------------------------------------------------------------
    private JidValue roomJID;
}
