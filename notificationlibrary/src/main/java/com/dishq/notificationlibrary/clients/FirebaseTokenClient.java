package com.dishq.notificationlibrary.clients;

import android.util.Log;

import com.dishq.notificationlibrary.server.Config;
import com.dishq.notificationlibrary.server.requests.SendFirebaseTokenHelper;
import com.dishq.notificationlibrary.server.RestApi;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by dishq on 06/07/17.
 * property of dishq
 */

public class FirebaseTokenClient {

    private static final String TAG = "FirebaseTokenClient";

    public void sendFirebaseToken(int clientId, int userId) {
        // [START subscribe_topics]
        FirebaseMessaging.getInstance().subscribeToTopic("news");
        // [END subscribe_topics]
        String token = FirebaseInstanceId.getInstance().getToken();
        final SendFirebaseTokenHelper firebaseTokenHelper = new SendFirebaseTokenHelper(userId, clientId, token);
        String accessToken = "d63e49ef09cd37dbaaefa7eef42a7abcfa092384";
        String authorization = "Token" + " " + accessToken;
        RestApi restApi = Config.createService(RestApi.class);
        Call<ResponseBody> call = restApi.sendFirebaseToken(authorization, firebaseTokenHelper);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                Log.d(TAG, "success");
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.d(TAG, "Failure");
            }
        });
    }





}
