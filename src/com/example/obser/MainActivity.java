package com.example.obser;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConcreteSubject concreteSubject = new ConcreteSubject();
        Observer lisi = new ConcreteObserver();
        Observer wangsi = new Wangsi();
        Observer liusi = new Liusi();
        concreteSubject.addObser(liusi);
       /* hanfeizi.addObser(lisi);
        hanfeizi.addObser(wangsi);*/
        concreteSubject.haveFun();
         
    }


    
}
