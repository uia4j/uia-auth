/*******************************************************************************
 * Copyright 2019 UIA
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package uia.auth.db;

import uia.dao.annotation.ColumnInfo;
import uia.dao.annotation.TableInfo;

@TableInfo(name = "auth_role")
public class AuthRole {

	@ColumnInfo(name = "id", primaryKey = true)
    private long id;

	@ColumnInfo(name = "role_name")
    private String roleName;

	@ColumnInfo(name = "enabled")
    private String enabled;

    public AuthRole() {
    }

    public AuthRole(AuthRole data) {
        this.id = data.id;
        this.roleName = data.roleName;
        this.enabled = data.enabled;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getEnabled() {
        return this.enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public AuthRole copy() {
        return new AuthRole(this);
    }

    @Override
    public String toString() {
        return String.format("%6s(%s). %-30s", this.id, this.enabled, this.roleName);
    }
}
