package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int code;
        System.out.println("1 : Computer vs Player \n 2 : Player 1 vs Player 2");
        Scanner scan = new Scanner(System.in);
        code = scan.nextInt();
        switch (code) {
            case 1 -> {
                System.out.println("Computer vs Player");
                System.out.println("Lets Play!!! \n Lady Hunter Tiger Game");
                while (true) {
                    String[] LHT = {"L", "H", "T"};
                    String computerMove = LHT[new Random().nextInt(LHT.length)];


                    Scanner scanner = new Scanner(System.in);
                    String playerMove;


                    while (true) {
                        System.out.println("Enter Your Move (L, H, or T)");
                        playerMove = scanner.nextLine();
                        if (playerMove.equals("L") || playerMove.equals("H") || playerMove.equals("T")) {
                            break;
                        }
                        System.out.println(playerMove + "is not a valid move.");
                    }
                    System.out.println("Computer played:" + computerMove);

                    if (playerMove.equals(computerMove)) {
                        System.out.println("The game is Tie!");
                    } else if (playerMove.equals("L")) {
                        if (computerMove.equals("T")) {
                            System.out.println("You LOSE");
                        } else if (computerMove.equals("H")) {
                            System.out.println("You Win!");
                        }
                    } else if (playerMove.equals("T")) {
                        if (computerMove.equals("H")) {
                            System.out.println("You WIN!");
                        } else if (computerMove.equals("L")) {
                            System.out.println("You LOSE!");
                        }
                    } else {
                        if (computerMove.equals("T")) {
                            System.out.println("You WIN!");
                        } else if (computerMove.equals("L")) {
                            System.out.println("You LOSE!");
                        }
                    }

                    System.out.println("Play Again? (Y/N)");
                    String playAgain = scanner.nextLine();

                    if (!playAgain.equals("Y")) {
                        break;
                    }
                }
            }
            case 2 -> {
                Scanner sc= new Scanner(System.in);
                System.out.println("LADY HUNTER TIGER GAME");
                System.out.println("Player 1 input");
                String input1=sc.nextLine();
                System.out.println("Player 2 input");
                String input2=sc.nextLine();
                if(((input1.equalsIgnoreCase("Hunter"))&&(input2.equalsIgnoreCase("Lady")))||((input1.equalsIgnoreCase("Lady"))&&(input2.equalsIgnoreCase("Hunter"))))
                {
                    System.out.println("Lady wins");
                }
                else if(((input1.equalsIgnoreCase("Tiger"))&&(input2.equalsIgnoreCase("Hunter")))||((input1.equalsIgnoreCase("Hunter"))&&(input2.equalsIgnoreCase("Tiger"))))
                {
                    System.out.println("Hunter wins");
                }
                else if(((input1.equalsIgnoreCase("Lady"))&&(input2.equalsIgnoreCase("Tiger")))||((input1.equalsIgnoreCase("Tiger"))&&(input2.equalsIgnoreCase("Lady"))))
                {
                    System.out.println("Tiger wins");
                }
                else if(input1.equalsIgnoreCase(input2))
                {
                    System.out.println("Its a tie");
                }

                System.out.println("Play Again? (Y/N)");
                String playAgain = sc.nextLine();
                if (!playAgain.equals("Y")) {
                    break;
                }

            }
            default -> System.out.println("EXIT!!! ");
        }
    }
}
