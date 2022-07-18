package com.example.android_app_dev;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.android_app_dev.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

      //ここから
        final TextView text2 = (TextView)findViewById(R.id.text2);
        final TextView text10 = (TextView)findViewById(R.id.text10);
        final TextView text16 = (TextView)findViewById(R.id.text16);
        Button button2 = (Button)findViewById(R.id.button2);
        Button button10 = (Button)findViewById(R.id.button10);
        Button button16 = (Button)findViewById(R.id.button16);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	String input = getString(R.string.text2);
            	String input_decimal;
            	input_decimal = test.B_to_D(input);
                text10.setText(test.B_to_D(input));
                text16.setText(test.Hexadecimal(input_decimal));
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	String input = getString(R.string.text10);
            	String input_decimal;
                text2.setText(test.Binary(input));
                text16.setText(test.Hexadecimal(input_decimal));
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	String input = getString(R.string.text16);
            	String input_decimal;
            	input_decimal = test.H_to_D(input);
                text2.setText(test.Binary(input_decimal));
                text10.setText(test.H_to_D(input));
            }
        });
        //ここまで入力

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

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

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}