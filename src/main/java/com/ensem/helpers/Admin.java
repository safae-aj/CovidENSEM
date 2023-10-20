package com.ensem.helpers;

import javax.swing.*;
import java.sql.*;
import java.util.Scanner;

import static com.ensem.Objects.Student.*;

public class Admin {

    private JButton button1;

    public static void menu_admin()  {



       while (true){
                    System.out.println("--------welcome to student tracking management System--------");
                    System.out.println("1.Add Students");
                    System.out.println("2.Delete Students");
                    System.out.println("3.Modify Students");
                    System.out.println("4.Find a Student");
                    System.out.println("5.View all students");
                    System.out.println("6.View Covid Case ");
                    System.out.println("7.View statistic ");
                    System.out.println("8.Sign out");
                    System.out.println("Please enter your choice:");
                    Scanner in = new Scanner(System.in);
                    String line = in.nextLine();

                    switch (line) {
                        case "1":
                            System.out.println("Add Students");
                            Account.setStudentInfo();
                            InsertData();
                            break;


                        case "2":
                            System.out.println("Delete Students");
                            Account.DeleteStudentInfo();
                            Delete();
                            break;

                        case "3":
                            System.out.println("Modify Students");
                            Account.UpdateStudentInfo();
                            UpdateStudent();
                            break;

                        case "4":
                            System.out.println("Find a Student");
                            Admin.FindStudent();
                            break;

                        case "5":
                            System.out.println("View all students");
                            Showtable();
                            break;
                        case "6":
                            System.out.println("View Covid Case");
                            ShowCase();
                            break;

                        case "7":
                            System.out.println("View Statistic");
                            Statistic.Statistic();
                            break;

                        case "8":
                            System.out.println("Thank you for using!");
                            Authentication.LogOut();

                    }
                }

    }


    static void InsertData() {

        try
        {
            // create a mysql database connection

            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost:3300/data_student";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl,"imrane" , "1234");


            // the mysql insert statement
            String query = " insert into student (student_id,full_name,sector, age, vaccin_type,doses_number)" + " values (?, ?, ?, ?, ? , ?)";

            // create the mysql insert preparedstatement

            PreparedStatement preparedStmt = conn.prepareStatement(query);



                preparedStmt.setString(1, getSid());
                preparedStmt.setString(2, getName());
                preparedStmt.setString(3, getSect());
                preparedStmt.setString(4, getAge());
                preparedStmt.setString(5, getVacc());
                preparedStmt.setString(6, getDose());


            // execute the preparedstatement
            preparedStmt.execute();

            conn.close();
        }
        catch (Exception e)
        {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
    }
  static void Delete() {

            try
            {


                String myDriver = "com.mysql.cj.jdbc.Driver";
                String myUrl = "jdbc:mysql://localhost:3300/data_student";
                Class.forName(myDriver);
                Connection conn = DriverManager.getConnection(myUrl,"imrane" , "1234");

                Statement stmt = conn.createStatement();

                System.out.println("Suppression...");
                String sql = "DELETE FROM student WHERE student_id = " +  getSid()  + ";";
                stmt.executeUpdate(sql);
                System.out.println("L'étudiant avec l'sid = " + getSid() + " a été supprimer avec succès...");

                conn.close();
            }
            catch(Exception e){
                System.err.println("Got an exception!");
                System.err.println(e.getMessage());
            }}

      static void UpdateStudent(){

          try
          {


              String myDriver = "com.mysql.cj.jdbc.Driver";
              String myUrl = "jdbc:mysql://localhost:3300/data_student";
              Class.forName(myDriver);
              Connection conn = DriverManager.getConnection(myUrl,"imrane" , "1234");

              Statement stmt = conn.createStatement();


              System.out.println("Modification...");
              String sql = "UPDATE student  SET full_name ='"+  getName()+"',sector ='" + getSect()  +"',age ='" + getAge()+ "',vaccin_type ='" + getVacc()+"',doses_number ='" + getDose()+"' WHERE student_id = '" +getSid() +"' ;" ;
              stmt.executeUpdate(sql);






              conn.close();
          }
          catch(Exception e){
              System.err.println("Got an exception!");
              System.err.println(e.getMessage());
          }
        }
    static void Showtable(){

        try
        {


            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost:3300/data_student";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl,"imrane" , "1234");

            Statement stmt = conn.createStatement();


            String sql = "SELECT  student_id,full_name,sector, age, vaccin_type,doses_number FROM student ;";
            ResultSet res = stmt.executeQuery(sql);

            while(res.next()){


                String sid = res.getString("student_id");
                String name = res.getString("full_name");
                String sect = res.getString("sector");
                String age = res.getString("age");
                String vacc = res.getString("vaccin_type");
                String dose = res.getString("doses_number");
                //Afficher les valeurs
                System.out.println("-----------------------------");
                System.out.println(", Student Id : " + sid);
                System.out.println(", Full Name: " + name);
                System.out.println(", Sector: " + sect);
                System.out.println(", Age: " + age);
                System.out.println(", Type of vaccine: " + vacc);
                System.out.println(", Number of doses: " + dose);
                System.out.println("-----------------------------");
            }

            conn.close();
        }
        catch(Exception e){
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
    }
    static void FindStudent(){
        try
        {


            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost:3300/data_student";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl,"imrane" , "1234");

            Statement stmt = conn.createStatement();
            Scanner in = new Scanner(System.in);

            System.out.println("\n\tEnter Value ");

            String Value = in.next();
            String sql = "SELECT  * FROM student WHERE student_id ='"+ Value +"'OR full_name = '"+ Value +"'OR sector ='" + Value +"'OR age ='"+ Value +"'OR vaccin_type ='"+ Value +"'OR doses_number ='"+ Value +"';";
            ResultSet res = stmt.executeQuery(sql);
            System.out.println(" students found by  " + Value + ":");
            while(res.next()){


                String sid = res.getString("student_id");
                String name = res.getString("full_name");
                String sect = res.getString("sector");
                String age = res.getString("age");
                String vacc = res.getString("vaccin_type");
                String dose = res.getString("doses_number");
                //Afficher les valeurs
                System.out.println("                         ");
                System.out.println(", Student Id : " + sid);
                System.out.println(", Full Name: " + name);
                System.out.println(", Sector: " + sect);
                System.out.println(", Age: " + age);
                System.out.println(", Type of vaccine: " + vacc);
                System.out.println(", Number of doses: " + dose);
                System.out.println(" ---------------------------- ");
            }

            conn.close();
        }
        catch(Exception e){
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }

    }
    static void ShowCase(){

        try
        {


            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost:3300/data_student";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl,"imrane" , "1234");

            Statement stmt = conn.createStatement();


            String sql = "SELECT  nom,prenom,date_de_declaration, commentaire FROM cascovid ;";
            ResultSet res = stmt.executeQuery(sql);

            while(res.next()){


                String nom = res.getString("nom");
                String prenom = res.getString("prenom");
                String date = res.getString("date_de_declaration");
                String comm = res.getString("commentaire");

                //Afficher les valeurs
                System.out.println("-----------------------------");
                System.out.println(" first name : " + nom);
                System.out.println(" last name : " + prenom);
                System.out.println(" date : " + date);
                System.out.println(" commentary: " + comm);
                System.out.println("-----------------------------");
            }

            conn.close();
        }
        catch(Exception e){
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
    }
    }

