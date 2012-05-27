package PAndroid.System;

import android.app.Activity;
import android.os.Bundle;

public class PAndroidActivity extends Activity {
    SystemView _view;
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        _view=new SystemView(this);
        setContentView(_view);
        
    }
}