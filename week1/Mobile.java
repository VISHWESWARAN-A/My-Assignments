package week1;

public class Mobile {

	public void sendSms() {
		// TODO Auto-generated method stub
  System.out.println("from OPPO");
	}

	public void makeCall() {
		System.out.println("Calling my friend");
	}
	
	public static void main(String[] args) {
			
		Mobile phone=new Mobile();
		phone.sendSms();
		phone.makeCall();
		
		
	}
}
