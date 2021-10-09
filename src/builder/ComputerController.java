package builder;

public class ComputerController {


		State onState;
		State offState;
		State dvdState;
		State printState;
		State crashState;

		State state;

	public ComputerController() {
		onState = new OnState(this);
		offState = new OffState(this);
		dvdState = new DvdState(this);
		printState = new PrintState(this);
		crashState = new CrashState(this);

		state = offState;

	}

	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public State getOnState() {
		return onState;
	}
	public State getOffState() {
		return offState;
	}
	public State getDvdState() {
		return dvdState;
	}
	public State getPrintState() {
		return printState;
	}
	public State getCrashState() {
		return crashState;
	}
	public void powerOn() {
		state.powerOn();
	}
	public void powerOff() {
		state.powerOff();

	}
	public void printJob() {
		state.printJob();
	}
	public void crashOS() {
		state.crashOS();
	}
	public void playDVD() {
		state.playDVD();
	}
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\n------------MIT Labs-------------\n");
		result.append("HP laptop " + state + "\n");
		return result.toString();
	}

}
