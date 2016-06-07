#include <jni.h>
JNIEXPORT jstring JNICALL
Java_sz6636_helloandroidjni_MainActivity_getMsgFromJni(JNIEnv *env, jobject instance) {

    // TODO

    return (*env)->NewStringUTF(env, "Hello From Jni ，So Easy");
}
