import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main4A2 {
  public static void main(String[] args) throws IOException{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String line;
    while ((line = reader.readLine()) != null && !line.matches("^\\s*$")) {
        System.out.println("INPUT: " + line);
    }
  }
}