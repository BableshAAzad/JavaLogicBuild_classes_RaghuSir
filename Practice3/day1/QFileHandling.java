package Practice3.day1;

import java.io.FileReader;
import java.io.IOException;

public class QFileHandling {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader(
                    "D:\\a. programming\\java\\BableshWorkSpace\\RaghuSir_JavaLogicBuild_classes\\Practice3\\day1\\demo.text");
            StringBuilder sb = new StringBuilder();
            String s = "";
            while (true) {
                int c = fr.read();
                if (c == -1) {
                    break;
                }
                if((char)c != ' '){
                  s += (char)c;
                  map.put()
                }else{
                    s = "";
                }
                sb.append((char) c);
            }
            System.out.println(sb);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
