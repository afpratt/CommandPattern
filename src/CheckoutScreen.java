
public class CheckoutScreen {

	public static void main(String[] args) {
		var checkout = new Checkout();
		var sizeCommand = new SizeSelectionCommand(checkout);
		var selectSize = new SizeSelection(sizeCommand);
		var orderCommand = new PlaceOrderCommand(checkout);
		var placeOrder = new PlaceOrder(orderCommand);
		selectSize.click();
		placeOrder.click();
	}

}
