package com.dishq.notificationlibrary.server.requests;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by dishq on 28/06/17.
 * property of dishq
 */

public class SendFirebaseTokenHelper {
    @SerializedName("user_id")
    @Expose
    private int userId;

    @SerializedName("client_id")
    @Expose
    private int clientId;

    @SerializedName("firebase_token_id")
    @Expose
    private String firebaseTokenId;

    //Constructor for the class
    public SendFirebaseTokenHelper(int userId, int clientId, String firebaseTokenId) {
        this.userId =userId;
        this.clientId = clientId;
        this.firebaseTokenId = firebaseTokenId;
    }

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getClientId() {
        return this.clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getFirebaseTokenId() {
        return this.firebaseTokenId;
    }

    public void setFirebaseTokenId(String firebaseTokenId) {
        this.firebaseTokenId = firebaseTokenId;
    }

}
