import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RushHour {
    static String path = "C:\\Users\\tremb\\Desktop\\Users";


    public static void main(String[] args) {
        Boolean bool =false;
        String username="";
        System.out.println("Wanna create an account? Yes:1 No:2");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num==1){
            System.out.println("Enter a username: ");
            username = sc.next();
            System.out.println("Enter the password:");
            String password = sc.next();
            try {
                UserCreator.createFiles(username, password);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        else if(num==2){
            System.out.println("Enter a username: ");
            username = sc.next();
            System.out.println("Enter the password:");
            String password = sc.next();
            try {
                bool = Login.login(username,password);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        else{
            System.out.println("Bro??!??!");
        }
        if(bool){

        }


    }
}
