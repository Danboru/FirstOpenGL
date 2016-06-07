package com.example.danboru.opengl;

import android.content.Context;
import android.opengl.GLSurfaceView;


public class myGLSurfaceView extends GLSurfaceView {//ini extend surfaceView karena menggunakan library OpenGL

    private final MyGLRenderer mRenderer;

    public myGLSurfaceView(Context context){
        super(context);

        setEGLContextClientVersion(2);//untuk parameter ini tergantung dari versi OpenGL nya
        setEGLContextClientVersion(2);
        mRenderer = new MyGLRenderer();

        setRenderer(mRenderer);
    }




}
