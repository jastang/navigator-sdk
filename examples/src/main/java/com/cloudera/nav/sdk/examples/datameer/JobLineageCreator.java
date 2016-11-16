/*
 * Copyright (c) 2015 Cloudera, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cloudera.nav.sdk.examples.datameer;

import com.cloudera.nav.sdk.client.NavigatorPlugin;

import com.cloudera.nav.sdk.client.writer.ResultSet;
import com.cloudera.nav.sdk.examples.datameer.json.JobDetails;

import com.cloudera.nav.sdk.model.SourceType;
import org.springframework.web.client.RestTemplate;

public class JobLineageCreator {
    /**
     * This class creates and writes custom entity model data into Navigator representing Datameer Jobs.
     * The Datameer job metadata is obtained via a REST API and mapped into the DatameerJob class.
     * The job's underlying execution is mapped into the {TBD} class which can be MapReduce, Spark, etc.
     * <p>
     * The relationship to the
     */
    protected final NavigatorPlugin plugin;

    protected final RestTemplate api;

    private String workbookID;

    private String jobID;

    //todo: move to helper config or system properties
    protected static final String job_details_url = "http://{url}/rest/job-execution/job-details/{jobID}";

    //todo: move to system properties
    private String datameer_host;

    /**
     * Instantiate the NavigtorPlugin using a .conf file, as well as a Spring REST template
     *
     * @param config
     */
    public JobLineageCreator(String config) {
        this.plugin = NavigatorPlugin.fromConfigFile(config);
        this.api = new RestTemplate();
        this.datameer_host = plugin.getConfig().getNavigatorUrl();
    }

    /**
     * Creates
     */
    public void run() {
        //Load custom entities
        plugin.registerModels(getClass().getPackage().getName());

        //Get metadata
        JobDetails jobDetails = this.getJobMetadata();

        //Map POJOs to Datameer custom entities

        //Write the Custom entity to Navigator
        //plugin.write();
    }

    /**
     * No-REST API call test function for mapping JSON data from Datameer
     * @param metadata
     */
    public void runLocal(JobDetails metadata) {
        plugin.registerModels(getClass().getPackage().getName());
        DatameerJobSummary djs = new DatameerJobSummary(plugin.getNamespace());
        djs.setSourceType(SourceType.DATAMEER);
        djs.setOwner("Jason");
        djs.setOperationID("SOME-YARN-APP");
        ResultSet results = plugin.write(djs);
        if (results.hasErrors()) {
            throw new RuntimeException(results.toString());
        }
    }

    public String getWorkbookID() {
        return this.workbookID;
    }

    public String getJobID() {
        return this.jobID;
    }

    public void setWorkbookID(String id) {
        this.workbookID = id;
    }

    public void setJobID(String id) {
        this.jobID = id;
    }

    /**
     * Retrieve the job details metadata by ID, in JSON, using the REST API.
     * JobDetails is a custom Java class representing the JSON object from the Datameer API.
     *
     * @return
     */
    protected JobDetails getJobMetadata() {
        return this.api.getForObject(this.job_details_url, JobDetails.class, datameer_host, getJobID());
    }

}
