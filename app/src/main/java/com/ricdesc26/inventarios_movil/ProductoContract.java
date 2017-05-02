package com.ricdesc26.inventarios_movil;

import android.provider.BaseColumns;

/**
 * Created by dirck26 on 27/04/2017.
 */

public class ProductoContract {

    public static abstract class ProductoEntry implements BaseColumns{
        public static final String TABLE_NAME = "Producto";

        public static final String ID = "id";
        public static final String NOMBRE = "Nombre";
        public static final String TIPO = "Tipo";
        public static final String MARCA = "Marca";
        public static final String CANTIDAD = "Cantidad";
        public static final String COMPRA = "Compra";
        public static final String VENTA = "Venta";
    }
}
