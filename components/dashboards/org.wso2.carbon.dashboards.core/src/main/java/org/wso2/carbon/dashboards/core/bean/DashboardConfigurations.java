/*
 *  Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */
package org.wso2.carbon.dashboards.core.bean;

import org.wso2.carbon.config.annotation.Configuration;
import org.wso2.carbon.config.annotation.Element;
import org.wso2.carbon.dashboards.core.bean.roles.provider.Roles;
import org.wso2.carbon.database.query.manager.config.Queries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Configuration bean class for dashboard.
 *
 * @since 4.0.0
 */
@Configuration(namespace = "wso2.dashboard", description = "WSO2 Dashboard configurations")
public class DashboardConfigurations {

    @Element(description = "Database queries template array list.")
    List<Queries> queries = new ArrayList<>();

    @Element(description = "Map of roles list")
    public Roles roles = new Roles();

    @Element(description = "Report generation configurations")
    Map<String, Object> reportGeneration = Collections.emptyMap();

    @Element(description = "Theme configuration provider class name")
    public String themeConfigProviderClass = "org.wso2.carbon.dashboards.core.DefaultDashboardThemeConfigProvider";

    @Element(description = "Location where theme configuration resources(ex: fav icon, logo etc.) are stored in")
    public String themeConfigResourcesPath = "https://localhost:9643/analytics-dashboard/public/app/images";

    @Element(description = "file name of the logo image")
    public String logoFileName = "logo.svg";

    @Element(description = "file name of the favicon")
    public String faviconFileName = "favicon.ico";

    /**
     * Get map of roles.
     *
     * @return
     */
    public Roles getRoles() {
        return roles;
    }

    /**
     * Get dashboard queries.
     *
     * @return
     */
    public List<Queries> getQueries() {
        return queries;
    }

    /**
     * Get map of report generation configuration configs.
     *
     * @return
     */
    public Map<String, Object> getReportConfigs() {
        return reportGeneration;
    }

    /**
     * Get theme configuration provider class.
     *
     * @return theme config provider full qualified class name
     */
    public String getThemeConfigProviderClass() {
        return themeConfigProviderClass;
    }

    /**
     * Get theme configuration resources path.
     *
     * @return theme config resources path
     */
    public String getThemeConfigResourcesPath() {
        return themeConfigResourcesPath;
    }

    /**
     * Get file name of the logo image.
     *
     * @return logo image file name
     */
    public String getLogoFileName() {
        return logoFileName;
    }

    /**
     * Get file name of the favicon.
     *
     * @return favicon icon file name
     */
    public String getFaviconFileName() {
        return faviconFileName;
    }


}
