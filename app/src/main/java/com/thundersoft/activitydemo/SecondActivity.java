package com.thundersoft.activitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //Activity正在被创建，作用是进行Activity的一些初始化工作，此时Activity还在后台，不可见，整个生命周期期间只会执行一次
        Log.e("LifeCycle","onCreate_2");

    }

    @Override
    protected void onStart() {
        super.onStart();
        //Activity已经可见，但是还没出现在前台，无法进行与之交互
        Log.e("LifeCycle","onStart_2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        //Activity已经出现在前台并且可见可以进行交互
        Log.e("LifeCycle","onResume_2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        //当前Activity失去焦点，即将被挂起但依旧可见
        Log.e("LifeCycle","onPause_2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        //Activity已经不可见了，但Activity对象还在内存中，没有被销毁
        Log.e("LifeCycle","onStop_2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //Activity被销毁，不可见，可以进行一些资源释放和回收工作
        Log.e("LifeCycle","onDestroy_2");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        //Activity重新开始，此时可见
        Log.e("LifeCycle","onDestroy_2");
    }
}