package be.ehb.thisappisalsointents.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import be.ehb.thisappisalsointents.R;

public class Fragment9 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment9, container, false);

        Button websiteBTN = rootView.findViewById(R.id.btn_website);
        //using lambda
        websiteBTN.setOnClickListener((View v) -> {
            Uri uri = Uri.parse("http://www.ehb.be");
            Intent webIntent = new Intent(Intent.ACTION_VIEW, uri);

            startActivity(webIntent);

        });
        // or anonymous inner class
        /*
        websiteBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        */
        Button adressBtn = rootView.findViewById(R.id.btn_adres);
        adressBtn.setOnClickListener((View v) -> {
            Uri uri = Uri.parse("geo:50.838722,4.319684");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri);

            startActivity(mapIntent);

        });
        return rootView;

    }
}
