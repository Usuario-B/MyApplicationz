package es.upv.etsit.aatt.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    String ETIQUETA = "DEPURANDO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d( ETIQUETA, "En onStart()" );
    }


    @Override protected void onStart( ) { Log.d( ETIQUETA, "En onStart()" ); }
    @Override protected void onRestart( ) { Log.d( ETIQUETA, "En onRestart()" ); }
    @Override protected void onResume( ) { Log.d( ETIQUETA, "En onResume()" ); }
    @Override protected void onPause( ) { Log.d( ETIQUETA, "En onPause()" ); }
    @Override protected void onStop( ) { Log.d( ETIQUETA, "En onStop()" ); }
    @Override protected void onDestroy( ) { Log.d( ETIQUETA, "En onDestroy()" ); }
    //... ¡¡¡CRASH!!!: super.onXxxx();
}





