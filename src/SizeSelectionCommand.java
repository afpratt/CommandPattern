
public class SizeSelectionCommand implements Command{
	
	private Checkout checkout;
	
	public SizeSelectionCommand(Checkout checkout) {
		this.checkout = checkout;
	}
	
	@Override
	public void execute() {
		checkout.selectSize();
	}
}
