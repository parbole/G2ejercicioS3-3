 import java.util.Scanner;

public class G2ejercicioS3_3{
    public static void main(String[] args) {
        int empleados, contador, numeroEmpleado;
        double sueldos[], porcentajeComision, sueldoFinal, totalSueldos, totalComisiones;
        
        empleados = 0;
        contador = 0;
        numeroEmpleado = 1;
        totalSueldos = 0;
        totalComisiones = 0;
        
        
        System.out.print("Programa para Calcular la nomina" + "\n" + "Digite la cantidad de empleados"+ "\n\n");
        
        Scanner teclado = new Scanner(System.in);
        empleados = teclado.nextInt();
        
        sueldos = new double[empleados];
        
        for(int i=0; i < sueldos.length; i++) {
            
            System.out.print("Ingrese el sueldo base del empleado No." + numeroEmpleado + "\n");
            sueldos[i] = teclado.nextDouble();
            numeroEmpleado = numeroEmpleado + 1;
            
        }
        
        numeroEmpleado = 1;
        
        for(int i=0;i<sueldos.length;i++){
            porcentajeComision = (10.0 / 100.0) * sueldos[i];
            sueldoFinal = sueldos[i] + porcentajeComision;
            
            System.out.println("El sueldo del empleado No. : "+ numeroEmpleado + " con su comisión es $" + sueldoFinal + "\n");
            
            totalSueldos = totalSueldos + sueldos[i];
            totalComisiones = totalComisiones + porcentajeComision;
            
            numeroEmpleado = numeroEmpleado + 1;
        }
        
        System.out.println("El valor total a pagar por los sueldos es de  $"+ totalSueldos + "\n");
        System.out.println("El valor total a pagar en comisiones es de  $"+ totalComisiones + "\n");
                 
    
        
        
        
    }
}