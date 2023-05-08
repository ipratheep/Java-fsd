package Email_validation;
import java.util.ArrayList;
import java.util.Scanner;

public class email_validation {
    public static void main(String [] args){
        ArrayList<String> emailID = new ArrayList<String>();
        emailID.add("messi@gmail.com");
        emailID.add("ronaldo@gmail.com");
        emailID.add("pele@gmail.com");
        emailID.add("morodona@gmail.com");
        emailID.add("suarex@gmail.com");
        emailID.add("neymar@gmail.com");
        emailID.add("mbappe@gmail.com.com");

        String get_email = null;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the email id : ");
        get_email = sc.nextLine();

        if (emailID.contains(get_email)){
            System.out.println("Entered email id is found \n Email id is : "+ get_email);
        } else if (get_email == null) {
            System.out.println("Enter the valid email id");
        } else {
            System.out.println("Enter email id is not found");
        }

    }
}
