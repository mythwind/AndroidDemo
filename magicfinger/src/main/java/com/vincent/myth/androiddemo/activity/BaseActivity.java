package com.vincent.myth.androiddemo.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.vincent.myth.androiddemo.R;
import com.vincent.myth.androiddemo.utils.MyLog;

/**
 * Created by Admin on 2015/12/28.
 */
public class BaseActivity extends AppCompatActivity {
    private ImageView mImageView;
    private TextView mTvTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base_layout);

        Toolbar toolbar = (Toolbar) findViewById(R.id.base_toolbar);
        mImageView = (ImageView) findViewById(R.id.iv_base_image);
        mTvTitle = (TextView) findViewById(R.id.iv_base_title);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        getSupportActionBar().setElevation(5);

        displayBackButton();
    }

    protected void setTitleText(int resId) {
        if(null == mTvTitle)
            throw new NullPointerException("This method must be called after super.onCreate().");
        mTvTitle.setText(resId);
    }
    /**
     * 默认显示返回按钮
     */
    protected void displayBackButton() {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        mImageView.setVisibility(View.GONE);
    }

    protected void appendViewBody(int layoutResId) {
        LinearLayout mainBody = (LinearLayout) findViewById(R.id.ll_base_container);
        View view = LayoutInflater.from(this).inflate(layoutResId, null);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT);
        MyLog.e("=========" + mainBody);
        MyLog.e("=========" + view + ", params:" + params);
        mainBody.addView(view, params);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        switch (id) {
            case android.R.id.home:
                finish();
                break;
            case R.id.action_settings:
                break;
        }
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
