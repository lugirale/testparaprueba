package com.prueba.lgramir.testprueba;

import android.support.v4.app.Fragment;

public class mainActivity  extends SingleFragmentActivity {


    @Override
    protected Fragment createFragment() {
        return new mainFragment();
    }
}
