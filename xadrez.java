import java.util.Scanner;
public class xadrez {

public static void main(String[] args) {	
		int linha, coluna , x , y;		
		Scanner leitor = new Scanner (System.in);
		System.out.println("Desafio do xadrez!!!");
		System.out.print("Digite a linha em que a Torre está: ");
		linha = leitor.nextInt();
		System.out.print("Digite a coluna em que a Torre está: ");
		coluna = leitor.nextInt();	
		if (linha>=1 && linha<=8 && coluna>=1 && coluna<=8) {
			System.out.println("Movimentos possiveis: ");
			System.out.println("   1  2  3  4  5  6  7  8");
			System.out.println("   ----------------------");
	for (x = 1 ; x<=8 ;x++) {
		  System.out.print(x + "|");
		  for (y = 1 ;  y <= 8 ;y++) {
			  if (linha == x || coluna == y)
				  System.out.print(" x ");
			  else  
				  System.out.print( " - " );		  
		  }
		  System.out.println(""); 
		} 
			}
		}
	}