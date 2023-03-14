/*
 *  Copyright (c) 2020, 2021 Microsoft Corporation
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 *
 *  Contributors:
 *       Microsoft Corporation - initial API and implementation
 *       Fraunhofer Institute for Software and Systems Engineering - added dependencies
 *
 */

plugins {
    `java-library`
}

val edcGroup: String by project
val version: String by project

dependencies {
    api("$edcGroup:control-plane-spi:$version")
    api("$edcGroup:data-plane-spi:$version")
    implementation("$edcGroup:control-plane-core:$version")
    implementation("$edcGroup:data-plane-core:$version")
    implementation("$edcGroup:data-plane-util:$version")
    implementation("$edcGroup:data-plane-client:$version")
    implementation("$edcGroup:data-plane-selector-client:$version")
    implementation("$edcGroup:data-plane-selector-core:$version")
    implementation("$edcGroup:transfer-data-plane:$version")
    implementation(libs.opentelemetry.annotations)
}