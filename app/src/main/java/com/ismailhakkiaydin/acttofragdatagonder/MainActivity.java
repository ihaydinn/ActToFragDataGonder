package com.ismailhakkiaydin.acttofragdatagonder;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button fragmenteGonder;
    EditText ilkSayi, sonSayi;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ilkSayi = findViewById(R.id.birinci_sayi);
        sonSayi = findViewById(R.id.ikinci_Sayi);
        fragmenteGonder = findViewById(R.id.btnFragmentegonder);
        fragmentManager = getFragmentManager();
    }

    public void calistir(View view){
        FragmentA fragmentA = new FragmentA();
      //  Bundle bundle = new Bundle();

        int birinciSayi = Integer.parseInt(ilkSayi.getText().toString());
        int ikinciSayi = Integer.parseInt(sonSayi.getText().toString());

       /* bundle.putInt("birinci", birinciSayi);
        bundle.putInt("ikinci", ikinciSayi);

        fragmentA.setArguments(bundle);*/

        fragmentA.sendData(birinciSayi, ikinciSayi);
       // fragmentA.sendOgrenci(new Ogrenci());
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.container, fragmentA, "FragmentA");
        fragmentTransaction.commit();

    }

   /* class Ogrenci{
        int ogrNo;
        String ad;
    }*/

}
