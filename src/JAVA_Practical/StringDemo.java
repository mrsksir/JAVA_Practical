package JAVA_Practical;

import java.util.*;

public class StringDemo {

    public static void main(String[] args) {

        int vCount = 0,cCount = 0;
        String myname;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        myname = sc.nextLine();
        
        System.out.println("Your Name: " + myname);
        System.out.println("This is in upperCase: " + myname.toUpperCase());
        System.out.println("This is in lowerCase: " + myname.toLowerCase());
        System.out.println("Length: " + myname.length());
        
        for (int i = 0; i < myname.length(); i++) {
                        
            char ch = myname.toUpperCase().charAt(i);
            
            if (ch == ' ') continue;
            
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println(ch);
                vCount++;
            }else {
                cCount++;
            }
        }
        
        System.err.println("Vowels: " + vCount);
        System.err.println("Consonant: " + cCount);
        
        System.out.println(myname.charAt(0));
        System.out.println(myname.charAt(1));
        System.out.println(myname.charAt(2));
        System.out.println(myname.charAt(3));
        System.out.println(myname.charAt(4));
        System.out.println(myname.charAt(5));
        System.out.println(myname.charAt(6));
        System.out.println(myname.charAt(7));
        
    }
    
}
