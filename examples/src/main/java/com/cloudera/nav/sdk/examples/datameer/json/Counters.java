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
public class Counters {

    private long IMPORT_RECORDS;

    private long IMPORT_BYTES;

    private long IMPORT_DROPPED_RECORDS;

    private long IMPORT_PREVIEW_RECORDS;

    private long IMPORT_OUTPUT_BYTES;

    private long IMPORT_DROPPED_SPLITS;

    private long IMPORT_OUTPUT_PARTITIONS;

    public long getImportRecords() { return this.IMPORT_RECORDS; }

    public long getImportBytes() { return this.IMPORT_BYTES; }

    public long getImportDroppedRecords() { return this.IMPORT_DROPPED_RECORDS; }

    public long getPreviewRecords() { return this.IMPORT_PREVIEW_RECORDS; }

    public long getOutputBytes() { return this.IMPORT_OUTPUT_BYTES; }

    public long getImportDroppedSplits() { return this.IMPORT_DROPPED_SPLITS; }

    public long getImportOutputPartitions() { return this.IMPORT_OUTPUT_PARTITIONS; }

    public void setImportRecords(long value) { this.IMPORT_RECORDS = value; }

    public void setImportBytes(long value) { this.IMPORT_BYTES = value; }

    public void setImportDroppedRecords(long value) { this.IMPORT_DROPPED_RECORDS = value; }

    public void setImportPreviewRecords(long value) { this.IMPORT_PREVIEW_RECORDS = value; }

    public void setImportOutputyBytes(long value) { this.IMPORT_OUTPUT_BYTES = value; }

    public void setImportDroppedSplits(long value) { this.IMPORT_DROPPED_SPLITS = value; }

    public void setImportOutputPartitions(long value) { this.IMPORT_OUTPUT_PARTITIONS = value; }

    @Override
    public String toString(){
        return new StringBuilder()
                .append("counters{")
                .append("importrecords=").append(getImportRecords()).append('\n')
                .append("importbytes=").append(getImportBytes()).append('\n')
                //etc
                .append('}')
                .toString();
    }

}
