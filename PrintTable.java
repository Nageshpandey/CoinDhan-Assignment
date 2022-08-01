package com.company;
import java.util.*;

public class print_table {
    public static void main(String[] args) {
        printTable();
    }
    public static void printTable(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        //reading a number whose table is to be print
        int num=sc.nextInt();
        //loop start execution form and execute until the condition i<=10 becomes false
        for(int i=1; i <= 10; i++)
        {
        //prints table of the entered number
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
}

//Output
/* 
 Enter number: 5
5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
5 * 5 = 25
5 * 6 = 30
5 * 7 = 35
5 * 8 = 40
5 * 9 = 45
5 * 10 = 50
*/