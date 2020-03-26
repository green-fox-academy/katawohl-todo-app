package todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Lister {
  private String path;

  public Lister() {
    this.path = null;
  }

  public Lister(String path) {
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
      for (int i = 0; i < lines.size(); i++) {
        if (!lines.get(i).contains("[x]")) {
          String uncheckedLine = "[ ] " + lines.get(i);
          lines.set(i, uncheckedLine);
        }
        if (lines.get(i).contains("[x]")) {
          continue;
        }
        Files.write(Paths.get(path), lines);
      }
      int counter = 1;
      for (String line : lines) {
        System.out.println(counter + " -  " + line);
        counter++;
      }

    }
  }
}
