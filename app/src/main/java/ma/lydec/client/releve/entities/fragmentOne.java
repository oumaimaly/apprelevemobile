package ma.lydec.client.releve.entities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.zip.Inflater;

import ma.lydec.client.releve.ui.R;

/**
 * Created by Oumaima on 26/04/2018.
 */

public class fragmentOne extends Fragment {

    public View onCreateView(LayoutInflater inflater,  ViewGroup container,
                            Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragmentindex_one,container,false);
    }}
