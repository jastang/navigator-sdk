
package com.cloudera.nav.sdk.examples.datameer.json;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Sheet {

    @SerializedName("_type")
    @Expose
    private String type;
    @SerializedName("uuid")
    @Expose
    private String uuid;
    @SerializedName("columns")
    @Expose
    private List<Column> columns = new ArrayList<Column>();
    @SerializedName("identifier")
    @Expose
    private String identifier;
    @SerializedName("kept")
    @Expose
    private Boolean kept;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("position")
    @Expose
    private Integer position;

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
     *     The uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * 
     * @param uuid
     *     The uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * 
     * @return
     *     The columns
     */
    public List<Column> getColumns() {
        return columns;
    }

    /**
     * 
     * @param columns
     *     The columns
     */
    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }

    /**
     * 
     * @return
     *     The identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * 
     * @param identifier
     *     The identifier
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * 
     * @return
     *     The kept
     */
    public Boolean getKept() {
        return kept;
    }

    /**
     * 
     * @param kept
     *     The kept
     */
    public void setKept(Boolean kept) {
        this.kept = kept;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The position
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * 
     * @param position
     *     The position
     */
    public void setPosition(Integer position) {
        this.position = position;
    }

}
