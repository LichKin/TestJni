//
// Created by Richie on 16/10/24.
//

#include "com_richie_testjni_JNIUtils.h"

JNIEXPORT jstring JNICALL

Java_com_richie_testjni_JNIUtils_getString(JNIEnv *env, jobject obj){
    return (*env)->NewStringUTF(env,"Test Success!");
}