package example.weisente.top.policy;

import android.util.Log;

/**
 * Created by san on 2017/12/29.
 */

public class SeniorPolicy implements Policy {
    @Override
    public double calcPrice(double booksPrice) {
        Log.v("tag", "中级会员只有打八折");
        return booksPrice * 0.8;
    }
}
