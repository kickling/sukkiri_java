public class Practice53 {
	public static void main(String[] args) {
		String address = "xx@xx.xx";
		String text = "���[���̖{��";
		email(address, text);
	}
	public static void email(String address, String text) {
		System.out.println(address + "�ɁA�ȉ��̃��[���𑗐M���܂���");
		System.out.println("�����F����");
		System.out.println("�{���F" + text);
	}
	public static void email(String title, String address, String text) {
		System.out.println(address + "�ɁA�ȉ��̃��[���𑗐M���܂���");
		System.out.println("�����F" + title);
		System.out.println("�{���F" + text);
	}
}