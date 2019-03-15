package model;

public class Medicament{

//Atributos

private String nameOfMedicament;
private double dose;
private double totalDose;
private char frecuency;

//Constructores
public Medicament(String nameOfMedicament, double dose, double totalDose, char frecuency){

this.nameOfMedicament = nameOfMedicament;
this.dose = dose;
this.totalDose = totalDose;
this.frecuency = frecuency;
}

public String getNameOfMedicament(){
  return nameOfMedicament;
}
public void setNameOfMedicament(String nameOfMedicament){
  this.nameOfMedicament = nameOfMedicament;
}
public double getDose(){
  return dose;
}
public void setDose(double dose){
  this.dose = dose;
}
public double getTotalDose(){
  return totalDose;
}
public void setTotalDose(double totalDose){
  this.totalDose = totalDose;
}
public char getFrecuency(){
  return frecuency;
}
public void setFrecuency(char frecuency){
  this.frecuency = frecuency;
}

}