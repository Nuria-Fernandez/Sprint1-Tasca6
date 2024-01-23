package N2exercici2;

public class GenericMethods {
    @SafeVarargs

    public static <T> void metodoGenerico(T...args) {
        for (T t : args) {
            System.out.println(t);
        }
    }
}
