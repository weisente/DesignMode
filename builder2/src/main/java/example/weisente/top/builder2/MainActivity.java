package example.weisente.top.builder2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CommonDilaogFragment.Builder(getFragmentManager())
                .title("标题")
                .message("简单消息框")
                .positive("你好")
                .negative("哈哈")
                .build();
    }
}
