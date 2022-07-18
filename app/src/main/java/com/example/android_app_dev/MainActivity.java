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
        editText = findViewById(R.id.edit2);
    	editText = findViewById(R.id.edit10);
    	editText = findViewById(R.id.edit16);
    	editText = findViewById(R.id.editN);
    	editText = findViewById(R.id.editBase);
    	textView = findViewById(R.id.textbox2);
    	textView = findViewById(R.id.textbox10);
    	textView = findViewById(R.id.textbox16);
    	textView = findViewById(R.id.textboxN);
        Button button2 = findViewById(R.id.button2);
    	Button button10 = findViewById(R.id.button10);
    	Button button16 = findViewById(R.id.button16);
    	Button buttonN = findViewById(R.id.buttonN);

        button2.setOnClickListener(new View.OnClickListener() {
        	@Override
        	public void onClick(View v) {
                String input = edit2.getText().toString();
                String input_decimal;
                input_decimal = test.B_to_D(input);
                textbox2.setText(input);
                textbox10.setText(test.B_to_D(input));
                textbox16.setText(test.Hexadecimal(input_decimal));
        	}
        });
    	button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	String input = edit10.getText().toString();
            	String input_decimal;
                textbox2.setText(test.Binary(input));
                textbox10.setText(input);
                textbox16.setText(test.Hexadecimal(input_decimal));
            }
        });
    	button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	String input = edit16.getText().toString();
            	String input_decimal;
            	input_decimal = test.H_to_D(input);
                textbox2.setText(test.Binary(input_decimal));
                textbox10.setText(test.H_to_D(input));
                textbox16.setText(input);
            }
        });
    	buttonN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	String Base = editBase.getText().toString();
            	String input = editN.getText().toString();
            	String input_decimal;
            	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            	int n = Integer.parseInt(Base);
            	int A = Integer.parseInt(input, n);
          		input_decimal = Integer.toString(A);
                textbox2.setText(test.Binary(input_decimal));
                textbox10.setText(Integer.toString(A));
                textbox16.setText(test.Hexadecimal(input_decimal));
                textboxN.setText(input);
            }
        });
        //ここまで入力

        //NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        //appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        //NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

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