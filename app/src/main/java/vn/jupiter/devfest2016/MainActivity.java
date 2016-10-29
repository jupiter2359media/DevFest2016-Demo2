package vn.jupiter.devfest2016;

import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    private void showListOfParticipants(List<Participant> participants) {
        AudioManager audioManager = ((AudioManager) getSystemService(Context.AUDIO_SERVICE));

    }



}
