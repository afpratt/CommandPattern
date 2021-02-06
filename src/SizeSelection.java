
public class SizeSelection {
	private String label;
	private Command	command;

	public SizeSelection(Command command) {
		this.command = command;
	}

	public void click() {
		command.execute();
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
}
