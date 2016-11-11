
package com.cloudera.nav.sdk.examples.datameer.json;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ErrorHandling {

    @SerializedName("maxLogErrors")
    @Expose
    private Integer maxLogErrors;
    @SerializedName("mode")
    @Expose
    private String mode;

    /**
     * 
     * @return
     *     The maxLogErrors
     */
    public Integer getMaxLogErrors() {
        return maxLogErrors;
    }

    /**
     * 
     * @param maxLogErrors
     *     The maxLogErrors
     */
    public void setMaxLogErrors(Integer maxLogErrors) {
        this.maxLogErrors = maxLogErrors;
    }

    /**
     * 
     * @return
     *     The mode
     */
    public String getMode() {
        return mode;
    }

    /**
     * 
     * @param mode
     *     The mode
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

}
