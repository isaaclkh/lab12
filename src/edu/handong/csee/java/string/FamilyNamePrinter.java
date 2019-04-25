package edu.handong.csee.java.string;

public class FamilyNamePrinter{
    private String stringNames;
    private String[] familyNames;

    public static void main(String[] args) {

        FamilyNamePrinter famNamePrint = new FamilyNamePrinter();
        
        famNamePrint.stringNames = args[0];
        famNamePrint.FamilyNamePrinter(famNamePrint.stringNames);
        famNamePrint.printFamilyNames();
    }

    public void FamilyNamePrinter(String names){
        String[] name = names.split(", ");
        String[] famNames = new String[name.length];

        for (int i = 0; i < name.length; i++)
            famNames[i] = name[i].trim().split(" ")[1];

        this.familyNames = famNames;
    }

    public void printFamilyNames(){
        for(int i=0; i<this.familyNames.length; i++)
            System.out.println(this.familyNames[i]);
    }
}