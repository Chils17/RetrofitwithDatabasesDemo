package demo.webmyne.com.retrofitwithdatabasesdemo.api.model;

/**
 * Created by vaibhavirana on 10-04-2017.
 */

public class FAQs {

    /**
     * ActionType : Insert
     * AnswerEn : <ul>
     <li>While adding a case advocate can set date of that case by tapping on the nextdate and then select date from the calendar.</li>
     <li>For already added case advocate can set date of that case from dayview by long click on the next date column then GoLaw application redirect to next date selection screen. Select date from the calendar and enter case stage if advocate wants.</li>
     </ul>

     * AnswerHn : <ul>
     <li>मुकदमा दर्ज करते समय अधिवक्ता तिथि का निर्धारण कर अगली तिथि हेतु जंत्री से तिथि का निर्धारण करे.</li>
     <li>पूर्व सम्मलित मुकदमो के लिए रोज मर्रा की तिथियो का अवलोकन करने के बाद अगली तिथि निर्धारित करे ,उसके लिए उसे अगली तिथि का बटन लम्बे समय तक दबाए रखना होगा.और तब कानून सम्बन्धी निवेदाओ के अनुसार परदे पर अगली तिथि का चयन करे. यदि अधिवक्ता चाहे तो जंत्री से मुक़दमे की स्तिथि अनुसार भी तिथि का चयन कर सकता है.</li>
     </ul>

     * CreatedDate : 20-02-2017 06:52 PM
     * CreatedDateInt : 20170220185227
     * DisplayRank : 2
     * FAQID : 5
     * IsActive : true
     * IsDelete : false
     * QuestionEn : How to adjourn a case?
     * QuestionHn : मुक़दमे का स्थगन कैसे करे ?
     * UpdateDate : 20-02-2017 06:52 PM
     * UpdateDateInt : 20170220185227
     */

    private String ActionType;
    private String AnswerEn;
    private String AnswerHn;
    private String CreatedDate;
    private long CreatedDateInt;
    private int DisplayRank;
    private int FAQID;
    private boolean IsActive;
    private boolean IsDelete;
    private String QuestionEn;
    private String QuestionHn;
    private String UpdateDate;
    private long UpdateDateInt;

    public String getActionType() {
        return ActionType;
    }

    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    public String getAnswerEn() {
        return AnswerEn;
    }

    public void setAnswerEn(String AnswerEn) {
        this.AnswerEn = AnswerEn;
    }

    public String getAnswerHn() {
        return AnswerHn;
    }

    public void setAnswerHn(String AnswerHn) {
        this.AnswerHn = AnswerHn;
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

    public int getDisplayRank() {
        return DisplayRank;
    }

    public void setDisplayRank(int DisplayRank) {
        this.DisplayRank = DisplayRank;
    }

    public int getFAQID() {
        return FAQID;
    }

    public void setFAQID(int FAQID) {
        this.FAQID = FAQID;
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

    public String getQuestionEn() {
        return QuestionEn;
    }

    public void setQuestionEn(String QuestionEn) {
        this.QuestionEn = QuestionEn;
    }

    public String getQuestionHn() {
        return QuestionHn;
    }

    public void setQuestionHn(String QuestionHn) {
        this.QuestionHn = QuestionHn;
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
