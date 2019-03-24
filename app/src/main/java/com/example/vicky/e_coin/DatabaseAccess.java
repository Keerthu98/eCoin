package com.example.vicky.e_coin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.logging.Logger;

public class DatabaseAccess {
    private SQLiteOpenHelper openHelper;
    private SQLiteDatabase db;
    private static DatabaseAccess instance;
    Cursor c = null;
    public static final String COL1 = "user";
    public static final String COL2 = "password";
    public static final String DATABASE_TABLE = "users";
    private DatabaseAccess(Context context){
        this.openHelper = new DatabaseOpenHelper(context);
    }

    static DatabaseAccess getInstance(Context context) {
        if (instance == null) {
            instance = new DatabaseAccess(context);
        }
        return instance;
    }

    public void open(){
        this.db = openHelper.getWritableDatabase();
    }
    public void close(){
        if (db!=null){
            this.db.close();
        }
    }

    public boolean insertData(String username,String password){
        this.db = openHelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL1,username);
        contentValues.put(COL2,password);

         db.insert(DATABASE_TABLE,null,contentValues);
        Logger.getLogger("Error in insertion of data");
            return true;
    }

    public Cursor getAlldata(){
        SQLiteDatabase dbs = openHelper.getWritableDatabase();
        return dbs.rawQuery("select * from "+DATABASE_TABLE,null);

    }

    public boolean updatedata(String username,String password){
        SQLiteDatabase dbs1 = openHelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL1,username);
        contentValues.put(COL2,password);

        dbs1.update(DATABASE_TABLE,contentValues,"username = ?",new String[]{username});
        return true;
    }
    public String search(String username){
        SQLiteDatabase dbs2 = openHelper.getWritableDatabase();
        Cursor cursor = dbs2.rawQuery(" SELECT user,password from users ",null);
        String a;
        String b;
        b="Pass not found";
        if(cursor.moveToFirst()){

            do{

                a = cursor.getString(0);
                if(a.equals(username)){
                    b = cursor.getString(1);
                    break;
                }

            }while (cursor.moveToNext());
        }
        return b;
    }

}
