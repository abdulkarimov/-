package com.company;

public class Main {

    public static void main(String[] args) {
        Operationable op = new Operationable(){

            public int calculate(int x){

                return x *420;
            }
        };

        int z = op.calculate(20);
        System.out.println(" 20$ = " + z +"тг");
    }
}
interface Operationable{
    int calculate(int x);
}
