package com.example.pagewrap;

import com.robotium.solo.Solo;

import android.widget.Button;
import android.widget.EditText;

/*
 * ������װ����APP��ҳ�棬������ȡ�ؼ����Լ����ҳ����Ҫ�õ��ķ������������з�װ��
 * 
 */



public class PageFirst {
	
	private Solo solo;
	private Button imageButton=null;
	private Button progressButton=null;
	private Button dialogButton=null;
	private EditText edt;
	
	public PageFirst(Solo solo){
		this.solo=solo;
	}
	
	
    public void pageInitViews(){
    	imageButton=(Button)solo.getView("com.example.androidui:id/button2");
    	progressButton=(Button)solo.getView("com.example.androidui:id/button3");
    	dialogButton=(Button)solo.getView("com.example.androidui:id/button4");
    	edt=(EditText)solo.getView("com.example.androidui:id/edit_text");
    }
    
    public void clickPreogerssButton(){
		solo.sleep(5000);
		solo.clickOnView(progressButton);
		solo.sleep(5000);
    }
    
    public void clickDialogButton(){
    	solo.sleep(1000);
		solo.clickOnView(dialogButton);
		solo.sleep(1000);
		
    }
    
    public void clickImageViewButton(){
		solo.sleep(5000);
		solo.clickOnView(imageButton);
		solo.sleep(5000);
		solo.takeScreenshot("Image1");
    }
    public void inputEditText(){
		solo.sleep(1000);
		solo.enterText(edt, "hello word");
		solo.sleep(1000);
    }
	

}
