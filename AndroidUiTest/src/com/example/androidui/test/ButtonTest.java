package com.example.androidui.test;

//import android.util.Log;

public class ButtonTest extends BasicActivity {
	
	public ButtonTest(){
		super();
	}
	
	
  /*   ����case��setUp()���쳣������Ӱ�������caseִ��
	
 	@Override
	protected void setUp() throws Exception{
		
		try{
			super.setUp();
			int a=0;
			int b=3/a;
		}catch(Exception ex){
			Log.d("ButtonTest","Exception happened in setUp,the error msg is "+ex.getMessage());
			tearDown();
			throw ex;
		}
		
	}*/
	
	
	public void testProgressBarButton(){
		
		/*
		 * runTest()�е��쳣��������case����fail����Ӱ����һ��case���У����Ҵ�ӡ�Լ����Ƶ�log��Ϣ
		 * 
		 */
		
		//assertTrue(false);   
	      
		helper.getPageFirst().clickPreogerssButton();
         
		
		
	}

}
