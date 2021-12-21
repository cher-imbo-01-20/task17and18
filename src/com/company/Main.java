package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввод для первого задания: ");
        String str = scanner.nextLine();
        Pattern pattern = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher matcher = pattern.matcher(str);
        System.out.println(matcher.matches());
        //2
        System.out.println("Ввод для второго задания: ");
        str = scanner.nextLine();
        pattern = Pattern.compile("[a-f[A-F[0-9]]][a-f[A-F[0-9]]]:[a-f[A-F[0-9]]][a-f[A-F[0-9]]]:" +
                "[a-f[A-F[0-9]]][a-f[A-F[0-9]]]:[a-f[A-F[0-9]]][a-f[A-F[0-9]]]:" +
                "[a-f[A-F[0-9]]][a-f[A-F[0-9]]]:[a-f[A-F[0-9]]][a-f[A-F[0-9]]]");
        matcher = pattern.matcher(str);
        System.out.println(matcher.matches());
        //3
        System.out.println("Третье задание");
        System.out.println("Задана строка: ergespadjh4.42 UDD skldbjab erg ee491927323.11 RURrfg 0.002 USD rgerg 666.33 USD ups 1.111USD");
        str = "ergespadjh4.42 USD skldbjab erg ee491927323.11 RURrfg 0.002 USD rgerg 666.33 USD ups 1.111USD";
        pattern = Pattern.compile("([1-9]+)\\.\\d+\\s(USD|RUR|EU)");
        matcher = pattern.matcher(str);
        System.out.println("Найденные цены:");
        while(matcher.find())
            System.out.println(matcher.group());
    }
}
