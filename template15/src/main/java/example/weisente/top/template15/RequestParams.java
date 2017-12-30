package example.weisente.top.template15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by san on 2017/12/30.
 */

public class RequestParams {
    private final List<Map> params = new ArrayList<>();


    public void addFormData(String key, String value) {
        Map param = new HashMap<>();
        param.put(key, value);
        params.add(param);
    }
}
