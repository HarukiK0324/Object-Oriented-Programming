public class Main3B2 {
  public static String buildString() {
    String s = "";
    for(int i=0; i<100; i++)
    {
      s += "This ";
      s += "is ";
      s += "a ";
      s += "simple ";
      s += "string ";
      s += "builder ";
      s += "test.\n";
    }
    return s;
  }

  public static String buildStringByBuilder() {
    StringBuilder sb = new StringBuilder();
    for(int i = 0;i < 100;i++)
    {
      sb.append("This ");
      sb.append("is ");
      sb.append("a ");
      sb.append("simple ");
      sb.append("string ");
      sb.append("builder ");
      sb.append("test.\n");
    }
    return sb.toString();
  }

  public static String measureString() {
    System.out.println("String append");
    long start = System.nanoTime();
    String s = buildString();
    long end = System.nanoTime();
    System.out.println("Process time (us) : " + ((end - start) / 1000));
    return s;
  }

  public static String measureStringBuilder() {
    System.out.println("StringBuilder append");
    long start = System.nanoTime();
    String s = buildStringByBuilder();
    long end = System.nanoTime();
    System.out.println("Process time (us) : " + ((end - start) / 1000));
    return s;
  }

  public static void main(String[] args) {
    String s1 = measureStringBuilder();
    String s2 = measureString();
    System.out.println("Identity check : " + s1.equals(s2));
  }
}
