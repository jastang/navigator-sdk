
package com.cloudera.nav.sdk.examples.datameer.json;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Notification {

    @SerializedName("emailsInCaseOfFailure")
    @Expose
    private List<Object> emailsInCaseOfFailure = new ArrayList<Object>();
    @SerializedName("emailsInCaseOfSuccess")
    @Expose
    private List<Object> emailsInCaseOfSuccess = new ArrayList<Object>();

    /**
     * 
     * @return
     *     The emailsInCaseOfFailure
     */
    public List<Object> getEmailsInCaseOfFailure() {
        return emailsInCaseOfFailure;
    }

    /**
     * 
     * @param emailsInCaseOfFailure
     *     The emailsInCaseOfFailure
     */
    public void setEmailsInCaseOfFailure(List<Object> emailsInCaseOfFailure) {
        this.emailsInCaseOfFailure = emailsInCaseOfFailure;
    }

    /**
     * 
     * @return
     *     The emailsInCaseOfSuccess
     */
    public List<Object> getEmailsInCaseOfSuccess() {
        return emailsInCaseOfSuccess;
    }

    /**
     * 
     * @param emailsInCaseOfSuccess
     *     The emailsInCaseOfSuccess
     */
    public void setEmailsInCaseOfSuccess(List<Object> emailsInCaseOfSuccess) {
        this.emailsInCaseOfSuccess = emailsInCaseOfSuccess;
    }

}
