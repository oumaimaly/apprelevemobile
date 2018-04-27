package ma.lydec.client.releve.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import  ma.lydec.client.releve.dao.db;
import java.util.ArrayList;

import ma.lydec.client.releve.entities.PdaTournee;

/**
 * Created by Oumaima on 25/04/2018.
 */

public class dbtournee extends db {
    public dbtournee(Context context) {
        super(context);
    }


    PdaTournee tournee = new PdaTournee();


    public boolean dataInserttournee(Integer id, String[] CR) {
        SQLiteDatabase sqlDB = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put("refID", id);
        contentValues.put("frnCod", CR[0]);
        contentValues.put("cliNom", CR[5]);
        contentValues.put("numCompteur", CR[6]);
        contentValues.put("refSec", CR[9]);
        contentValues.put("referenceTournee", CR[10]);
        contentValues.put("refrefOrd", CR[11]);
        contentValues.put("refTournee", CR[26]);

        long insert = sqlDB.insert("Tournee", null, contentValues);

        if (insert == -1) {
            return false;
        } else {
            return true;
        }

    }

    ///////////
    public boolean dataInserttournee(Integer id,String frncode,String clinom,String numcompteur,String refsec,String referencetournee,String reford,String reftournee) {
        SQLiteDatabase sqlDB = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put("refID", id);
        contentValues.put("frnCod", frncode);
        contentValues.put("cliNom", clinom);
        contentValues.put("numCompteur", numcompteur);
        contentValues.put("refSec",refsec);
        contentValues.put("referenceTournee", referencetournee);
        contentValues.put("refrefOrd", reford);
        contentValues.put("refTournee", reftournee);

        long insert = sqlDB.insert("Tournee", null, contentValues);

        if (insert == -1) {
            return false;
        } else {
            return true;
        }

    }


    //////
    public boolean chargeIndex(Integer numCom ,Integer indx1 , Integer indx2, Integer indx3) {
        SQLiteDatabase sqlDB = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put("indx1", indx1);
        String cond = "numCom='" + numCom + "'";

        contentValues.put("indx2", indx2);
        contentValues.put("indx3", indx3);
        long insert = sqlDB.update("Tournee", contentValues, cond, null);

        if (insert == -1) {
            return false;
        } else {
            return true;
        }

    }
    public ArrayList dataSelect(Integer idref, String choix) {

        ArrayList list = new ArrayList();
        SQLiteDatabase sqLiteDB = this.getReadableDatabase();
        // String[] columns = {dbTournee.fID , dbTournee.frnCod,dbTournee.polNum,dbTournee.cliNom};
        Cursor cursor = sqLiteDB.rawQuery("select * from Tournee where refID = '" + idref + "'", null);

        cursor.moveToNext();
        while (cursor.isAfterLast() == false) {
            // String id = cursor.getString(0);
            String frnCodd = cursor.getString(1);
            String refSec = cursor.getString(4);
            String referenceTournee = cursor.getString(5);
            String refrefOrd = cursor.getString(6);
            //   String referenceTournee=cursor.getString(5);
            //  String tournee = cursor.getString(3);
            String numcompteur = cursor.getString(3);

            // list.add(frnCodd + "-" + "La tournee----> " + tournee + "- NumCompteurr: " + numcompteur);
            //cursor.moveToNext();

            if (choix == "frnCod") {
                list.add(frnCodd);
                cursor.moveToNext();
            }
            if (choix == "numcmp") {
                // list.add("La tournee----> " + reftournee);
                list.add(""+numcompteur);
                cursor.moveToNext();
            }
            if (choix == "tournee") {
                list.add("" + refSec + " / " + referenceTournee + " / " + refrefOrd);

                cursor.moveToNext();
            }

        }
        return list;


    }
//////////////////////////



    ///////////
    public int checkID( String user , String pass) {

        int query=-1;
        // String[] columns = {dbTournee.fID , dbTournee.frnCod,dbTournee.polNum,dbTournee.cliNom};
        SQLiteDatabase sqLiteDB = this.getReadableDatabase();
        Cursor cursor = sqLiteDB.rawQuery("select * from login l, Tournee t where l.ID=t.refID and l.userName = '" + user + "' and l.userPassword= '" + pass+"'", null);

        if (cursor.getCount() >0) {
            cursor.moveToNext();
            query=cursor.getInt(0);
            cursor.close();
        }
        return query;

    }
    //
    public int idref(String user , String pass) {

        int iddref=0 ;
        // String[] columns = {dbTournee.fID , dbTournee.frnCod,dbTournee.polNum,dbTournee.cliNom};
        SQLiteDatabase sqLiteDB = this.getReadableDatabase();
        //Cursor cursor = sqLiteDB.rawQuery("select ID from login l, Tournee t where l.ID=t.refID and l.userName = '" + user + "' and l.userPassword= '" + pass+"'", null);
        Cursor cursor = sqLiteDB.rawQuery("select ID from login where userName = '" + user + "' and userPassword= '" + pass+"'", null);


        cursor.moveToNext();
        while (cursor.isAfterLast() == false) {
            iddref = cursor.getInt(0);
            cursor.moveToNext();
        }

        return iddref;

    }







}