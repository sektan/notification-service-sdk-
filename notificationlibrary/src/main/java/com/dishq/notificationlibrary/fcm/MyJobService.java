package com.dishq.notificationlibrary.fcm;

import android.util.Log;

import com.firebase.jobdispatcher.JobService;
import com.firebase.jobdispatcher.JobParameters;

/**
 * Created by tania on 05/06/17.
 * property of dishq
 */

public class MyJobService extends JobService {

    private static final String TAG = "MyJobService";

    @Override
    public boolean onStartJob(JobParameters jobParameters) {
        Log.d(TAG, "Performing long running task in scheduled job");
        // TODO(developer): add long running task here.
        return false;
    }

    @Override
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
