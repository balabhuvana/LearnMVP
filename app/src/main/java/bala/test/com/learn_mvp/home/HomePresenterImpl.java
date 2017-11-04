package bala.test.com.learn_mvp.home;

import android.util.Log;

import java.util.List;

/**
 * Created by bala on 5/11/17.
 */

public class HomePresenterImpl implements HomePresenter, HomeInteractor.onHitFinishedListener {

    private HomeView mHomeView;
    private HomeInteractorImpl homeInteractorImpl;
    private String TAG = HomePresenterImpl.class.getSimpleName();

    public HomePresenterImpl(HomeView oHomeView) {
        mHomeView = oHomeView;
        homeInteractorImpl = new HomeInteractorImpl();
    }

    @Override
    public void onResume() {
        Log.d(TAG, "onResume");
        if (mHomeView != null) {
            Log.d(TAG, "if onResume");
            mHomeView.showProgress();
            homeInteractorImpl.findItems(this);
        }
    }


    @Override
    public void goToItemClick(String value) {
        mHomeView.goToNextScreen(value);
    }

    @Override
    public void getNetworkListItem(List<String> item) {
        mHomeView.setListViewItem(item);
        mHomeView.hideProgress();
    }
}
