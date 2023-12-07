package week3homework;

public class Webelement {

	public void click() {
		System.out.println("this is a super class");
	}
	public void setText(String Text) {
		System.out.println("this is string text");
	}
	public static void main(String[] args) {
		Webelement aa = new Webelement();
		aa.click();
		aa.setText("hybrid inhertance");
	}
}
