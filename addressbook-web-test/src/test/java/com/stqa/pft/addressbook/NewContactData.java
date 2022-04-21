package com.stqa.pft.addressbook;

public class NewContactData{
  public final String firstName;
  public final String lastName;
  public final String address;
  public final String phoneNumber;


public NewContactData(String firstName, String lastName, String address, String phoneNumber) {
  this.firstName = firstName;
  this.lastName = lastName;
  this.address = address;
  this.phoneNumber = phoneNumber;
}
public String getFirstName(){
  return firstName;
}
public String getLastName(){return  lastName;}
public String getAddress(){return address;}
public String getPhoneNumber(){return phoneNumber;}

};