package com.example.obser;

public class Wangsi implements Observer {

	@Override
	public void ubdate(String str) {
		// TODO Auto-generated method stub
		System.out.println("韩非子在吃饭");
			report();
	}

	public void report() {
		// TODO Auto-generated method stub
		System.out.println("举报");
	}

}
