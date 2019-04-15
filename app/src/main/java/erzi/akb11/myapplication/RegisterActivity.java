package erzi.akb11.myapplication;
/*
 * tanggal : 14 april 2019
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

public class RegisterActivity extends AppCompatActivity {
    private Button Register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Register = (Button)findViewById(R.id.btnRegister);
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reg  = new Intent(getApplicationContext(),AlmostActivity.class);
                startActivity(reg);
            }
        });
    }
}
