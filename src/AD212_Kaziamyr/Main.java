package AD212_Kaziamyr;

import java.util.Scanner;
/*
 * @author Bohdan Kaziamyr
 * @version 16 Oct 2022
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInt;
        while (true){
            System.out.printf("\n\n\n\n\n\n");
            System.out.printf("1 - Task №1\n2 - Task №2\n3 - Task №3\n4 - Task №4\n5 - Task №5\n\nPlease, enter the number: ");
            userInt = sc.nextInt();
            switch(userInt){
                case 1:
                    System.out.print(task1());
                    break;
                case 2:
                    System.out.print(task2());
                    break;
                case 3:
                    System.out.print(task3());
                    break;
                case 4:
                    task4();
                    break;
                case 5:
                    System.out.print(task5());
                    break;
            }
        }

    }

    private static boolean task1 (){
        Scanner sc = new Scanner(System.in);
        String userStr;
        System.out.printf("\nPlease enter the string: ");
        userStr = sc.nextLine();
        String lastTwo = userStr.substring(userStr.length()-2);
        if (lastTwo.equals("ed")) return true;
        else return false;
    }

    private static int task2 (){
        Scanner sc = new Scanner(System.in);
        String userStr = sc.nextLine();
        int sum = 0;
        for (int i = 0; i<userStr.length(); i++){
            int a = userStr.charAt(i);
            if (48 < a && a<58) sum += Character.digit(a, 10);
        }
        return sum;
    }

    private static int task3 (){
        Scanner sc = new Scanner(System.in);
        String userStr;
        int theLength1 = 0, theLength2 = 1, nextChar = 0;

        do{
            System.out.printf("\nPlease enter the string: ");
            userStr = sc.nextLine();
        }while(userStr.length() < 2);

        while (nextChar < userStr.length()-1){
            char c1 = userStr.charAt(nextChar);
            while (nextChar < userStr.length()-1){
                char c2 = userStr.charAt(nextChar+1);
                nextChar++;
                if (c1 == c2) theLength2++;
                else break;
            }
            if (theLength1 < theLength2) theLength1 = theLength2;
            theLength2 = 1;
        }
        return theLength1;
    }

    private static void task4 (){
        Scanner sc = new Scanner(System.in);
        String userStr = sc.nextLine();
        for (int i = 0; i < userStr.length(); i++){
            if (userStr.charAt(i) == ' ') System.out.printf("\n");
            else System.out.print(userStr.charAt(i));
        }
    }

    private static String task5 (){
        Scanner sc = new Scanner(System.in);
        String res = "";
        String userStr1 = sc.nextLine();
        String userStr2 = sc.nextLine();
        String userStr3;

        if (userStr1.length() > userStr2.length()) {
            userStr3 = userStr1;
            userStr1 = userStr2;
            userStr2 = userStr3;
        }

        for (int i = 0; i< userStr1.length(); i++){
            res += String.valueOf(userStr1.charAt(i));
            res += String.valueOf(userStr2.charAt(i));
        }
        res += userStr2.substring(userStr1.length());
        return res;
    }
}