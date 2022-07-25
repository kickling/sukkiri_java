public class Practice33 {
	public static void main(String[] args) {
		int isHungry = 1;
		String food = "Ä‚«‚»‚Î";
		System.out.println("‚±‚ñ‚É‚¿‚Í");
		if (isHungry== 0) {
			System.out.println("‚¨• ‚ª‚¢‚Á‚Ï‚¢‚Å‚·");
		} else {
			System.out.println("‚Í‚ç‚Ø‚±‚Å‚·");
		}
		if (isHungry == 1) {
			System.out.println(food + "‚ğ‚¢‚½‚¾‚«‚Ü‚·");
		}
		System.out.println("‚²‚¿‚»‚¤‚³‚Ü‚Å‚µ‚½");
	}
}