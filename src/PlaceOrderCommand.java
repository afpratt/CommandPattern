
public class PlaceOrderCommand implements Command{

	private Checkout checkout;

	public PlaceOrderCommand(Checkout checkout) {
		super();
		this.checkout = checkout;
	}
	
	@Override
	public void execute() {
		checkout.submitOrder();
}

}
