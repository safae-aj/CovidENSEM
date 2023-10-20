package com.ensem.helpers;

import java.util.Scanner;

public class Authentication  {

    public static String Login()  {
        String user, pwd = null, retry, loggedAs = "not logged in";
        Scanner in = new Scanner(System.in);
        boolean correctCredentials = true;
        System.out.println("*****************");
        System.out.println("                    Username");
        System.out.println("\n\tEnter username");
        user = in.next();
        if (!user.equals("admin" ) && !user.equals("étudiant")) {
            while (correctCredentials) {
                System.out.println("\t\t\tWrong username, do you want to retry? Y or N.");
                retry = in.next();
                while (retry.equalsIgnoreCase("y")){
                    System.out.println("\n\tRe enter username");
                    user = in.next();
                    if (!user.equals("admin") && !user.equals("étudiant")){
                        retry.equalsIgnoreCase("N");
                        correctCredentials=false;
                    }
                }
            }
        }

        if (user.equals("admin")) {
            loggedAs="admin";
        } else if (user.equals("étudiant")){
            loggedAs="étudiant";
        }
        if(user.equals("admin")){
            System.out.println("\n\tEnter password");
            pwd = in.next();
            if (!pwd.equals("1234")) {
                while (correctCredentials) {
                    System.out.println("\t\t\tWrong password, do you want to retry? Y or N.");
                    retry = in.next();
                    if (retry.equalsIgnoreCase("y")){
                        System.out.println("\n\tRe enter password");
                        pwd = in.next();
                        if (pwd.equals("1234")){
                            Admin.menu_admin();
                        }}
                    else if(retry.equalsIgnoreCase("N")){

                            correctCredentials=false;
                        }

        }}}

           else if(user.equals("étudiant")){
                System.out.println("\n\tEnter password");
                pwd = in.next();
                if (!pwd.equals("123")) {
                    while (correctCredentials) {
                        System.out.println("\t\t\tWrong password, do you want to retry? Y or N.");
                        retry = in.next();
                        if (retry.equalsIgnoreCase("y")){
                            System.out.println("\n\tRe enter password");
                            pwd = in.next();
                            if (pwd.equals("123")){
                                User.menu_user();
                            }}
                        else if(retry.equalsIgnoreCase("N")){

                            correctCredentials=false;
                        }

                    }}}



        if (user.equals("étudiant")&& pwd.equals("123")) {
            System.out.println("You are logged in successfully as :"+ loggedAs );
            User.menu_user();
        }
        else if(user.equals("admin")&&   pwd.equals("1234")){
            System.out.println("You are logged in successfully as :"+ loggedAs);
            Admin.menu_admin();
        }
        else {
            System.out.println("Wrong credentials combination, please retry later!");
            Authentication.LogOut();
        }
        return loggedAs;
    }

    public static void LogOut(){
        System.exit(0);

    }
}
