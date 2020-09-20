package com.example.simplecalculator_187pm14039;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText soA,soB;
    Button Xuat;
    TextView ketqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        soA = (EditText)findViewById(R.id.etSoA);
        soB = (EditText)findViewById(R.id.etSoB);
        Xuat = (Button)findViewById(R.id.btnXuat);
        ketqua = (TextView)findViewById(R.id.tvKetQua);

        Xuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 double a,b, tong, hieu, thuong, tich;
                 a = Double.parseDouble(soA.getText().toString());
                 b = Double.parseDouble(soB.getText().toString());
                 tong = a + b;
                 hieu = a - b;
                 thuong = a / b;
                 tich = a * b;

                 ketqua.setText("kết quả từ hai giá trị bạn vừa nhập là :" + "\n Tổng :" + tong + "\n Hiệu :" + hieu + "\n Tích :" + tich + "\n Thương :" + thuong);
            }
        });
    }
}
