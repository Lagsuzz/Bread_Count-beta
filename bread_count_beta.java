import java.util.ArrayList;
import java.util.Scanner;
public class bread_count_beta {
        public static void main(String[] args) {
            ArrayList <Integer> ingreso = new ArrayList <>();
            ArrayList <String> inventario = new ArrayList <>();
            ArrayList <Integer> gasto = new ArrayList <>();
            ArrayList <Integer> venta = new ArrayList <>();
            char regresar = 's'; 
            int cantidad = 0;
            int teclado = 0;
            String palabra = "  ";
            Scanner letritas = new Scanner (System.in);
            while(regresar == 's'){
            System.out.println("Que opcion desea elegir");
            System.out.println("-------------------");
            System.out.println("1 REGISTRO DE TRANSACCIONES ");
            System.out.println( "2 CONTROL DE INVENTARIO ");    
            System.out.println("3 VENTAS DIARIAS ");
            System.out.println("4 ANÁLISIS DE COSTOS POR PRODUCTO ");
            System.out.println("5 SALIR ");
            System.out.println("-------------------");
            teclado =letritas.nextInt();
            if(teclado == 1){
                System.out.println("Registro de transacciones");
                System.out.println("-------------------");
                System.out.println("1 Registrar ingreso ");
                System.out.println("2 Registrar gasto ");    
                System.out.println("3 Ver transacciones registradas ");
                System.out.println("4 Regresar al menú principal ");
                System.out.println("-------------------");
                teclado = letritas.nextInt();
                if (teclado == 1) {
                        System.out.println("Ingresar ingreso");
                        teclado = letritas.nextInt();
                        ingreso.add (teclado);
                }
                else{
                    if (teclado == 2) {
                        System.out.println("Registrar gasto");
                        teclado = letritas.nextInt();
                        gasto.add(teclado);
                    }
                    else if(teclado == 3){
                            System.out.println("Ingresos");
                            System.out.println("-------------------");
                            System.out.println(ingreso);
                            System.out.println("Gastos");
                            System.out.println("-------------------");
                            System.out.println(gasto);
                        }
                }
            }
            else if (teclado == 2){
                    System.out.println("Control de inventario");
                    System.out.println("-------------------");
                    System.out.println("1 Registrar producto ");
                    System.out.println("2 Ver inventario ");    
                    System.out.println("3 Regresar al menú principal ");
                    System.out.println("-------------------");
                    teclado = letritas.nextInt();
                    if (teclado == 1) {
                        System.out.println("Registrar producto");
                        palabra = letritas.next();
                        System.out.println("Cuanta cantidad");
                        cantidad = letritas.nextInt();
                        inventario.add(palabra+"\t"+cantidad);
                    }
                    else if (teclado == 2) {
                        System.out.println("Historial");
                        System.out.println(inventario);
                    }
                }
                else if (teclado == 3 ) {
                        System.out.println("Ventas Diarias");
                        System.out.println("-------------------");
                        System.out.println("1 Registrar nueva venta ");
                        System.out.println("2 Ver resumen de ventas");    
                        System.out.println("3 Regresar al menú principal");  
                        System.out.println("-------------------");
                        teclado = letritas.nextInt();
                        if (teclado == 1) {
                            System.out.println("Registrar venta");
                            teclado = letritas.nextInt();
                            venta.add(teclado);
                        }
                        else
                            if (teclado == 2) {
                                System.out.println("Historial de ventas");
                                System.out.print(venta+"\n");
                            }
                    }
                    else if (teclado == 4) {
                            System.out.println("Análisis de costos");
                            System.out.println("-------------------");
                            System.out.println("1 Calcular costos de produccion por producto ");
                            System.out.println("2 Ver análisis de costos");    
                            System.out.println("3 Regresar al menú principal");  
                            System.out.println("-------------------");
                            teclado = letritas.nextInt();
                            if (teclado == 1) {
                                
                            }
                        }
                        else if (teclado == 5) {
                                regresar = 'n';
                            }
            }        
        }
}
