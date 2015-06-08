package me.armando.hubifier;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Principal extends ActionBarActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        this.initialize();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.btnSettings)
        {
            Toast tstMessage=Toast.makeText(getApplicationContext(), "You need to be a monster, since this option is not allowed to see for human beans.", Toast.LENGTH_SHORT);
            tstMessage.show();
        }
        return super.onOptionsItemSelected(item);
    }


    // Custom functions...

    public void initialize()
    {
        Button btnSpotifyStreamer=(Button)findViewById(R.id.btnSpotifyStreamer);
        btnSpotifyStreamer.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Toast tstMessage=Toast.makeText(getApplicationContext(), "This button will launch the Spotify Streamer.", Toast.LENGTH_SHORT);
                tstMessage.show();
            }
        });

        Button btnScoresApp=(Button)findViewById(R.id.btnScoresApp);
        btnScoresApp.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Toast tstMessage=Toast.makeText(getApplicationContext(), "This button will launch the Scores App.", Toast.LENGTH_SHORT);
                tstMessage.show();
            }
        });

        Button btnLibraryApp=(Button)findViewById(R.id.btnLibraryApp);
        btnLibraryApp.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Toast tstMessage=Toast.makeText(getApplicationContext(), "This button will launch the Library App.", Toast.LENGTH_SHORT);
                tstMessage.show();
            }
        });

        Button btnBuiltItBigger=(Button)findViewById(R.id.btnBuiltItBigger);
        btnBuiltItBigger.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Toast tstMessage=Toast.makeText(getApplicationContext(), "This button will launch the Built It Bigger App.", Toast.LENGTH_SHORT);
                tstMessage.show();
            }
        });

        Button btnXYZReader=(Button)findViewById(R.id.btnXYZReader);
        btnXYZReader.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Toast tstMessage=Toast.makeText(getApplicationContext(), "This button will launch the XYZ Reader App.", Toast.LENGTH_SHORT);
                tstMessage.show();
            }
        });

        Button btnCapstone=(Button)findViewById(R.id.btnCapstone);
        btnCapstone.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Toast tstMessage=Toast.makeText(getApplicationContext(), "This button will launch the Capstone: YAGA App.", Toast.LENGTH_SHORT);
                tstMessage.show();
            }
        });
    }
}
