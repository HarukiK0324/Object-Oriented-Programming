package oop.ex2B2;

public class MyBoolean {
  private int value;
  public MyBoolean(int value)
  {
    this.value = value;
  }
  public boolean getValue()
  {
    return this.value != 0;
  }
  public void setValue(int value)
  {
    this.value = value;
  }
  public String toString()
  {
    if(this.getValue())
    {
      return "true (" + this.value + ")";
    }
    else
    {
      return "false (" + this.value + ")";
    }
  }
  public boolean equals(MyBoolean src)
  {
    if(src instanceof MyBoolean == false) 
      return false;
    return this.getValue() == src.getValue();
  }
  public int hashCode()
  {
    return value == 0 ? 0 : 1;
  }
}
