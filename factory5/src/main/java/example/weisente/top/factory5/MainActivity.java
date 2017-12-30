package example.weisente.top.factory5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Factory factory = new ConcreteFactory();
        ConcreteProductA a = factory.createProduct(ConcreteProductA.class);
        ConcreteProductB b = factory.createProduct(ConcreteProductB.class);
        a.create();
        b.create();


//        List
//        ArrayList

    }
}
