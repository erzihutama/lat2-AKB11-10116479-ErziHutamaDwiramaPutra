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

public class AlmostActivity extends AppCompatActivity {

    private Button verify;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost);
        verify = (Button)findViewById(R.id.btnV2);
        verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reg  = new Intent(getApplicationContext(),VerifActivity.class);
                startActivity(reg);
            }
        });

    }
}
