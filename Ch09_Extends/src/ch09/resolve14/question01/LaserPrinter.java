package ch09.resolve14.question01;

public class LaserPrinter extends Printer {
	protected double tonnerRamainders;

	public LaserPrinter(String modelName, String manufacturer, P_INTERFACE pInterface, int printCount,
			int paperRemains, double tonnerRamainders) {
		super(modelName, manufacturer, pInterface, printCount, paperRemains);
		this.tonnerRamainders = tonnerRamainders;
	}

	@Override
	public void print() {
		super.print();
		this.printCount++;
		this.tonnerRamainders *= 0.99;
		System.out.println("빠르게 출력된다.");
		System.out.println("품질이 매우 양호하다.");
	}

	@Override
	public String toString() {
		return "LaserPrinter [tonnerRamainders=" + tonnerRamainders + ", modelName=" + modelName + ", manufacturer="
				+ manufacturer + ", pInterface=" + pInterface + ", printCount=" + printCount + ", paperRemains="
				+ paperRemains + "]";
	}
	

}
