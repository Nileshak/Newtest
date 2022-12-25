package encapsulation1;


//new test nilesh ashok kalyankar
public class encapsultion_demo {

	private String name="Nilesh";
	private int Bank_bal=1000;
	private String check_bal;
	
	public void set(String n,int b) {
		n=this.name;
		b=this.Bank_bal;
		
	}
	public String get() {
		check_bal=(name+" "+Bank_bal);
		return check_bal;
		
		
	}
	public void set1(String n1,int b1) {
		n1=this.name;
		b1=this.Bank_bal;
			
}
	public String get1() {
		check_bal=(name+" "+Bank_bal);
		return check_bal;
		
}}


