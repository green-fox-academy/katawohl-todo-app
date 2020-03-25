package todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ArgumentHandler {

  String[] args;

  public ArgumentHandler(String[] args) {
    this.args = args;
  }

  PrintUsage printUsage = new PrintUsage();
  ListTask listTask = new ListTask("assets/todo-list.txt");

  public void argHandler() throws IOException {
    if (args.length == 0) {
      printUsage.printUsage();
    } else if (args[0].equals("-l")){
      listTask.listTask();
    }
  }


}