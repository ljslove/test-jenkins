package com.example.pagewrap;

import com.robotium.solo.Solo;

/*
 * PageHelper�࣬��Ҫ��������page�࣬�ṩͳһ����ڣ������ȡpage��
 * 
 */

public class PageHelper {
	
	private PageFirst pageFirst;
	private Solo solo;
	
	public PageHelper(Solo solo){
		
		this.solo=solo;
	}
	
	public PageFirst getPageFirst(){
		
		if(pageFirst==null){
			pageFirst=new PageFirst(solo);
		}
		
		pageFirst.pageInitViews();
		return pageFirst;
	}
	
	

}
