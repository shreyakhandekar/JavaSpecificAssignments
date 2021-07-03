package javaspecific;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MaximumWordCount {
    private int currentMaxcount = 0;
    private List<String> lines = new ArrayList<>();

    public void readCount(String filename) {
        FileInputStream fis = null;
        DataInputStream dis = null;
        BufferedReader br = null;

        try {
            fis = new FileInputStream(filename);
            dis = new DataInputStream(fis);
            br = new BufferedReader(new InputStreamReader(dis));

            String line = null;
            while ((line = br.readLine()) != null) {
                int count = (line.split("\\s+")).length;
                if (count > currentMaxcount) {
                    lines.clear();
                    ;
                    lines.add(line);
                    currentMaxcount = count;
                } else if (count == currentMaxcount) {
                    lines.add(line);
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
        }
    }
    public int getCurrentMaxcount(){
        return currentMaxcount;
    }
    public void setCurrentMaxcount(int currentMaxcount){
        this.currentMaxcount = currentMaxcount;
    }

    public List<String> getLines(){
        return lines;
    }

    public void setLines(List<String> lines){
        this.lines = lines;
    }

    public static void main(String[] args) {
        MaximumWordCount m = new MaximumWordCount();
        m.readCount("src/javaspecific/Sample.txt");
        System.out.println("Maximum number of words in line: "+m.getCurrentMaxcount());
        System.out.println("Line with maximum words is: ");
        List<String> lines = m.getLines();
        for (String l: lines){
            System.out.println(l);
        }
    }
}
