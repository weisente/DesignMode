package example.weisente.top.factory5;

/**
 * Created by san on 2017/12/29.
 */

public class ConcreteFactory  extends Factory {
    @Override
    public <T extends Product> T createProduct(Class<T> clz) {
        Product p = null;

        try {
            p = (Product) Class.forName(clz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) p;
    }
}
