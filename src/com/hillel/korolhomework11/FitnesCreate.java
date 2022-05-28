package com.hillel.korolhomework11;

class FitnesCreate extends Fitnes {

    String lastName;
    int weight;
    int pressure;
    int cntSteps;





    public FitnesCreate(String name, int day, int month, int year, String email, String phoneNumber, String lastName, int weight, int pressure, int cntSteps) {
        super(name, day, month, year, email, phoneNumber);
        this.lastName = lastName;
        this.weight = weight;
        this.pressure = pressure;
        this.cntSteps = cntSteps;


    }




    public void printAccountInfo() {

        System.out.println("Person: " +
                "\n First name =  " + getName() +
                ";\n Last name =  " + lastName +
                ";\n Date birth = " + getDay() + "." + getMonth() + "." + getYear() +
                ";\n Email = " + getMail() +
                ";\n Phone number = " + getPhoneNumber() +
                ";\n Weight = " + weight +
                ";\n Pressure = " + pressure +
                ";\n Total steps = " + cntSteps +
                ";\n Age = " + getAge(getYear())+ "\n");

    }

}
