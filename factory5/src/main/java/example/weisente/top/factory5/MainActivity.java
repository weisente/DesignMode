package example.weisente.top.factory5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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

    }
}
