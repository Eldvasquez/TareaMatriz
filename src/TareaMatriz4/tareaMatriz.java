package TareaMatriz4;
import java.util.Scanner;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class tareaMatriz {

	 
	 // Jorge Ivan Vasquez Sosa (0901-16-4067)
	 // 16-02-2019
	  // Una matriz que calcula el sueldo liquido ,isr,igss.
	
	
	 
	public static String Matriz[][]= new String [10][7];
	public static float Departamento[]= new float [5];
	public static Scanner entrada= new Scanner (System.in);
	public static DecimalFormat dc= new DecimalFormat("#.00");
	public static String deducciones,percepciones,departamento,sueldoBase,Sisr;
	public static int opcion, ded,perc,dep=0,sB;
	public static float isr=0,sueldoLiquido=0,total;
	
	public static int NoDepartamento(int i) {
		dep=(int)(1+(Math.random()*5));
		return dep;
	}
	
	public static void DatosMatriz() {
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
			if(sB>=2500 && sB<=5000) {
				isr=(float) ((sB) * 0.03);
				Matriz[i][4]=String.valueOf(dc.format(isr));
			}else if (sB>=5001 && sB<=10000) {
				isr=(float) ((sB) * 0.05);
						Matriz[i][4]=String.valueOf(dc.format(isr));
			}else if (sB>=10000 && sB<=100000) {
				isr=(float) ((sB) * 0.10);
						Matriz[i][4]=String.valueOf(dc.format(isr));
			}
			//
			sueldoLiquido=sB-ded+perc-isr;
			Matriz[i][5]=String.valueOf(dc.format(sueldoLiquido));
			//
			Matriz[i][6]=Integer.toString(NoDepartamento(dep));
			
		}
	}
	
	public static void MostrarDepartamento() {
	      for(int i = 0; i<10;i++)
	      { 
	    	  total = Float.parseFloat(Matriz[i][5]);
	      if(Matriz[i][6].equals("1"))
	      {
	    	  Departamento[0] = Departamento[0] + total;
	      }
	      if(Matriz[i][6].equals("2"))
	      {
	    	  Departamento[1] = Departamento[1] + total;
	      }
	       if(Matriz[i][6].equals("3"))
	      {
	    	   Departamento[2] = Departamento[2] + total;
	      }
	      if(Matriz[i][6].equals("4"))
	      {
	    	  Departamento[3] = Departamento[3] + total;
	      }
	      if(Matriz[i][6].equals("5"))
	      {
	    	  Departamento[4] = Departamento[4] + total;
	      }
	     
	      }
	      System.out.println("\n ");
			
	      System.out.println("_________________________");
	       for(int i = 0;i<=4;i++)
	       {
	    	  
	           System.out.println("|Departamento "+(i+1)+": "+Departamento[i]+"|");  
	       }
	       System.out.print("_________________________");
	}
	
	public static void MostrarMatriz() {
		System.out.println(" --------------------------------------------------------------------------------------------------------------");
		System.out.println("|Nombres------Sueldo Base------Deducciones------Percepciones------ISR------Sueldo Liquido------No Departamento|\n");
		
		for(int j=0;j<10;j++) {
			System.out.println("|"+Matriz[j][0]+"\t\t"+Matriz[j][1]+"\t\t"+Matriz[j][2]+"\t\t"+Matriz[j][3]+"\t\t"+Matriz[j][4]+"\t\t"+Matriz[j][5]+"\t\t\t"+Matriz[j][6]+"   |");
		System.out.println(" --------------------------------------------------------------------------------------------------------------");
	}
	}
	public static void main(String[] args) {
		
		
		DatosMatriz();
		MostrarMatriz();
		MostrarDepartamento();
			
			
			
			
			
			
			
			   
			
		
	}	
		
	}	
		
	
