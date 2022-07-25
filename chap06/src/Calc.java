package calcapp.main;
import calcapp.logics.*;

public class Calc {
	public static void main(String[] args) {
		int a = 10; int b = 2;
		int total = calcapp.logics.CalcLogic.plus(a, b);
		int delta = calcapp.logics.CalcLogic.minus(a, b);
		System.out.println("ë´Ç∑Ç∆" + total + "ÅAà¯Ç≠Ç∆" + delta);
	}
}