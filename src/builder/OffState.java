package builder;



public class OffState implements State {
	ComputerController computer;
	public OffState(ComputerController computer) {
		this.computer = computer;
	}

	@Override
	public void powerOn() {
		System.out.println("System powering on");
		computer.setState(computer.getOnState());
	}

	@Override
	public void powerOff() {
		System.out.println("Computer already off");

	}

	@Override
	public void playDVD() {
		System.out.println("Cant play dvd when already off");

	}

	@Override
	public void crashOS() {
		System.out.println("Can't crash computer already off");

	}

	@Override
	public void printJob() {
		System.out.println("Can't print computer already off");

	}

	public String toString() {
		return " off";
	}

}
