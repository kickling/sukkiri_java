public class Practice52 {
	public static void main(String[] args) {
		String title = "���[���̃^�C�g��";
		String address = "xx@xx.xx";
		String text = "���[���̖{��";
		email(title, address, text);
	}
	public static void email(String title, String address, String text) {
		System.out.println(address + "�ɁA�ȉ��̃��[���𑗐M���܂���");
		System.out.println("�����F" + title);
		System.out.println("�{���F" + text);
	}
}