package homework.week2;

public class Mobileprogram {
	public void makecall(String mobilemodel,float mobileweight) {
		System.out.println("this is my new mobile values\n");
	System.out.println("mobilemodel is:" + mobilemodel + "\nmobileweight is:" +mobileweight );	
	}
	public void sendmsg(boolean isfullcharged,int mobilecost ) {
		System.out.println("isfullcharged:" + isfullcharged + "\nmobilecost is:" +mobilecost );	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mobileprogram twometh = new Mobileprogram();
twometh.makecall("vivoy56",300);
twometh.sendmsg(true, 20000);

	}

}
