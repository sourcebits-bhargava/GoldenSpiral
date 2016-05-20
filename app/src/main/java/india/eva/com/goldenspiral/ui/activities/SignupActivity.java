package india.eva.com.goldenspiral.ui.activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import india.eva.com.goldenspiral.R;

/**
 * Created by bhargavagugamsetty on 17/05/16.
 */
public class SignupActivity extends BaseActivity{
    private String mCompName;
    private String mplan;
    private String mAdminName;
    private String memail;
    private String mphoneNo;
    private String mPass;
    private String mPhrase;
    private EditText mcompanyNameEt;
    private EditText mplanEt;
    private EditText mAdminNameEt;
    private EditText memailEt;
    private EditText mphoneNoEt;
    private EditText mPassEt;
    private EditText mPhraseEt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        setActionbarTitle(getString(R.string.sign_up), true, R.id.sign_up_tb);
        mcompanyNameEt = (EditText) findViewById(R.id.company_name_et);
        mplanEt =  (EditText) findViewById(R.id.plan_et);
        mAdminNameEt = (EditText) findViewById(R.id.admin_et);
        memailEt = (EditText) findViewById(R.id.email_et);
        mphoneNoEt = (EditText) findViewById(R.id.phone_et);
        mPassEt = (EditText) findViewById(R.id.password_et);
        mPhraseEt = (EditText) findViewById(R.id.pass_phrase_et);

        mCompName = mcompanyNameEt.getText().toString();
        mplan = mplanEt.getText().toString();
        mAdminName = mAdminNameEt.getText().toString();
        memail = memailEt.getText().toString();
        mphoneNo = mphoneNoEt.getText().toString();
        mPass = mPassEt.getText().toString();
        mPhrase = mPhraseEt.getText().toString();
        // validation
        if(isValidCompany(mCompName))
            mCompName.setError("Invalid Age. Valid age: 18 to 100");

         if(isValidplan(mplan))

             if(isValidAdmin(mAdminName))


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
