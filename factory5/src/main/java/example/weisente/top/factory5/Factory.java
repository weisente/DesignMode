package example.weisente.top.factory5;

/**
 * Created by san on 2017/12/29.
 */

public abstract class Factory {
    public abstract <T extends Product> T createProduct(Class<T> clz);
}
