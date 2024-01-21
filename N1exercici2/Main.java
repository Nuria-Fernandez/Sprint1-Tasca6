package N1exercici2;

public class Main {
    public static void main(String[] args) {
        Persona pers1 = new Persona("Gabriel", "García", 32);
        GenericMethods generico1 = new GenericMethods();
        generico1.metodoGenerico(pers1, "Les Corts", 1002);
        generico1.metodoGenerico(32.5, 879, "Sistema Digestivo");
        GenericMethods.metodoGenerico(new Persona("Lucía", "Ortiz", 45), 879.45, 'c');



        }

}
