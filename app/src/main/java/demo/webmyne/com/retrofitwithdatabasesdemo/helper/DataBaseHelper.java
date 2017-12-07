package demo.webmyne.com.retrofitwithdatabasesdemo.helper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

import demo.webmyne.com.retrofitwithdatabasesdemo.api.model.CaseType;
import demo.webmyne.com.retrofitwithdatabasesdemo.api.model.Districts;
import demo.webmyne.com.retrofitwithdatabasesdemo.api.model.DynamicPages;
import demo.webmyne.com.retrofitwithdatabasesdemo.api.model.FAQs;
import demo.webmyne.com.retrofitwithdatabasesdemo.api.model.Holidays;
import demo.webmyne.com.retrofitwithdatabasesdemo.api.model.States;

/**
 * Created by vaibhavirana on 10-04-2017.
 */

public class DataBaseHelper extends SQLiteOpenHelper {
    public DataBaseHelper(Context context) {
        super(context, AppConstant.DB_NAME, null, AppConstant.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sqlCase = "CREATE TABLE " + AppConstant.TABLE_CASE_TYPE
                + "(" + AppConstant.CASE_TYPE_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + AppConstant.ACTION_TYPE + " VARCHAR," + AppConstant.CASE_TYPE_NAME + " VARCHAR, "
                + AppConstant.CREATED_DATE + " VARCHAR," + AppConstant.CREATED_DATE_INT + " VARCHAR,"
                + AppConstant.IS_ACTIVE + " INTEGER ," + AppConstant.IS_DELETE + " INTEGER ,"
                + AppConstant.UPDATE_DATE + " VARCHAR," + AppConstant.UPDATE_DATE_INT + " VARCHAR);";
        sqLiteDatabase.execSQL(sqlCase);


        String sqlDist = "CREATE TABLE " + AppConstant.TABLE_DISTRICTS
                + "(" + AppConstant.DISTRICTS_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + AppConstant.ACTION_DIST_TYPE + " VARCHAR," + AppConstant.CREATED_DIST_DATE + " VARCHAR, "
                + AppConstant.CREATED_DIST_DATE_INT + " VARCHAR," + AppConstant.DISTRICT_NAME + " VARCHAR,"
                + AppConstant.DIST_IS_ACTIVE + " INTEGER," + AppConstant.STATE_ID + " VARCHAR,"
                + AppConstant.UPDATE_DIST_DATE + " VARCHAR," + AppConstant.UPDATE_DIST_DATE_INT + " VARCHAR);";
        sqLiteDatabase.execSQL(sqlDist);


        String sqlDyn = "CREATE TABLE " + AppConstant.TABLE_DYNAMIC_PAGES
                + "(" + AppConstant.DYNA_PAGE_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + AppConstant.ACTION_DYNA_TYPE + " VARCHAR," + AppConstant.CONTENTS + " VARCHAR, "
                + AppConstant.CREATED_DYNA_DATE + " VARCHAR," + AppConstant.CREATED_DYNA_DATE_INT + " VARCHAR,"
                + AppConstant.DYNA_IS_DELETE + " INTEGER," + AppConstant.DYAN_IS_VISIBLE + " INTEGER,"
                + AppConstant.PAGE_NAME + " VARCHAR," + AppConstant.PAGE_TITLE + " VARCHAR,"
                + AppConstant.UPDATE_DYNA_DATE + " VARCHAR," + AppConstant.UPDATE_DYNA_DATE_INT + " VARCHAR);";
        sqLiteDatabase.execSQL(sqlDyn);


        String sqlFaq = "CREATE TABLE " + AppConstant.TABLE_FAQS
                + "(" + AppConstant.DISPLAY_RANK + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + AppConstant.ACTION_FAQS_TYPE + " VARCHAR," + AppConstant.ANSWER_EN + " VARCHAR, "
                + AppConstant.ANSWER_HN + " VARCHAR," + AppConstant.CREATED_EAQS_DATE + " VARCHAR,"
                + AppConstant.CREATED_FAQS_DATE_INT + " VARCHAR," + AppConstant.FAQ_ID + " VARCHAR,"
                + AppConstant.FAQS_IS_DELETE + " INTEGER," + AppConstant.FAQS_IS_ACTIVE + " INTEGER,"
                + AppConstant.QUESTION_EN + " VARCHAR," + AppConstant.QUESTION_HN + " VARCHAR,"
                + AppConstant.UPDATE_FAQS_DATE + " VARCHAR," + AppConstant.UPDATE_FAQS_DATE_INT + " VARCHAR);";
        sqLiteDatabase.execSQL(sqlFaq);


        String sqlHld = "CREATE TABLE " + AppConstant.TABLE_HOLIDAYS
                + "(" + AppConstant.HLD_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + AppConstant.ACTION_HLD_TYPE + " VARCHAR," + AppConstant.CREATED_HLD_DATE + " VARCHAR, "
                + AppConstant.CREATED_HLD_DATE_INT + " VARCHAR," + AppConstant.HLD_IS_DELETE + " INTEGER,"
                + AppConstant.START_HLD_DATE + " VARCHAR," + AppConstant.START_HLD_DATE_INT + " VARCHAR,"
                + AppConstant.HLD_TITLE + " VARCHAR," + AppConstant.UPDATE_HLD_DATE + " VARCHAR,"
                + AppConstant.UPDATE_HLD_DATE_INT + " VARCHAR);";
        sqLiteDatabase.execSQL(sqlHld);


        String sqlSte = "CREATE TABLE " + AppConstant.TABLE_STATES
                + "(" + AppConstant.STE_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + AppConstant.ACTION_STE_TYPE + " VARCHAR," + AppConstant.CREATED_STE_DATE + " VARCHAR, "
                + AppConstant.CREATED_STE_DATE_INT + " VARCHAR," + AppConstant.STE_IS_ACTIVE + " INTEGER,"
                + AppConstant.STE_NAME + " VARCHAR," + AppConstant.UPDATE_STE_DATE + " VARCHAR,"
                + AppConstant.UPDATE_STE_DATE_INT + " VARCHAR);";
        sqLiteDatabase.execSQL(sqlSte);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String sqlCase = "DROP TABLE IF EXISTS CaseType";
        sqLiteDatabase.execSQL(sqlCase);

        String sqlDist = "DROP TABLE IF EXISTS Districts";
        sqLiteDatabase.execSQL(sqlDist);

        String sqlDyn = "DROP TABLE IF EXISTS DynamicPages";
        sqLiteDatabase.execSQL(sqlDyn);

        String sqlFaq = "DROP TABLE IF EXISTS FAQs";
        sqLiteDatabase.execSQL(sqlFaq);

        String sqlHld = "DROP TABLE IF EXISTS Holidays";
        sqLiteDatabase.execSQL(sqlHld);

        String sqlSte = "DROP TABLE IF EXISTS States";
        sqLiteDatabase.execSQL(sqlSte);
        onCreate(sqLiteDatabase);
    }

    //insert user casetype into the database
    public boolean addCaseType(List<CaseType> caseTypeBeen) {
        SQLiteDatabase db = this.getWritableDatabase();

        for (int i = 0; i < caseTypeBeen.size(); i++) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(AppConstant.ACTION_TYPE, caseTypeBeen.get(i).getActionType());
            contentValues.put(AppConstant.CASE_TYPE_ID, caseTypeBeen.get(i).getCaseTypeID());
            contentValues.put(AppConstant.CASE_TYPE_NAME, caseTypeBeen.get(i).getCaseTypeName());
            contentValues.put(AppConstant.CREATED_DATE, caseTypeBeen.get(i).getCreatedDate());
            contentValues.put(AppConstant.CREATED_DATE_INT, caseTypeBeen.get(i).getCreatedDateInt());
            contentValues.put(AppConstant.IS_ACTIVE, caseTypeBeen.get(i).isIsActive());
            contentValues.put(AppConstant.IS_DELETE, caseTypeBeen.get(i).isIsDelete());
            contentValues.put(AppConstant.UPDATE_DATE, caseTypeBeen.get(i).getUpdateDate());
            contentValues.put(AppConstant.UPDATE_DATE_INT, caseTypeBeen.get(i).getUpdateDateInt());
            db.insert(AppConstant.TABLE_CASE_TYPE, null, contentValues);
        }
        db.close();
        return true;
    }

    //Show user deatails
    public List<CaseType> getCaseType() {
        SQLiteDatabase db = this.getReadableDatabase();
        String sql = "SELECT * FROM UserProfile";
        Cursor cursor = db.rawQuery(sql, null);

        List<CaseType> caseType = new ArrayList<>();

        if (cursor.moveToFirst()) {
            do {
                CaseType caseTypeBean = new CaseType();
                caseTypeBean.setActionType(cursor.getString(cursor.getColumnIndex(AppConstant.ACTION_TYPE)));
                caseTypeBean.setCaseTypeName(cursor.getString(cursor.getColumnIndex(AppConstant.CASE_TYPE_NAME)));
                caseTypeBean.setCreatedDate(cursor.getString(cursor.getColumnIndex(AppConstant.CREATED_DATE)));
                caseTypeBean.setCreatedDateInt(cursor.getLong(cursor.getColumnIndex(AppConstant.CREATED_DATE_INT)));
                caseTypeBean.setIsActive(cursor.getInt(cursor.getColumnIndex(AppConstant.IS_ACTIVE)) == 1);
                caseTypeBean.setIsDelete(cursor.getInt(cursor.getColumnIndex(AppConstant.IS_DELETE)) == 0);
                caseTypeBean.setUpdateDate(cursor.getString(cursor.getColumnIndex(AppConstant.UPDATE_DATE)));
                caseTypeBean.setUpdateDateInt(cursor.getLong(cursor.getColumnIndex(String.valueOf(AppConstant.UPDATE_DATE_INT))));

                caseType.add(caseTypeBean);
            } while (cursor.moveToNext());
        }
        return caseType;
    }

    //insert user district into the database
    public boolean addDistrict(List<Districts> districtsBeen) {
        SQLiteDatabase db = this.getWritableDatabase();

        for (int i = 0; i < districtsBeen.size(); i++) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(AppConstant.ACTION_DIST_TYPE, districtsBeen.get(i).getActionType());
            contentValues.put(AppConstant.CREATED_DIST_DATE, districtsBeen.get(i).getCreatedDate());
            contentValues.put(AppConstant.CREATED_DATE_INT, districtsBeen.get(i).getCreatedDateInt());
            contentValues.put(AppConstant.DISTRICT_NAME, districtsBeen.get(i).getDistrictName());
            contentValues.put(AppConstant.DIST_IS_ACTIVE, districtsBeen.get(i).isIsActive());
            contentValues.put(AppConstant.STATE_ID, districtsBeen.get(i).getStateID());
            contentValues.put(AppConstant.UPDATE_DIST_DATE, districtsBeen.get(i).getUpdateDate());
            contentValues.put(AppConstant.UPDATE_DIST_DATE_INT, districtsBeen.get(i).getUpdateDateInt());
            db.insert(AppConstant.TABLE_DISTRICTS, null, contentValues);
        }
        db.close();
        return true;
    }

    //Show user deatails
    public List<Districts> getDistrict() {
        SQLiteDatabase db = this.getReadableDatabase();
        String sql = "SELECT * FROM UserProfile";
        Cursor cursor = db.rawQuery(sql, null);

        List<Districts> districts = new ArrayList<>();

        if (cursor.moveToFirst()) {
            do {
                Districts districtsBean = new Districts();
                districtsBean.setActionType(cursor.getString(cursor.getColumnIndex(AppConstant.ACTION_DIST_TYPE)));
                districtsBean.setCreatedDate(cursor.getString(cursor.getColumnIndex(AppConstant.CREATED_DIST_DATE)));
                districtsBean.setCreatedDateInt(cursor.getLong(cursor.getColumnIndex(AppConstant.CREATED_DIST_DATE_INT)));
                districtsBean.setDistrictName(cursor.getString(cursor.getColumnIndex(AppConstant.DISTRICT_NAME)));
                districtsBean.setIsActive(cursor.getInt(cursor.getColumnIndex(AppConstant.DIST_IS_ACTIVE)) == 1);
                districtsBean.setUpdateDate(cursor.getString(cursor.getColumnIndex(AppConstant.UPDATE_DIST_DATE)));
                districtsBean.setUpdateDateInt(cursor.getLong(cursor.getColumnIndex(String.valueOf(AppConstant.UPDATE_DIST_DATE_INT))));

                districts.add(districtsBean);
            } while (cursor.moveToNext());
        }
        return districts;
    }


    //insert user casetype into the database
    public boolean addDynamic(List<DynamicPages> dynamicPagesBeen) {
        SQLiteDatabase db = this.getWritableDatabase();

        for (int i = 0; i < dynamicPagesBeen.size(); i++) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(AppConstant.ACTION_DYNA_TYPE, dynamicPagesBeen.get(i).getActionType());
            contentValues.put(AppConstant.CONTENTS, dynamicPagesBeen.get(i).getContents());
            contentValues.put(AppConstant.CREATED_DYNA_DATE, dynamicPagesBeen.get(i).getCreatedDate());
            contentValues.put(AppConstant.CREATED_DYNA_DATE_INT, dynamicPagesBeen.get(i).getCreatedDateInt());
            contentValues.put(AppConstant.DYNA_IS_DELETE, dynamicPagesBeen.get(i).isIsDelete());
            contentValues.put(AppConstant.DYAN_IS_VISIBLE, dynamicPagesBeen.get(i).isIsVisible());
            contentValues.put(AppConstant.PAGE_NAME, dynamicPagesBeen.get(i).getPageName());
            contentValues.put(AppConstant.PAGE_TITLE, dynamicPagesBeen.get(i).getPageTitle());
            db.insert(AppConstant.TABLE_DYNAMIC_PAGES, null, contentValues);
        }
        db.close();
        return true;
    }

    //Show user deatails
    public List<DynamicPages> getDynamic() {
        SQLiteDatabase db = this.getReadableDatabase();
        String sql = "SELECT * FROM UserProfile";
        Cursor cursor = db.rawQuery(sql, null);

        List<DynamicPages> dynamicPages = new ArrayList<>();

        if (cursor.moveToFirst()) {
            do {
                DynamicPages dynamicPagesBean = new DynamicPages();
                dynamicPagesBean.setActionType(cursor.getString(cursor.getColumnIndex(AppConstant.ACTION_DYNA_TYPE)));
                dynamicPagesBean.setContents(cursor.getString(cursor.getColumnIndex(AppConstant.CONTENTS)));
                dynamicPagesBean.setCreatedDate(cursor.getString(cursor.getColumnIndex(AppConstant.CREATED_DYNA_DATE)));
                dynamicPagesBean.setCreatedDateInt(cursor.getLong(cursor.getColumnIndex(AppConstant.CREATED_DYNA_DATE_INT)));
                dynamicPagesBean.setIsDelete(cursor.getInt(cursor.getColumnIndex(AppConstant.DYNA_IS_DELETE)) == 0);
                dynamicPagesBean.setIsVisible(cursor.getInt(cursor.getColumnIndex(AppConstant.DYAN_IS_VISIBLE)) == 1);
                dynamicPagesBean.setPageName(cursor.getString(cursor.getColumnIndex(AppConstant.PAGE_NAME)));
                dynamicPagesBean.setPageTitle(cursor.getString(cursor.getColumnIndex(AppConstant.PAGE_TITLE)));
                dynamicPagesBean.setUpdateDate(cursor.getString(cursor.getColumnIndex(AppConstant.UPDATE_DYNA_DATE)));
                dynamicPagesBean.setUpdateDateInt(cursor.getLong(cursor.getColumnIndex(String.valueOf(AppConstant.UPDATE_DYNA_DATE_INT))));

                dynamicPages.add(dynamicPagesBean);
            } while (cursor.moveToNext());
        }
        return dynamicPages;
    }

    //insert user faqs into the database
    public boolean addFaqs(List<FAQs> faQsBeen) {
        SQLiteDatabase db = this.getWritableDatabase();

        for (int i = 0; i < faQsBeen.size(); i++) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(AppConstant.ACTION_FAQS_TYPE, faQsBeen.get(i).getActionType());
            contentValues.put(AppConstant.ANSWER_EN, faQsBeen.get(i).getAnswerEn());
            contentValues.put(AppConstant.ANSWER_HN, faQsBeen.get(i).getAnswerHn());
            contentValues.put(AppConstant.CREATED_EAQS_DATE, faQsBeen.get(i).getCreatedDate());
            contentValues.put(AppConstant.CREATED_FAQS_DATE_INT, faQsBeen.get(i).getCreatedDateInt());
            contentValues.put(AppConstant.FAQ_ID, faQsBeen.get(i).getFAQID());
            contentValues.put(AppConstant.FAQS_IS_ACTIVE, faQsBeen.get(i).isIsActive());
            contentValues.put(AppConstant.FAQS_IS_DELETE, faQsBeen.get(i).isIsDelete());
            contentValues.put(AppConstant.QUESTION_EN, faQsBeen.get(i).getQuestionEn());
            contentValues.put(AppConstant.QUESTION_HN, faQsBeen.get(i).getQuestionHn());
            contentValues.put(AppConstant.UPDATE_FAQS_DATE, faQsBeen.get(i).getUpdateDate());
            contentValues.put(AppConstant.UPDATE_FAQS_DATE_INT, faQsBeen.get(i).getUpdateDateInt());
            db.insert(AppConstant.TABLE_FAQS, null, contentValues);
        }
        db.close();
        return true;
    }

    //Show user deatails
    public List<FAQs> getFAQs() {
        SQLiteDatabase db = this.getReadableDatabase();
        String sql = "SELECT * FROM UserProfile";
        Cursor cursor = db.rawQuery(sql, null);

        List<FAQs> faQs = new ArrayList<>();

        if (cursor.moveToFirst()) {
            do {
                FAQs faQsBean = new FAQs();
                faQsBean.setActionType(cursor.getString(cursor.getColumnIndex(AppConstant.ACTION_FAQS_TYPE)));
                faQsBean.setAnswerEn(cursor.getString(cursor.getColumnIndex(AppConstant.ANSWER_EN)));
                faQsBean.setAnswerHn(cursor.getString(cursor.getColumnIndex(AppConstant.ANSWER_HN)));
                faQsBean.setCreatedDate(cursor.getString(cursor.getColumnIndex(AppConstant.CREATED_EAQS_DATE)));
                faQsBean.setCreatedDateInt(cursor.getLong(cursor.getColumnIndex(AppConstant.CREATED_FAQS_DATE_INT)));
                faQsBean.setIsActive(cursor.getInt(cursor.getColumnIndex(AppConstant.FAQS_IS_ACTIVE)) == 1);
                faQsBean.setIsDelete(cursor.getInt(cursor.getColumnIndex(AppConstant.FAQS_IS_DELETE)) == 0);
                faQsBean.setQuestionEn(cursor.getString(cursor.getColumnIndex(AppConstant.QUESTION_EN)));
                faQsBean.setQuestionHn(cursor.getString(cursor.getColumnIndex(AppConstant.QUESTION_HN)));
                faQsBean.setUpdateDate(cursor.getString(cursor.getColumnIndex(AppConstant.UPDATE_FAQS_DATE)));
                faQsBean.setUpdateDateInt(cursor.getLong(cursor.getColumnIndex(String.valueOf(AppConstant.UPDATE_FAQS_DATE_INT))));

                faQs.add(faQsBean);
            } while (cursor.moveToNext());
        }
        return faQs;
    }

    //insert user holiday into the database
    public boolean addHoliday(List<Holidays> holidaysBeen) {
        SQLiteDatabase db = this.getWritableDatabase();

        for (int i = 0; i < holidaysBeen.size(); i++) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(AppConstant.ACTION_HLD_TYPE, holidaysBeen.get(i).getActionType());
            contentValues.put(AppConstant.CREATED_HLD_DATE, holidaysBeen.get(i).getCreatedDate());
            contentValues.put(AppConstant.CREATED_HLD_DATE_INT, holidaysBeen.get(i).getCreatedDateInt());
            contentValues.put(AppConstant.HLD_IS_DELETE, holidaysBeen.get(i).isIsDelete());
            contentValues.put(AppConstant.START_HLD_DATE, holidaysBeen.get(i).getStartDate());
            contentValues.put(AppConstant.START_HLD_DATE_INT, holidaysBeen.get(i).getStartDateInt());
            contentValues.put(AppConstant.HLD_TITLE, holidaysBeen.get(i).getTitle());
            contentValues.put(AppConstant.UPDATE_HLD_DATE, holidaysBeen.get(i).getUpdateDate());
            contentValues.put(AppConstant.UPDATE_HLD_DATE_INT, holidaysBeen.get(i).getUpdateDateInt());
            db.insert(AppConstant.TABLE_HOLIDAYS, null, contentValues);
        }
        db.close();
        return true;
    }

    //Show user deatails
    public List<Holidays> getHoliday() {
        SQLiteDatabase db = this.getReadableDatabase();
        String sql = "SELECT * FROM UserProfile";
        Cursor cursor = db.rawQuery(sql, null);

        List<Holidays> holidays = new ArrayList<>();

        if (cursor.moveToFirst()) {
            do {
                Holidays holidaysBean = new Holidays();
                holidaysBean.setActionType(cursor.getString(cursor.getColumnIndex(AppConstant.ACTION_HLD_TYPE)));
                holidaysBean.setCreatedDate(cursor.getString(cursor.getColumnIndex(AppConstant.CREATED_HLD_DATE)));
                holidaysBean.setCreatedDateInt(cursor.getLong(cursor.getColumnIndex(AppConstant.CREATED_HLD_DATE_INT)));
                holidaysBean.setIsDelete(cursor.getInt(cursor.getColumnIndex(AppConstant.HLD_IS_DELETE)) == 0);
                holidaysBean.setStartDate(cursor.getString(cursor.getColumnIndex(AppConstant.START_HLD_DATE)));
                holidaysBean.setStartDateInt(cursor.getLong(cursor.getColumnIndex(AppConstant.START_HLD_DATE_INT)));
                holidaysBean.setTitle(cursor.getString(cursor.getColumnIndex(AppConstant.HLD_TITLE)));
                holidaysBean.setUpdateDate(cursor.getString(cursor.getColumnIndex(AppConstant.UPDATE_HLD_DATE)));
                holidaysBean.setUpdateDateInt(cursor.getLong(cursor.getColumnIndex(String.valueOf(AppConstant.UPDATE_HLD_DATE_INT))));

                holidays.add(holidaysBean);
            } while (cursor.moveToNext());
        }
        return holidays;
    }

    //insert user State into the database
    public boolean addState(List<States> statesBeen) {
        SQLiteDatabase db = this.getWritableDatabase();

        for (int i = 0; i < statesBeen.size(); i++) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(AppConstant.ACTION_STE_TYPE, statesBeen.get(i).getActionType());
            contentValues.put(AppConstant.CREATED_STE_DATE, statesBeen.get(i).getCreatedDate());
            contentValues.put(AppConstant.CREATED_STE_DATE_INT, statesBeen.get(i).getCreatedDateInt());
            contentValues.put(AppConstant.STE_IS_ACTIVE, statesBeen.get(i).isIsActive());
            contentValues.put(AppConstant.STE_NAME, statesBeen.get(i).getStateName());
            contentValues.put(AppConstant.UPDATE_STE_DATE, statesBeen.get(i).getUpdateDate());
            contentValues.put(AppConstant.UPDATE_STE_DATE_INT, statesBeen.get(i).getUpdateDateInt());
            db.insert(AppConstant.TABLE_STATES, null, contentValues);
        }
        db.close();
        return true;
    }

    //Show user deatails
    public List<States> getStates() {
        SQLiteDatabase db = this.getReadableDatabase();
        String sql = "SELECT * FROM UserProfile";
        Cursor cursor = db.rawQuery(sql, null);

        List<States> states = new ArrayList<>();


        if (cursor.moveToFirst()) {
            do {
                States statesBean = new States();
                statesBean.setActionType(cursor.getString(cursor.getColumnIndex(AppConstant.ACTION_STE_TYPE)));
                statesBean.setCreatedDate(cursor.getString(cursor.getColumnIndex(AppConstant.CREATED_STE_DATE)));
                statesBean.setCreatedDateInt(cursor.getLong(cursor.getColumnIndex(AppConstant.CREATED_STE_DATE_INT)));
                statesBean.setIsActive(cursor.getInt(cursor.getColumnIndex(AppConstant.STE_IS_ACTIVE)) == 1);
                statesBean.setStateName(cursor.getString(cursor.getColumnIndex(AppConstant.STE_NAME)));
                statesBean.setUpdateDate(cursor.getString(cursor.getColumnIndex(AppConstant.UPDATE_STE_DATE)));
                statesBean.setUpdateDateInt(cursor.getLong(cursor.getColumnIndex(String.valueOf(AppConstant.UPDATE_STE_DATE_INT))));

                states.add(statesBean);
            } while (cursor.moveToNext());
        }
        return states;
    }
}
