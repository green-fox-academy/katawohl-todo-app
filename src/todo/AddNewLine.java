package todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import javax.swing.JOptionPane;

public class AddNewLine {
  private String path;

  public AddNewLine(String path) {
    this.path = path;
  }

  ListTask listTask = new ListTask();

  public void addingNewLine(String newline) throws IOException {
    if (newline.isEmpty()){
      System.out.println("No todos for today! :)");
    }
    else {
      List<String> lines = Files.readAllLines(Paths.get(path));
      lines.add(newline);
      Files.write(Paths.get(path), lines);
      listTask.listTask(path);
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
