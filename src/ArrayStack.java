public class ArrayStack extends GenericMethods<Integer> {

    int top, length;
    Integer[] integers;

    GenericMethods<String> array;

    ArrayStack(int length) {
        super(Integer[].class, length);
        GenericMethods<Integer> array = new GenericMethods<Integer>(Integer[].class, length);
        this.top = -1;
        this.length = length;
        integers = array.ofType;
    }

    public void add(int integer) {
        if (!isFull(getTop(), getLength())) {
            top++;
            integers[top] = integer;
            System.out.println("String '" + integer + "' was added!");
        } else {
            System.exit(0);
        }
    }

    public boolean remove() {
        if (!isEmpty(getTop())) {
            System.exit(0);
            return false;
        } else {
            int aux = integers[top];
            integers[top] = integers[0];
            top--;
            System.out.println("String " + integers[0] + " was removed!");
            return true;
        }
    }

    public void print() {
        for (int i = 0; i < getIntegers().length; i++) {
            if (integers[i] != null) {
                System.out.println(integers[i]);
            }
        }
    }

    public void invertPosition() {
        for (int i = 0; i < integers.length / 2; i++) {
            Integer temp = integers[i];
            integers[i] = integers[integers.length - 1 - i];
            integers[integers.length - 1 - i] = temp;
            if(temp != null) {
                System.out.println(temp);
            }
        }
    }


    public Integer[] getIntegers() {
        return integers;
    }

    public void setIntegers(Integer[] integers) {
        this.integers = integers;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getLength() {
        setLength(length + 1);
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}

