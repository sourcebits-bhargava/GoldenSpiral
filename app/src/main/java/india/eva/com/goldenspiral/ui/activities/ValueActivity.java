package india.eva.com.goldenspiral.ui.activities;

import android.app.Activity;
import android.os.Bundle;

import india.eva.com.goldenspiral.R;

/**
 * Created by bhargavagugamsetty on 17/05/16.
 */
public class ValueActivity extends BaseActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_value);
        setActionbarTitle(getString(R.string.value), true, R.id.value_tb);

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
