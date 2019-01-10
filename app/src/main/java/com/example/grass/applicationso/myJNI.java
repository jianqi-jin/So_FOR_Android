package com.example.grass.applicationso;

/**
 * Created by Administrator on 2019/1/10.
 */

public class myJNI {
    static {
        System.loadLibrary("JniTest");

    }
    public static native String sayHello();


}
