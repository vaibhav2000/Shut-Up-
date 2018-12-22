package newpackage.vab.shutup;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.lang.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       causeDelay();

    }

    private void causeDelay()
    {
        final TextView txt= (TextView)findViewById(R.id.loaderID);
        final Handler handler= new Handler();


        handler.post(new Runnable() {
            @Override
            public void run() {

                String str =  txt.getText().toString();
                if(str.length()<19)
                {   str+= 'l';
                    txt.setText(str);
                    handler.postDelayed(this,200);}
                else
                {
                    Intent intent = new Intent(getApplicationContext(),MainActivityShouter.class);
                    startActivity(intent);
                }

            }


        });

           txt.setText("");
    }



}
