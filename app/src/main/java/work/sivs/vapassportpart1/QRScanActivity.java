package work.sivs.vapassportpart1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import work.sivs.vapassportpart1.other.other_QRScanActivity_hard;
import work.sivs.vapassportpart1.other.other_QRScanActivity_medium;

/**
 * <h2>第2部分 - 本地端資料存取 (防疫實聯制)</h2>
 *
 * <div class="special reference">
 *
 * <h1>這部分依照難度分3種難度</h1>
 * <h3>因為列表這個有點難度，如果有興趣可以試看看</h3>
 * <h3>或者想要挑戰做出圓角邊框，美化排版的</h3>
 * </div>
 * <p>----------------------------------------------</p>
 * <h1>目前難度 : {@link QRScanActivity 簡單} </h1>
 * <h3>(Ctrl+點擊難度 即可跳至該頁面)</h3>
 * <ul>
 *   <li><h2>簡單</h2></li>
 *   <li><h2>{@link other_QRScanActivity_medium 普通 +美化排版}</h2></li>
 *   <li><h2>{@link other_QRScanActivity_hard 困難 +美化排版 +列表呈現}</h2></li>
 * </ul>
 * <p></p>
 * <h3>
 *   註：要看任何的東西都直接 {@linkplain null ctrl + 左鍵} 就可以看到了!
 * </h3>
 */
public class QRScanActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrscan);
    }

    public void clickBackToMain(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

}