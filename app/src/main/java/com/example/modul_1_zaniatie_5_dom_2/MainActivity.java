package com.example.modul_1_zaniatie_5_dom_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Worker ivan = new Worker();
        ivan.setFirstName("Ivan");
        ivan.setLastName("Kozak");

        SignedDatedDocument signedDatedDocument = new SignedDatedDocument("Signed Dated Doc",
                "Text","06/06/22", ivan.createSignature());
        signedDatedDocument.print();

    }
}