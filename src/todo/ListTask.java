package todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ListTask {

  public void listTask() throws IOException {
    int counter = 1;
    Path filePath = Paths.get("assets/todo-list.txt");
    List<String> lines = Files.readAllLines(filePath);
    for (String line: lines) {
      System.out.println(counter + " - " + line);
      counter++;
    }
  }
}
