public class Plactice83 {
  String name;
  int hp = 50;
  final int MAX_HP = 50;
  int mp = 10;
  final int MAX_MP = 10;

  public void selfAid() {
    System.out.println(this.name + "�̓Z���t�G�C�h���r��");
    this.hp = this.MAX_HP;
    this.mp -= 5;
    System.out.println("HP���ő�܂ŉ�");
  }
}