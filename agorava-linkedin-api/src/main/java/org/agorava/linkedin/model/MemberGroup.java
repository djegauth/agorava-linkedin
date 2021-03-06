/*
 * Copyright 2012 Agorava
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.agorava.linkedin.model;

import java.io.Serializable;

/**
 * Model class representing a Member Group
 *
 * @author Robert Drysdale
 * @author Antoine Sabot-Durand
 */
public class MemberGroup implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String id;

    private final String name;

    private final UrlResource siteGroupRequest;

    public MemberGroup(String id, String name, UrlResource siteGroupRequest) {
        this.id = id;
        this.name = name;
        this.siteGroupRequest = siteGroupRequest;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public UrlResource getSiteGroupRequest() {
        return siteGroupRequest;
    }

}
