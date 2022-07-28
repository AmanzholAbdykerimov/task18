package com.company;

public class Main {
    public static void main(String[] args) {
        Farm f1 = new Farm("Bakai-Ata",5,2,3,"Marat");
        Farm f2 = new Farm("Salkyn-Tor",1,1,1,"Samat");
        Farm[]  farm1 ={new Cow(43,4,"m","Marusya1"),
                new Cow(43,4,"m","Marusya1"),
                new Cow(43,4,"m","Marusya1"),
                new Cow(43,4,"m","Marusya1"),
                new Cow(43,4,"m","Marusya1"),
                new Horse(56,9,"m","Puchok1"),
                new Horse(56,9,"m","Puchok1"),
                new Sheep(39,2,"j","Kesha1"),
                new Sheep(39,2,"j","Kesha1"),
                new Sheep(39,2,"j","Kesha1")};
        Farm[] farm2 ={
                new Cow(43,4,"m","Marusya1"),
                new Horse(56,9,"m","Puchok1"),
                new Sheep(39,2,"j","Kesha1")};
        System.out.println(f1.toString());
        System.out.println("  ");
        for(Farm i:farm1){
            System.out.println(i.toString());
        }
        System.out.println(f1.toString());
        System.out.println("  ");
        System.out.println();
        for(Farm i:farm2){
            System.out.println(i.toString());
    }
}}