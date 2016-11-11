
package com.cloudera.nav.sdk.examples.datameer.json;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class PermissionForOthers {

    @SerializedName("executable")
    @Expose
    private Boolean executable;
    @SerializedName("readable")
    @Expose
    private Boolean readable;
    @SerializedName("writable")
    @Expose
    private Boolean writable;

    /**
     * 
     * @return
     *     The executable
     */
    public Boolean getExecutable() {
        return executable;
    }

    /**
     * 
     * @param executable
     *     The executable
     */
    public void setExecutable(Boolean executable) {
        this.executable = executable;
    }

    /**
     * 
     * @return
     *     The readable
     */
    public Boolean getReadable() {
        return readable;
    }

    /**
     * 
     * @param readable
     *     The readable
     */
    public void setReadable(Boolean readable) {
        this.readable = readable;
    }

    /**
     * 
     * @return
     *     The writable
     */
    public Boolean getWritable() {
        return writable;
    }

    /**
     * 
     * @param writable
     *     The writable
     */
    public void setWritable(Boolean writable) {
        this.writable = writable;
    }

}
