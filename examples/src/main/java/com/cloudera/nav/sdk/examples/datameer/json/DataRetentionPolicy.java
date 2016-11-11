
package com.cloudera.nav.sdk.examples.datameer.json;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class DataRetentionPolicy {

    @SerializedName("_type")
    @Expose
    private String type;
    @SerializedName("minimumToKeep")
    @Expose
    private Integer minimumToKeep;

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The _type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The minimumToKeep
     */
    public Integer getMinimumToKeep() {
        return minimumToKeep;
    }

    /**
     * 
     * @param minimumToKeep
     *     The minimumToKeep
     */
    public void setMinimumToKeep(Integer minimumToKeep) {
        this.minimumToKeep = minimumToKeep;
    }

}
