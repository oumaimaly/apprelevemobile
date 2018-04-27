package ma.lydec.client.releve.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

import ma.lydec.client.releve.entities.user;
import ma.lydec.client.releve.dao.db;

/**
 * Created by Oumaima on 25/04/2018.
 */

public class dbuser extends db {
    public dbuser(Context context) {
        super(context);
    }
////
//user user1=new user(1,"ouma2018","123");



    public boolean dataInsertuser(Integer id ,String nom,String pass) {
        SQLiteDatabase sqlDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("ID", id );
        contentValues.put("userName",nom);
        contentValues.put("userPassword", pass);
        long insert = sqlDB.insert("login", null, contentValues);

        if (insert == -1) {
            return false;
        } else {
            return true;
        }

    }



    public int dataSelectLogin( String user , String pass) {

        int query=-1;
        // String[] columns = {dbTournee.fID , dbTournee.frnCod,dbTournee.polNum,dbTournee.cliNom};
        SQLiteDatabase sqLiteDB = this.getReadableDatabase();
        Cursor cursor = sqLiteDB.rawQuery("select * from login where userName = '" + user + "' and userPassword= '" + pass+"'", null);

        if (cursor.getCount() >0) {
            cursor.moveToNext();
            query=cursor.getInt(0);
            cursor.close();
        }
        return query;

    }
}
