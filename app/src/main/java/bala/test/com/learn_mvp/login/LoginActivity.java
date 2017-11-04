package bala.test.com.learn_mvp.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import bala.test.com.learn_mvp.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.loginFrameLayout, LoginFragment.newInstance("", ""))
                .commit();
    }
}
