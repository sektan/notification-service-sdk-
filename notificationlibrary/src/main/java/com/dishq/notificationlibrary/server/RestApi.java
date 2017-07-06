package com.dishq.notificationlibrary.server;


import com.dishq.notificationlibrary.server.requests.SendFirebaseTokenHelper;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.PUT;

/**
 * Created by dishq on 28/06/17.
 * property of dishq
 */

public interface RestApi {

    //Api call for sending the user's firebase token ID + userId + clientId
    @PUT("v1/client/user/addfirebasetoken/")
    Call<ResponseBody> sendFirebaseToken(@Header("Authorization") String authorization,
                                         @Body SendFirebaseTokenHelper firebaseTokenHelper);
}
