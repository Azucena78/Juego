package juego;

import java.util.Scanner;

public class PiedraPapelTijera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		System.err.println("Juego piedra-papel-tijera");
		
		int seleccionCompu = (int)(Math.random()*3) + 1;
		do {
		System.out.println("La computadora ya escogió...");
		
		System.out.print("Indique su selección [1=Piedra, 2=Papel, 3=Tijera] >> ");
		int seleccionUsuario = scn.nextInt();
		
		System.out.println("La computadora ya a eligido >> ");
		 
		switch (seleccionCompu) {
		case 1:
			System.out.println("Piedra");
			switch (seleccionUsuario)
		{
			case 1: System.err.println("Empate!"); break;
			case 2: System.err.println("Has ganado!"); break;
			case 3: System.err.println("La computadora gana!"); break;
			
		}
			break;
		case 2:
			System.out.println("Papel");
			switch (seleccionUsuario)
			{
			case 1: System.err.println("La computadora gana!"); break;
			case 2: System.err.println("Empate!"); break;
			case 3: System.err.println("Has ganado!"); break;
			
			}
			break;
		case 3:
			System.out.println("Tijera");
			switch (seleccionUsuario)
			{
			case 1: System.err.println("Has ganado!"); break;
			case 2: System.err.println("La computadora gana!"); break;
			case 3: System.err.println("Empate!"); break;
			
			}
			break;
		}
		
	 }
		while (seleccionCompu!=3);
      }	
	
}

