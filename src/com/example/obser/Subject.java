package com.example.obser;
/**
 * �����ӵ���Ҫʵ������ӿڣ�������ӣ�ɾ����֪ͨ�۲���
 * @author zhou
 *
 */
public interface Subject {
	public void addObser(Observer obsered);
	public void deletObser(Observer obsered);
	public void notifiObser(String context);

}
