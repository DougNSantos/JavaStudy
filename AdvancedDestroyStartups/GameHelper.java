package AdvancedDestroyStartups;
//classe baixada dos recursos do livro JAVA da O'Reilly

import java.util.Scanner;

public class GameHelper {
  public int getUserInput(String prompt) {
    System.out.print(prompt + ": ");
    Scanner scanner = new Scanner(System.in);
    return scanner.nextInt();
  }
}
