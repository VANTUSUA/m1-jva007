package com.luxoft.basics.part1.xtasks;

public class T0_Split
{
    public static void main(String[] args)
    {
        double randomNumber = 343.36;
        double secondNumber = 3.069;
        double last = .2;

        String str = "" + randomNumber;

        int dotIndex = str.indexOf(".");

        System.out.println("whole: " + str.substring(0, dotIndex) + ", " + "fract: " + str.substring(4));
        System.out.println ("whole: " + str.substring(0, dotIndex) + ", " + "fract: " + str.substring(4));
        System.out.println("whole: " + str.substring(0, dotIndex) + ", " + "fract: " + str.substring(4));
    }
}
