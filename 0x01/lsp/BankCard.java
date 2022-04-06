public abstract class BankCard implements IPayment{

	@Override
	public void validate() throws Exception {
	
		
	}

	@Override
	public void collectPayment() {
		System.out.println("Pagamento Realizado");
		
	}

}
