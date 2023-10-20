package com.ensem.helpers;

import com.ensem.Objects.Student;

import java.util.Scanner;

public class Account {
    public static Student student;
    public static void setStudentInfo(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter id of student");
        String sid = in.nextLine();
        student.setSid(sid);

        System.out.println("Enter name of student");
        String name = in.nextLine();
        student.setName(name);

        System.out.println("Enter sector of student");
        String sect = in.nextLine();
        student.setSect(sect);

        System.out.println("Enter age of student");
        String age = in.nextLine();
        student.setAge(age);

        System.out.println("Enter type of vaccine");
        String vacc = in.nextLine();
        student.setVacc(vacc);

        System.out.println("Enter number of doses");
        String dose = in.nextLine();
        student.setDose(dose);

    }
    public static void setCaseInfo(){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter First name of student");
        String nom = in.nextLine();
        student.setNom(nom);

        System.out.println("Enter second name of student");
        String prenom = in.nextLine();
        student.setPrenom(prenom);

        System.out.println("Enter Date ");
        String date = in.nextLine();
        student.setDate(date);

        System.out.println("Enter Comment");
        String comm = in.nextLine();
        student.setComm(comm);



    }

    public static void DeleteStudentInfo() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter sid ");
        String sid = in.nextLine();
        student.setSid(sid);
    }

    public static void UpdateStudentInfo(){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter id of student");
        String sid = in.nextLine();
        student.setSid(sid);

        System.out.println("Enter name of student");
        String name = in.nextLine();
        student.setName(name);

        System.out.println("Enter sector of student");
        String sect = in.nextLine();
        student.setSect(sect);

        System.out.println("Enter age of student");
        String age = in.nextLine();
        student.setAge(age);

        System.out.println("Enter type of vaccine");
        String vacc = in.nextLine();
        student.setVacc(vacc);

        System.out.println("Enter number of doses");
        String dose = in.nextLine();
        student.setDose(dose);


    }
    }

