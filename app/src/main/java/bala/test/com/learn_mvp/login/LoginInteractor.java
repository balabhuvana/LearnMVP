package bala.test.com.learn_mvp.login;

/**
 * Created by bala on 4/11/17.
 */

public interface LoginInteractor {

    interface OnLoginFinishedListener {
        void onUsernameError();

        void onPasswordError();

        void onSuccess();
    }

    public void login(String username, String password, OnLoginFinishedListener onLoginFinishedListener);
}
