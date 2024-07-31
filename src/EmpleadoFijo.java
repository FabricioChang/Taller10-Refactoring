

public class EmpleadoFijo extends Empleado {
    private double bonoAnual;
    private String genero;

    public EmpleadoFijo(String nombre, double salarioBase, int horasTrabajadas, Departamento departamento, double bonoAnual, String genero) {
        super(nombre, salarioBase, horasTrabajadas, departamento,genero);
        this.bonoAnual = bonoAnual;
    }

    public void imprimirDetalles() {
        imprimirDetallesBase();
        System.out.println("Genero: " + this.genero);
        System.out.println("bonoAnual: " + bonoAnual);
    }

    // Más metodos
}
