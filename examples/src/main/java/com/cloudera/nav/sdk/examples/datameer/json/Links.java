
package com.cloudera.nav.sdk.examples.datameer.json;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Links {

    @SerializedName("file")
    @Expose
    private File_ file;
    @SerializedName("self")
    @Expose
    private Self self;

    /**
     * 
     * @return
     *     The file
     */
    public File_ getFile() {
        return file;
    }

    /**
     * 
     * @param file
     *     The file
     */
    public void setFile(File_ file) {
        this.file = file;
    }

    /**
     * 
     * @return
     *     The self
     */
    public Self getSelf() {
        return self;
    }

    /**
     * 
     * @param self
     *     The self
     */
    public void setSelf(Self self) {
        this.self = self;
    }

}
