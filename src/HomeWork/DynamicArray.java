package HomeWork;

public class DynamicArray {
    private Object[] values;
    private int size;

    public void add(Object value) {
        resizeIfNeeded();
        values[size++] = value;
    }

    public void set(Object value, int position) {
        if (position < 0 || position >= size) {
            System.err.println("IllegalArgument: positiom =" + position);
            return;
        }
        values[position] = value;
    }


    private static void resizeIfNeeded() {
    }
}
