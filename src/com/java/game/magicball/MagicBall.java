package com.java.game.magicball;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    private static Scanner scannerUserInformation = new Scanner(System.in);

    public static void main(String[] args) {
        showTextFirstWords();
        String userAnswerYesNo = userSolution();
        switchCheckUserSolve(userAnswerYesNo);
    }

    private static void showTextFirstWords (){   //showTextFirstWords   userSolution
        System.out.println("This game begins now !!! \n" +
                "But you must know that your life never be the same if you play the game Magic balls. \n" +
                "Are you ready?  ((Yes)= Y) or ((No)= N) ");
    }

    private static String userSolution() {
        return scannerUserInformation.next();
    }

    private static void switchCheckUserSolve(String userAnswerYesNo) {
        switch (userAnswerYesNo) {
            case "Y":
                userQestion();
                break;
            case "y":
                userQestion();
                break;
            case "N":
                System.out.println("Game Over");
                break;
            case "n":
                System.out.println("Game Over ");
                break;
            default:
                System.err.println("Something is wrong \n" +
                        "Do you want to try again?  ((Yes)= Y) or ((No)= N)");
                String userAnswerYesNo2 = scannerUserInformation.next();
                switchCheckUserSolve(userAnswerYesNo2);

        }
    }

    private static void userQestion() {
        System.out.println("Ask a question and get an answer");
        String stringUserQestion = scannerUserInformation.next();
        Random random = new Random();
        while (true) {
            int randomNumber = random.nextInt(6);
            switch (randomNumber) {
                case 0:
                    System.out.println("Very doubtful");
                    break;
                case 1:
                    System.out.println("Outlook is good");
                    break;
                case 2:
                    System.out.println("Outlook is not very good");
                    break;
                case 3:
                    System.out.println("Ask again later");
                    break;
                case 4:
                    System.out.println("Concentrate and ask again");
                    break;
                case 5:
                    System.out.println("Most likely");
                    break;
                case 6:
                    System.out.println("Do not count on it");
                    break;
            }
            System.out.println("Do you have any question? ((Yes)= Y) or ((No)= N)");
            String userAnswerYesNo = scannerUserInformation.next();
            switchCheckUserSolve(userAnswerYesNo);
            return;
        }
    }
}
