package N2exercici2;
import N1exercici2.Persona;

public class Main {
    public static void main(String[] args){
        GenericMethods.metodoGenerico("Amanda", 34.5, 'J', false);
        GenericMethods.metodoGenerico(78, new Persona("Raquel", "Gómez", 87));
    }
}
