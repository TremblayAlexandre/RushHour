import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class UserCreator {
    static String path = "\\C:\\Users\\tremb\\Desktop\\";

    public static String getPath() {
        return path;
    }

    public static void createFiles(String folderName, String username, String password, int points, int levels) throws FileNotFoundException {
            //path += folderName;
            File f1 = new File(path+folderName);
            boolean bool = f1.mkdir();
            path += folderName+"\\";
          File usernameFile = new File(path+"username.txt");
          fileWrite(usernameFile, username);
          File passwordFile = new File(path+"password.txt");
          fileWrite(passwordFile, password);
          File pointsFile = new File(path+"username.txt");
          fileWrite(pointsFile, points);
          File levelFile = new File(path+"password.txt");
          fileWrite(levelFile, levels);
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
