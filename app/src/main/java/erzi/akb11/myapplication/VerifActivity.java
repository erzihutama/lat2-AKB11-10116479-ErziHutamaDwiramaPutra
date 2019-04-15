package erzi.akb11.myapplication;
/*
 * tanggal : 15 april 2019
 * 10116479
 * Erzi Hutama Dwirama Putra
 * AKB-11/IF-11
 *
 *
 * */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VerifActivity extends AppCompatActivity {

    private Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verif);

        send = (Button)findViewById(R.id.btn_send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent send  = new Intent(getApplicationContext(),HomeActivity.class);
                startActivity(send);
            }
        });
    }
}
