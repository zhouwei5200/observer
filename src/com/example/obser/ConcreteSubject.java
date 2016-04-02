package com.example.obser;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author zhou
 *
 */
//被观察者
public class ConcreteSubject  implements Preson,Subject{
	public List<Observer> list = new ArrayList<Observer>();

	@Override
	public void addObser(Observer obsered) {
		// TODO Auto-generated method stub
		list.add(obsered);//添加观察者
	
	}

	@Override
	public void deletObser(Observer obsered) {
		// TODO Auto-generated method stub
		list.remove(obsered);//移除观察者
	}

	@Override
	public void notifiObser(String str) {
		// TODO Auto-generated method stub
		for(Observer obsered:list){
			obsered.ubdate(str);//通知观察者消息
		}
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		this.notifiObser("这货在吃饭");
		
	}

	@Override
	public void haveFun() {
		// TODO Auto-generated method stub
		this.notifiObser("这货在玩耍");
	}

}
