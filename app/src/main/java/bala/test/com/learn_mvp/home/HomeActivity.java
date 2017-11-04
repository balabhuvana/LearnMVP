package bala.test.com.learn_mvp.home;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import bala.test.com.learn_mvp.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.homeFrameLayout, HomeFragment.newInstance("", ""))
                .commit();
    }
}
