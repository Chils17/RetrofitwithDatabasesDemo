package demo.webmyne.com.retrofitwithdatabasesdemo.api.model;

/**
 * Created by vaibhavirana on 10-04-2017.
 */

public class UserResponse {
    private int ResponseCode;
    private ResponseDataBean ResponseData;
    private String ResponseMsg;

    public int getResponseCode() {
        return ResponseCode;
    }

    public void setResponseCode(int responseCode) {
        ResponseCode = responseCode;
    }

    public ResponseDataBean getResponseData() {
        return ResponseData;
    }

    public void setResponseData(ResponseDataBean responseData) {
        ResponseData = responseData;
    }

    public String getResponseMsg() {
        return ResponseMsg;
    }

    public void setResponseMsg(String responseMsg) {
        ResponseMsg = responseMsg;
    }
}
