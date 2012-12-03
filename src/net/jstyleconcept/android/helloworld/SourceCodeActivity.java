package net.jstyleconcept.android.helloworld;

import android.os.Bundle;
import android.app.Activity;
import android.webkit.WebView;

public class SourceCodeActivity extends Activity {
	WebView sourceCodeView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_source_code);
		sourceCodeView=(WebView)this.findViewById(R.id.webView1);
		sourceCodeView.getSettings().setBuiltInZoomControls(true);
		sourceCodeView.loadUrl("file:///android_asset/sourcecode.html");
	}
}