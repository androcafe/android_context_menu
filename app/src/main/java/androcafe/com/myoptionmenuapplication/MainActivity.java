package androcafe.com.myoptionmenuapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.menu_item1:
                Toast.makeText(getApplicationContext()," "+getResources().getString(R.string.menu_item1)+" Selected",Toast.LENGTH_LONG).show();
                return true;
            case R.id.menu_item2:
                Toast.makeText(getApplicationContext()," "+getResources().getString(R.string.menu_item2)+" Selected",Toast.LENGTH_LONG).show();
                return true;
            case R.id.menu_item3:
                Toast.makeText(getApplicationContext()," "+getResources().getString(R.string.menu_item3)+" Selected",Toast.LENGTH_LONG).show();
                return true;
            case R.id.menu_item4:
                Toast.makeText(getApplicationContext()," "+getResources().getString(R.string.menu_item4)+" Selected",Toast.LENGTH_LONG).show();
                return true;
            case R.id.menu_item5:
                Toast.makeText(getApplicationContext()," "+getResources().getString(R.string.menu_item5)+" Selected",Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
