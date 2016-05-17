package india.eva.com.goldenspiral.ui.activities;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by bhargavagugamsetty on 17/05/16.
 */
public class TutorialActivity extends BaseActivity implements View.OnClickListener {
    private static final int[] INDICATOR = new int[]{R.id.pager_indicator_one, R.id.pager_indicator_two, R.id.pager_indicator_three, R.id.pager_indicator_four};

    private LinearLayout mIndicatorLinearLayout = null;
    public PagerAdapter mPagerAdapter = null;
    public ViewPager mViewPager = null;

    private TextView mNext;

    private static final String TAG = "TutorialScreenA.class";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
