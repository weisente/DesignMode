package example.weisente.top.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by san on 2017/12/29.
 * 使用容器去创建  这个是因为map的特点
 *
 * 而且把多个单例统一通过key去管理
 * 这种方式使得我们可以管理多种类型的单例
 */

public class SingletonManager {

    private static Map<String, Object> map = new HashMap<>();

    private SingletonManager() {
    }

    public void registerInstance(String key, Object obj) {
        if (map.containsKey(key)) {
            map.put(key, obj);
        }
    }
    public static Object getInstance(String key) {
        return map.get(key);
    }
}
