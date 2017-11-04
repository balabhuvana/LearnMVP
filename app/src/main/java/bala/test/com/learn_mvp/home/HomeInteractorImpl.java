package bala.test.com.learn_mvp.home;

import android.util.Log;

import java.util.Arrays;
import java.util.List;

/**
 * Created by bala on 5/11/17.
 */

public class HomeInteractorImpl implements HomeInteractor {
    private String TAG = HomeInteractorImpl.class.getSimpleName();

    private List<String> createArrayList() {
        return Arrays.asList(
                "Apple",
                "Banana",
                "Chitra",
                "Deva",
                "Rakesh",
                "Ramesh",
                "Kave",
                "Nelson",
                "Ganasen",
                "Arun"
        );
    }

    @Override
    public void findItems(final onHitFinishedListener hitFinishedListener) {
        Log.d(TAG, "findItems");
        new android.os.Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                hitFinishedListener.getNetworkListItem(createArrayList());
            }
        }, 5000);
    }
}
