import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Login {
    static String path = "\\C:\\Users\\tremb\\Desktop\\Users\\";
    public static boolean login(String username, String password) throws FileNotFoundException {
        //File f1 = new File(path + username);
        File f2 = new File(path + username + "\\password.txt");
        Scanner sc = new Scanner(f2);
        String pass = sc.next();
        if(pass.equals(password)){
            return true;
        }
        else{
            return false;
        }
    }
}
