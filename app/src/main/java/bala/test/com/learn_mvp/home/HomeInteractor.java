package bala.test.com.learn_mvp.home;

import java.util.List;

/**
 * Created by bala on 5/11/17.
 */

public interface HomeInteractor {
    void findItems(onHitFinishedListener hitFinishedListener);

    interface onHitFinishedListener {
        public void getNetworkListItem(List<String> item);
    }
}
