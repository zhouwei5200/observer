package com.example.obser;

public class Liusi implements Observer{

	@Override
	public void ubdate(String str) {
		// TODO Auto-generated method stub
		System.out.println("�������ڳԷ�");
		cry();
	}


	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("��");
	}

}
