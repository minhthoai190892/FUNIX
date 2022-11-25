import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class App {
    private static final String INPUT = "INPUT.TXT";
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        // D:\\Funix\\CSD201Assignment\\test.txt
        // int[] array = { 9, 3, 5, 6, 1, 2, 4 };
        // linearSearch(array, 5);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            writeFile(INPUT, array[i],n);
        }
        float[] arrayFloat = readFile(INPUT,n) ;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

    public static void linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > value) {
                System.out.print(i + " ");
            }
        }

    }

    public static void writeFile(String fileName, int index,int length) {
        // append = true: không ghe đè file
        // append = false: ghe đè file
        try {
            FileWriter fw = new FileWriter(fileName, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(String.valueOf(index));
            bw.newLine();
            bw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static float[] readFile(String fileName,int length) {
        float[] array = new float[length];
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            int i = 0;

            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                array[i] = Integer.parseInt(line);
            }
            br.close();
            fr.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return array;
    }
}
