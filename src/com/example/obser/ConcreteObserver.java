package com.example.obser;
/**
 * �۲���
 * @author zhou
 *
 */
public class ConcreteObserver implements Observer {

	@Override
	public void ubdate(String str) {
		// TODO Auto-generated method stub
		System.out.println("�������ڳԷ�");
		//���������Ѿ��õ���Ϣ
		happy();
	}


	public void happy() {
		// TODO Auto-generated method stub
		System.out.println("����ܿ���");
	}

}
