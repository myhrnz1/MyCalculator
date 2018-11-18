import java.util.Scanner;

public class MyCalculator {

  public void printMenu() {
    System.out.println("Choose operation");
    System.out.println("1) Addition");
    System.out.println("2) Subtraction");
    System.out.println("3) Multiplication");
    System.out.println("4) Division");
    System.out.println("Choose operation: ");
  }

  public double add(Scanner scan) {
    System.out.print("First number: ");
    double operand1 = scan.nextDouble();
    System.out.print("Second number: ");
    double operand2 = scan.nextDouble();

    double result = operand1 + operand2;
    return result;
  }

  public double sub(Scanner scan) {
    System.out.print("First number: ");
    double operand1 = scan.nextDouble();
    System.out.print("Second number: ");
    double operand2 = scan.nextDouble();

    double result = operand1 - operand2;
    return result;
  }

  public double mult(Scanner scan) {
    System.out.print("First number: ");
    double operand1 = scan.nextDouble();
    System.out.print("Second number: ");
    double operand2 = scan.nextDouble();

    double result = operand1 * operand2;
    return result;
  }

  public double div(Scanner scan) {
    System.out.print("First number: ");
    double operand1 = scan.nextDouble();
    System.out.print("Second number: ");
    double operand2 = scan.nextDouble();

    boolean check = false;
    while (!check) {
	if (operand2 == 0) {
	    System.out.print("You can't divide by zero! Try again: ");
	    operand2 = scan.nextDouble();
	} else {
	    check = true;
	}
    }
    double result = operand1 / operand2;
    return result;
  }
  
  public static void main (String[] args) {

  double result = 0;
  Scanner scan = new Scanner(System.in);
  
  MyCalculator calc = new MyCalculator();

  calc.printMenu();
  int operation = scan.nextInt();

  switch(operation) {
    case 1 : result = calc.add(scan);
      break;
    case 2 : result = calc.sub(scan);
      break;
    case 3 : result = calc.mult(scan);
      break;
    case 4 : result = calc.div(scan);
      break;
    default: System.out.println("Not a valid operation!");
      break;
    }
  System.out.println("Result: "+ result);
  }
}