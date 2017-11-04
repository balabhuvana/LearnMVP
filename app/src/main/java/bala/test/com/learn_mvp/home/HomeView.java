package bala.test.com.learn_mvp.home;

import java.util.List;

/**
 * Created by bala on 4/11/17.
 */

public interface HomeView {
    public void setListViewItem(List<String> listViewItem);

    public void showProgress();

    public void hideProgress();

    public void goToNextScreen(String item);
}
