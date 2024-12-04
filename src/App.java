import java.util.Stack;
import Materia.Models.Stack.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("");
        runStack();
    }

    public static void runStack(){
        Stack stacks = new Stack();

        stacks.push(5);
        stacks.push(7);
        stacks.push(10);
        stacks.push(20);

        System.out.println("Cima      ->"+stacks.peek());
        System.out.println("Retirar   ->"+stacks.pop());
        System.out.println("Cima      ->"+stacks.peek());
        System.out.println("Retirar   ->"+stacks.pop());
        System.out.println("Cima      ->"+stacks.peek());
    }
}
