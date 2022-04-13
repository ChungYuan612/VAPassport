package work.sivs.vapassportpart1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * <li>第1部分 - 基礎介面設計 (主要介面)</li>
 * <h2>重點在XML設計</h2>
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickVA(View view) {
        Intent intent = new Intent(this,VAActivity.class);
        startActivity(intent);
        finish();
    }
    /*以下是第2部分的*/
    public void clickQR(View view) {
        Intent intent = new Intent(this,QRScanActivity.class);
        startActivity(intent);
        finish();
    }
}