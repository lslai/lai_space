import java.util.*;
class binario{
	public static void main(String[]args){
		double binario1;
		Scanner stdin=new Scanner(System.in);
		System.out.println("Digite o numero binario");
		binario1= stdin.nextInt();
		double resultado,b=0;
		double binario2;
		binario2=binario1;
		while(binario2%10=!0){
			resultado= resultado + (binario1%10)*Math.pow(2,b);
			binario1=binario1/10;
			binario2=binario1;
		}
		System.out.println(resultado);

	}
}