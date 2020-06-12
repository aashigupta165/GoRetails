package com.goretails;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefManager {

        private static final String SHARED_PREF_NAME = "my_shared_preff";

        private static SharedPrefManager mInstance;
        private Context mCtx;

        private SharedPrefManager(Context mCtx) {
            this.mCtx = mCtx;
        }


        public static synchronized SharedPrefManager getInstance(Context mCtx) {
            if (mInstance == null) {
                mInstance = new SharedPrefManager(mCtx);
            }
            return mInstance;
        }


        public void saveQuery(String query) {

            SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();

            editor.putString("query", query);

            editor.apply();

        }

    public String getQuery() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString("query", null);
    }

    }
