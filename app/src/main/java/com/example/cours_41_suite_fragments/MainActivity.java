package com.example.cours_41_suite_fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * activity avec un frameLyout (container de fragment)
 * ajout dasn onCreate d'un fragment type A
 * ajout a chaque click d'un nouveau fragment type B
 *
 *
 * Pour profiter de ce projet, Dans les fonctions intFragment : changer add en replace ou inversement et ajouter ou suppprimer la fonction addToBackStack
 */
public class MainActivity extends AppCompatActivity {

    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intFragmentA();

        findViewById(R.id.AM_plus_btn).setOnClickListener(view -> {
            //a chaque click on ajoute un fragment B
            intFragmentB(++counter);
        });
    }

    /**
     * add(R.id.AM_container, fragmentA, FragmentA.TAG) ajoute un fragment par dessu un autre si on regarde la pile de VUES on a plusieurs etages
     *
     * addToBackStack(String Tag) permet d'indiquer au gestionnaire de navigation (BackStack) de considerer ce fragment comme un couche de navigation
     */
    private void intFragmentA() {
        FragmentA fragmentA = FragmentA.newInstance();
        getSupportFragmentManager().beginTransaction().add(R.id.AM_container, fragmentA, FragmentA.TAG).addToBackStack(FragmentA.TAG).commit();
    }

    /**
     * replace(R.id.AM_container, fragmentB, FragmentB.TAG) remplace la vue du fragment precedent par la vue du nouveau si on regarde la pile de VUES on en a qu'une
     * (mais les instances des fragments precedents ne sont pas detruite pour autant, juste as affiche)
     *
     * addToBackStack(String Tag) permet d'indiquer au gestionnaire de navigation (BackStack) de considerer ce fragment comme un couche de navigation
     *
     * @param counter pour diferencier chque nouveau fragment B dasn la pile
     */
    private void intFragmentB(int counter) {
        FragmentB fragmentB = FragmentB.newInstance(counter);
        getSupportFragmentManager().beginTransaction().replace(R.id.AM_container, fragmentB, FragmentB.TAG).addToBackStack(FragmentB.TAG).commit();
    }
}