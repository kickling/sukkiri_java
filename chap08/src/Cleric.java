import java.util.*;

public class Cleric {
  String name;
  int hp = 50;
  final int MAX_HP = 50;
  int mp = 10;
  final int MAX_MP = 10;

  public void selfAid() {
    System.out.println(this.name + "ÍZtGChðr¥");
    this.hp = this.MAX_HP;
    this.mp -= 5;
    System.out.println("HPªÅåÜÅñ");
  }

  public int pray(int sec) {
    System.out.println(this.name + "Í" + sec + "bÔr¥");
    int recover = new Random().nextInt(3) + sec;

    int recoverActual = Math.min(this.MAX_MP - this.mp, recover);

    this.mp += recoverActual;
    System.out.println("MP" + recoverActual + "ñ");
    return recoverActual;
  }
}