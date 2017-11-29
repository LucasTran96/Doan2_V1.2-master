package com.example.pcc.doan2_v1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.pcc.doan2_v1.danhmuctin.CongNghe;
import com.example.pcc.doan2_v1.danhmuctin.ChinhTri;
import com.example.pcc.doan2_v1.danhmuctin.GiaiTrii;
import com.example.pcc.doan2_v1.danhmuctin.GiaoDuc;
import com.example.pcc.doan2_v1.danhmuctin.KinhTen;
import com.example.pcc.doan2_v1.danhmuctin.PhapLuat;
import com.example.pcc.doan2_v1.danhmuctin.VanHoa;
import com.example.pcc.doan2_v1.danhmuctin.XaHoi;

public class HomeQuanLyDanhMucTinTuc extends AppCompatActivity {
    Button btnXaHoi,btnKinhTe,btnVanHoa,btnGiaoDuc,btnChinhTri,btnPhapLuat,btnGiaiTri,btnGiaDinh;
    TextView txtDanhMuc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_quan_ly_danh_muc_tin_tuc);
        khaibao();
        setEvent();
    }

    private void setEvent() {
        btnChinhTri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), ChinhTri.class);
                startActivity( intent);


            }
        });

        btnXaHoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), XaHoi.class);
                startActivity( intent);


            }
        });

        btnVanHoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), VanHoa.class);
                startActivity( intent);


            }
        });

        btnPhapLuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),PhapLuat.class);
                startActivity( intent);


            }
        });

        btnKinhTe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),KinhTen.class);
                startActivity( intent);


            }
        });

        btnGiaoDuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), GiaoDuc.class);
                startActivity( intent);


            }
        });

        btnGiaiTri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),GiaiTrii.class);
                startActivity( intent);


            }
        });

        btnGiaDinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), CongNghe.class);
                startActivity( intent);


            }
        });
    }

    private void khaibao() {
        btnChinhTri= findViewById(R.id.btnChinhTriRSS);
        btnGiaDinh= findViewById(R.id.btnGiaDinhRSS);
        btnGiaiTri= findViewById(R.id.btnGiaiTriRSS);
        btnGiaoDuc= findViewById(R.id.btnGiaoDucRSS);
        btnKinhTe= findViewById(R.id.btnKinhTeRSS);
        btnPhapLuat= findViewById(R.id.btnPhapLuatRSS);
        btnVanHoa= findViewById(R.id.btnVanHoaRSS);
        btnXaHoi= findViewById(R.id.btnXaHoiRSS);


    }


}
