package opensource.codeer;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView ivGirls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivGirls = (ImageView) findViewById(R.id.iv_girls);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    ivGirls.setImageDrawable(
                            ContextCompat.getDrawable(MainActivity.this, R.drawable.image1));
                    return true;
                case R.id.navigation_dashboard:
                    ivGirls.setImageDrawable(
                            ContextCompat.getDrawable(MainActivity.this, R.drawable.image2));
                    return true;
                case R.id.navigation_notifications:
                    ivGirls.setImageDrawable(
                            ContextCompat.getDrawable(MainActivity.this, R.drawable.image3));
                    return true;
            }
            return false;
        }

    };
}
