package arreglos;

// Importar la libreria Java.util con la que se puede utilizar Scanner
import java.util.*;

public class Arreglos {

    public static void main(String[] args) {
        // 1. definir dos arreglos unidimensionales que permitan almacenar 
        //    7 números ingresados por el usuario.
        
        //Permite capturar los valores ingresados por consola
        Scanner sc = new Scanner(System.in);
        
        //Definicion de tipo y nombre de variables
        int i, valor, sumArray1=0, sumArray2=0;
        double promedio;
        
        
        // Definicion de los 2 arreglos Unidimensionales        
        int [] array1 = new int[7];        
        int [] array2 = new int[7];        
        
        
        // Mediante un ciclo for pedimos los datos para llenar el arreglo 1 y el arreglo 2
        // mediante la consola

        //array1
        System.out.print("Ingrese los " + array1.length + " valores del Primer arreglo \n");
        for(i = 0; i< array1.length; i++){
            
            System.out.print("Valor " + (i+1) +":") ;
            //Captura los datos ingresados por consola
            valor = sc.nextInt();
           
            //asigna al arreglo el valor capturado, en la posicion i de la iteracion del ciclo for
            array1[i] = valor;
        }
        
        //array2
        System.out.print("Ingrese los " + array2.length + " valores del Segundo arreglo \n");
        for(i = 0; i< array1.length; i++){
            
            System.out.print("Valor " + (i+1) +":") ;
            valor = sc.nextInt();
           
            array2[i] = valor;
        }       
        
        // 2. LLenar un tercer arreglo con la diferencia de los dos primeros
        //    arreglos. Mostrar el promedio de todos los datos.
        
        //Definimos el arreglo 3
        int [] array3 = new int[7];
        
        //Para llenar el arreglo 3 con la diferencia del arreglo 1 y 2
        // se utiliza otro ciclo for para recorrer los array y asignar el valor 
        // al arreglo 3
        for(i = 0; i<array3.length; i++){    
            
            // A la variable "diferencia" le asignamos la diferencia del array1 y el array2
            int diferencia = array1[i] - array2[i];       
            
            // a array3 le asignamos el valor de la variable diferencia
            // en la iteracion i del ciclo for
            array3[i]=diferencia;            
        }
        
        // Sumamos todos los datos de cada posicion en el array1 y lo asignamos 
        // a la variable sumArray1
        for(i = 0; i<array1.length; i++){  
            sumArray1 = sumArray1 + array1[i];            
        }
        
        // Sumamos todos los datos de cada posicion en el array2 y lo asignamos 
        // a la variable sumArray2
        for(i = 0; i<array2.length; i++){   
            sumArray2 = sumArray2 + array2[i];            
        }
        
        // A la variable "promedio" le asignamos la variable "sumArray1" y "sumArray1", se suman
        // y luego se dividen por la cantidad de datos, para obtener el promedio
        
        // la cantidad de datos se obtiene sumando array1.length y array2.length
        promedio = (sumArray1 +  sumArray2) / (array1.length + array2.length);
        
        //Se imprime la variable "promedio"
        System.out.print("El promedio de todos los datos ingresados es: " + promedio + "\n");
        
        // 3. Mostrar todos y cada uno de los datos del tercer arreglo.
        
        
        //Utilizamos el ciclo for para recorrer todo el arreglo "array3"
        //e imprimir el valor de i en cada iteracion.
        System.out.print("Datos del Tercer arreglo: \n");
        for(i = 0; i<array3.length; i++){   
            
            System.out.print(array3[i] + ", ");
        }
        
    }
    
}
