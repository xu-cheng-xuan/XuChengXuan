package Demo;

import java.math.BigDecimal;

public class Demo {

	public static void main(String[] args) {
		Double[] d = {12.1,15.5};
//		System.err.println(d.toString());
		BigDecimal num = new BigDecimal(1.1);
		BigDecimal tow = new BigDecimal(1);
		BigDecimal one = new BigDecimal(0);
//		System.err.println(num.compareTo(new BigDecimal(1)) == -1 && num.compareTo(new BigDecimal(0)) == 1);
		System.err.println(num.toString().indexOf("."));
	}

}
