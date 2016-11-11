
package com.cloudera.nav.sdk.examples.datameer.json;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Triggering {

    @SerializedName("_type")
    @Expose
    private String type;
    @SerializedName("sheets")
    @Expose
    private Sheets sheets;

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
     *     The sheets
     */
    public Sheets getSheets() {
        return sheets;
    }

    /**
     * 
     * @param sheets
     *     The sheets
     */
    public void setSheets(Sheets sheets) {
        this.sheets = sheets;
    }

}
