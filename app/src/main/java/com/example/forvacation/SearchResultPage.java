package com.example.forvacation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SearchResultPage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle clickedItemPosition = getIntent().getExtras();
        int itemPosition = (int) clickedItemPosition.get("position");

        switch (itemPosition) {
            case 0:
                setContentView(R.layout.result_acropolis_of_athens);
                break;
            case 1:
                setContentView(R.layout.result_panathenaic_stadium);
                break;
            case 2:
                setContentView(R.layout.result_temple_of_olympian_zeus);
                break;
            case 3:
                setContentView(R.layout.result_mount_olympus);
                break;
            case 4:
                setContentView(R.layout.result_palace_of_the_grand_masters);
                break;
            case 5:
                setContentView(R.layout.result_mystras);
                break;
            case 6:
                setContentView(R.layout.result_lindos_acropolis);
                break;
            case 7:
                setContentView(R.layout.result_the_meteora);
                break;
            case 8:
                setContentView(R.layout.result_zagori_region);
                break;
            case 9:
                setContentView(R.layout.result_corinth_canal);
                break;
        }
//        setContentView(R.layout.search_page_result);
    }
}
