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

package com.cloudera.nav.sdk.examples.datameer.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JobDetails {

    private Counters counters;

    private long failureCount;

    private String jobStatus;

    private String startTime;

    private String stopTime;

    private long successCount;

    public Counters getCounters() { return this.counters; }

    public long getFailureCount() { return this.failureCount; }

    public String getJobStatus() { return this.jobStatus; }

    //todo: use date formatting and data type
    public String getStartTime() { return this.getStartTime(); }

    public String getStopTime() { return this.getStopTime(); }

    public long getSuccessCount() { return this.getSuccessCount(); }

    public void setCounters(Counters value) { this.counters = value; }

    public void setFailureCount(long value) { this.failureCount = value; }

    public void setJobStatus(String value) { this.jobStatus = value; }

    public void setStartTime(String value) { this.startTime = value; }

    public void setStopTime(String value) { this.stopTime = value; }

    public void setSuccessCount(long value) { this.successCount = value; }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("JobDetails{")
                //implement
                .append('}')
                .toString();
    }
}
