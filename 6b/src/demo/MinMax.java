package demo;
import java.util.Arrays;
import java.util.Comparator;


interface MinMax<T> {
    T min(T[] array);
    T max(T[] array);
}


class ArrayMinMax<T> implements MinMax<T> {
    private Comparator<? super T> comparator;

    public ArrayMinMax(Comparator<? super T> comparator) {
        this.comparator = comparator;
    }

  
    public T min(T[] array) {
        return Arrays.stream(array).min(comparator).orElse(null);
    }


    public T max(T[] array) {
        return Arrays.stream(array).max(comparator).orElse(null);
    }
}

