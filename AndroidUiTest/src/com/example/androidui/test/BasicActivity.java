package com.example.androidui.test;

import com.example.androidui.FirstActivity;
import com.example.pagewrap.PageHelper;
import com.robotium.solo.Solo;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

public class BasicActivity extends ActivityInstrumentationTestCase2<FirstActivity> {
	
	protected Solo solo;
	public PageHelper helper;
	
	public BasicActivity(){
		super(FirstActivity.class);
	}
	
	@Override
	protected void setUp() throws Exception{
		try{
		super.setUp();
		solo=new Solo(getInstrumentation(),getActivity());
		/*
		 * setUp()�е��쳣���д���һ��Ҫִ��tearDown����֤��һ��case����ǰ�ر����л
		 */
		//int a=0;
		//int b=3/a;
		helper=new PageHelper(solo);
		}catch(Exception ex){
			
			Log.d("BasicActivity","Exception happened in setUp,the error msg is "+ex.getMessage());
			tearDown();
			throw ex;
			
		}
	}
	
	@Override
	protected void tearDown() throws Exception{
		solo.finishOpenedActivities();
		super.tearDown();
	}
	
	@Override
	protected void runTest() throws Throwable{
		
		try{
			super.runTest();
		}catch(Throwable th){
			Log.d("BasicActivity","Exception happened in runTest,the error mag is "+th.getMessage());
			throw th;
		}
		
		
		
		
	}
	

}
