package com.prueba.lgramir.testprueba;

import android.support.v4.app.Fragment;


public class thirdActivity extends SingleFragmentActivity{


    @Override
    protected Fragment createFragment() {
        return new thirdFragment() ;
    }
}