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

import com.cloudera.nav.sdk.model.CustomIdGenerator;
import com.cloudera.nav.sdk.model.SourceType;
import com.cloudera.nav.sdk.model.annotations.MClass;
import com.cloudera.nav.sdk.model.annotations.MProperty;
import com.cloudera.nav.sdk.model.entities.Entity;
import com.cloudera.nav.sdk.model.entities.EntityType;
import com.google.common.base.Preconditions;
import org.apache.commons.lang.StringUtils;
import org.joda.time.Instant;

@MClass(model = "datameer_job_summary")
public class DatameerJobSummary extends Entity {

    //Not using @MRelation for now ..
    //@MRelation(role = RelationRole.TEMPLATE)

    @MProperty
    private String operationID;

    @MProperty
    private String jobStatus;

    @MProperty
    private long successCount;

    @MProperty
    private String startTime;

    @MProperty
    private String stopTime;

    public DatameerJobSummary(String namespace) {
        Preconditions.checkArgument(StringUtils.isNotEmpty(namespace));
        setNamespace(namespace);
    }

    @Override
    public String generateId() {
        return CustomIdGenerator.generateIdentity(getNamespace(), operationID);
    }

    public void setOperationID(String id) {
        this.operationID = id;
    }

    public String getOperationID() {
        return this.operationID;
    }

    @Override
    public SourceType getSourceType() {
        return SourceType.DATAMEER;
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.DATASET;
    }

    public String getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    public long getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(long successCount) {
        this.successCount = successCount;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
        this.setCreated(Instant.parse(this.startTime));
    }

    public String getStopTime() {
        return stopTime;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }

    /*public void setTemplate(StetsonScript template) {
        this.template = template;
    }*/
}
