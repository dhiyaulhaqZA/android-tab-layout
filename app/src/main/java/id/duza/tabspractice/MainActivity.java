package id.duza.tabspractice;

import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import id.duza.tabspractice.adapter.SimpleAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Setup view pager
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(new SimpleAdapter(getSupportFragmentManager(), this));

        TabLayout tabs = (TabLayout) findViewById(R.id.tabs);
        // Styling tabs
        tabs.setTabGravity(TabLayout.GRAVITY_FILL);
        tabs.setBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimary));
        tabs.setTabTextColors(ContextCompat.getColor(this, R.color.colorNormal), ContextCompat.getColor(this, android.R.color.white));
        tabs.setSelectedTabIndicatorColor(ContextCompat.getColor(this, R.color.colorAccent));
        tabs.setSmoothScrollingEnabled(true);
        tabs.setFillViewport(true);

        tabs.setupWithViewPager(viewPager);
    }
}
