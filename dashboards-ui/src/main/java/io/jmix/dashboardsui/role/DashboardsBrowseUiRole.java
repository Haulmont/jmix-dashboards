/*
 * Copyright 2021 Haulmont.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.jmix.dashboardsui.role;

import io.jmix.dashboards.role.DashboardsBrowseRole;
import io.jmix.security.role.annotation.ResourceRole;
import io.jmix.security.role.annotation.SpecificPolicy;
import io.jmix.securityui.role.annotation.MenuPolicy;
import io.jmix.securityui.role.annotation.ScreenPolicy;

@ResourceRole(code = DashboardsBrowseUiRole.CODE, name = "Dashboards: view a list of available dashboards in UI")
public interface DashboardsBrowseUiRole extends DashboardsBrowseRole {

    String CODE = "dashboards-browse-ui";

    @ScreenPolicy(screenIds = {
            "dshbrd_PersistentDashboard.browse",
            "dshbrd_DashboardView.screen"
    })
    @MenuPolicy(menuIds = {
            "dashboard",
            "dshbrd_PersistentDashboard.browse"
    })
    @SpecificPolicy(resources = {"dashboardGroupsBrowse"})
    void dashboardsBrowseUi();
}