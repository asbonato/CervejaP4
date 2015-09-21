package br.usjt.cervejap4.data;

import android.provider.BaseColumns;

/**
 * Created by asbonato on 9/19/15.
 */
public class CategoriasContract {
    public CategoriasContract(){}

    public static abstract class CorEntry implements BaseColumns{
        public static final String TABLE_NAME = "cor";
        public static final String COLUMN_NAME_COR_NOME = "nomeCor";
    }

    public static abstract class EstiloEntry implements BaseColumns{
        public static final String TABLE_NAME = "estilo";
        public static final String COLUMN_NAME_ESTILO_NOME = "nomeEstilo";
    }

    public static abstract class PaisEntry implements BaseColumns{
        public static final String TABLE_NAME = "pais";
        public static final String COLUMN_NAME_PAIS_NOME = "nomePais";
    }
}
