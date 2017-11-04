package bala.test.com.learn_mvp.login;

/**
 * Created by bala on 4/11/17.
 */

public class LoginPresenterImpl implements LoginPresenter, LoginInteractor.OnLoginFinishedListener {
    private LoginView mLoginView;
    private LoginInteractorImpl mLoginInteractorImpl;

    public LoginPresenterImpl(LoginView loginView) {
        this.mLoginView = loginView;
        mLoginInteractorImpl = new LoginInteractorImpl();
    }

    @Override
    public void validateLogin(final String userName, final String password) {
        mLoginView.showProgress();
        mLoginInteractorImpl.login(userName, password, this);
    }


    @Override
    public void onUsernameError() {
        mLoginView.userNameError();
        mLoginView.hideProgress();

    }

    @Override
    public void onPasswordError() {
        mLoginView.passwordError();
        mLoginView.hideProgress();
    }

    @Override
    public void onSuccess() {
        mLoginView.goToHomeFragment();
        mLoginView.hideProgress();
    }
}
