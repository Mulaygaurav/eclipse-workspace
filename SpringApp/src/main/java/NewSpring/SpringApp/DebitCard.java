package NewSpring.SpringApp;

public class DebitCard implements CardPayment {
	private int a;
	
	

	 public DebitCard() {
		 System.out.println("I am debit constuctor");
	 }

	@Override
	public void payment() {
		// TODO Auto-generated method stub
		 System.out.println("debit pay");
	}
	

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	
	Address add;
	public void getAddress() {
		System.out.println(add.toString());
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}
	
	
}
