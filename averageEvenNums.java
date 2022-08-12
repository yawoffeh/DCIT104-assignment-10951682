/*
Student-Id: 10951682
I certify that I yaw offeh dansoh wrote this code ..

Write a program that calculates the sum all even numbers between 1 --- 10000
------------------------------*/
public class Main{
  public static void main(String[] args){
    int sum = 0;
    int range = 10000;
    int average;
    for (int i=0; i<10000; i+=2){ 
      sum+= i;
    }
    average = sum/5000;
    System.out.println("The average of the sum of even integers between 1 - 10000 is " + average);
  }
}
