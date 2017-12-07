package demo.webmyne.com.retrofitwithdatabasesdemo.api.call;

import android.content.Context;
import android.util.Log;

import java.util.List;

import demo.webmyne.com.retrofitwithdatabasesdemo.api.ApiCalling;
import demo.webmyne.com.retrofitwithdatabasesdemo.api.model.Data;
import demo.webmyne.com.retrofitwithdatabasesdemo.api.model.UserRequest;
import demo.webmyne.com.retrofitwithdatabasesdemo.api.model.UserResponse;
import demo.webmyne.com.retrofitwithdatabasesdemo.helper.Function;
import demo.webmyne.com.retrofitwithdatabasesdemo.helper.MyApplication;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by vaibhavirana on 10-04-2017.
 */

public class GetUser {
    private Context context;
    private OnGetUser onGetUser;
    private UserRequest userRequest;

    public GetUser(Context context, OnGetUser onGetUser, UserRequest userRequest) {
        this.onGetUser = onGetUser;
        this.userRequest = userRequest;
        this.context = context;
        call();
    }

    private void call() {
        ApiCalling api = MyApplication.getRetrofit().create(ApiCalling.class);
        api.getUserDetail(userRequest).enqueue(new Callback<UserResponse>() {
            @Override
            public void onResponse(Call<UserResponse> call, Response<UserResponse> response) {
                //Log.e("res", "" + response.code());
               // Log.e("res", "" + response.body().getResponseCode());

                if (response.body() != null) {
                    Log.e("res", Function.jsonString(response.body()));
                    if (response.body().getResponseCode()==1) {
                        onGetUser.onSuccess(response.body().getResponseData().getData());

                    } else {
                        onGetUser.onServerError(response.body().getResponseMsg());
                    }

                } else {
                    onGetUser.onFail();
                }
            }

            @Override
            public void onFailure(Call<UserResponse> call, Throwable t) {
                Log.e("res", "" + t.getMessage());
            }
        });

    }


    public interface OnGetUser {
        void onSuccess(List<Data> data);

        void onFail();

        void onServerError(String responseMessage);
    }
}
