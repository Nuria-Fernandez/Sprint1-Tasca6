package N2exercici2;

public class GenericMethods {

    public static <T> void metodoGenerico(T...args) {
        for (T t : args) {
            System.out.println(t);
        }
    }
}
