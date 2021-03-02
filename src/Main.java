import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(40);
        ArrayStack arrayStack = new ArrayStack(40);
        Validator validator =  new Validator();

        arrayQueue.add("A fila está adicionando!");

        arrayStack.add(4);
        arrayStack.add(2);
        arrayStack.add(65);
        arrayStack.add(53);
        arrayStack.add(3243);
        arrayStack.add(766);

        arrayStack.invertPosition();
        arrayStack.print();

        char[] validatorTeste1 = "((X+Y))".toCharArray();
        int i = validatorTeste1.length;

        if(validator.validateParenthesis(validatorTeste1, i)) {
            System.out.println("A expressão é válida!");
        } else {
            System.out.println("A expressão não é valida!");
        }


    }
}
