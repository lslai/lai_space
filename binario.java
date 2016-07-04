import java.util.*;
class binario{
	public static void main(String[]args){
		double binario;
		Scanner stdin=new Scanner(System.in);
		System.out.println("Digite o numero binario");
		binario= stdin.nextInt();
		double resultado=0,b=0;
		
		while(binario!=0){
			resultado= resultado + (binario%10)*Math.pow(2,b);
			binario=(binario-binario%2)/10;
			b++;

		}
		System.out.println(resultado);

	}
}