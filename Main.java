package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num = 1;

        while (num != 4){
            System.out.print("Игра быки и коровы.Выберите вариант игры с ботом :" );
            System.out.println();
            System.out.println("1 - Угадать цифры");
            System.out.println("2 - Угадать буквы русского алфавита");
            System.out.println("3 - Угадать буквы английского алфавита ");

            Scanner in = new Scanner(System.in);
            num = in.nextInt();

            Game game = null;

            switch (num){
                case 1:game = new NumberGame();
                    break;
                case 2:game = new RussianСomposition();
                    break;
                case 3:game = new EnglishСomposition();
                    break;
                default:
                    System.out.println("Неверный вариант ввода");
                    System.exit(0);
            }

            System.out.println("Задано трехзначное значение.Ходов дается 15" );
            System.out.println("\n");
            System.out.print("Если угадано верное значение с  ПОЗИЦИЕЙ-бот скажет,что найден бык" );
            System.out.println("\n");
            System.out.print("Если угадано верное ЗНАЧЕНИЕ  -бот скажет,что найдена корова" );
            System.out.println("\n");

            game.start(3,15);

            while (game.getGameStatus().equals(GameStatus.START)){
                System.out.print("Ваш ход :   ");
                String answer = in.next();
                Answer answerGame = game.inputAnswer(answer);
                System.out.println(String.format("Найдено %d коров и %d быков",answerGame.getCows(),answerGame.getBulls()));
            }

            if (game.getGameStatus().equals(game.getGameWin())){
                System.out.println("Вы выграли . ");
            }
            else {
                System.out.println("Вы проиграли .");
            }

            System.out.print("Вывести историю ходов (1 - да, 2- нет) -> ");
            num = in.nextInt();
            if (num == 1) {
                int step = 1;
                for (String historyStep: game.getHistory()){
                    System.out.println("Шаг " + step + "  игрок выбрал  " + historyStep);
                    step++;
                }
            }
            else if (num == 2){
                System.out.println("Спасибо за игру!");
            }
            else {
                System.out.println("Неверный вариант ввода");
                System.out.println("Спасибо за игру!");

            }

        }
    }
}