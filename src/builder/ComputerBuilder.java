package builder;
import java.util.*;
public abstract class ComputerBuilder {
	String name;
	List<String> parts = new ArrayList<String>();

	public abstract ComputerBuilder addMonitor();
	public abstract ComputerBuilder addBattery();
	public abstract ComputerBuilder addChargingAdapter();
	public abstract ComputerBuilder addCPU();
	public abstract ComputerBuilder addRam();
	public abstract	ComputerBuilder addKeyboard();
	public abstract ComputerBuilder addMouse();
	public abstract ComputerBuilder addOS();
	public abstract ComputerBuilder addGraphicsCard();
	public abstract ComputerBuilder addCoolingPad();

	public Computer build() {
		Computer computer = new Computer();
		computer.setName(this.name);
		computer.addParts(parts);
		return computer;
	}


}
