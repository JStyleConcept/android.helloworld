package net.jstyleconcept.android.helloworld;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main,menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		Intent intent=new Intent(MainActivity.this,SourceCodeActivity.class);
		switch(item.getOrder()) {
			case 0:
				startActivity(intent);
				break;
			case 1:
				MainActivity.this.finish();
				break;
		}
		return super.onOptionsItemSelected(item);
	}
}