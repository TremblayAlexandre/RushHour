import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Users {
    private String username;
    private String password;
    private int level;
    private int points;
    private static int count =0;
    public static ArrayList<Users> users= new ArrayList(count);
    static String path = "\\C:\\Users\\tremb\\Desktop\\Users\\";
    public Users(String username, String password) {
        this.username = username;
        this.password = password;
        this.points = 0;
        this.level = 1;
        count++;
        try {
            UserCreator.createFiles(username,password);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        users();

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void users() {
        users.add(this);
    }

    public static int getCount() {
        return count;
    }

    public static void getUsers() {
        for(int x=0; x< count; x++){
            System.out.println(users.get(x).points);
        }
    }
}
