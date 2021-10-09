package builder;

public class DesktopBuilder extends ComputerBuilder{

	public DesktopBuilder() {
		this.name = "Desktop Builder";
		}

	public ComputerBuilder addMonitor() {
		this.parts.add("Monitor");
		return this;
	}
	public ComputerBuilder addBattery() {
		//this.parts.add("Battery");
		return this;
	}
	public ComputerBuilder addChargingAdapter() {
		this.parts.add("Charging adapter");
		return this;
	}
	public ComputerBuilder addCPU() {
		this.parts.add("CPU");
		return this;
	}
	public ComputerBuilder addRam() {
		this.parts.add("Ram");
		return this;
	}
	public ComputerBuilder addKeyboard() {
		this.parts.add("Keyboard");
		return this;
	}
	public ComputerBuilder addMouse() {
		this.parts.add("Mouse");
		return this;
	}
	public ComputerBuilder addOS() {
		this.parts.add("OS");
		return this;
	}
	public ComputerBuilder addGraphicsCard() {
		this.parts.add("GraphicsCard");
		return this;
	}
	public ComputerBuilder addCoolingPad() {
		//this.parts.add("Cooling Pad");
		return this;
	}
}
