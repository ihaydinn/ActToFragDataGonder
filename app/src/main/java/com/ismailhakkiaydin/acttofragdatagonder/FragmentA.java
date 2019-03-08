package com.ismailhakkiaydin.acttofragdatagonder;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FragmentA extends Fragment {

    Button hesapla;
    TextView sonuc;
    int sayi1 =0, sayi2=0;
   // MainActivity.Ogrenci ogrenci;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_a, container, false);

       /* Bundle bundle = getArguments();
        final int sayi1 = bundle.getInt("birinci");
        final int sayi2 = bundle.getInt("ikinci");
*/
        hesapla = view.findViewById(R.id.btnHesapla);
        sonuc = view.findViewById(R.id.tvSonuc);

        hesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sonuclar = sayi1 + sayi2;
                sonuc.setText("Sonuc : " +  sonuclar);
            }
        });

        return view;

    }

    public void sendData(int birinciSayi, int ikinciSayi) {
        this.sayi1=birinciSayi;
        this.sayi2=ikinciSayi;
    }

  /*  public void sendOgrenci(MainActivity.Ogrenci ogrenci){
        this.ogrenci = ogrenci;
    }
*/
}
