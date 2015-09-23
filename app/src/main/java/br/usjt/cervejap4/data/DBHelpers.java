package br.usjt.cervejap4.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.io.File;

import se.emilsjolander.sprinkles.Migration;
import se.emilsjolander.sprinkles.Sprinkles;

/**
 * Created by eabrahao on 21/09/15.
 */
public class DBHelpers {

    private static final String TAG = DBHelpers.class.getSimpleName();

    public static void configureDatabaseIfNeeded(Context context) {
        setupDB(context);
    }

    private static void setupDB(Context context) {
        Sprinkles sprinkles = Sprinkles.init(context);


        sprinkles.addMigration(new Migration() {
            @Override
            protected void onPreMigrate() {
                // do nothing
            }

            @Override
            protected void doMigration(SQLiteDatabase db) {
                db.execSQL("DROP TABLE IF EXISTS estilo");
                db.execSQL("DROP TABLE IF EXISTS cor");
                db.execSQL("DROP TABLE IF EXISTS pais");
                db.execSQL("CREATE TABLE estilo (id INTEGER PRIMARY KEY AUTOINCREMENT,nome TEXT)");
                db.execSQL("CREATE TABLE pais (id INTEGER PRIMARY KEY AUTOINCREMENT,nome TEXT)");
                db.execSQL("CREATE TABLE cor (id INTEGER PRIMARY KEY AUTOINCREMENT,nome TEXT)");
                db.execSQL("INSERT INTO cor (nome) values('amarela')");
                db.execSQL("INSERT INTO cor (nome) values('amarela-palha')");
                db.execSQL("INSERT INTO cor (nome) values('âmbar')");
                db.execSQL("INSERT INTO cor (nome) values('cobre-claro')");
                db.execSQL("INSERT INTO cor (nome) values('dourada')");
                db.execSQL("INSERT INTO cor (nome) values('marrom')");
                db.execSQL("INSERT INTO cor (nome) values('marrom-clara')");
                db.execSQL("INSERT INTO cor (nome) values('marrom-escura')");
                db.execSQL("INSERT INTO cor (nome) values('preta')");
                db.execSQL("INSERT INTO cor (nome) values('preta-opaca')");
                db.execSQL("INSERT INTO estilo (nome) values('india pale ale')");
                db.execSQL("INSERT INTO estilo (nome) values('lager')");
                db.execSQL("INSERT INTO estilo (nome) values('pilsner')");
                db.execSQL("INSERT INTO estilo (nome) values('porter')");
                db.execSQL("INSERT INTO estilo (nome) values('stout')");
                db.execSQL("INSERT INTO estilo (nome) values('trapistas')");
                db.execSQL("INSERT INTO estilo (nome) values('trigo/weiss')");
                db.execSQL("INSERT INTO estilo (nome) values('tripel')");
                db.execSQL("INSERT INTO pais (nome) values('Alemanha')");
                db.execSQL("INSERT INTO pais (nome) values('Argentina')");
                db.execSQL("INSERT INTO pais (nome) values('Áustria')");
                db.execSQL("INSERT INTO pais (nome) values('Austrália')");
                db.execSQL("INSERT INTO pais (nome) values('Bélgica')");
                db.execSQL("INSERT INTO pais (nome) values('Brasil')");
                db.execSQL("INSERT INTO pais (nome) values('Chile')");
                db.execSQL("INSERT INTO pais (nome) values('Dinamarca')");
                db.execSQL("INSERT INTO pais (nome) values('Escócia')");
                db.execSQL("INSERT INTO pais (nome) values('Espanha')");
                db.execSQL("INSERT INTO pais (nome) values('Estados Unidos')");
                db.execSQL("INSERT INTO pais (nome) values('Inglaterra')");
                db.execSQL("INSERT INTO pais (nome) values('Irlanda')");
                db.execSQL("INSERT INTO pais (nome) values('México')");
                db.execSQL("INSERT INTO pais (nome) values('Uruguai')");
            }

            @Override
            protected void onPostMigrate() {
                // do nothing
            }
        });
    }

}