package demo.webmyne.com.retrofitwithdatabasesdemo.api;

import demo.webmyne.com.retrofitwithdatabasesdemo.api.model.UserRequest;
import demo.webmyne.com.retrofitwithdatabasesdemo.api.model.UserResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by vaibhavirana on 10-04-2017.
 */

public interface ApiCalling {
    @POST(ApiConstant.getUserDetail)
    Call<UserResponse> getUserDetail(@Body UserRequest userRequest);
}
