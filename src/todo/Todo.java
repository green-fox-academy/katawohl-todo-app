package todo;

import java.io.IOException;

public class Todo {
  public static void main(String[] args) {
    ArgumentHandler argumentHandler = new ArgumentHandler(args);
    try {
      argumentHandler.argHandler();
    } catch (IOException e) {
      System.out.println("ToDo text file list does not exist.");
    }
  }
}