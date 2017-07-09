package myjava;

abstract class Bank{

    float rateOfInterest;
    int serviceCharges;
    int noOfEmployees;

    abstract void getDetails(float rateOfInterest, int serviceCharges, int noOfEmployees);
}
