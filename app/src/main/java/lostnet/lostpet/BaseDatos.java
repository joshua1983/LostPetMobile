package lostnet.lostpet;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by josue_000 on 05/03/2015.
 */
public class BaseDatos extends SQLiteOpenHelper {

    private static int version = 1;
    private static String name = "LostPet" ;
    private static SQLiteDatabase.CursorFactory factory = null;

    public BaseDatos(Context context){
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(Parametros.mascota);
        db.execSQL(Parametros.perfil);
        db.execSQL(Parametros.producto);
        db.execSQL(Parametros.tienda);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {

    }
}
