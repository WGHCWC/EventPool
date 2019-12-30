package com.wghcwc.eventpool;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.wghcwc.rtrofitadapter.RxJava2CallAdapterFactory;

/**
 * @author wghcwc
 * @date 19-12-30
 */
public class AAAActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RxJava2CallAdapterFactory.create();
    }
}
