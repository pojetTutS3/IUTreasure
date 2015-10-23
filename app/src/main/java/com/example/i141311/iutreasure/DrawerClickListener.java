package com.example.i141311.iutreasure;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.text.style.LineBackgroundSpan;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class DrawerClickListener extends ActionBarActivity implements ListView.OnItemClickListener{

    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        switch (position) {

            case 0:// Activité aide
                Intent intentAide = new Intent(this, AideActivity.class);
                startActivity(intentAide);
                overridePendingTransition(0, 0);
                break;

            case 1://TODO Creer activity option pour finir cette case
                break;

            case 2 ://Activité déconnexion
                Intent intentDeco = new Intent(this,ConnexionActivity.class);
                startActivity(intentDeco);
                overridePendingTransition(0, 0);
                break;

        }
    }
}
