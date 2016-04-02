package com.example.obser;
/**
 * 观察者
 * @author zhou
 *
 */
public class ConcreteObserver implements Observer {

	@Override
	public void ubdate(String str) {
		// TODO Auto-generated method stub
		System.out.println("韩非子在吃饭");
		//在这里我已经得到消息
		happy();
	}


	public void happy() {
		// TODO Auto-generated method stub
		System.out.println("这货很快乐");
	}

}
