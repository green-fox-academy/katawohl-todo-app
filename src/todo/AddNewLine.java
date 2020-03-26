package todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class AddNewLine {
  String path;

  public AddNewLine(String path) {
    this.path = path;
  }

  public void addingNewLine(String newline) throws IOException {
    List<String> lines = Files.readAllLines(Paths.get(path));
    lines.add(newline);
    Files.write(Paths.get(path), lines);
  }
}
