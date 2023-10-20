package com.ensem.helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import static com.ensem.Objects.Student.*;

public class User {

        public static void menu_user (){


        while (true) {
            System.out.println("--------welcome  student --------");
            System.out.println("1.Add Your Information");
            System.out.println("2.Add Case Of Covid");
            System.out.println("3.Sign out");
            System.out.println("Please enter your choice:");
            Scanner in = new Scanner(System.in);
            String line = in.nextLine();

            switch (line) {
                case "1":
                    System.out.println("Add Students");
                    Account.setStudentInfo();
                    InsertInformation();
                    break;
                case "2":
                    System.out.println("Add Case");
                    Account.setCaseInfo();
                    AddCase();
                    break;
                case "3":
                    System.out.println("Thank you for using!");
                    Authentication.LogOut();
            }
        }
    }
    static void AddCase() {
        try {
            // create a mysql database connection

            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost:3300/data_student";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "imrane", "1234");


            // the mysql insert statement
            String query = " insert into cascovid (nom,prenom,  date_de_declaration,commentaire)" + " values (?,  ?, ?, ?)";

            // create the mysql insert preparedstatement

            PreparedStatement preparedStmt = conn.prepareStatement(query);
            String Nom = getNom();
            String Prenom = getPrenom();
            String Date = getDate();
            String Commentaire =getComm();



            preparedStmt.setString(1, Nom);
            preparedStmt.setString(2, Prenom);
            preparedStmt.setString(3, Date);
            preparedStmt.setString(4, Commentaire);



            // execute the preparedstatement
            preparedStmt.execute();

            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
    }
    static void InsertInformation() {
        try {
            // create a mysql database connection

            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost:3300/data_student";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "imrane", "1234");


            // the mysql insert statement
            String query = " insert into student (student_id,full_name,sector, age, vaccin_type,doses_number)" + " values (?, ?, ?, ?, ? , ?)";

            // create the mysql insert preparedstatement

            PreparedStatement preparedStmt = conn.prepareStatement(query);
            String MySid = getSid();
            String MyName = getName();
            String MySect = getSect();
            String MyAge = getAge();
            String MyVacc = getVacc();
            String MyDose = getDose();


            preparedStmt.setString(1, MySid);
            preparedStmt.setString(2, MyName);
            preparedStmt.setString(3, MySect);
            preparedStmt.setString(4, MyAge);
            preparedStmt.setString(5, MyVacc);
            preparedStmt.setString(6, MyDose);


            // execute the preparedstatement
            preparedStmt.execute();

            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
    }
}
