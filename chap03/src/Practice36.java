public class Practice36 {
	public static void main(String[] args) {
		System.out.print("�y�����ăQ�[���z");
		int ans = new java.util.Random().nextInt(10);
		for (int i = 0; i < 5; i++) {
			System.out.println("0�`9�̐�������͂��Ă�������");
			int num = new java.util.Scanner(System.in).nextInt();
			if (ans == num) {
				System.out.println("�A�^���I");
				break;
			} else {
				System.out.println("�Ⴂ�܂�");
			}
		}
		System.out.println("�Q�[�����I�����܂�");
	}
}