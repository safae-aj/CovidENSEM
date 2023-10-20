package com.ensem.Objects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class NbrDose{




    public static void TotalNbrDose(){
        try {
            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost:3300/data_student";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl,"imrane" , "1234");

            Statement stmt = conn.createStatement();

            System.out.println("Calculate...");

            String sql = "SELECT COUNT(*) as nbdose FROM  student ;";
            ResultSet rs = stmt.executeQuery(sql);
            int nbdose =0;
            rs.next();
            nbdose = rs.getInt("nbdose");

            System.out.println("Le nombre total des doses est :" + nbdose );

            conn.close();
        }
        catch(Exception e){
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }}
    public static void NbrDose0(){
        try {
            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost:3300/data_student";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl,"imrane" , "1234");

            Statement stmt = conn.createStatement();



            String sql = "SELECT COUNT(*) AS nbdose0 FROM  student WHERE doses_number = 0;";
            ResultSet rs = stmt.executeQuery(sql);
            int nbdose0;

            rs.next();

            nbdose0 = rs.getInt("nbdose0");


            System.out.println("Les étudiants non vaccinnés est :" + nbdose0 );

            conn.close();
        }
        catch(Exception e){
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }}
    public static void NbrDose1(){
        try {
            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost:3300/data_student";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl,"imrane" , "1234");

            Statement stmt = conn.createStatement();


            String sql = "SELECT COUNT(*) AS nbdose1 FROM  student WHERE doses_number = 1;";
            ResultSet rs = stmt.executeQuery(sql);

            int nbdose1=0;
            rs.next();
            nbdose1 = rs.getInt("nbdose1");
            System.out.println("Le nombre des étudiants qui ont pris  une seule dose  est : " + nbdose1 );

            conn.close();
        }
        catch(Exception e){
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }}
    public static void NbrDose2(){
        try {
            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost:3300/data_student";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl,"imrane" , "1234");

            Statement stmt = conn.createStatement();


            String sql = "SELECT COUNT(*) AS nbdose2 FROM  student WHERE doses_number = 2;";
            ResultSet rs = stmt.executeQuery(sql);

            int nbdose2=0;
            rs.next();
            nbdose2 = rs.getInt("nbdose2");
            System.out.println("Le nombre des étudiants qui ont pris  deux doses est : " + nbdose2 );

            conn.close();
        }
        catch(Exception e){
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }}
    public static void NbrDose3(){
        try {
            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost:3300/data_student";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl,"imrane" , "1234");

            Statement stmt = conn.createStatement();



            String sql = "SELECT COUNT(*) AS nbdose3 FROM  student WHERE doses_number = 3;";
            ResultSet rs = stmt.executeQuery(sql);

            int nbdose3=0;
            rs.next();
            nbdose3 = rs.getInt("nbdose3");
            System.out.println("Le nombre des étudiants qui ont pris  trois doses est : " + nbdose3 );

            conn.close();
        }
        catch(Exception e){
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }}


}
