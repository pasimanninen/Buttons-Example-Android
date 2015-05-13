package fi.ptm.buttonsexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


/**
 *
 * @author PTM
 */

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // add listener to another button
        Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(getApplicationContext(), "Button 2 Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    /** Called when the user touches the button */
    public void buttonClicked(View view) {
        // Do something in response to button click
        Toast.makeText(getApplicationContext(), "Button 1 Clicked", Toast.LENGTH_SHORT).show();
    }


}
