package bala.test.com.learn_mvp.login;

/**
 * Created by bala on 4/11/17.
 */

public interface LoginView {

    public void showProgress();

    public void hideProgress();

    public void userNameError();

    public void passwordError();

    public void goToHomeFragment();
}
