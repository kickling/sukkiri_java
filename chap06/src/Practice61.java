public class Practice61 {
	public static void main(String[] args) throws Exception {
		doWarusa();
		doTogame();
		callDeae();
		showMondokoro();
	}
	public static void doWarusa() {
		System.out.println("���Ȃ��ł�����B�H���܂��񂪂́B");
	}
	public static void doTogame() {
		System.out.println("���̘V���ڂ�̖ڂ͂��܂����܂��񂼁B");
	}
	public static void callDeae() {
		System.out.println("�������A�����Ⴍ�ȁB�����҂��I�ł������I");
	}
	public static void showMondokoro() throws Exception {
		System.out.println("��Ԃ���A�p����B���������ł��傤�B");
		System.out.println("���̖䏊���ڂɂ͂���ʂ��I");
		doTogame();    // ������x�A�Ƃ��߂�
	}
}