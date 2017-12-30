package example.weisente.top.mediator17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //构造主板对象
        MainBoard mediator = new MainBoard();

        //分别构造各个零件
        CD cd = new CD(mediator);
        CPU cpu = new CPU(mediator);

        //将各个零件安装到主板
        mediator.setCDDevice(cd);
        mediator.setCPU(cpu);

        //播放电影
        cd.load();
    }
}
