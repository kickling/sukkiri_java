public class Main54 {
	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		hello("hoge");
		hello("foo");
		hello("huga");
		System.out.println("メソッドの呼び出しが終わりました");
	}
	public static void hello(String name) {
		System.out.println(name + "さん、こんにちは");
	}
}
