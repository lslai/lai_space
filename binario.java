import java.util.*;
class binario{
	public static void main(String[]args){
		double binario;
		Scanner stdin=new Scanner(System.in);
		System.out.println("Digite o numero binario");
		binario= stdin.nextInt();
		double resultado,b=0;
		while(binario%10=!0){
			resultado= resultado + (binario%10)*Math.pow(2,b);
			binario=binario/10;
		}
		System.out.println(resultado);

	}
}