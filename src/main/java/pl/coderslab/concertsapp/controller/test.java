package pl.coderslab.concertsapp.controller;

import java.util.*;
import java.io.*;

class test {

    public static String StringChallenge(String str) {

        String[] words = str.split(" ");
        String output = "";

        for (int i = 0 ; i<words.length; i++){

            words[i] = words[i].replace(words[i].charAt(0), Character.toUpperCase(words[i].charAt(0)));

            output += words[i] + " ";

        }

        output.trim();
        return output;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(StringChallenge(s.nextLine()));
    }

}
