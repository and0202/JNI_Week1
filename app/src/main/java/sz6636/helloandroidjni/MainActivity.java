package sz6636.helloandroidjni;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends Activity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textview);
        textView.setText(getMsgFromJni());
    }




    // new code
    static {
        System.loadLibrary("hello-android-jni");
    }
    public native String getMsgFromJni();
}
