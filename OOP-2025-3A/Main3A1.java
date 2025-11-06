class Main3A1 {
  public static void main(String[] args) {
    for(String s : args) {
      String[] list = s.split(",");
      for(String str : list)
      {
        str = str.trim();
        System.out.println(str);
      }
    }
  }
}
