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

@TableInfo(name = "auth_func")
public class AuthFunc {

	@ColumnInfo(name = "id", primaryKey = true)
    private long id;

	@ColumnInfo(name = "func_name")
    private String funcName;

	@ColumnInfo(name = "parent_func")
    private long parentFunc;

	@ColumnInfo(name = "func_description")
    private String funcDescription;

	@ColumnInfo(name = "func_args")
    private String funcArgs;

    public AuthFunc() {
    }

    public AuthFunc(AuthFunc data) {
        this.id = data.id;
        this.funcName = data.funcName;
        this.parentFunc = data.parentFunc;
        this.funcDescription = data.funcDescription;
        this.funcArgs = data.funcArgs;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFuncName() {
        return this.funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName;
    }

    public long getParentFunc() {
        return this.parentFunc;
    }

    public void setParentFunc(long parentFunc) {
        this.parentFunc = parentFunc;
    }

    public String getFuncDescription() {
		return funcDescription;
	}

	public void setFuncDescription(String funcDescription) {
		this.funcDescription = funcDescription;
	}

	public String getFuncArgs() {
		return funcArgs;
	}

	public void setFuncArgs(String funcArgs) {
		this.funcArgs = funcArgs;
	}

    public AuthFunc copy() {
        return new AuthFunc(this);
    }

    @Override
    public String toString() {
        return this.funcName;
    }
}
