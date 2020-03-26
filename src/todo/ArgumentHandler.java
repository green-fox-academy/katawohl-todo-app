package todo;

import java.io.IOException;

public class ArgumentHandler {

  String[] args;

  public ArgumentHandler(String[] args) {
    this.args = args;
  }

  String path = "assets/todo-list.txt";

  Printer printer = new Printer();
  Lister lister = new Lister(path);
  NewLineAdder lineAdder = new NewLineAdder(path);
  LineRemover lineRemover = new LineRemover(path);

  public void argHandler() throws IOException {
    if (args.length == 0) {
      printer.printUsage();
    } else if (args[0].equals("-l")) {
      lister.listTask();
    } else if (args[0].equals("-a")) {
      lineAdder.addingNewLine("");
    } else if (args[0].equals("-r")) {
      if (args.length == 1) {
        System.out.println("Invalid argument. Remove must specify the number of  line to remove");
      } else if (args.length > 1) {
        lineRemover.removeLine(args);
      }
    }
  }


}