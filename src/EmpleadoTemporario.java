public class EmpleadoTemporario extends Empleado {
    private String nombre;
    private double salarioBase;
    private int horasTrabajadas;
    private Departamento departamento;
    private int mesesContrato;
    private String genero;

    public EmpleadoTemporario(String nombre, double salarioBase, int horasTrabajadas, Departamento departamento, int mesesContrato, String genero) {
        super(nombre, salarioBase, horasTrabajadas, departamento,genero);
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
        this.mesesContrato = mesesContrato;
        this.genero = genero;
    }

    public void imprimirDetalles() {
        imprimirDetallesBase();
        System.out.println("Meses de contrato: " + mesesContrato);
        System.out.println("Genero: " + this.genero);
    }

    // Más metodos
}
