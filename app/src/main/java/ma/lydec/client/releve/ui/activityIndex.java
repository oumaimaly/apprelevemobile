package ma.lydec.client.releve.ui;

import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import ma.lydec.client.releve.dao.db;
import ma.lydec.client.releve.dao.dbtournee;
import ma.lydec.client.releve.entities.pagerAdapter;
import ma.lydec.client.releve.ui.R;

public class activityIndex extends AppCompatActivity {
private ViewPager viewPager;
private int[] layouts={R.layout.fragmentindex_one,R.layout.fragmentindex_two,R.layout.fragmentindex_three};
private pagerAdapter mpagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index2);

viewPager=(ViewPager)findViewById(R.id.pager);
       mpagerAdapter=new pagerAdapter(layouts,this);
       viewPager.setAdapter(mpagerAdapter);

       // boolean res;
       /* Button btnok=(Button)findViewById(R.id.btnOk);
        final EditText indexx =(EditText)findViewById(R.id.txtindex);
        final dbtournee db=new dbtournee(this);
        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

       //      res=  db.chargeIndex(indexx);
            }
        });*/
    }
}
