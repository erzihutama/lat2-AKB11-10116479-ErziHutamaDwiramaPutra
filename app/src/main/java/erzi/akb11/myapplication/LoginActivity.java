package erzi.akb11.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/*
* tanggal : 14 april 2019 jam 10 pagi
* 10116479
* Erzi Hutama Dwirama Putra
* AKB-11/IF-11
*
*
* */
public class LoginActivity extends AppCompatActivity {

    public Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }

    public void regis(View view) {
        Intent intent = null;
        switch(view.getId()){
            case R.id.btn_regist:
                intent = new Intent(this,RegisterActivity.class);
                break;
        }
        if (null!=intent) startActivity(intent);
    }
}
