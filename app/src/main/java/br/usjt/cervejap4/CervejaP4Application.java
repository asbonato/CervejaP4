package br.usjt.cervejap4;

import android.app.Application;

import br.usjt.cervejap4.data.DBHelpers;

/**
 * Created by eabrahao on 21/09/15.
 */
public class CervejaP4Application extends Application {


    @Override public void onCreate() {
        super.onCreate();

        DBHelpers.configureDatabaseIfNeeded(this);


    }


}
