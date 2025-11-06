package oop.ex3A3;

public class Plus extends Exp {
  protected Exp num1;
  protected Exp num2;
  public Plus(Exp num1, Exp num2) {
    this.num1 = num1;
    this.num2 = num2;
  }
  public int calcResult() {
    return num1.calcResult() + num2.calcResult();
  }
}
