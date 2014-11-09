package genusdetect.app.com.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * @author Dedea
 * @since 08/11/2014
 */
public class MyActivity extends Activity {

    /*------------------ INSTANCE variables --------------------------------------*/
    private final String TAG = "MyActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_my);

        final EditText text = (EditText)findViewById(R.id.editText);

        text.onHoverChanged(true);

        // Initialize UI elements
        final EditText addrText = (EditText) findViewById(R.id.editText);
        final Button button = (Button) findViewById(R.id.mapButton);

        // Link UI elements to actions in code
        button.setOnClickListener(new View.OnClickListener() {

            // Called when user clicks the Show Map button
            public void onClick(View v) {
                try {

                    // Process text for network transmission
                    String address = addrText.getText().toString();
                    address = address.replace(' ', '+');

                    // Create Intent object for starting Google Maps application
                    Intent geoIntent = new Intent(
                            android.content.Intent.ACTION_VIEW, Uri
                            .parse("geo:0,0?q=" + address));

                    // Use the Intent to start Google Maps application using Activity.startActivity()
                    startActivity(geoIntent);

                } catch (Exception e) {
                    // Log any error messages to LogCat usingng Log.e()
                    Log.e(TAG, e.toString());
                }
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "The activity is and has focus (it is now \"resumed\")");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,
                "Another activity is taking focus (this activity is about to be \"paused\")");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "The activity is no longer visible (it is now \"stopped\")");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "The activity is about to be destroyed.");
    }
}
