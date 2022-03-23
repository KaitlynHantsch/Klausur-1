import java.util.Scanner;

class Grundrechenarten {
    public static void main(String[] args){
      String quit = "n";
      Scanner sc = new Scanner(System.in);
      while(quit.equals("n")){
        System.out.println("Geben Sie den ersten Operanden ein...");
        int operandEins = sc.nextInt();
        System.out.println("Geben Sie den zweiten Operanden ein...");
        int operandZwei = sc.nextInt();
        System.out.println("Geben Sie den Operator ein...");
        String operator = sc.next();
        int r = 0;

        switch(operator) {
            case "+":
              r = operandEins + operandZwei;
              break;
            case "-":
              r = operandEins - operandZwei;
              break;
            case "*":
              r = operandEins * operandZwei;
              break;
            case "/":
              r = operandEins / operandZwei;
              break;
            default:
                     ;
            break;
        }
        System.out.println(r);
        System.out.println("Soll das Programm beendet werden?");
        quit = sc.next();
      }
      sc.close();
    }
}