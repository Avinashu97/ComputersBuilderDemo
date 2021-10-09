package builder;



public class PrintState implements State {
	ComputerController computer;
	public PrintState(ComputerController computer) {
		this.computer = computer;
	}

	@Override
	public void powerOn() {
		System.out.println("Computer already on");

	}

	@Override
	public void powerOff() {
		System.out.println("Computer powering off");
		computer.setState(computer.getOffState());
	}

	@Override
	public void playDVD() {
		System.out.println("Playing DVD");
		computer.setState(computer.getDvdState());

	}

	@Override
	public void crashOS() {
		System.out.println("Computer crashed");
		computer.setState(computer.getCrashState());

	}

	@Override
	public void printJob() {
		System.out.println("Printing documents...");

	}
	public String toString() {
		return " printing";
	}

}
