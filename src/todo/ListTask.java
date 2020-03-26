package todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ListTask {
  String path;

  public ListTask(String path) {
    this.path = path;
  }

  public void listTask() throws IOException {
    int counter = 1;
    List<String> lines = Files.readAllLines(Paths.get(this.path));
    for (String line : lines) {
      System.out.println(counter + " - " + line);
      counter++;
    }
  }
}
