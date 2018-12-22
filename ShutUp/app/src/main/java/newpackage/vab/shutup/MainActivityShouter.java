package newpackage.vab.shutup;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivityShouter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_shouter);
    }

    public void sayShutUp(View view)
    {
        MediaPlayer mp= MediaPlayer.create(this,R.raw.sound_effect);
        mp.start();


    }

    public void visitPage(View view)
    {
          Intent brain= new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/user/smosh"));
          startActivity(brain);
    }

    public void shareIt(View view)
    {

    }



}

