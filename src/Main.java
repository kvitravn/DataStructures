public class Main {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(40);
        ArrayStack arrayStack = new ArrayStack(40);
        Validator validator = new Validator();

        arrayQueue.add("A fila está adicionando!");

        arrayStack.add("4");
        arrayStack.add("2");
        arrayStack.add("65");
        arrayStack.add("53");
        arrayStack.add("3243");
        arrayStack.add("766");

        arrayStack.invertPosition();
        arrayStack.print();

        String expressao = "((X+Y)";
        String expressao2 = "((X+Y))";

        System.out.println(validator.validarParenteses(expressao));
        System.out.println(validator.validarParenteses(expressao2));


    }


}

