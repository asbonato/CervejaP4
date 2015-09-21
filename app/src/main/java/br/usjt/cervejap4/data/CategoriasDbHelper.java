package br.usjt.cervejap4.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by asbonato on 9/19/15.
 */
public class CategoriasDbHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Categorias.db";
    public static final String TEXT_TYPE = " TEXT";
    public static final String COMMA_SEP = ",";
    public static final String OPEN_PAR = "(";
    public static final String CLOSE_PAR = ")";
    public static final String SQL_CREATE_COR =
            "CREATE TABLE " + CategoriasContract.CorEntry.TABLE_NAME + OPEN_PAR +
                    CategoriasContract.CorEntry._ID + " INTEGER PRIMARY KEY" + COMMA_SEP +
                    CategoriasContract.CorEntry.COLUMN_NAME_COR_NOME + TEXT_TYPE + CLOSE_PAR;
    public static final String SQL_DROP_COR =
            "DROP TABLE IF EXISTS " + CategoriasContract.CorEntry.TABLE_NAME;
    public static final String SQL_CREATE_ESTILO =
            "CREATE TABLE " + CategoriasContract.EstiloEntry.TABLE_NAME + OPEN_PAR +
                    CategoriasContract.EstiloEntry._ID + " INTEGER PRIMARY KEY" + COMMA_SEP +
                    CategoriasContract.EstiloEntry.COLUMN_NAME_ESTILO_NOME + TEXT_TYPE + CLOSE_PAR;
    public static final String SQL_DROP_ESTILO =
            "DROP TABLE IF EXISTS " + CategoriasContract.EstiloEntry.TABLE_NAME;
    public static final String SQL_CREATE_PAIS =
            "CREATE TABLE " + CategoriasContract.PaisEntry.TABLE_NAME + OPEN_PAR +
                    CategoriasContract.PaisEntry._ID + " INTEGER PRIMARY KEY" + COMMA_SEP +
                    CategoriasContract.PaisEntry.COLUMN_NAME_PAIS_NOME + TEXT_TYPE + CLOSE_PAR;
    public static final String SQL_DROP_PAIS=
            "DROP TABLE IF EXISTS " + CategoriasContract.PaisEntry.TABLE_NAME;


    public CategoriasDbHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_COR);
        db.execSQL(SQL_CREATE_ESTILO);
        db.execSQL(SQL_CREATE_PAIS);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //tabelas de parâmetros que podem ser recriadas
        db.execSQL(SQL_DROP_COR);
        db.execSQL(SQL_DROP_ESTILO);
        db.execSQL(SQL_DROP_PAIS);
        db.execSQL(SQL_CREATE_COR);
        db.execSQL(SQL_CREATE_ESTILO);
        db.execSQL(SQL_CREATE_PAIS);
    }

}
