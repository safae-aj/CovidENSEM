package com.ensem.Objects;

public class Student {

    static String _sid;
    static String _sect;
    static String _name;
    static String _age;
    static String _vacc;
    static String _dose;
    static String nom ;
    static String prenom ;
    static String date_de_declaration;
    static String commentaire ;
    public Student() {}
    public static String getNom() {return nom;}
    public static String getPrenom() {return prenom;}
    public static String getDate (){return date_de_declaration;}
    public static String getComm() {return commentaire;}
    public static String getSid() {return _sid;}
    public static String getSect() {return _sect;}
    public static String getName(){return _name;}
    public static String getAge() {return _age;}
    public static String getVacc() {return _vacc;}
    public static String getDose() {return _dose;}
    public static void setNom(String fname ){ nom=fname;}
    public static void setPrenom(String lname) {prenom=lname;}
    public static void setDate(String date ) {date_de_declaration = date ;}
    public static void setComm(String comm) {commentaire = comm ;}
    public static void setSid(String sid) {_sid = sid;}
    public static void setSect(String sect) {_sect = sect;}
    public static void setName(String name) {_name = name;}
    public static void setAge(String age) {_age = age;}
    public static void setVacc(String vacc) {_vacc = vacc;}
    public static void setDose(String dose) {_dose = dose;}



}
