package com.richie.testjni;

/**
 * Created by richie on 16/10/24.
 */

public class JNIUtils {
    static {
        System.loadLibrary("JniLibName");
    }

    public native String getString();
}
