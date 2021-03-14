import java.util.Stack;

public class ArrayStack extends GenericMethods<String> {

    int top, length;
    String[] strings;

    ArrayStack(int length) {
        super(String[].class, length);
        GenericMethods<String> array = new GenericMethods<String>(String[].class, length);
        this.top = -1;
        this.length = length;
        strings = array.ofType;
    }

    public void add(String string) {
        if (!isFull(getTop(), getLength())) {
            top++;
            strings[top] = string;
            System.out.println("String '" + string + "' was added!");
        } else {
            System.exit(0);
        }
    }

    public boolean remove() {
        if (!isEmpty(getTop())) {
            System.exit(0);
            return false;
        } else {
            String aux = strings[top];
            strings[top] = strings[0];
            top--;
            System.out.println("String " + strings[0] + " was removed!");
            return true;
        }
    }

    public void print() {
        for (int i = 0; i < getStrings().length; i++) {
            if (strings[i] != null) {
                System.out.println(strings[i]);
            }
        }
    }

    public void invertPosition() {
        for (int i = 0; i < strings.length / 2; i++) {
            String temp = strings[i];
            strings[i] = strings[strings.length - 1 - i];
            strings[strings.length - 1 - i] = temp;
            if(temp != null) {
                System.out.println(temp);
            }
        }
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String[] getStrings() {
        return strings;
    }

    public void setStrings(String[] strings) {
        this.strings = strings;
    }
}

