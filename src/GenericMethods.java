import java.lang.reflect.Array;

public class GenericMethods<T> {

    T[] ofType;

    public GenericMethods(Class<T[]> classType, int size) {
        ofType = classType.cast(Array.newInstance(classType.getComponentType(), size));
    }

    public boolean isFull(int size, int length) {
        if (size == length) {
            System.out.println("List is full!");
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty(int length) {
        if (length == 0) {
            System.out.println("List is empty!");
            return true;
        } else {
            return false;
        }
    }
}
