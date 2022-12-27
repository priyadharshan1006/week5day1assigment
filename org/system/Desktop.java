package org.system;

public class Desktop extends Computer {
	public void deskTopSize() {System.out.println("Display size =16.7 ");}
	public static void main(String[] args) {
		Desktop obj = new Desktop();
		obj.computerModel();
		obj.deskTopSize();
	}
}
