package com.varun.hangover.utils;

import android.content.Context;
import android.text.TextUtils;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by Administrator on 16 Sep,2016.
 */
public class VolleySingleton {

    public static final String TAG = VolleySingleton.class.getSimpleName();
    private RequestQueue mRequestQueue;
    private static VolleySingleton mInstance;
    private Context context;

    public VolleySingleton(Context ctx) {
        context = ctx;
    }

    public static synchronized VolleySingleton getInstance(Context ctx) {
        if (mInstance == null) {
            mInstance = new VolleySingleton(ctx);
        }
        return mInstance;
    }

    public RequestQueue getRequestQueue() {
        if (mRequestQueue == null) {
            mRequestQueue = Volley.newRequestQueue(context);
        }
        return mRequestQueue;
    }

    public <T> void addToRequestQueue(Request<T> req, String tag) {
        // set the default tag if tag is empty
        req.setTag(TextUtils.isEmpty(tag) ? TAG : tag);
        getRequestQueue().add(req);
    }

    public <T> void addToRequestQueue(Request<T> req) {
        req.setTag(TAG);
        getRequestQueue().add(req);
    }

    public void cancelPendingRequests(Object tag) {
        if (mRequestQueue != null) {
            mRequestQueue.cancelAll(tag);
        }
    }

}
