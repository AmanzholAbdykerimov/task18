package com.company;

public class Farm {
String adress;
int cows;
int horses;
int sheeps;
String ownerName;

    @Override
    public String toString() {
        return "Farm{" +
                "adress='" + adress + '\'' +
                ", cows=" + cows +
                ", horses=" + horses +
                ", sheeps=" + sheeps +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }

    public Farm(String adress, int cows, int horses, int sheeps, String ownerName) {
        this.adress = adress;
        this.cows = cows;
        this.horses = horses;
        this.sheeps = sheeps;
        this.ownerName = ownerName;
    }
}
