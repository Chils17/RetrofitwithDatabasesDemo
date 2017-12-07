package demo.webmyne.com.retrofitwithdatabasesdemo.api.model;

/**
 * Created by vaibhavirana on 10-04-2017.
 */

public class Holidays {

    /**
     * ActionType : Insert
     * CreatedDate : 09-03-2017 10:39 PM
     * CreatedDateInt : 20170309223928
     * HolidayID : 3
     * IsDelete : false
     * StartDate : 10-03-2017 12:00 AM
     * StartDateInt : 20170310000000
     * Title : test holiday 10-03-2017
     * UpdateDate : 09-03-2017 10:39 PM
     * UpdateDateInt : 20170309223928
     */

    private String ActionType;
    private String CreatedDate;
    private long CreatedDateInt;
    private int HolidayID;
    private boolean IsDelete;
    private String StartDate;
    private long StartDateInt;
    private String Title;
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

    public int getHolidayID() {
        return HolidayID;
    }

    public void setHolidayID(int HolidayID) {
        this.HolidayID = HolidayID;
    }

    public boolean isIsDelete() {
        return IsDelete;
    }

    public void setIsDelete(boolean IsDelete) {
        this.IsDelete = IsDelete;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    public long getStartDateInt() {
        return StartDateInt;
    }

    public void setStartDateInt(long StartDateInt) {
        this.StartDateInt = StartDateInt;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
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
