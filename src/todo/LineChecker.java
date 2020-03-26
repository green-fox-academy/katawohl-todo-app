package todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LineChecker {
  private String path;

  public LineChecker(String path){
    this.path = path;
  }

  Lister lister = new Lister();

  public void checkLine(String[] args) throws IOException {
    int lineToCheck = Integer.parseInt(args[1]) - 1;
    if (args.length >= lineToCheck) {
      List<String> checkedLines = Files.readAllLines(Paths.get(path));
      String checkedLine = "[x] " + checkedLines.get(lineToCheck);
      checkedLines.set(lineToCheck, checkedLine);
      Files.write(Paths.get(path), checkedLines);
    }else {
      System.out.println("There aren't as many todos, phew!");
    }
    lister.listTask(path);
  }

}
