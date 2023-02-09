package week1.day1;

public class Mobile {
	
	public void makeCall()
	{
		String mobileModel= "I phone";
				float mobileWeight= 180.0f;
				System.out.println("mobileModel " +mobileModel);
				System.out.println("mobileWeight " +mobileWeight);			
	}

	public void sendMsg()
	{
	boolean isFullCharged= true;
	int mobileCost= 90000;
	System.out.println("Mobile fully charged "+isFullCharged);
	System.out.println("Mobile cost " +mobileCost);
	}
	public static void main(String[] args) {
		Mobile i= new Mobile();
		i.makeCall();
		i.sendMsg();
		System.out.println("This is my mobile");
	}
	
	
}
