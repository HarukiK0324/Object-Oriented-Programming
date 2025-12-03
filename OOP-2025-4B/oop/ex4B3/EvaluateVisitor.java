package oop.ex4B3;

public class EvaluateVisitor implements Visitor {
  private Value v;

  public Value evaluate(Expression e) {
    e.accept(this);
    return v;
  }

  @Override
  public void visit(Number e) {
    v = e;
  }

  @Override
  public void visit(Bool e) {
    v = e;
  }

  @Override
  public void visit(Addition e) {
    e.getLeftExpression().accept(this);
    Value leftValue = v;
    e.getRightExpression().accept(this);
    Value rightValue = v;
    v = new Number(leftValue.getNumber() + rightValue.getNumber());
  }

  @Override
  public void visit(LessThan e) {
    e.getLeftExpression().accept(this);
    Value leftValue = v;
    e.getRightExpression().accept(this);
    Value rightValue = v;
    v = new Bool(leftValue.getNumber() < rightValue.getNumber());
  }

  @Override
  public void visit(IfThenElse e) {
    e.getConditional().accept(this);
    if (v.getBool())
      e.getThenPart().accept(this);
    else
      e.getElsePart().accept(this);
  }
}
