/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class Solution04 {
    /* Begin pseudocode */
    // Create scanner object.
    // Prompt and scan for noun.
    // Prompt and scan for verb.
    // Prompt and scan for adjective.
    // Prompt and scan for adverb.
    // Print madlib using printf.
    /* End pseudocode */

    public static void main(String[] args){
        Scanner madLibs = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String noun = madLibs.nextLine();
        System.out.print("Enter a verb: ");
        String verb = madLibs.nextLine();
        System.out.print("Enter an adjective: ");
        String adjective = madLibs.nextLine();
        System.out.print("Enter an adverb: ");
        String adverb = madLibs.nextLine();
        System.out.printf("Once, my %s wanted to %s %s, and it was %s!", noun, verb, adverb, adjective);
    }

}
