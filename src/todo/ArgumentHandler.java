package todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ArgumentHandler {

  String[] args;

  public ArgumentHandler(String[] args) {
    this.args = args;
  }

  String path = "assets/todo-list.txt";

  PrintUsage printUsage = new PrintUsage();
  ListTask listTask = new ListTask(path);
  AddNewLine addNewLine = new AddNewLine(path);

  public void argHandler() throws IOException {
    if (args.length == 0) {
      printUsage.printUsage();
    } else if (args[0].equals("-l")) {
      listTask.listTask();
    } else if (args[0].equals("-a")) {
      addNewLine.addingNewLine("Drink gin and tonic");
      listTask.listTask();
    }
  }


}