package builder;

public class ComputerBuilderDemo {

	public static void main(String[] args) {
		ComputerController computerController = new ComputerController();

		System.out.println(computerController);

		computerController.powerOn();
		computerController.playDVD();
		computerController.printJob();
		computerController.crashOS();
		computerController.powerOff();

		computerController.crashOS();
	}

}
