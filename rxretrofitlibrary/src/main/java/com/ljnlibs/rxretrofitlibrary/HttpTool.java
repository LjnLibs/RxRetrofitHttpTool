package com.ljnlibs.rxretrofitlibrary;

import android.widget.Toast;

import com.ljnlibs.rxretrofitlibrary.netsubscribe.MovieSubscribe;
import com.ljnlibs.rxretrofitlibrary.netutils.OnSuccessAndFaultListener;
import com.ljnlibs.rxretrofitlibrary.netutils.OnSuccessAndFaultSub;

public class HttpTool {

    public void getData(int pageNumber, int userId){
        MovieSubscribe.getData(pageNumber,userId,new OnSuccessAndFaultSub(new OnSuccessAndFaultListener() {
            @Override
            public void onSuccess(String result) {
                //成功
            }

            @Override
            public void onFault(String errorMsg) {
                //失败
            }
        }));
    }
}
