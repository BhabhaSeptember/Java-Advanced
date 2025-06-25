package lesson09;

public interface UnaryOperator<T> extends Function<T,T> {
    @Override
    public T apply(T t);
}

