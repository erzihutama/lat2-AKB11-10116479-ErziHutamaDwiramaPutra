package erzi.akb11.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

        login = (Button)findViewById(R.id.BtnLogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginn  = new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(loginn);
            }
        });
    }
}
