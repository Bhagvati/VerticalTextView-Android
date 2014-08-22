package com.example.verticaltextview;

import com.example.java.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
	@SuppressLint("ResourceAsColor")
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.main);
		VerticalLabelView vertical_label1 = (VerticalLabelView) findViewById(R.id.chart_y_axis_title1);
		vertical_label1.setText("Hello World!");
		vertical_label1.setTextSize(50);
		vertical_label1.setTextColor(getResources().getColor(R.color.text2));
		VerticalLabelView vertical_label2 = (VerticalLabelView) findViewById(R.id.chart_y_axis_title2);

		vertical_label2.setText("Hello World!");
		vertical_label2.setTextSize(50);
		vertical_label2.setTextColor(getResources().getColor(R.color.text2));
	}

}
