package com.vincent.myth.androiddemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.vincent.myth.androiddemo.R;
import com.vincent.myth.androiddemo.fragment.DiscoverFragment;
import com.vincent.myth.androiddemo.fragment.HomeFragment;
import com.vincent.myth.androiddemo.fragment.MeFragment;
import com.vincent.myth.androiddemo.fragment.SquareFragment;

public class HomeActivity extends BaseActivity implements View.OnClickListener {
    private RadioButton mTvHome;
    private RadioButton mTvSquare;
    private RadioButton mTvDiscover;
    private RadioButton mTvMe;
    private ImageView mAvatar;
    private View mLayoutContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        getSupportActionBar().setElevation(5);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                */
            }
        });
        initViewComponent();
        initParams();
        initListener();
    }

    private void initViewComponent() {
        mTvHome = (RadioButton) findViewById(R.id.tv_home_default);
        mTvSquare = (RadioButton) findViewById(R.id.tv_home_square);
        mTvDiscover = (RadioButton) findViewById(R.id.tv_home_discover);
        mTvMe = (RadioButton) findViewById(R.id.tv_home_me);
        mAvatar = (ImageView) findViewById(R.id.iv_toolbar_image);
        mLayoutContainer = findViewById(R.id.ll_home_container);
    }
    private void initParams() {
        getSupportFragmentManager().beginTransaction().replace(R.id.ll_home_container, new HomeFragment()).commitAllowingStateLoss();
    }
    private void initListener() {
        mTvHome.setOnClickListener(this);
        mTvSquare.setOnClickListener(this);
        mTvDiscover.setOnClickListener(this);
        mTvMe.setOnClickListener(this);
        mAvatar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_home_default:
                getSupportFragmentManager().beginTransaction().replace(R.id.ll_home_container, new HomeFragment()).commitAllowingStateLoss();
                break;
            case R.id.tv_home_square:
                getSupportFragmentManager().beginTransaction().replace(R.id.ll_home_container, new SquareFragment()).commitAllowingStateLoss();
                break;
            case R.id.tv_home_discover:
                getSupportFragmentManager().beginTransaction().replace(R.id.ll_home_container, new DiscoverFragment()).commitAllowingStateLoss();
                break;
            case R.id.tv_home_me:
                getSupportFragmentManager().beginTransaction().replace(R.id.ll_home_container, new MeFragment()).commitAllowingStateLoss();
                break;
            case R.id.iv_toolbar_image:
                startActivity(new Intent(this, UserCenterActivity.class));
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
