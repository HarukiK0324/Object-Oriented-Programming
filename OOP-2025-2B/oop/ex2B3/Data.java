package oop.ex2B3;

public class Data {
  public int field;
  public int[] intarray;
  public Data next;

  public Data() {
    field = 0; intarray = null; next = null;
  }

  @Override public String toString() {
    String s = "" + field;
    if(intarray != null) {
      s += "[";
      for(int i : intarray) {
        s += " " + i;
      }
      s += " ]";
    }
    if(next != null) {
      s += " + " + next;
    }
    return s;
  }

  // implements shallow and deep
  public Data shallow()
  {
    return this;
  }

  public Data deep()
  {
    Data newData = new Data();
    newData.field = this.field;
    if(this.intarray != null) {
      newData.intarray = new int[this.intarray.length];
      for(int i = 0; i < this.intarray.length; i++) {
        newData.intarray[i] = this.intarray[i];
      }
    }
    if(this.next != null) {
      newData.next = this.next.deep();
    }
    return newData;
  }

}
