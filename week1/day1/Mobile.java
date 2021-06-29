package week1.day1;

public class Mobile {
	
	public String mobileModel="vivo v15 pro";
	public int mobileWeight=1;
	public boolean isFullCharge=true;
	public double mobileCost=31500.00;
	
	
	
	public void makeCall(){
		System.out.println("Calling");
		System.out.println(mobileModel);
	}
	
	public void sendMsg()
	{
		System.out.println("message sent");
		System.out.println(mobileWeight);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Mobile myMobile= new Mobile();
		myMobile.makeCall();
		myMobile.sendMsg();
		System.out.println(myMobile.isFullCharge);
		System.out.println(myMobile.mobileCost);
		
	}

}
