
package com.cloudera.nav.sdk.examples.datameer.json;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Workbook {

	@SerializedName("_version")
    @Expose
    private String _version;
    @SerializedName("dataPermission")
    @Expose
    private DataPermission dataPermission;
    @SerializedName("errorHandling")
    @Expose
    private ErrorHandling errorHandling;
    @SerializedName("file")
    @Expose
    private File file;
    @SerializedName("jobConfiguration")
    @Expose
    private JobConfiguration jobConfiguration;
    @SerializedName("notification")
    @Expose
    private Notification notification;
    @SerializedName("sheets")
    @Expose
    private List<Sheet> sheets = new ArrayList<Sheet>();
    @SerializedName("properties")
    @Expose
    private Properties_ properties;

    /**
     * 
     * @return
     *     The version
     */
    public String getVersion() {
        return _version;
    }

    /**
     * 
     * @param version
     *     The version
     */
    public void setVersion(String version) {
        this._version = version;
    }

    /**
     * 
     * @return
     *     The dataPermission
     */
    public DataPermission getDataPermission() {
        return dataPermission;
    }

    /**
     * 
     * @param dataPermission
     *     The dataPermission
     */
    public void setDataPermission(DataPermission dataPermission) {
        this.dataPermission = dataPermission;
    }

    /**
     * 
     * @return
     *     The errorHandling
     */
    public ErrorHandling getErrorHandling() {
        return errorHandling;
    }

    /**
     * 
     * @param errorHandling
     *     The errorHandling
     */
    public void setErrorHandling(ErrorHandling errorHandling) {
        this.errorHandling = errorHandling;
    }

    /**
     * 
     * @return
     *     The file
     */
    public File getFile() {
        return file;
    }

    /**
     * 
     * @param file
     *     The file
     */
    public void setFile(File file) {
        this.file = file;
    }

    /**
     * 
     * @return
     *     The jobConfiguration
     */
    public JobConfiguration getJobConfiguration() {
        return jobConfiguration;
    }

    /**
     * 
     * @param jobConfiguration
     *     The jobConfiguration
     */
    public void setJobConfiguration(JobConfiguration jobConfiguration) {
        this.jobConfiguration = jobConfiguration;
    }

    /**
     * 
     * @return
     *     The notification
     */
    public Notification getNotification() {
        return notification;
    }

    /**
     * 
     * @param notification
     *     The notification
     */
    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    /**
     * 
     * @return
     *     The sheets
     */
    public List<Sheet> getSheets() {
        return sheets;
    }

    /**
     * 
     * @param sheets
     *     The sheets
     */
    public void setSheets(List<Sheet> sheets) {
        this.sheets = sheets;
    }

    /**
     * 
     * @return
     *     The properties
     */
    public Properties_ getProperties() {
        return properties;
    }

    /**
     * 
     * @param properties
     *     The properties
     */
    public void setProperties(Properties_ properties) {
        this.properties = properties;
    }

}
