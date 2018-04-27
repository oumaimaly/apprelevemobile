package ma.lydec.client.releve.ui;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import ma.lydec.client.releve.ui.R;


public class listAadapter extends ArrayAdapter {
    Context adapterContext;
    int adapterResource;
    list[] adapterList;

    public listAadapter(@NonNull Context context, int resource, @NonNull list[] objects) {
        super(context, resource, objects);
        adapterContext=context;
        adapterResource=resource;
        adapterList=objects;
    }

    @Override
    public Object getItem(int position) {
        return super.getItem(position);
    }

    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {

        final View view1 ;
        LayoutInflater layoutInflater = LayoutInflater.from(adapterContext);
        view1 = layoutInflater.inflate(adapterResource,parent,false);
        TextView trn = (TextView)view1.findViewById(R.id.trn);
        final TextView numCmp = (TextView)view1.findViewById(R.id.numcmp);
        ImageView img = (ImageView) view1.findViewById(R.id.img);
        Button btn = (Button) view1.findViewById(R.id.btnPlus);
        final list listSet = adapterList[position];

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view1.getContext(),activityIndex.class);
                i.putExtra("numCmp",listSet.numCmp);
                adapterContext.startActivity(i);
            }
        });
        trn.setText(listSet.trn);
        numCmp.setText(listSet.numCmp);
        int idimg = adapterContext.getResources().getIdentifier(listSet.img,"drawable",adapterContext.getPackageName());
        img.setImageResource(idimg);

        return view1;
    }
}
