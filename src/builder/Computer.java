package builder;
import java.util.*;
public class Computer {

	String name;
	List<String> parts;
	public void addParts(List<String> parts) {
		this.parts = parts;
	}

	void prepare() {
		System.out.println("Prepare " + name );
		System.out.println("Connecting Computer parts together");
		for(String part : parts) {
			System.out.println("   " + part);
		}

	}
	void openCase() {
		System.out.println("Open the case");
	}
	void mountMoutherBoard() {
		System.out.println("Mounting the motherboard");
	}
	void mountProcessor () {
		System.out.println("Mounting the processor");
	}
	void mountCPUCooler() {
		System.out.println("Mounting Cpu cooler");
	}
	void installPowerSupply() {
		System.out.println("Installing power supply");
	}
	void mountRam() {
		System.out.println("Mounting Ram onto motherboard");
	}
	void installGraphicsCard() {
		System.out.println("installing Graphics card");

	}

	public void setName(String name ) {
		this.name = name;
	}
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("\n\n--  " + this.name + "  --\n");
		for(String part : parts) {
			display.append(part + "\n");
		}
		return display.toString();
	}
}
