
package com.cloudera.nav.sdk.examples.datameer.json;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class DMWorkbook {

    @SerializedName("workbook")
    @Expose
    private Workbook workbook;
    @SerializedName("_links")
    @Expose
    private Links links;

    /**
     * 
     * @return
     *     The workbook
     */
    public Workbook getWorkbook() {
        return workbook;
    }

    /**
     * 
     * @param workbook
     *     The workbook
     */
    public void setWorkbook(Workbook workbook) {
        this.workbook = workbook;
    }

    /**
     * 
     * @return
     *     The links
     */
    public Links getLinks() {
        return links;
    }

    /**
     * 
     * @param links
     *     The _links
     */
    public void setLinks(Links links) {
        this.links = links;
    }

}
