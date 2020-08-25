package sample;

import java.io.*;
import java.net.Socket;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> checkForMatches = new HashMap<>();

        checkForMatches.put("Молоко","Milk");
        checkForMatches.put("Окно","Window");
        checkForMatches.put("Деньги","Money");
        checkForMatches.put("Дом","House");
        
        int min = 0;
        int max = 3;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;

        System.out.println("Напиши перевод слова "+ checkForMatches.values()+"");

        String word =scanner.next();
            System.out.println(checkForMatches.get(word));

        int points = 0;
        if ()
        {
            System.out.println("Количество слов подряд:"+points+"");
        }
        else{
            points=0;
        }
    }

    }

