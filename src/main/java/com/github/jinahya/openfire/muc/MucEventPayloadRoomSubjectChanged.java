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
package com.github.jinahya.openfire.muc;

import com.github.jinahya.xmpp.packet.JidValue;
import org.xmpp.packet.JID;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MucEventPayloadRoomSubjectChanged extends MucEventPayloadWithRoomAndUser {

    // -----------------------------------------------------------------------------------------------------------------
    public static MucEventPayloadRoomSubjectChanged of(final JID room, final JID user, final String newSubject) {
        final MucEventPayloadRoomSubjectChanged instance = of(MucEventPayloadRoomSubjectChanged::new, room, user);
        instance.setSubject(newSubject);
        return instance;
    }

    // ------------------------------------------------------------------------------------------------------------ room
    public JidValue getRoom() {
        return room;
    }

    void setRoomJID(final JidValue roomJID) {
        this.room = roomJID;
    }

    // ------------------------------------------------------------------------------------------------------------ user
    public JidValue getUser() {
        return user;
    }

    void setUser(final JidValue user) {
        this.user = user;
    }

    // --------------------------------------------------------------------------------------------------------- subject
    public String getSubject() {
        return subject;
    }

    void setSubject(final String subject) {
        this.subject = subject;
    }

    // -----------------------------------------------------------------------------------------------------------------
    private JidValue room;

    private JidValue user;

    private String subject;
}