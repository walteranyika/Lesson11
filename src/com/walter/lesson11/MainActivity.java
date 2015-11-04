package com.walter.lesson11;

import org.apache.http.Header;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public void create(View v)
    {
    	Person p1=new Person("John Mark", "jm@gmail.com", "55");
    	Person p2=new Person("Chang Ling", "cl@yahoo.com", "66");
    	Person p3=new Person("Wayne Rooney", "wr@yahoo.com", "79");
    	Person p4=new Person("Rio Ferdinand", "rf@yahoo.com", "17");
    	Person p5=new Person("Ashley Young", "ay@yahoo.com", "53");
    	Gson gson=new Gson();
    	Person[] data ={p1,p2,p3,p4,p5};
    	String all = gson.toJson(data);
    	Log.d("ALL", all);
    	RequestParams params=new RequestParams();
    	params.put("data", all);
    	//http://emobilis-server.com/lesson10/data.txt
    	AsyncHttpClient client=new AsyncHttpClient();
    	//http://emobilis-server.com/lesson10/json.php
    	String url="http://emobilis-server.com/lesson10/json.php";
    	client.post(url, params, new AsyncHttpResponseHandler() {
     		@Override
			public void onSuccess(int arg0, Header[] arg1, byte[] arg2) {
                 Toast.makeText(getApplicationContext(), 
            		       "Success", Toast.LENGTH_SHORT).show();				
			}
			
			@Override
			public void onFailure(int arg0, Header[] arg1, byte[] arg2, Throwable arg3) {
	             Toast.makeText(getApplicationContext(), 
          		            "Failed", Toast.LENGTH_SHORT).show();	
				
			}
		});
    	
    	/*String s1 = gson.toJson(p1);
    	String s2 = gson.toJson(p2);
    	Log.d("JSON", s1);
    	Log.d("JSON", s2);*/
    }
    public void manipulate(View v)
    {
    	
    }
}
