package pl.saramak.connectwithwearapp;

import android.content.Intent;

import com.google.android.gms.wearable.MessageEvent;
import com.google.android.gms.wearable.WearableListenerService;

import pl.saramak.connectwithwearapp.MainActivity;

/**
 * Created by mario on 06.08.16.
 */
public class WearPhoneMessageListenerService extends WearableListenerService {
    private static final String START_ACTIVITY = "/start_phone_activity";
    @Override
    public void onMessageReceived(MessageEvent messageEvent) {
        if( messageEvent.getPath().equalsIgnoreCase( START_ACTIVITY ) ) {
            Intent intent = new Intent( this, MainActivity.class );
            intent.addFlags( Intent.FLAG_ACTIVITY_NEW_TASK );
            startActivity( intent );
        } else {
            super.onMessageReceived(messageEvent);
        }
    }
}