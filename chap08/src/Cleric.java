import java.util.*;

public class Cleric {
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

  public int pray(int sec) {
    System.out.println(this.name + "��" + sec + "�b�ԉr��");
    int recover = new Random().nextInt(3) + sec;

    int recoverActual = Math.min(this.MAX_MP - this.mp, recover);

    this.mp += recoverActual;
    System.out.println("MP" + recoverActual + "��");
    return recoverActual;
  }
}