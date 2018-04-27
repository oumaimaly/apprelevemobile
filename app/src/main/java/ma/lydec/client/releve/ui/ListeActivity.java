package ma.lydec.client.releve.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;


import java.util.ArrayList;

import ma.lydec.client.releve.dao.dbtournee;
import ma.lydec.client.releve.ui.R;

public class ListeActivity extends AppCompatActivity {

    ArrayList<String> listFrnCod =new ArrayList<String>() ;
    ArrayList<String> listTourné  =new ArrayList<String>();
    ArrayList<String>  listNumCmp =new ArrayList<String>();

    ListView listTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste);
        dbtournee dataBase1=new dbtournee(this);

        listTV=(ListView)findViewById(R.id.lst);

        int idref = getIntent().getExtras().getInt("idref");
        listFrnCod = dataBase1.dataSelect(idref,"frnCod");
        listTourné = dataBase1.dataSelect(idref, "tournee");
        listNumCmp = dataBase1.dataSelect(idref, "numCmp");

        ArrayList<list> TourneeList = new ArrayList<list>();
        int tst ;
        for(int i = 0 ; i<listTourné.size() ; i++) {

            tst = Integer.parseInt(listFrnCod.get(i)) ;
            //si FRNCODE==1 ->eau
            if ( tst == 1){
                TourneeList.add(new list("eau_bleue", listTourné.get(i), listNumCmp.get(i)));
            }
            //sinon electricite
            else {
                TourneeList.add(new list("electricite_rouge", listTourné.get(i), listNumCmp.get(i)));
            }
        }
        list[] Tournee = new list[listTourné.size()];

        for(int i = 0 ; i<Tournee.length ; i++) {
            Tournee[i] = TourneeList.get(i);
        }

        listAadapter aadapter = new listAadapter(ListeActivity.this,R.layout.rowlayout,Tournee);

    }
}
