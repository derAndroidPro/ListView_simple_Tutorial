package de.derandroidpro.listviewtutorial;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListView_tut_Activity extends Activity {
	
	public ListView lv1;
	public TextView tv1;
	public String [] listentxt = {"Android 1.0","Android 1.1","Android 1.5","Android 1.6","Android 2.0","Android 2.0.1","Android 2.1",
			"Android 2.2","Android 2.3","Android 2.3.3","Android 3.0","Android 3.1","Android 3.2","Android 4.0","Android 4.0.3","Android 4.1",
			"Android 4.2" , "Android 4.3", "Android 4.4"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list_view_tut_layout);
		
		lv1 = (ListView) findViewById(R.id.listView1);
		tv1 = (TextView) findViewById(R.id.textView1);
		
		ArrayAdapter<String> listenadapter = new ArrayAdapter<>(ListView_tut_Activity.this, android.R.layout.simple_list_item_1, listentxt);
		lv1.setAdapter(listenadapter);
		lv1.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View view, int arg2, long arg3) {
				
				switch (lv1.getPositionForView(view)) {
				
				case 0: {
					tv1.setText("API-Version 1");
					break;
				}
				case 1: {
					tv1.setText("API-Version 2");
					break;
				}
				case 2:{
					tv1.setText("API-Version 3");
					break;
				}
				case 3:{
					tv1.setText("API-Version 4");
					break;
				}
				case 4:{
					tv1.setText("API-Version 5");
					break;
				}
				case 5:{
					tv1.setText("API-Version 6");
					break;
				}
				case 6:{
					tv1.setText("API-Version 7");
					break;
				}
				case 7:{
					tv1.setText("API-Version 8");
					break;
				}
				case 8:{
					tv1.setText("API-Version 9");
					break;
				}
				case 9:{
					tv1.setText("API-Version 10");
					break;
				}
				case 10:{
					tv1.setText("API-Version 11");
					break;
				}
				case 11:{
					tv1.setText("API-Version 12");
					break;
				}
				case 12:{
					tv1.setText("API-Version 13");
					break;
				}
				case 13:{
					tv1.setText("API-Version 14");
					break;
				}
				case 14:{
					tv1.setText("API-Version 15");
					break;
				}
				case 15:{
					tv1.setText("API-Version 16");
					break;
				}
				case 16:{
					tv1.setText("API-Version 17");
					break;
				}
				case 17:{
					tv1.setText("API-Version 18");
					break;
				}
				case 18:{
					tv1.setText("API-Version 19");
					break;
				}
				
				
				
				}
				
				
			}
		});
		
		
		
		
	}


}
