
package matriztarea;

import java.util.Scanner;

/**
 *
 * Jorge Ivan Vasquez Sosa (0901-16-4067)
 * 04-02-2019
 * Una matriz que calcula el sueldo liquido random
 */
public class MatrizTarea {

    
    public static void main(String[] args) {
        
       Scanner entrada =new Scanner(System.in);
		//funcion random
		int rango= 2000,rangTd=1000;
		//aqui termina
		
  // Con esto manejamos el tamaño que queremos la matris y la creamos
		String matriz[][];
		int nFilas,nColumnas;
		int matris1,matris2,matris3,sumar;
		nFilas=11;
		nColumnas= 6;
		matriz=new String[nFilas][nColumnas];
		
		// Random de los departamentos
		int rang=5,numRandon;
		int aux;
		String [] departamento = {"coban", "peten", "quiche", "izabal", "escuintla" };
		numRandon = (int) Math.round(Math.random() * 5 ) ;
		//aqui termina el random de departamentos
		System.out.print("Ingrese los 10 nombres que iran en la matriz\n");
	
        // Ingresa en la matriz los titulos del programa        
        matriz[0][0]="Nombre Empleados";
        matriz[0][1]="Sueldo base";
        matriz[0][2]="Total Deduccion";
        matriz[0][3]="Total Percepcion";
        matriz[0][4]="Sueldo liquido";
        matriz[0][5]="Departamento";
        
        //Ingresa en cada punto que le indique en la matriz el nombre y los numero aleatorios
        matriz[1][0]=entrada.nextLine();
        matriz[1][1]=(Integer.toString((int)(Math.random()*rango)));
        matriz[1][2]=Integer.toString((int)(Math.random()*rangTd));
        matriz[1][3]=Integer.toString((int)(Math.random()*rango));
        matris1=Integer.parseInt(matriz[1][1]);
        matris2=Integer.parseInt(matriz[1][2]);
        matris3=Integer.parseInt(matriz[1][3]);
        sumar= matris1-matris2+matris3;
        matriz[1][4]=Integer.toString(sumar) ;
        matriz[1][5]=(departamento[numRandon]);
        
        
        matriz[2][0]=entrada.nextLine();
        matriz[2][1]=Integer.toString( (int)(Math.random()*rango));
        matriz[2][2]= Integer.toString( (int)(Math.random()*rangTd));
        matriz[2][3]=Integer.toString( (int)(Math.random()*rango));
        matris1=Integer.parseInt(matriz[2][1]);
        matris2=Integer.parseInt(matriz[2][2]);
        matris3=Integer.parseInt(matriz[2][3]);
        sumar= matris1-matris2+matris3;
        matriz[2][4]=Integer.toString(sumar);
        matriz[2][5]=departamento[numRandon];
        
        matriz[3][0]=entrada.nextLine();
        matriz[3][1]= Integer.toString((int)(Math.random()*rango));
        matriz[3][2]= Integer.toString( (int)(Math.random()*rangTd));
        matriz[3][3]=Integer.toString( (int)(Math.random()*rango));
        matris1=Integer.parseInt(matriz[3][1]);
        matris2=Integer.parseInt(matriz[3][2]);
        matris3=Integer.parseInt(matriz[3][3]);
        sumar= matris1-matris2+matris3;
        matriz[3][4]=Integer.toString(sumar);
        matriz[3][5]=departamento[numRandon];
        
        matriz[4][0]=entrada.nextLine();
        matriz[4][1]=Integer.toString( (int)(Math.random()*rango));
        matriz[4][2]= Integer.toString( (int)(Math.random()*rangTd));
        matriz[4][3]=Integer.toString( (int)(Math.random()*rango));
        matris1=Integer.parseInt(matriz[4][1]);
        matris2=Integer.parseInt(matriz[4][2]);
        matris3=Integer.parseInt(matriz[4][3]);
        sumar= matris1-matris2+matris3;
        matriz[4][4]=Integer.toString(sumar);
        matriz[4][5]=departamento[numRandon];
        
        matriz[5][0]=entrada.nextLine();
        matriz[5][1]=Integer.toString( (int)(Math.random()*rango));
        matriz[5][2]= Integer.toString( (int)(Math.random()*rangTd));
        matriz[5][3]=Integer.toString( (int)(Math.random()*rango));
        matris1=Integer.parseInt(matriz[5][1]);
        matris2=Integer.parseInt(matriz[5][2]);
        matris3=Integer.parseInt(matriz[5][3]);
        sumar= matris1-matris2+matris3;
        matriz[5][4]=Integer.toString(sumar);
        matriz[5][5]=departamento[numRandon];
        
        matriz[6][0]=entrada.nextLine();
        matriz[6][1]=Integer.toString( (int)(Math.random()*rango));
        matriz[6][2]= Integer.toString( (int)(Math.random()*rangTd));
        matriz[6][3]=Integer.toString( (int)(Math.random()*rango));
        matris1=Integer.parseInt(matriz[6][1]);
        matris2=Integer.parseInt(matriz[6][2]);
        matris3=Integer.parseInt(matriz[6][3]);
        sumar= matris1-matris2+matris3;
        matriz[6][4]=Integer.toString(sumar);
        matriz[6][5]=departamento[numRandon];
        
        matriz[7][0]=entrada.nextLine();
        matriz[7][1]=Integer.toString( (int)(Math.random()*rango));
        matriz[7][2]= Integer.toString( (int)(Math.random()*rangTd));
        matriz[7][3]=Integer.toString( (int)(Math.random()*rango));
        matris1=Integer.parseInt(matriz[7][1]);
        matris2=Integer.parseInt(matriz[7][2]);
        matris3=Integer.parseInt(matriz[7][3]);
        sumar= matris1-matris2+matris3;
        matriz[7][4]=Integer.toString(sumar);
        matriz[7][5]=departamento[numRandon];
       
        matriz[8][0]=entrada.nextLine();
        matriz[8][1]=Integer.toString( (int)(Math.random()*rango));
        matriz[8][2]= Integer.toString( (int)(Math.random()*rangTd));
        matriz[8][3]=Integer.toString( (int)(Math.random()*rango));
        matris1=Integer.parseInt(matriz[8][1]);
        matris2=Integer.parseInt(matriz[8][2]);
        matris3=Integer.parseInt(matriz[8][3]);
        sumar= matris1-matris2+matris3;
        matriz[8][4]=Integer.toString(sumar);
        matriz[8][5]=departamento[numRandon];
        
        matriz[9][0]=entrada.nextLine();
        matriz[9][1]=Integer.toString( (int)(Math.random()*rango));
        matriz[9][2]= Integer.toString( (int)(Math.random()*rangTd));
        matriz[9][3]=Integer.toString( (int)(Math.random()*rango));
        matris1=Integer.parseInt(matriz[9][1]);
        matris2=Integer.parseInt(matriz[9][2]);
        matris3=Integer.parseInt(matriz[9][3]);
        sumar= matris1-matris2+matris3;
        matriz[9][4]=Integer.toString(sumar);
        matriz[9][5]=departamento[numRandon];
       
        matriz[10][0]=entrada.nextLine();
        matriz[10][1]=Integer.toString( (int)(Math.random()*rango));
        matriz[10][2]= Integer.toString( (int)(Math.random()*rangTd));
        matriz[10][3]=Integer.toString( (int)(Math.random()*rango));
        matris1=Integer.parseInt(matriz[10][1]);
        matris2=Integer.parseInt(matriz[10][2]);
        matris3=Integer.parseInt(matriz[10][3]);
        sumar= matris1-matris2+matris3;
        matriz[10][4]=Integer.toString(sumar);
        matriz[10][5]=departamento[numRandon];
        
       //El For que imprime la matriz en pantalla
     for(int i=0;i<nFilas;i++) {
    	 for(int j=0;j<nColumnas;j++) {
    		 System.out.print("|"+matriz[i][j]+"| ");
    	 }
    	 System.out.println("");
     }

	}
    }
    
