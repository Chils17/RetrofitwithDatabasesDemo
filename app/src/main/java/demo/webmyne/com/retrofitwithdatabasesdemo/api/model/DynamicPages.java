package demo.webmyne.com.retrofitwithdatabasesdemo.api.model;

/**
 * Created by vaibhavirana on 10-04-2017.
 */

public class DynamicPages {

    /**
     * ActionType : Insert
     * Contents : <p>Test</p>

     * CreatedDate : 29-09-2016 12:00 AM
     * CreatedDateInt : 20160929000000
     * DynamicPageID : 1
     * IsDelete : false
     * IsVisible : true
     * PageName : About Us
     * PageTitle : About Us
     * UpdateDate : 17-11-2016 04:55 PM
     * UpdateDateInt : 20161117165543
     */

    private String ActionType;
    private String Contents;
    private String CreatedDate;
    private long CreatedDateInt;
    private int DynamicPageID;
    private boolean IsDelete;
    private boolean IsVisible;
    private String PageName;
    private String PageTitle;
    private String UpdateDate;
    private long UpdateDateInt;

    public String getActionType() {
        return ActionType;
    }

    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    public String getContents() {
        return Contents;
    }

    public void setContents(String Contents) {
        this.Contents = Contents;
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

    public int getDynamicPageID() {
        return DynamicPageID;
    }

    public void setDynamicPageID(int DynamicPageID) {
        this.DynamicPageID = DynamicPageID;
    }

    public boolean isIsDelete() {
        return IsDelete;
    }

    public void setIsDelete(boolean IsDelete) {
        this.IsDelete = IsDelete;
    }

    public boolean isIsVisible() {
        return IsVisible;
    }

    public void setIsVisible(boolean IsVisible) {
        this.IsVisible = IsVisible;
    }

    public String getPageName() {
        return PageName;
    }

    public void setPageName(String PageName) {
        this.PageName = PageName;
    }

    public String getPageTitle() {
        return PageTitle;
    }

    public void setPageTitle(String PageTitle) {
        this.PageTitle = PageTitle;
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
