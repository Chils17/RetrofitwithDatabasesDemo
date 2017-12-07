package demo.webmyne.com.retrofitwithdatabasesdemo.api.model;

/**
 * Created by vaibhavirana on 10-04-2017.
 */

public class CaseType {
    /**
     * ActionType : Insert
     * CaseTypeID : 2
     * CaseTypeName : Bail Application
     * CreatedDate : 15-02-2017 02:29 PM
     * CreatedDateInt : 20170215142912
     * IsActive : true
     * IsDelete : false
     * UpdateDate : 15-02-2017 02:29 PM
     * UpdateDateInt : 20170215142912
     */

    private String ActionType;
    private int CaseTypeID;
    private String CaseTypeName;
    private String CreatedDate;
    private long CreatedDateInt;
    private boolean IsActive;
    private boolean IsDelete;
    private String UpdateDate;
    private long UpdateDateInt;

    public String getActionType() {
        return ActionType;
    }

    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    public int getCaseTypeID() {
        return CaseTypeID;
    }

    public void setCaseTypeID(int CaseTypeID) {
        this.CaseTypeID = CaseTypeID;
    }

    public String getCaseTypeName() {
        return CaseTypeName;
    }

    public void setCaseTypeName(String CaseTypeName) {
        this.CaseTypeName = CaseTypeName;
    }

    public String getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(String CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    public long getCreatedDateInt() {
        return CreatedDateInt;
    }

    public void setCreatedDateInt(long CreatedDateInt) {
        this.CreatedDateInt = CreatedDateInt;
    }

    public boolean isIsActive() {
        return IsActive;
    }

    public void setIsActive(boolean IsActive) {
        this.IsActive = IsActive;
    }

    public boolean isIsDelete() {
        return IsDelete;
    }

    public void setIsDelete(boolean IsDelete) {
        this.IsDelete = IsDelete;
    }

    public String getUpdateDate() {
        return UpdateDate;
    }

    public void setUpdateDate(String UpdateDate) {
        this.UpdateDate = UpdateDate;
    }

    public long getUpdateDateInt() {
        return UpdateDateInt;
    }

    public void setUpdateDateInt(long UpdateDateInt) {
        this.UpdateDateInt = UpdateDateInt;
    }
}
