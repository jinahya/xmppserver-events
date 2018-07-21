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
package com.github.jinahya.openfire.event.group;

import java.util.Map;
import org.jivesoftware.openfire.group.Group;
import org.jivesoftware.openfire.event.GroupEventListener;

/**
 * An event for
 * {@link GroupEventListener#adminAdded(org.jivesoftware.openfire.group.Group, java.util.Map)}.
 * {@link GroupEventListener#adminAdded(Group, Map)}.
 *
 * @author Jin Kwon &lt;onacit at gmail.com&gt;
 */
public class AdminAdded extends GroupWithParamsEvent {

    // -------------------------------------------------------------------------
    public static AdminAdded of(final Group group, final Map params) {
        return of(AdminAdded::new, group, params);
    }
}
