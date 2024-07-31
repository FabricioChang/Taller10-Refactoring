public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        DepartamentoSistemas sistemas = new DepartamentoSistemas();
        DepartamentoCont contabilidad = new DepartamentoCont();
        EmpleadoPorHoras emp1 = new EmpleadoPorHoras("Dario Laborde", 45, 15, sistemas, "Masculino");
        
        EmpleadoFijo emp2 = new EmpleadoFijo("Jorge Gaibor",700,45,contabilidad,40, "Masculino");
        EmpleadoTemporario emp3 = new EmpleadoTemporario("Jordan Salinas",200,20,sistemas,6, "Masculino");

        empresa.contratarEmpleado(emp1);
        empresa.contratarEmpleado(emp2);
        empresa.contratarEmpleado(emp3);

        emp1.imprimirDetalles();
        emp2.imprimirDetalles();
        emp3.imprimirDetalles();
    }
}