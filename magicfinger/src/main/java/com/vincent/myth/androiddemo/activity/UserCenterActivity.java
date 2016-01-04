package com.vincent.myth.androiddemo.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

import com.vincent.myth.androiddemo.R;
import com.vincent.myth.androiddemo.fragment.HomeFragment;

public class UserCenterActivity extends BaseActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTitleText(R.string.personal_center);
        appendViewBody(R.layout.activity_user_center);

        initViewComponent();
        initParams();
        initListener();
    }
    private void initViewComponent() {
    }
    private void initParams() {

    }
    private void initListener() {
        findViewById(R.id.ll_user_username).setOnClickListener(this);
        findViewById(R.id.ll_user_mobile).setOnClickListener(this);
        findViewById(R.id.ll_user_gender).setOnClickListener(this);
        findViewById(R.id.ll_user_area).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ll_user_username:
                break;
            case R.id.ll_user_mobile:
                break;
            case R.id.ll_user_gender:
                break;
            case R.id.ll_user_area:

                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_personal_center, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_home:
                Intent intent = new Intent(this, HomeActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP); // 设置不要刷新将要跳到的界面
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // 它可以关掉所要到的界面中间的activity
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
