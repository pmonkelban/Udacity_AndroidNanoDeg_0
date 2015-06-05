package udacity.nano.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickApp1(View v) {
        showToast(R.string.app_1_toast);
    }

    public void onClickApp2(View v) {
        showToast(R.string.app_2_toast);
    }

    public void onClickApp3(View v) {
        showToast(R.string.app_3_toast);
    }

    public void onClickApp4(View v) {
        showToast(R.string.app_4_toast);
    }

    public void onClickApp5(View v) {
        showToast(R.string.app_5_toast);
    }

    public void onClickApp6(View v) {
        showToast(R.string.app_6_toast);
    }

    private void showToast(int stringId) {
        Toast.makeText(this, getString(stringId), Toast.LENGTH_SHORT).show();
    }
}
