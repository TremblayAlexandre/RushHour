import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class UserCreator {
    static String path = "\\C:\\Users\\tremb\\Desktop\\Users\\";

    public static String getPath() {
        return path;
    }

    public static void createFiles(String username, String password) throws FileNotFoundException {
        //path += folderName;
        File f1 = new File(path + username);
        boolean bool = f1.mkdir();
        path += username + "\\";
        File usernameFile = new File(path + "username.txt");
        fileWrite(usernameFile, username);
        File passwordFile = new File(path + "password.txt");
        fileWrite(passwordFile, password);
        File pointsFile = new File(path + "pointsFile.txt");
        fileWrite(pointsFile, 0);
        File levelFile = new File(path + "levelFile.txt");
        fileWrite(levelFile, 1);
    }

    public static void fileWrite(File file, String string) throws FileNotFoundException {
        PrintWriter st = new PrintWriter(file);
        st.print(string);
        st.close();
    }

    public static void fileWrite(File file, int num) throws FileNotFoundException {
        PrintWriter st = new PrintWriter(file);
        st.print(num);
        st.close();
    }
}
