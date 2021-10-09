package builder;



public class CrashState implements State {
	ComputerController computer;
	public CrashState(ComputerController computer) {
		this.computer = computer;
	}

	@Override
	public void powerOn() {
		System.out.println("Booting Computer");
		computer.setState(computer.getOnState());

	}

	@Override
	public void powerOff() {
		System.out.println("Computer crashed and is already off");

	}

	@Override
	public void playDVD() {
		System.out.println("Computer crashed and is powered off");

	}

	@Override
	public void crashOS() {
		System.out.println("Computer Crashed");
		System.out.println("Making another Computer");

		ComputerBuilder laptopBuilder = new LaptopBuilder();
		Computer laptop = laptopBuilder.addBattery().addChargingAdapter().addCoolingPad().addCPU().addGraphicsCard().addKeyboard().addMonitor().addMouse().addOS().addRam().build();

		laptop.installGraphicsCard();
		laptop.installPowerSupply();
		laptop.mountCPUCooler();
		laptop.mountMoutherBoard();
		laptop.mountProcessor();
		laptop.mountRam();

		System.out.println(laptop);

	}

	@Override
	public void printJob() {
		System.out.println("Computer is off. Turn on to print");

	}
	public String toString() {
		return " has crashed";
	}

}

