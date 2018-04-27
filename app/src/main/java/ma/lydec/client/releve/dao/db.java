package ma.lydec.client.releve.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Oumaima on 25/04/2018.
 */

public class db extends SQLiteOpenHelper {
    private static final String DB_Name = "DbTournee";

    public db(Context context) {
        super(context, DB_Name, null, 2);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //////////////////creer la table login////////////////////////
        sqLiteDatabase.execSQL("CREATE TABLE login ( ID INTEGER PRIMARY KEY  , userName TEXT , userPassword TEXT );");
        ///////////////////// creer la table tournee////////////////////////////
        sqLiteDatabase.execSQL("CREATE TABLE Tournee ( refID INTEGER , frnCod TEXT , cliNom TEXT , NumCompteur Integer primary key, refSec Integer, referenceTournee Integer, refrefOrd Integer, refTournee TEXT, indx1 Integer, indx2 Integer, indx3 Integer);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS Tournee");
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS login");

        onCreate(sqLiteDatabase);

    }


}