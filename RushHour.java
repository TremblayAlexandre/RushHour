import java.io.File;
import java.io.FileNotFoundException;

public class RushHour {
    static String path = "C:\\Users\\tremb\\Desktop\\BOB";
    static String fileIn = "Prog2.txt";
    static String fileOut = "Prog3.txt";
    static java.io.File fileI = new File(path+fileIn);
    static java.io.File fileO = new File(path+fileOut);
    public static void main(String[] args) {
        try {
            UserCreator.createFiles("Josh","Bob", "Xavier", 12 ,13);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
