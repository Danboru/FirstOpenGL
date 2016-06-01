package com.example.danboru.opengl;

import android.content.Context;
import android.opengl.GLSurfaceView;

/**
 * Created by Danboru on 01/06/2016.
 * @version 1.0
 *
 */
public class myGLSurfaceView extends GLSurfaceView {//ini extend surfaceView karena menggunakan library OpenGL

    private final MyGLRenderer mRenderer;

    public myGLSurfaceView(Context context){
        super(context);

        setEGLContextClientVersion(2);//untuk parameter ini tergantung dari versi OpenGL nya
        mRenderer = new MyGLRenderer();

        setRenderer(mRenderer);

    }




}
