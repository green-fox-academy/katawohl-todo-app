package todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ArgumentHandler {

  String[] args;

  public ArgumentHandler(String[] args) {
    this.args = args;
  }

  public void argHandler() throws IOException {
    if (args.length == 0) {
      System.out.println();
      System.out.println("Command Line Todo application");
      System.out.println("=============================");
      System.out.println();
      System.out.println("Command line arguments:");
      System.out.println("    -l   Lists all the tasks");
      System.out.println("    -a   Adds a new task");
      System.out.println("    -r   Removes an task");
      System.out.println("    -c   Completes an task");
    }
    if (args[0].equals("-l")) {
      int counter = 1;
      Path filePath = Paths.get("assets/todo-list.txt");
      List<String> lines = Files.readAllLines(filePath);
      for (String line: lines) {
        System.out.println(counter + " - " + line);
        counter++;
      }
    }
  }
}