package demo.webmyne.com.retrofitwithdatabasesdemo.api.model;

/**
 * Created by vaibhavirana on 10-04-2017.
 */

public class States {

    /**
     * ActionType : Insert
     * CreatedDate : 14-02-2017 11:19 PM
     * CreatedDateInt : 20170214231908
     * IsActive : true
     * StateID : 30
     * StateName : Andhra Pradesh
     * UpdateDate : 30-03-2017 12:51 PM
     * UpdateDateInt : 20170330125151
     */

    private String ActionType;
    private String CreatedDate;
    private long CreatedDateInt;
    private boolean IsActive;
    private int StateID;
    private String StateName;
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

    public String getStateName() {
        return StateName;
    }

    public void setStateName(String StateName) {
        this.StateName = StateName;
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
