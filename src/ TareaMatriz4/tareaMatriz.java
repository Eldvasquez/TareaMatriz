package TareaMatriz4;
import java.util.Scanner;
import javax.swing.JOptionPane;
{/ **
 *
 * Jorge Ivan Vasquez Sosa (0901-16-4067)
 * 04-02-2019
 * Una matriz que calcula el sueldo liquido al azar
 * /
public class tareaMatriz 

	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		//
		int Departamento[];
		Departamento = new int[5];
		//
		String Matriz[][];
		Matriz=new String[10][6];
		//
		String deducciones,percepciones,sueldoLiquido,departamento,sueldoBase;
		int opcion, ded,perc,suelLiq=0,dep=0,sB;
		do {
			for(int i=0;i<10;i++) {
				//
				Matriz[i][0]=JOptionPane.showInputDialog(null,"Ingrese el nombre:"+(i+1));
				//
				sB=(int)(2500+(Math.random()*5000));
				sueldoBase=Integer.toString(sB);
				Matriz[i][1]=sueldoBase;
				//
				ded=(int)(1+(Math.random())*2500);
				deducciones=Integer.toString(ded);
				Matriz[i][2]=deducciones;
				//
				perc=(int) (1+(Math.random())*2500);
				percepciones=Integer.toString(perc);
				Matriz[i][3]=percepciones;
				//
				suelLiq=sB-ded+perc;
				sueldoLiquido=Integer.toString(suelLiq);
				Matriz[i][4]=sueldoLiquido;
				//
				dep=(int)(1+(Math.random()*5));
				departamento=Integer.toString(dep);
				Matriz[i][5]=departamento;
				
			}
			System.out.println(" _____________________________________________________________________________________________________");
			System.out.println("|Nombres------Sueldo Base------Deducciones------Percepciones------Sueldo Liquido------No Departamento|");
			for(int j=0;j<10;j++) {
				System.out.println("|"+Matriz[j][0]+"\t\t"+Matriz[j][1]+"\t\t"+Matriz[j][2]+"\t\t"+Matriz[j][3]+"\t\t\t"+Matriz[j][4]+"\t\t\t"+Matriz[j][5]+"|");
			System.out.println(" _____________________________________________________________________________________________________");
			}
			
			   int total;
			     
			     
			      for(int i = 0; i<10;i++)
			      { 
			    	  total = Integer.parseInt(Matriz[i][4]);
			      if(Matriz[i][5].equals("1"))
			      {
			    	  Departamento[0] = Departamento[0] + total;
			      }
			      if(Matriz[i][5].equals("2"))
			      {
			    	  Departamento[1] = Departamento[1] + total;
			      }
			       if(Matriz[i][5].equals("3"))
			      {
			    	   Departamento[2] = Departamento[2] + total;
			      }
			      if(Matriz[i][5].equals("4"))
			      {
			    	  Departamento[3] = Departamento[3] + total;
			      }
			      if(Matriz[i][5].equals("5"))
			      {
			    	  Departamento[4] = Departamento[4] + total;
			      }
			     
			      }
			       for(int i = 0;i<=4;i++)
			       {
			           System.out.println("Departamento "+(i+1)+": "+Departamento[i]);
			       }
			 System.out.println("");
			System.out.print("Desea Ingresar todo de nuevo?\n 1.si\n 2.Salir\n");
			opcion=entrada.nextInt();
		}while(opcion!=2);
		
		
		
		
	}
}
