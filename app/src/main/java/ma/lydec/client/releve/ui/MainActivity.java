package ma.lydec.client.releve.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import ma.lydec.client.releve.dao.dbtournee;
import android.widget.EditText;
import android.widget.Toast;
import ma.lydec.client.releve.dao.dbuser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import ma.lydec.client.releve.entities.PdaTournee;
import ma.lydec.client.releve.entities.user;

import ma.lydec.client.releve.entities.chargement;
import ma.lydec.client.releve.ui.R;

public class MainActivity extends AppCompatActivity {

    String user, pass;
    EditText edname, edpass;
    Button btnlogin;
    chargement charg=new chargement(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     final    dbuser db=new dbuser(this);
     final  dbtournee dbt=new dbtournee(this);
  user utili=new user();
        btnlogin = (Button) findViewById(R.id.buttonLogin);
        edname = (EditText) findViewById(R.id.edname);
        edpass = (EditText) findViewById(R.id.edpass);

        charg.charger();
        Toast.makeText(MainActivity.this,"oo"+dbt.dataSelect(150,"frnCode").size(),Toast.LENGTH_SHORT).show();


/// lire les donnes du fichier et les stocker dans ArrayList tourneeLine
//
       // db.dataInsertuser(utili.getId(),utili.getNom(),utili.getPassword());

//cliquer sur boutton login
    /*  btnlogin.setOnClickListener(new View.OnClickListener() {

                                      @Override
                                      public void onClick(View view) {

                                          user = edname.getText().toString();
                                          pass = edpass.getText().toString();
                                          //si vides
                                          if (user.equals("") || pass.equals("")) {
                                              AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                                              builder.setMessage("LES CHAMPS SONT VIDES").setIcon(android.R.drawable.stat_notify_error).setTitle("VEUILLEZ REMPLIR LES CHAMPS")
                                                      .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                                                          public void onClick(DialogInterface dialog, int which) {
                                                              // continue with delete
                                                          }
                                                      })
                                                      .show();
                                          } else {

                                              int query = db.dataSelectLogin(user, pass);


                                              if (query == -1) {
                                                  AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                                                  builder.setMessage("MOT DE PASSE OU NOM D'UTILISATEUR INCORRECT!!!!").setIcon(android.R.drawable.stat_notify_error).setTitle("Information Erronées")
                                                          .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                                                              public void onClick(DialogInterface dialog, int which) {
                                                                  // continue with delete
                                                              }
                                                          })
                                                          .show();
                                              } else {
                                                   int query2 = dbt.checkID(user, pass);
                                                   if (query2 == -1) {
                                                  Toast.makeText(getApplicationContext(), "vous avez pas de tournees", Toast.LENGTH_SHORT).show();

                                                  Intent intent = new Intent(MainActivity.this, Activity2chargerActivity.class);
                                                  intent.putExtra("user", user);
                                                  intent.putExtra("pass", pass);
                                                  startActivity(intent);

                                              } else {
                                                  Toast.makeText(getApplicationContext(), "Consultez vos tournees", Toast.LENGTH_SHORT).show();

                                                  int idref = dbt.idref(user, pass);
                                                  Intent intent = new Intent(MainActivity.this, ListeActivity.class);
                                                   intent.putExtra("idref", idref);
                                                  startActivity(intent);
                                                   }
                                              }*/

                                          }
                                      }



/*Cursor data=db.getAllreftournee();
if(data.getCount()==0){
            Toast.makeText(Main2Activity.this,"database empty",Toast.LENGTH_SHORT).show();
            }
            else{
    while (data.moveToFirst()){
        liste.add(data.getString(1));                                 //ListAdapter   listedata  =new ArrayAdapter<> (this,R.layout.support_simple_spinner_dropdown_item,liste);
    lo.setAdapter(new ArrayAdapter(getApplication()  , android.R.layout.simple_list_item_1,liste));
        Intent in = new Intent(Main2Activity.this,tournee.class);
        in.putExtra("reftournee", (Parcelable) lo);    startActivity(in);*/


    //  });}}*/


