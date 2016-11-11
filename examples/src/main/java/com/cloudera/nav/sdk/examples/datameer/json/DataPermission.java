
package com.cloudera.nav.sdk.examples.datameer.json;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class DataPermission {

    @SerializedName("groups")
    @Expose
    private Groups groups;
    @SerializedName("owner")
    @Expose
    private String owner;
    @SerializedName("permissionForOthers")
    @Expose
    private Boolean permissionForOthers;

    /**
     * 
     * @return
     *     The groups
     */
    public Groups getGroups() {
        return groups;
    }

    /**
     * 
     * @param groups
     *     The groups
     */
    public void setGroups(Groups groups) {
        this.groups = groups;
    }

    /**
     * 
     * @return
     *     The owner
     */
    public String getOwner() {
        return owner;
    }

    /**
     * 
     * @param owner
     *     The owner
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * 
     * @return
     *     The permissionForOthers
     */
    public Boolean getPermissionForOthers() {
        return permissionForOthers;
    }

    /**
     * 
     * @param permissionForOthers
     *     The permissionForOthers
     */
    public void setPermissionForOthers(Boolean permissionForOthers) {
        this.permissionForOthers = permissionForOthers;
    }

}
