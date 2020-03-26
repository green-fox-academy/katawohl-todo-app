package todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class NewLineAdder {
  private String path;

  public NewLineAdder(String path) {
    this.path = path;
  }

  Lister lister = new Lister();

  public void addingNewLine(String newline) throws IOException {
    if (newline.isEmpty()){
      System.out.println("No todos for today! :)");
    }
    else {
      List<String> lines = Files.readAllLines(Paths.get(path));
      lines.add(newline);
      Files.write(Paths.get(path), lines);
      lister.listTask(path);
    }
  }
}
  //region addNewLine function with error message in dialog box
  /*public void addingNewLine(String newline) throws IOException {
    if (newline.isEmpty()){JOptionPane.showMessageDialog(null, "Unable to add: no task provided",
        "Sorry!", JOptionPane.ERROR_MESSAGE);
    }
    else {
      List<String> lines = Files.readAllLines(Paths.get(path));
      lines.add(newline);
      Files.write(Paths.get(path), lines);
      listTask.listTask(path);
    }
  }*/
  //endregion
