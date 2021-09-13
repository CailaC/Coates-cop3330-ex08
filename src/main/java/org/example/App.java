package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Caila Coates
 */

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        Scanner input = new Scanner(System.in);

        System.out.println( "How many people?" );
        int people = input.nextInt();

        System.out.println("How many pizzas do you have?");
        int pizzas = input.nextInt();

        System.out.println("How many slices per pizza?");
        int slices = input.nextInt();

        int totalSlices = pizzas*slices;

        System.out.println(people + " people with " + pizzas + " pizzas (" + totalSlices + " slices)");

        //spp = slices per person
        int ssp = totalSlices/people;
        System.out.println("Each person gets " + ssp + " pieces of pizza.");

        //sLeft = slices leftover
        int sLeft = totalSlices%people;
        System.out.println("There are " + sLeft + " leftover pieces.");
    }
}
