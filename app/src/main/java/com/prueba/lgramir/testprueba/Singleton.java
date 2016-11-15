package com.prueba.lgramir.testprueba;

public class Singleton {

    private static Singleton mInstance = null;

    private String mString;
    private String mString2;

    private Singleton(){
    }

    public static Singleton getInstance(){
        if(mInstance == null)
        {
            mInstance = new Singleton();
        }
        return mInstance;
    }

    public String getString(){
        return this.mString;
    }

    public void setString(String value){
        mString = value;
    }


    public String getString2(){
        return this.mString2;
    }

    public void setString2(String value){
        mString2 = value;
    }
}
