/*
 * Tencent is pleased to support the open source community by making Polaris available.
 *
 * Copyright (C) 2019 THL A29 Limited, a Tencent company. All rights reserved.
 *
 * Licensed under the BSD 3-Clause License (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://opensource.org/licenses/BSD-3-Clause
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package cn.polarismesh.polaris.sync.extension.registry;

public class Health {

    public enum Status {
        UP, DOWN
    }

    private final Status status;

    private final int code;

    private final String detail;

    private final int errorCount;

    public Health(Status status, int code, String detail) {
        this.status = status;
        this.code = code;
        this.detail = detail;
        this.errorCount = 1;
    }

    public Health(Status status, int code, String detail, int errorCount) {
        this.status = status;
        this.code = code;
        this.detail = detail;
        this.errorCount = errorCount;
    }

    public Health(Status status) {
        this(status, 0, "");
    }


    public Status getStatus() {
        return status;
    }

    public int getCode() {
        return code;
    }

    public String getDetail() {
        return detail;
    }

    public int getErrorCount() {
        return errorCount;
    }
}
