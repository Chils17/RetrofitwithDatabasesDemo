package demo.webmyne.com.retrofitwithdatabasesdemo.api.model;

/**
 * Created by vaibhavirana on 10-04-2017.
 */

public class Districts {

    /**
     * ActionType : Insert
     * CreatedDate : 14-02-2017 11:39 PM
     * CreatedDateInt : 20170214233954
     * DistrictID : 28
     * DistrictName : Central Delhi
     * IsActive : true
     * StateID : 63
     * UpdateDate : 14-02-2017 11:39 PM
     * UpdateDateInt : 20170214233954
     */

    private String ActionType;
    private String CreatedDate;
    private long CreatedDateInt;
    private int DistrictID;
    private String DistrictName;
    private boolean IsActive;
    private int StateID;
    private String UpdateDate;
    private long UpdateDateInt;

    public String getActionType() {
        return ActionType;
    }

    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
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

    public int getDistrictID() {
        return DistrictID;
    }

    public void setDistrictID(int DistrictID) {
        this.DistrictID = DistrictID;
    }

    public String getDistrictName() {
        return DistrictName;
    }

    public void setDistrictName(String DistrictName) {
        this.DistrictName = DistrictName;
    }

    public boolean isIsActive() {
        return IsActive;
    }

    public void setIsActive(boolean IsActive) {
        this.IsActive = IsActive;
    }

    public int getStateID() {
        return StateID;
    }

    public void setStateID(int StateID) {
        this.StateID = StateID;
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
