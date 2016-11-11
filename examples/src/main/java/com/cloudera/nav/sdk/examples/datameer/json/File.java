
package com.cloudera.nav.sdk.examples.datameer.json;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class File {

    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("extension")
    @Expose
    private String extension;
    @SerializedName("folder")
    @Expose
    private List<String> folder = new ArrayList<String>();
    @SerializedName("modifiedAt")
    @Expose
    private String modifiedAt;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("permission")
    @Expose
    private Permission permission;
    @SerializedName("uuid")
    @Expose
    private String uuid;

    /**
     * 
     * @return
     *     The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * @param createdAt
     *     The createdAt
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The extension
     */
    public String getExtension() {
        return extension;
    }

    /**
     * 
     * @param extension
     *     The extension
     */
    public void setExtension(String extension) {
        this.extension = extension;
    }

    /**
     * 
     * @return
     *     The folder
     */
    public List<String> getFolder() {
        return folder;
    }

    /**
     * 
     * @param folder
     *     The folder
     */
    public void setFolder(List<String> folder) {
        this.folder = folder;
    }

    /**
     * 
     * @return
     *     The modifiedAt
     */
    public String getModifiedAt() {
        return modifiedAt;
    }

    /**
     * 
     * @param modifiedAt
     *     The modifiedAt
     */
    public void setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
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
     *     The permission
     */
    public Permission getPermission() {
        return permission;
    }

    /**
     * 
     * @param permission
     *     The permission
     */
    public void setPermission(Permission permission) {
        this.permission = permission;
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

}
