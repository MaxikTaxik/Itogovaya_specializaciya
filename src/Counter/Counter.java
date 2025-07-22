package Counter;

// Counter.java
public class Counter implements AutoCloseable {
    private int count = 0;
    private boolean isOpen = false;

    public Counter() {
        isOpen = true;
    }

    public void add() {
        if (!isOpen) {
            throw new IllegalStateException("Счетчик должен быть открыт");
        }
        count++;
    }

    @Override
    public void close() {
        isOpen = false;
    }

    public int getCount() {
        return count;
    }
}
