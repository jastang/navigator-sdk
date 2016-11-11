
package com.cloudera.nav.sdk.examples.datameer.json;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Permission {

    @SerializedName("groups")
    @Expose
    private Groups_ groups;
    @SerializedName("owner")
    @Expose
    private String owner;
    @SerializedName("permissionForOthers")
    @Expose
    private PermissionForOthers permissionForOthers;
    @SerializedName("publiclyShared")
    @Expose
    private Boolean publiclyShared;

    /**
     * 
     * @return
     *     The groups
     */
    public Groups_ getGroups() {
        return groups;
    }

    /**
     * 
     * @param groups
     *     The groups
     */
    public void setGroups(Groups_ groups) {
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
    public PermissionForOthers getPermissionForOthers() {
        return permissionForOthers;
    }

    /**
     * 
     * @param permissionForOthers
     *     The permissionForOthers
     */
    public void setPermissionForOthers(PermissionForOthers permissionForOthers) {
        this.permissionForOthers = permissionForOthers;
    }

    /**
     * 
     * @return
     *     The publiclyShared
     */
    public Boolean getPubliclyShared() {
        return publiclyShared;
    }

    /**
     * 
     * @param publiclyShared
     *     The publiclyShared
     */
    public void setPubliclyShared(Boolean publiclyShared) {
        this.publiclyShared = publiclyShared;
    }

}
