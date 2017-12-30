package example.weisente.top.policy;

/**
 * Created by san on 2017/12/29.
 */

public class Price {


    private Policy policy;

    public Price(Policy policy){
        this.policy = policy;
    }

    public double count(double price){
        return policy.calcPrice(price);
    }
}

