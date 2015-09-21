package br.usjt.cervejap4.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

/**
 * Created by asbonato on 9/20/15.
 */
public class CategoriasDb {
    CategoriasDbHelper dbHelper;
    public static final String PAIS = "pais";
    public static final String ESTILO = "estilo";
    public static final String COR = "cor";

    public CategoriasDb(Context context){
        dbHelper = new CategoriasDbHelper(context);
    }

    public void insereCor(){
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(CategoriasContract.CorEntry.COLUMN_NAME_COR_NOME, "amarela");
        db.insert(CategoriasContract.CorEntry.TABLE_NAME, null, values);
        values.put(CategoriasContract.CorEntry.COLUMN_NAME_COR_NOME, "amarela-palha");
        db.insert(CategoriasContract.CorEntry.TABLE_NAME, null, values);
        values.put(CategoriasContract.CorEntry.COLUMN_NAME_COR_NOME, "âmbar");
        db.insert(CategoriasContract.CorEntry.TABLE_NAME, null, values);
        values.put(CategoriasContract.CorEntry.COLUMN_NAME_COR_NOME, "cobre-claro");
        db.insert(CategoriasContract.CorEntry.TABLE_NAME, null, values);
        values.put(CategoriasContract.CorEntry.COLUMN_NAME_COR_NOME, "dourada");
        db.insert(CategoriasContract.CorEntry.TABLE_NAME, null, values);
        values.put(CategoriasContract.CorEntry.COLUMN_NAME_COR_NOME, "marrom");
        db.insert(CategoriasContract.CorEntry.TABLE_NAME, null, values);
        values.put(CategoriasContract.CorEntry.COLUMN_NAME_COR_NOME, "marrom-clara");
        db.insert(CategoriasContract.CorEntry.TABLE_NAME, null, values);
        values.put(CategoriasContract.CorEntry.COLUMN_NAME_COR_NOME, "marrom-escura");
        db.insert(CategoriasContract.CorEntry.TABLE_NAME, null, values);
        values.put(CategoriasContract.CorEntry.COLUMN_NAME_COR_NOME, "preta");
        db.insert(CategoriasContract.CorEntry.TABLE_NAME, null, values);
        values.put(CategoriasContract.CorEntry.COLUMN_NAME_COR_NOME, "preta-opaca");
        db.insert(CategoriasContract.CorEntry.TABLE_NAME, null, values);
    }

    public void insereEstilo(){
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(CategoriasContract.EstiloEntry.COLUMN_NAME_ESTILO_NOME, "india pale ale");
        db.insert(CategoriasContract.EstiloEntry.TABLE_NAME, null, values);
        values.put(CategoriasContract.EstiloEntry.COLUMN_NAME_ESTILO_NOME, "lager");
        db.insert(CategoriasContract.EstiloEntry.TABLE_NAME, null, values);
        values.put(CategoriasContract.EstiloEntry.COLUMN_NAME_ESTILO_NOME, "pilsner");
        db.insert(CategoriasContract.EstiloEntry.TABLE_NAME, null, values);
        values.put(CategoriasContract.EstiloEntry.COLUMN_NAME_ESTILO_NOME, "porter");
        db.insert(CategoriasContract.EstiloEntry.TABLE_NAME, null, values);
        values.put(CategoriasContract.EstiloEntry.COLUMN_NAME_ESTILO_NOME, "stout");
        db.insert(CategoriasContract.EstiloEntry.TABLE_NAME, null, values);
        values.put(CategoriasContract.EstiloEntry.COLUMN_NAME_ESTILO_NOME, "trapistas");
        db.insert(CategoriasContract.EstiloEntry.TABLE_NAME, null, values);
        values.put(CategoriasContract.EstiloEntry.COLUMN_NAME_ESTILO_NOME, "trigo/weiss");
        db.insert(CategoriasContract.EstiloEntry.TABLE_NAME, null, values);
        values.put(CategoriasContract.EstiloEntry.COLUMN_NAME_ESTILO_NOME, "tripel");
        db.insert(CategoriasContract.EstiloEntry.TABLE_NAME, null, values);

    }

    public void inserePais(){
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(CategoriasContract.PaisEntry.COLUMN_NAME_PAIS_NOME, "Alemanha");
        db.insert(CategoriasContract.PaisEntry.TABLE_NAME, null, values);
        values.put(CategoriasContract.PaisEntry.COLUMN_NAME_PAIS_NOME, "Argentina");
        db.insert(CategoriasContract.PaisEntry.TABLE_NAME, null, values);
        values.put(CategoriasContract.PaisEntry.COLUMN_NAME_PAIS_NOME, "Áustria");
        db.insert(CategoriasContract.PaisEntry.TABLE_NAME, null, values);
        values.put(CategoriasContract.PaisEntry.COLUMN_NAME_PAIS_NOME, "Austrália");
        db.insert(CategoriasContract.PaisEntry.TABLE_NAME, null, values);
        values.put(CategoriasContract.PaisEntry.COLUMN_NAME_PAIS_NOME, "Bélgica");
        db.insert(CategoriasContract.PaisEntry.TABLE_NAME, null, values);
        values.put(CategoriasContract.PaisEntry.COLUMN_NAME_PAIS_NOME, "Brasil");
        db.insert(CategoriasContract.PaisEntry.TABLE_NAME, null, values);
        values.put(CategoriasContract.PaisEntry.COLUMN_NAME_PAIS_NOME, "Chile");
        db.insert(CategoriasContract.PaisEntry.TABLE_NAME, null, values);
        values.put(CategoriasContract.PaisEntry.COLUMN_NAME_PAIS_NOME, "Dinamarca");
        db.insert(CategoriasContract.PaisEntry.TABLE_NAME, null, values);
        values.put(CategoriasContract.PaisEntry.COLUMN_NAME_PAIS_NOME, "Escócia");
        db.insert(CategoriasContract.PaisEntry.TABLE_NAME, null, values);
        values.put(CategoriasContract.PaisEntry.COLUMN_NAME_PAIS_NOME, "Espanha");
        db.insert(CategoriasContract.PaisEntry.TABLE_NAME, null, values);
        values.put(CategoriasContract.PaisEntry.COLUMN_NAME_PAIS_NOME, "Estados Unidos");
        db.insert(CategoriasContract.PaisEntry.TABLE_NAME, null, values);
        values.put(CategoriasContract.PaisEntry.COLUMN_NAME_PAIS_NOME, "Inglaterra");
        db.insert(CategoriasContract.PaisEntry.TABLE_NAME, null, values);
        values.put(CategoriasContract.PaisEntry.COLUMN_NAME_PAIS_NOME, "Irlanda");
        db.insert(CategoriasContract.PaisEntry.TABLE_NAME, null, values);
        values.put(CategoriasContract.PaisEntry.COLUMN_NAME_PAIS_NOME, "México");
        db.insert(CategoriasContract.PaisEntry.TABLE_NAME, null, values);
        values.put(CategoriasContract.PaisEntry.COLUMN_NAME_PAIS_NOME, "Uruguai");
        db.insert(CategoriasContract.PaisEntry.TABLE_NAME, null, values);
    }

    public ArrayList<String>  selecionaCores(){
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Escolha a cor");

        SQLiteDatabase db = dbHelper.getReadableDatabase();

        String[] colunas = {CategoriasContract.CorEntry._ID,
                CategoriasContract.CorEntry.COLUMN_NAME_COR_NOME};

        String ordem = CategoriasContract.CorEntry.COLUMN_NAME_COR_NOME;

        Cursor c = db.query(CategoriasContract.CorEntry.TABLE_NAME, colunas, null, null, ordem, null, null );

        while(c.moveToNext()){
            lista.add(c.getString(c.getColumnIndex(CategoriasContract.CorEntry.COLUMN_NAME_COR_NOME)));
        }

        c.close();

        return lista;
    }


    public ArrayList<String> selecionaEstilos(){
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Escolha o estilo");

        SQLiteDatabase db = dbHelper.getReadableDatabase();

        String[] colunas = {CategoriasContract.EstiloEntry.COLUMN_NAME_ESTILO_NOME};

        String ordem = CategoriasContract.EstiloEntry.COLUMN_NAME_ESTILO_NOME;

        Cursor c = db.query(CategoriasContract.EstiloEntry.TABLE_NAME, colunas, null, null, null, null, ordem);

        while(c.moveToNext()){
            lista.add(c.getString(c.getColumnIndex(CategoriasContract.EstiloEntry.COLUMN_NAME_ESTILO_NOME)));
        }

        c.close();

        return lista;
    }

    public ArrayList<String> selecionaPaises(){
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Escolha o país");

        SQLiteDatabase db = dbHelper.getReadableDatabase();

        String[] colunas = {CategoriasContract.PaisEntry._ID,
                CategoriasContract.PaisEntry.COLUMN_NAME_PAIS_NOME};

        String ordem = CategoriasContract.PaisEntry.COLUMN_NAME_PAIS_NOME;

        Cursor c = db.query(CategoriasContract.PaisEntry.TABLE_NAME, colunas, null, null, ordem, null, null );

        while(c.moveToNext()){
            lista.add(c.getString(c.getColumnIndex(CategoriasContract.PaisEntry.COLUMN_NAME_PAIS_NOME)));
        }

        c.close();
        return lista;
    }

}
