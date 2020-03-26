package todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ArgumentHandler {

  String[] args;

  public ArgumentHandler(String[] args) {
    this.args = args;
  }

  String path = "assets/todo-list.txt";

  UsagePrinter usagePrinter = new UsagePrinter();
  Lister lister = new Lister(path);
  NewLineAdder lineAdder = new NewLineAdder(path);
  LineRemover lineRemover = new LineRemover(path);
  LineChecker lineChecker = new todo.LineChecker(path);

  public void argHandler() throws IOException {
    if (args.length == 0) {
      usagePrinter.printUsage();
    } else if (args[0].equals("-l")) {
      lister.listTask();
    } else if (args[0].equals("-a")) {
      lineAdder.addingNewLine("");
    } else if (args[0].equals("-r")) {
      if (args.length == 1) {
        System.out.println("Invalid argument. Must specify the number of line to remove");
      } else if (args.length > 1) {
        lineRemover.removeLine(args);
      }
    } else if (args[0].equals("-c")) {
      if (args.length == 1) {
        System.out.println("Invalid argument. Must specify the number of line to check");
      } else if (args.length > 1) {
        lineChecker.checkLine(args);
      }
    }
  }


}