package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entidade.barra;

public class Trelica {

	public static void main(String[] args) {
		
		//Inicial program 
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			List<barra> list = new ArrayList<>();
			
			System.out.println("Quantas barras tem a treliça? ");
			int n = sc.nextInt();
			
			for (int i=1; i<=n; i++) {
				System.out.println();
				System.out.println("Barra #" + i + ": ");
				int nome = i;
				System.out.print("Primeiro nó: ");
				int no1 = sc.nextInt();
			
				System.out.print("Coordenada x: ");
				double x1 = sc.nextDouble();
				System.out.print("Coordenada y: ");
				double y1 = sc.nextDouble();
				
				System.out.println();
				System.out.print("Segundo nó: ");
				int no2 = sc.nextInt();
				
				System.out.print("Coordenada x: ");
				double x2 = sc.nextDouble();
				System.out.print("Coordenada y: ");
				double y2 = sc.nextDouble();
				
				list.add(new barra(nome, no1, no2, x1, x2, y1, y2));
			}
		
				System.out.println();
				System.out.println("Modelagem da treliça: ");
				for (barra br: list) {
					System.out.println("Barra " + 
										br.getNome() + ": ---> " +
										"[Nó " + br.getNo1() + 
										":, coordenadas " + "(" + br.getX1() + " ," + br.getY1() + ")] " +
										"[Nó " + br.getNo2() + ":, coordenadas " + "(" + br.getX2() + " ," + br.getY2() + ")] " +	
										"---> comprimento da barra = " + String.format("%.2f", br.comprimento()) + " metros" +
										"---> Angulo = " + String.format("%.0f", br.angulo()) + " graus");
		}								
			sc.close();
	}

}
