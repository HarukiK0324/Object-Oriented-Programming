import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main4B1 {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Usage: java Main4B1 <input file>");
            return;
        }
        int lineNum = 0, wordNum = 0;
        Map<String, Integer> wordCount = new HashMap<>();
        FileInputStream fis = new FileInputStream(args[0]);
        BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
        StringBuilder line = new StringBuilder();
        int c;
        while ((c = reader.read()) != -1) {
            if(c == '\n')
            {
                lineNum++;
                String[] words = line.toString().split("[ \\s.,:;'’]");
                if(words.length == 0)
                    continue;
                for (String word : words) {
                    if(word.isEmpty())
                        continue;
                    wordNum++;
                    if(wordCount.containsKey(word.toLowerCase())) {
                        wordCount.put(word.toLowerCase(), wordCount.get(word.toLowerCase()) + 1);
                    } else {
                        wordCount.put(word.toLowerCase(), 1);
                    }
                }
                line.setLength(0);
            }else
                line.append((char)c);
        }
        if(line.length() > 0) {
            String[] words = line.toString().split("[\\s\\p{Punct}]+");
            if(words.length != 0) {
                for (String word : words) {
                    if(word.isEmpty())
                        continue;
                    wordNum++;
                    if(wordCount.containsKey(word.toLowerCase())) {
                        wordCount.put(word.toLowerCase(), wordCount.get(word.toLowerCase()) + 1);
                    } else {
                        wordCount.put(word.toLowerCase(), 1);
                    }
                }
            }
        }
        reader.close();
        System.out.println("line num: " + lineNum);
        System.out.println("word num: " + wordNum);
        System.out.println("unique word num: " + wordCount.size());
    }
}