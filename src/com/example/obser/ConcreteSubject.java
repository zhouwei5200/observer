package com.example.obser;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author zhou
 *
 */
//���۲���
public class ConcreteSubject  implements Preson,Subject{
	public List<Observer> list = new ArrayList<Observer>();

	@Override
	public void addObser(Observer obsered) {
		// TODO Auto-generated method stub
		list.add(obsered);//��ӹ۲���
	
	}

	@Override
	public void deletObser(Observer obsered) {
		// TODO Auto-generated method stub
		list.remove(obsered);//�Ƴ��۲���
	}

	@Override
	public void notifiObser(String str) {
		// TODO Auto-generated method stub
		for(Observer obsered:list){
			obsered.ubdate(str);//֪ͨ�۲�����Ϣ
		}
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		this.notifiObser("����ڳԷ�");
		
	}

	@Override
	public void haveFun() {
		// TODO Auto-generated method stub
		this.notifiObser("�������ˣ");
	}

}
