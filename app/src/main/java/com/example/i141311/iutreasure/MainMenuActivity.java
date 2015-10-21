package com.example.i141311.iutreasure;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainMenuActivity extends Activity {

    //Declaration du bouton pour lancer la partie
    Button buttonJouer;
    //Declaration du bouton pour retour à l'acceuil
    Button buttonDeco;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        //instanciation du bouton jouer
        buttonJouer = (Button) findViewById(R.id.btnJouer);
        //instanciation du bouton deco
        buttonDeco = (Button) findViewById(R.id.btnDeco);


        //Click listener pour le bouton de jeu
        buttonJouer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent play = new Intent(MainMenuActivity.this,GameActivity.class);
                startActivity(play);


            }
        });

        //Click Listener pour le bouton de deconnexion
        buttonDeco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deco = new Intent(MainMenuActivity.this, ConnexionActivity.class);
                startActivity(deco);
            }
        });

    }
}

