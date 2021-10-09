package builder;


public class DvdState implements State {
	ComputerController computer;
	public DvdState(ComputerController computer) {
		this.computer = computer;
	}

	@Override
	public void powerOn() {
		System.out.println("Computer already on");

	}

	@Override
	public void powerOff() {
		System.out.println("Powering off");
		computer.setState(computer.getOffState());

	}

	@Override
	public void playDVD() {

		System.out.println("Playing DVD");
	}

	@Override
	public void crashOS() {
		System.out.println("Os crashed");
		computer.setState(computer.getCrashState());

	}

	@Override
	public void printJob() {
		System.out.println("Printing Job ready");
		computer.setState(computer.getPrintState());


	}
	public String toString() {
		return " playing dvd ";
	}

}
