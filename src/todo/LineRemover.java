package todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LineRemover {
  private String path;

  public LineRemover(String path) {
    this.path = path;
  }

  Lister lister = new Lister();

  public void removeLine(String[] args) throws IOException {
    int lineToRemove = Integer.parseInt(args[1]) - 1;
    if (args.length >= lineToRemove) {
      List<String> allLines = Files.readAllLines(Paths.get(path));
      List<String> linesRemoved = new ArrayList<>();
      for (int i = 0; i < allLines.size(); i++) {
        if (i == lineToRemove) {
          continue;
        }
        linesRemoved.add(allLines.get(i));
      }
      Files.write(Paths.get(path), linesRemoved);
    } else {
      System.out.println("There aren't as many todos, phew!");
    }
    lister.listTask(path);
  }
}
