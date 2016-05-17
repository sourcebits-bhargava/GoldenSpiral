package india.eva.com.goldenspiral.ui.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by bhargavagugamsetty on 17/05/16.
 */
public class BaseActivity extends AppCompatActivity {


    public Toolbar mToolbar;
    private ActionBar mActionBar;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public void setActionbarTitle(String title, Boolean isParent, int id) {

        mToolbar = (Toolbar) findViewById(id);
//        mToolbar.setTitleTextColor(ContextCompat.getColor(getApplicationContext(), R.color.white));
        setSupportActionBar(mToolbar);

        mActionBar = getSupportActionBar();
        mActionBar.setDisplayHomeAsUpEnabled(true);
//        mActionBar.setHomeAsUpIndicator(R.drawable.back_icon);

        if (title != null) {
            mActionBar.setTitle(title);
        }
    }


}
