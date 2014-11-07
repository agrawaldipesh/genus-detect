package genusdetect.app.com.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MyActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Integer total = 5+9;

        Util util = new Util();

        util.suma(5,61);

        super.onCreate(savedInstanceState);
//(exxgxh)
        super.setContentView(R.layout.activity_my);
        Integer total1 = suma(5, 9);



    }

    public Integer suma(Integer a, Integer b) {

        return a+b;
    }

    @Override
    public void setContentView(int layoutResID) {
       // fa altfel
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
}
