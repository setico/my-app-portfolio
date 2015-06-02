package mobilplug.com.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;


public class MainActivity extends ActionBarActivity{

    @InjectView(R.id.btn_1)
    protected Button btn_1;
    @InjectView(R.id.btn_2)
    protected Button btn_2;
    @InjectView(R.id.btn_3)
    protected Button btn_3;
    @InjectView(R.id.btn_4)
    protected Button btn_4;
    @InjectView(R.id.btn_5)
    protected Button btn_5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
    }

    @OnClick(R.id.btn_1)
    public void btn_1_Onclick(){
        showToast(btn_1.getText().toString());
    }
    @OnClick(R.id.btn_2)
    public void btn_2_Onclick(){
        showToast(btn_2.getText().toString());
    }
    @OnClick(R.id.btn_3)
    public void btn_3_Onclick(){
        showToast(btn_3.getText().toString());
    }
    @OnClick(R.id.btn_4)
    public void btn_4_Onclick(){
        showToast(btn_4.getText().toString());
    }
    @OnClick(R.id.btn_5)
    public void btn_5_Onclick(){
        showToast(btn_5.getText().toString());
    }

    void showToast(String msg){
        Toast.makeText(this,getString(R.string.toast_msg)+" "+msg, Toast.LENGTH_SHORT).show();
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
