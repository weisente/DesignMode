package example.weisente.top.policy;

import android.util.Log;

/**
 * Created by san on 2017/12/29.
 */

public class PrimaryPolicy implements Policy {
    @Override
    public double calcPrice(double booksPrice) {
        Log.v("tag", "初级会员没有优惠");
        return booksPrice;
    }
}
