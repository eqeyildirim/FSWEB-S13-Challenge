package org.example;

public class Company {
    private int id;
    private String  name;
    private double giro;
    private String[] developerNames;
    public Company(int id, String name, double giro,String[] developerNames){
        if(giro <0){
            throw new IllegalArgumentException("giro cannot be less than zero");
        }
        this.name= name;
        this.id=id;
        this.giro=giro;
        this.developerNames= developerNames;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getGiro() {
        return giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void setGiro(double giro) {
        if (giro < 0) {
            throw new IllegalArgumentException("Giro cannot be negative.");
        }
        this.giro = giro;
    }
    public void  addEmployee(int index, String name){
        if (index >= 0 && index < developerNames.length) {
            if (developerNames[index] == null) {
                developerNames[index] = name;
                System.out.println("Employee added at index " + index);
            } else {
                System.out.println("Index " + index + " is already occupied.");
            }
        } else {
            System.out.println("Index " + index + " is out of bounds.");
        }
    }

    @Override
    public String toString(){

        return id + name + giro + developerNames;

    }
}
