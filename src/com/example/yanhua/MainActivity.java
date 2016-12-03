package com.example.yanhua;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

import com.wayww.edittextfirework.FireworkView;

public class MainActivity extends Activity {
	private EditText mEditText;
	private FireworkView mFireworkView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mEditText = (EditText) findViewById(R.id.edit_text);

		mFireworkView = (FireworkView) findViewById(R.id.fire_work);
		mFireworkView.bindEditText(mEditText);
	}

}
