import java.util.*;

class Animal {
    private String nombre;
    private String tipo;
    private String genero;

    public Animal(String nombre, String tipo, String genero) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.genero = genero;
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    @Override
    public String toString() {
        return nombre;
    }
}

public class Principal {
    private Map<String, List<Animal>> clasificacion;
    private List<Animal> animales;

    public Principal() {
        clasificacion = new TreeMap<>();
        animales = new ArrayList<>();
    }

    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Ingrese el nombre del animal: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el tipo (terrestre/aéreo/acuático): ");
            String tipo = scanner.nextLine().toLowerCase();

            System.out.print("Ingrese el género (masculino/femenino): ");
            String genero = scanner.nextLine();

            Animal animal = new Animal(nombre, tipo, genero);
            animales.add(animal);

            clasificacion.computeIfAbsent(tipo, k -> new ArrayList<>()).add(animal);

            System.out.print("¿Desea ingresar otro animal? (s/n): ");
            continuar = scanner.nextLine();
        } while (continuar.equalsIgnoreCase("s"));

        mostrarClasificacion();
    }

    private void mostrarClasificacion() {
        for (Map.Entry<String, List<Animal>> entry : clasificacion.entrySet()) {
            System.out.println(capitalizarPrimeraLetra(entry.getKey()) + "s:");
            for (Animal animal : entry.getValue()) {
                System.out.println("    " + animal);
            }
            System.out.println();
        }
    }

    private String capitalizarPrimeraLetra(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static void main(String[] args) {
        new Principal().ejecutar();
    }
}
