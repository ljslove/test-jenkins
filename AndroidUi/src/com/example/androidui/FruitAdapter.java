package com.example.androidui;

import android.widget.ArrayAdapter;

import android.content.Context;
import java.util.List;

import com.example.androidui.R;

import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.widget.ImageView;

/*
 * ��д���๹�캯�������ڽ������ģ�ListView����ֺ����ݶ����ݽ���
 * ��дgetView�������������������ÿ�������������Ļ�ڵ�ʱ��ᱻ����
 * ��getView�����У�����ͨ��getItem���������õ���ǰ���Fruitʵ����Ȼ��ʹ��LayoutInflater��Ϊ�������������Ǵ���Ĳ���
 * 
 */


public class FruitAdapter extends ArrayAdapter<Fruit> {
	private int resourceId;
	public FruitAdapter(Context context,int textViewResourceId,List<Fruit> objects){
		super(context,textViewResourceId,objects);
		resourceId=textViewResourceId;
	}
	
	@Override
	public View getView(int position,View covertView,ViewGroup parent){
		Fruit fruit=getItem(position);
		View view=LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
		ImageView fruitImage=(ImageView)view.findViewById(R.id.fruit_image);
		/*
		 * ����View��findViewById�����ֱ��ȡ��ImageView��TextView��ʵ��
		 * ���ֱ�������ǵ�setImageResource()��setText()������������ʾ��ͼƬ�����֣���󽫲��ַ���
		 * 
		 * 
		 */
		TextView fruitName=(TextView)view.findViewById(R.id.fruit_name);
		fruitImage.setImageResource(fruit.getImageId());
		fruitName.setText(fruit.getName());
		
		return view;
		
	}

}
