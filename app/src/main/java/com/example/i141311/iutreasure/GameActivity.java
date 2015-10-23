package com.example.i141311.iutreasure;


import android.content.Intent;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;


public class GameActivity extends ActionBarActivity {

    private ListView itemDrawer;
    private DrawerLayout drawer;
    private String[] drawerItemsList;
    private ActionBarDrawerToggle drawerToggle;

    MyDrawerClickListener clickDrawer = new MyDrawerClickListener();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        drawer = (DrawerLayout) findViewById(R.id.activity_game);
        drawerItemsList = getResources().getStringArray(R.array.nom_items_drawer);

        itemDrawer = (ListView) findViewById(R.id.menu_coulissant); // recuperation du List view dans le layout "drawer_items"
        itemDrawer.setAdapter(new ArrayAdapter<String>(this, R.layout.drawer_items, drawerItemsList));//ajout de l'array String
        // pour le texte a l'interieur du drawer
        itemDrawer.setOnItemClickListener(clickDrawer);

        drawerToggle = new ActionBarDrawerToggle(this, drawer, R.string.Ouverture, R.string.Fermeture) {
            public void onDrawerClosed(View view) {
                invalidateOptionsMenu();
            }

            public void onDrawerOpened(View view) {
                invalidateOptionsMenu();
            }

        };//action sur la fermeture/ouverture du drawer
        drawer.setDrawerListener(drawerToggle);




    }

    private class MyDrawerClickListener implements ListView.OnItemClickListener {


        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            switch (position) {

                case 0:// Activité aide
                    Intent intentAide = new Intent(GameActivity.this, AideActivity.class);
                    startActivity(intentAide);
                    overridePendingTransition(0, 0);
                    break;

                case 1://TODO Creer activity option pour finir cette case
                    break;

                case 2://Activité déconnexion
                    Intent intentDeco = new Intent(GameActivity.this, ConnexionActivity.class);
                    startActivity(intentDeco);
                    overridePendingTransition(0, 0);
                    break;

            }
        }
    }





}

