public class Main34 {
	public static void main(String[] args) {
		System.out.println("���Ȃ��̉^����肢�܂�");
		int fortune = new java.util.Random().nextInt(5) + 1;
		switch (fortune) {
		case 1:
		case 2:
			System.out.println("�����ˁI");
			break;
		case 3:
			System.out.println("���ʂł�");
			break;
		case 4:
		case 5:
			System.out.println("���[��c");
		}
	}
}