package india.eva.com.goldenspiral.ui.activities;

import android.app.Activity;
import android.os.Bundle;

import india.eva.com.goldenspiral.R;

/**
 * Created by bhargavagugamsetty on 17/05/16.
 */
public class PriceActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price);
        setActionbarTitle(getString(R.string.price), true, R.id.price_tb);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
