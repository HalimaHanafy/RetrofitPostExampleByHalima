package com.iayon.retrofit20tutorial;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import models.login.request.Data;
import models.login.request.LoginRequestModel;
import models.login.request.Request;
import models.login.response.LoginResponseModel;
import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;

import static rest.RestClient.*;

public class MainActivity extends AppCompatActivity {

    String userId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ProgressDialog dialog = ProgressDialog.show(this, "", "loading...");

        GitApiInterface service = getClient();

        LoginRequestModel user = new LoginRequestModel(new Data(getApplicationContext()),new Request(getApplicationContext()));

        Call<LoginResponseModel> call2 = service.createUser(user);

        call2.enqueue(new Callback<LoginResponseModel>() {
            @Override
            public void onResponse(Response<LoginResponseModel> response) {
                dialog.dismiss();
                Log.d("MainActivity", "Status Code = " + response.code());
                if (response.isSuccess()) {
                    // request successful (status code 200, 201)
                    LoginResponseModel result = response.body();
                    Log.d("MainActivity", "response = " + new Gson().toJson(result));
                    userId = result.getResult().getSalonName_ar();
                    Log.d("MainActivity", "Items = " + userId);
                    Toast.makeText(getApplicationContext(),""+userId,Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(),"ellllse",Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Throwable t) {
                dialog.dismiss();
            }
        });



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
