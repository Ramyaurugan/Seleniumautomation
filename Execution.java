package week3homework;

public class Execution extends Button{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Button bb = new Button();
		bb.submit();
		bb.click();
		bb.setText("Webelement class");
		
		Textfield tt = new Textfield();
		tt.click();
		tt.getText();
		tt.setText("rr");
		
		Checkboxbutton cc = new  Checkboxbutton();
		cc.clickCheckButton();
		cc.submit();
		
		Radiobutton rr = new Radiobutton();
		rr.selectRadioButton();
		rr.submit();
		rr.click();
		
		Execution ee = new Execution();
		ee.click();
		ee.setText("ee");
	}

}
