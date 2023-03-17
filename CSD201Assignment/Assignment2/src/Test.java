import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        String txt = "Nguyen minh THoia";
        String[] arr = { "Nguyen minh THoia1", "Nguyen minh THoia2", "Nguyen minh THoia3", };
        try {
            FileWriter fw = new FileWriter("data.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for (String string : arr) {
                bw.write(string);
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
