package todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ListTask {
  private String path;

  public ListTask() {
    this.path = null;
  }

  public ListTask(String path) {
    this.path = path;
  }

  public void listTask() throws IOException {
    List<String> lines = Files.readAllLines(Paths.get(this.path));
    if (lines.isEmpty()) {
      System.out.println("No todos for today! :)");
    } else {
      int counter = 1;
      for (String line : lines) {
        System.out.println(counter + " - " + line);
        counter++;
      }
    }
  }

  public void listTask(String path) throws IOException {
    List<String> lines = Files.readAllLines(Paths.get(path));
    if (lines.isEmpty()) {
      System.out.println("No todos for today! :)");
    } else {
      int counter = 1;
      for (String line : lines) {
        System.out.println(counter + " - " + line);
        counter++;
      }
    }
  }
}
