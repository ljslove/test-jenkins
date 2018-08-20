package com.example.androidui;

import android.app.Activity;
import com.example.androidui.R;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.DialogInterface;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.ProgressBar;
//import android.app.AlertDialog.Builder;
import android.app.AlertDialog;
import android.app.ProgressDialog;

public class FirstActivity extends Activity {
	
	//private ImageView imageView=(ImageView)findViewById(R.id.image_view);
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first_layout);
		Button button=(Button)findViewById(R.id.button);
		button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
				startActivity(intent);
				
			}
		});
		Button button2=(Button)findViewById(R.id.button2);
		/*
		 * �����ڲ������ʹ�þֲ���������ô����ֲ�������Ҫfinal���Σ��Է�ֹ����ֵ�ı�
		 */
		final ImageView imageView=(ImageView)findViewById(R.id.image_view);
		
		button2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				imageView.setImageResource(R.drawable.img_2);
				
			}
		});
		final ProgressBar progressBar=(ProgressBar)findViewById(R.id.progress_bar);
		Button button3=(Button)findViewById(R.id.button3);
		button3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int progress=progressBar.getProgress();
				progress=progress+10;
				progressBar.setProgress(progress);
				
			}
		});
		/*
		 * AlterDialog�����ڵ�ǰ�Ľ��浯��һ���Ի�������Ի������ö������н���Ԫ��֮�ϣ��ܹ����ε������ؼ��Ľ�������
		 * AlterDialoû��layout��ͨ��new������
		 * 
		 * 
		 */
		Button button4=(Button)findViewById(R.id.button4);
		button4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				AlertDialog.Builder dialog=new AlertDialog.Builder(FirstActivity.this);
				dialog.setTitle("This is a Dialog");
				dialog.setMessage("Something import");
				dialog.setCancelable(false);
				dialog.setPositiveButton("OK",new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						
					}
				});
				
				dialog.setNegativeButton("Cancel",new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						
					}
				});
				dialog.show();
			}
		});
		/*
		 * ProgressDialog�������ڽ����ϵ���һ���Ի����ܹ����������ؼ��Ľ�������
		 * ProgressDialog���ڶԻ�������ʾһ����������һ�����ڱ�ʾ��ǰ�����ȽϺ�ʱ�����û����ĵصȴ�
		 * 
		 */
		Button button5=(Button)findViewById(R.id.button5);
		button5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ProgressDialog progressDialog=new ProgressDialog(FirstActivity.this);
				progressDialog.setTitle("This is a ProgressDialog");
				progressDialog.setMessage("Loading....");
				progressDialog.setCancelable(true);
				progressDialog.show();
				
				
			}
		});
		Button button6=(Button)findViewById(R.id.button6);
		button6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(FirstActivity.this,ForthActivity.class);
				startActivity(intent);
				
			}
		});
		
	}

}
