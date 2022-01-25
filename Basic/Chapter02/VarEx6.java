
public class VarEx6 {

	public static void main(String[] args) {

		// Overflow
		short sMin = -32767;
		short sMax = 32767;
		char cMin = 0;
		char cMax = 65535;

		System.out.println("sMin = " + sMin); // 최소값
		System.out.println("sMin - 1 = " + (short) (sMin - 1)); // 최소값 - 1
		System.out.println("sMax = " + sMax); // 최대값
		System.out.println("sMax + 1 = " + (short) (sMax + 1)); // 최대값 + 1
		System.out.println("cMin = " + (int) cMin);
		System.out.println("cMin - 1 = " + (int) (--cMin));
		System.out.println("cMax = " + (int) cMax);
		System.out.println("cMax + 1 = " + (int) (++cMax));

	}

}
