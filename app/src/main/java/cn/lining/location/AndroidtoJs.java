package cn.lining.location;

import android.util.Log;
import android.webkit.JavascriptInterface;

/**
 * Created by LN on 2018/11/14.
 */

public class AndroidtoJs extends Object{
    @JavascriptInterface
    public String hello(String msg){
        Log.i("lo","JS call Android method");
        return "haha";
    }
}
