package com.varun.hangover.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.varun.hangover.R;
import com.varun.hangover.constants.Api;
import com.varun.hangover.constants.Constants;
import com.varun.hangover.utils.GenericRequest;
import com.varun.hangover.utils.VolleySingleton;

import org.json.JSONException;
import org.json.JSONObject;


public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false);
    }

    private void makeLiquorListCall() {
        @SuppressWarnings("unchecked")
        GenericRequest genericRequest = new GenericRequest(Request.Method.GET, Api.LIQUOR_LIST, null, null, new Response.Listener() {
            @Override
            public void onResponse(Object response) {

                try {
                    JSONObject jsonObject = new JSONObject(response.toString());

                    String status = jsonObject.getString("status");
                    String data = jsonObject.getString("data");

                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {


            }
        }, null, false, true);

        VolleySingleton.getInstance(HomeFragment.this.getActivity()).addToRequestQueue(genericRequest, Constants.TAG);
    }

}
