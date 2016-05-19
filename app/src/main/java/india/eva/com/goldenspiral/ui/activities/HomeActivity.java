package india.eva.com.goldenspiral.ui.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import india.eva.com.goldenspiral.R;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener{


    private Button mprice,mContact,mValue,mBlog,mSign,mLogin;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mprice = (Button)findViewById(R.id.price_bt);
        mprice.setOnClickListener(this);

        mContact = (Button)findViewById(R.id.price_bt);
        mContact.setOnClickListener(this);

        mValue = (Button)findViewById(R.id.price_bt);
        mValue.setOnClickListener(this);

        mBlog = (Button)findViewById(R.id.price_bt);
        mBlog.setOnClickListener(this);

        mSign = (Button)findViewById(R.id.price_bt);
        mSign.setOnClickListener(this);

        mLogin = (Button)findViewById(R.id.price_bt);
        mLogin.setOnClickListener(this);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.price_bt:
                Intent priceIntent = new Intent(this, PriceActivity.class);
                startActivity(priceIntent);
            case R.id.contact_us_bt:
                Intent contactIntent = new Intent(this, ContactActivity.class);
                startActivity(contactIntent);
            case R.id.value_bt:
                Intent valueIntent = new Intent(this, ValueActivity.class);
                startActivity(valueIntent);
            case R.id.blog_bt:
                Intent blogIntent = new Intent(this, BlogActivity.class);
                startActivity(blogIntent);
            case R.id.sign_up_bt:
                Intent signIntent = new Intent(this, SignupActivity.class);
                startActivity(signIntent);
            case R.id.login_bt:
                Intent loginIntent = new Intent(this, LoginActivity.class);
                startActivity(loginIntent);


        }

    }
}
