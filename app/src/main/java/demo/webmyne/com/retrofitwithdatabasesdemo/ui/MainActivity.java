package demo.webmyne.com.retrofitwithdatabasesdemo.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import demo.webmyne.com.retrofitwithdatabasesdemo.R;
import demo.webmyne.com.retrofitwithdatabasesdemo.api.call.GetUser;
import demo.webmyne.com.retrofitwithdatabasesdemo.api.model.CaseType;
import demo.webmyne.com.retrofitwithdatabasesdemo.api.model.Data;
import demo.webmyne.com.retrofitwithdatabasesdemo.api.model.Districts;
import demo.webmyne.com.retrofitwithdatabasesdemo.api.model.DynamicPages;
import demo.webmyne.com.retrofitwithdatabasesdemo.api.model.FAQs;
import demo.webmyne.com.retrofitwithdatabasesdemo.api.model.Holidays;
import demo.webmyne.com.retrofitwithdatabasesdemo.api.model.States;
import demo.webmyne.com.retrofitwithdatabasesdemo.api.model.UserRequest;
import demo.webmyne.com.retrofitwithdatabasesdemo.helper.DataBaseHelper;
import demo.webmyne.com.retrofitwithdatabasesdemo.helper.Function;

public class MainActivity extends AppCompatActivity {

    private Context context;
    private DataBaseHelper db;
    private List<CaseType> caseTypes;
    private List<Districts> districtsList;
    private List<DynamicPages> dynamicPages;
    private List<Holidays> holidaysList;
    private List<FAQs> faQsList;
    private List<States> statesList;
    private UserRequest userRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        context = this;

        db = new DataBaseHelper(context);
        caseTypes = new ArrayList<>();
        districtsList = new ArrayList<>();
        statesList = new ArrayList<>();
        faQsList = new ArrayList<>();
        holidaysList = new ArrayList<>();
        dynamicPages = new ArrayList<>();
        callApi();
    }

    private void callApi() {
        userRequest = new UserRequest();
        userRequest.setUpdateDate("");

        new GetUser(context, new GetUser.OnGetUser() {
            @Override
            public void onSuccess(List<Data> data) {

                if (!data.isEmpty() || data != null) {
                    Data dataResult = data.get(0);

                    caseTypes.addAll(dataResult.getCaseType());
                    db.addCaseType(caseTypes);
                    //db.getCaseType();

                    districtsList.addAll(dataResult.getDistricts());
                    db.addDistrict(districtsList);
                   // db.getDistrict();

                    dynamicPages.addAll(dataResult.getDynamicPages());
                    db.addDynamic(dynamicPages);
                   // db.getDynamic();

                    faQsList.addAll(dataResult.getFAQs());
                    db.addFaqs(faQsList);
                   // db.getFAQs();

                    holidaysList.addAll(dataResult.getHolidays());
                    db.addHoliday(holidaysList);
                   // db.getHoliday();

                    statesList.addAll(dataResult.getStates());
                    db.addState(statesList);
                   // db.getStates();
                }
            }

            @Override
            public void onFail() {
                Function.showToast(context, getString(R.string.try_again));
            }

            @Override
            public void onServerError(String responseMessage) {
                Function.showToast(context, responseMessage);
            }
        }, userRequest);
    }
}
