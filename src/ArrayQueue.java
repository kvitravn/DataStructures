public class ArrayQueue extends GenericMethods<String> {

    int size, length;
    String[] strings;

    GenericMethods<String> array;

    ArrayQueue(int size) {
        super(String[].class, size);
        GenericMethods<String> array = new GenericMethods<String>(String[].class, size);
        this.size = size;
        this.length = 0;
        strings = array.ofType;
    }

    public void add(String string) {
        if (!isFull(getSize(), getLength())) {
            strings[length] = string;
            length++;
            System.out.println("String '" + string + "' was added!");
        } else {
            System.exit(0);
        }
    }

    public boolean remove() {
        if (isEmpty(getSize())) {
            System.exit(0);
            return false;
        } else {
            strings[length] = strings[0];
            length--;
            System.out.println("String " + strings[0] + " was removed!");
            return true;
        }
    }

    public void print() {
        for (int i = 0; i < getStrings().length; i++) {
            if(strings[i] != null) {
                System.out.println(strings[i]);
            }
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
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
