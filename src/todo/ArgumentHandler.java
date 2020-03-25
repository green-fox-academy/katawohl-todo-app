package todo;

public class ArgumentHandler {

  String[] args;

  public ArgumentHandler(String[] args) {
    this.args = args;
  }

  public void argHandler() {
    if (args.length == 0) {
      System.out.println();
      System.out.println("Command Line Todo application");
      System.out.println("=============================");
      System.out.println();
      System.out.println("Command line arguments:");
      System.out.println("    -l   Lists all the tasks");
      System.out.println("    -a   Adds a new task");
      System.out.println("    -r   Removes an task");
      System.out.println("    -c   Completes an task");
    }
  }
}






