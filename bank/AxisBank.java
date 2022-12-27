package bank;

public class AxisBank extends BankInfo{
	public void deposit(){System.out.println("deposit");}
public static void main(String[] args) {
 BankInfo obj = new AxisBank();
 obj.deposit();
}

}
