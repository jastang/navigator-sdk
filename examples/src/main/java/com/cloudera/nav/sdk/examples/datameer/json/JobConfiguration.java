
package com.cloudera.nav.sdk.examples.datameer.json;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class JobConfiguration {

    @SerializedName("dataRetentionPolicy")
    @Expose
    private DataRetentionPolicy dataRetentionPolicy;
    @SerializedName("hadoopProperties")
    @Expose
    private HadoopProperties hadoopProperties;
    @SerializedName("logging")
    @Expose
    private Logging logging;
    @SerializedName("triggering")
    @Expose
    private Triggering triggering;

    /**
     * 
     * @return
     *     The dataRetentionPolicy
     */
    public DataRetentionPolicy getDataRetentionPolicy() {
        return dataRetentionPolicy;
    }

    /**
     * 
     * @param dataRetentionPolicy
     *     The dataRetentionPolicy
     */
    public void setDataRetentionPolicy(DataRetentionPolicy dataRetentionPolicy) {
        this.dataRetentionPolicy = dataRetentionPolicy;
    }

    /**
     * 
     * @return
     *     The hadoopProperties
     */
    public HadoopProperties getHadoopProperties() {
        return hadoopProperties;
    }

    /**
     * 
     * @param hadoopProperties
     *     The hadoopProperties
     */
    public void setHadoopProperties(HadoopProperties hadoopProperties) {
        this.hadoopProperties = hadoopProperties;
    }

    /**
     * 
     * @return
     *     The logging
     */
    public Logging getLogging() {
        return logging;
    }

    /**
     * 
     * @param logging
     *     The logging
     */
    public void setLogging(Logging logging) {
        this.logging = logging;
    }

    /**
     * 
     * @return
     *     The triggering
     */
    public Triggering getTriggering() {
        return triggering;
    }

    /**
     * 
     * @param triggering
     *     The triggering
     */
    public void setTriggering(Triggering triggering) {
        this.triggering = triggering;
    }

}
