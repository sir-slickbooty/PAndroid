package PAndroid.System;

import android.content.Context;
import android.opengl.GLSurfaceView;

public class SystemView extends GLSurfaceView {

	private SystemRenderer _renderer;
	
	public SystemView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		_renderer=new SystemRenderer();
		setRenderer(_renderer);
	}

}
