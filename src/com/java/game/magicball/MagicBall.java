package com.java.game.magicball;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    private static Scanner scannerUserInformation = new Scanner(System.in);
    private static boolean flagFirst = false;
    private static boolean flag = false;

    void starting() {
        begin();

    }

    private static void begin() {
        showTextFirstSentence();
        String userAnswerPlayNotPlay = userWriteSolutionYesNo();
        flagFirst = checkUserSolutionPlayNotPlay(userAnswerPlayNotPlay);
        while (true) {
            if (flagFirst) {
                break;
            } else {
                System.out.println("Game Over ");
                return;
            }
        }
        showUserAskQestion();
        userAskQestion();
 //       String userAnswerYesNo = userWriteSolutionYesNo();
        flag = checkUserSolution(userAnswerYesNo);
        while (true) {
            if (flag) {
                showUserAskQestion();
                userAskQestion();
                forUseAnswer();
            } else {
                return;
            }
        }
    }

    private static void showTextFirstSentence() {
        System.out.println("This game begins now !!! \n" +
                "But you must know that your life never be the same if you play the game Magic balls. \n" +
                "Are you ready?  ((Yes)= Y) or ((No)= N) ");
    }

    private static String userWriteSolutionYesNo() {
        return scannerUserInformation.next();
    }

    private static boolean checkUserSolutionPlayNotPlay(String userAnswerPlayNotPlay) {
        flagFirst = false;
        switch (userAnswerPlayNotPlay) {
            case "Y":
                System.out.println("good choice! ");
                return true;
            case "y":
                System.out.println("good choice!");
                return true;
            case "N":
                System.out.println("It's your decision");
                return false;
            case "n":
                System.out.println("It's your decision ");
                return false;
            default:
                flagFirst = showTextSecondSentenceAndFlag();
        }
        return flagFirst;
    }

    private static boolean checkUserSolution(String userAnswerYesNo) {
        flag = false;
        switch (userAnswerYesNo) {
            case "Y":
                System.out.println("good choice, man");
                return true;
            case "y":
                System.out.println("good choice");
                return true;
            case "N":
                System.out.println("Game Over");
                return false;
            case "n":
                System.out.println("Game Over ");
                return false;
            default:
                flag = showTextSecondSentenceAndFlag();
        }
        return flag;
    }

    private static boolean showTextSecondSentenceAndFlag() {
        System.err.println("Something is wrong \n" +
                "Do you want to try again?  ((Yes)= Y) or ((No)= N)");
        return true;
    }

    private static void showUserAskQestion() {
        System.out.println("Ask a question and receive an answer");
    }

    private static void userAskQestion() {
        String stringUserQestion = scannerUserInformation.next();
    }

    private static void forUseAnswer() {
//        System.out.println("Ask a question and get an answer");
//        String stringUserQestion = scannerUserInformation.next();
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
            checkUserSolution(userAnswerYesNo);
            return;
        }
    }
}
