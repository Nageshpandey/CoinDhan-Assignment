package com.company;

public class number_pattern {
    public static void main(String[] args) {
        numberPattern();
    }
    public static void numberPattern(){
        int num = 6;
        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}


//output
/* 
 1
22
333
4444
55555
666666

*/