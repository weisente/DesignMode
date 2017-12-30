package example.weisente.top.visitor16;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //构建报表
        BusinessReport report = new BusinessReport();
        System.out.println("===== 给CEO看报表 =====");
        //设置访问者CEO
        report.showReport(new CEOVisitor());
        System.out.println("===== 给CTO看报表 =====");
        //设置访问者CTO
        report.showReport(new CTOVisitor());
    }
}
