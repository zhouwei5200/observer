package com.example.obser;
/**
 * 被监视的需要实现这个接口，用于添加，删除，通知观察者
 * @author zhou
 *
 */
public interface Subject {
	public void addObser(Observer obsered);
	public void deletObser(Observer obsered);
	public void notifiObser(String context);

}
