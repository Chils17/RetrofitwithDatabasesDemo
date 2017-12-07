package demo.webmyne.com.retrofitwithdatabasesdemo.api.model;

import java.util.List;

/**
 * Created by vaibhavirana on 10-04-2017.
 */

public class Data {
    private List<CaseType> CaseType;
    private String CurrentDate;
    private List<Districts> Districts;
    private List<DynamicPages> DynamicPages;
    private List<FAQs> FAQs;
    private List<Holidays> Holidays;
    private List<States> States;


    public List<CaseType> getCaseType() {
        return CaseType;
    }

    public void setCaseType(List<CaseType> caseType) {
        CaseType = caseType;
    }

    public String getCurrentDate() {
        return CurrentDate;
    }

    public void setCurrentDate(String currentDate) {
        CurrentDate = currentDate;
    }

    public List<demo.webmyne.com.retrofitwithdatabasesdemo.api.model.Districts> getDistricts() {
        return Districts;
    }

    public void setDistricts(List<demo.webmyne.com.retrofitwithdatabasesdemo.api.model.Districts> districts) {
        Districts = districts;
    }

    public List<demo.webmyne.com.retrofitwithdatabasesdemo.api.model.DynamicPages> getDynamicPages() {
        return DynamicPages;
    }

    public void setDynamicPages(List<demo.webmyne.com.retrofitwithdatabasesdemo.api.model.DynamicPages> dynamicPages) {
        DynamicPages = dynamicPages;
    }

    public List<demo.webmyne.com.retrofitwithdatabasesdemo.api.model.FAQs> getFAQs() {
        return FAQs;
    }

    public void setFAQs(List<demo.webmyne.com.retrofitwithdatabasesdemo.api.model.FAQs> FAQs) {
        this.FAQs = FAQs;
    }

    public List<demo.webmyne.com.retrofitwithdatabasesdemo.api.model.Holidays> getHolidays() {
        return Holidays;
    }

    public void setHolidays(List<demo.webmyne.com.retrofitwithdatabasesdemo.api.model.Holidays> holidays) {
        Holidays = holidays;
    }

    public List<demo.webmyne.com.retrofitwithdatabasesdemo.api.model.States> getStates() {
        return States;
    }

    public void setStates(List<demo.webmyne.com.retrofitwithdatabasesdemo.api.model.States> states) {
        States = states;
    }
}
