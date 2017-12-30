package example.weisente.top.state8;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 这次的学习是 使用状态模式 其目的在于不同状态对同一的行为的不同响应
 * 把if---else用多态来实现 避免耦合
 *
 * 讲到底 就是多态的学习
 */

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.forward)
    Button forward;
    @Bind(R.id.logout)
    Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @OnClick({R.id.forward, R.id.logout})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.forward:
                LoginTools.getInstance().forward(MainActivity.this);
                break;
            case R.id.logout:
                LoginTools.getInstance().setState(new LogoutState());
                break;
        }
    }
}
