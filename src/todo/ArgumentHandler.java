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
  RemoveLine removeLine = new RemoveLine(path);

  public void argHandler() throws IOException {
    if (args.length == 0) {
      printUsage.printUsage();
    } else if (args[0].equals("-l")) {
      listTask.listTask();
    } else if (args[0].equals("-a")) {
      addNewLine.addingNewLine("");
    } else if (args[0].equals("-r")) {
      if (args.length == 1) {
        System.out.println("Invalid argument. Remove must specify the number of  line to remove");
      } else if (args.length > 1) {
        removeLine.removeLine(args);
      }
    }
  }


}