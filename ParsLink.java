package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        in.close();

        if (str.matches(".*obj=.*")) {
            str = str.replaceAll("(.*(?=obj=.*))", "");
            str = str.replaceAll("[=&]", " ");
            String[] arr = str.split(" ");
            System.out.println(arr[0] + " " + arr[2]);
            if (isItDouble(arr[1]))
                alert(Double.parseDouble(arr[1]));
            else
                alert(arr[1]);
        } else {
            str = str.replaceAll(".*(?=\\?)", "");
            str = str.replaceAll("[?=&]", " ");
            str = str.trim();

            String[] arr = str.split(" ");

            System.out.println(arr[0] + " " + arr[2] + " " + arr[3]);
        }
    }

    public static boolean isItDouble(String str) {
        boolean flag = false;

        try {
            double nbr = Double.parseDouble(str);
            flag = true;
        } catch (Exception e) {}

        return flag;
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
