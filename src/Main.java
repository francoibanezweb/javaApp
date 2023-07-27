import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Automovil auto1 = new Automovil();
        Automovil auto2 = new Automovil("Renault", "Sandero",
                1996);
        String marcaNueva;

        System.out.println("Auto1, marca: " + auto1.getMarca());
        System.out.println("Auto1, Año: " + auto1.getAnioFrabricacion());
        System.out.println("\n");
        System.out.println("Auto2, marca: " + auto2.getMarca());
        System.out.println("Auto2, modelo: " + auto2.getModelo());
        System.out.println("Auto2, Año: " + auto2.getAnioFrabricacion());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese marca nueva Auto2: ");
        marcaNueva = scanner.nextLine();

        auto2.setMarca(marcaNueva);

        System.out.println("La marca nueva de Auto2 es: " + marcaNueva);
    }
}
