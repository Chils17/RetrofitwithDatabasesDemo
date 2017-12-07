package demo.webmyne.com.retrofitwithdatabasesdemo.api.model;

import java.util.List;

/**
 * Created by vaibhavirana on 10-04-2017.
 */

public class ResponseDataBean {
    private List<Data> Data;

    public List<Data> getData() {
        return Data;
    }

    public void setData(List<Data> data) {
        Data = data;
    }
}
