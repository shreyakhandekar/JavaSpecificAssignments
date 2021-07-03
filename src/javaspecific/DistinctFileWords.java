package javaspecific;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class DistinctFileWords {
    public List<String> findDistinctWords(String filename) {
        FileInputStream fis = null;
        DataInputStream dis = null;
        BufferedReader br = null;
        List<String> wordlist = new ArrayList<>();
        try {
            fis = new FileInputStream(filename);
            dis = new DataInputStream(fis);
            br = new BufferedReader(new InputStreamReader(dis));
            String line = null;
            while ((line = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line, ",.;:\"");
                while (st.hasMoreTokens()) {
                    String tmp = st.nextToken().toLowerCase();
                    if (!wordlist.contains(tmp)) {
                        wordlist.add(tmp);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (Exception ex) {
            }
            return wordlist;
        }
    }

    public static void main(String[] args) {
        DistinctFileWords distFW = new DistinctFileWords();
        List<String> wordlist = distFW.findDistinctWords("src/javaspecific/myDistinctWord.txt");
        for (String str: wordlist){
            System.out.println(str);
    }
    }
}
