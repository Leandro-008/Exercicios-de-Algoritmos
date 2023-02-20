import java.util.Scanner;
import java.lang.Math;

public class App{
    public static void main(String[] args) {
        //Agoritmo 11

        System.out.print("Aprendendo Algoritmo!!! ");

        //Agoritmo 12

        System.out.print("Aprendendo Algoritmo!!!");
        System.out.print("Com Anita e Guto");

        //Agoritmo 16

        int x = 10;
        System.out.print(x);

        //Agoritmo 18

        int z = 10;
        System.out.print("Valor de x = "+ (z + 1));

        //Agoritmo 23
        
        Scanner numero = new Scanner(System.in);
        int a,d;
        System.out.print("Digite o numero de tres casas: ");
        a = numero.nextInt();
        d = (a % 100) / 10;
        System.out.println("Algarismo da casa das dezenas: " + d);
        numero.close();

        //Agoritmo 25

        Scanner data1 = new Scanner(System.in);
        int data,dia,mes,ano;
        System.out.print("Digite data no formato ddmmaa: ");
        data = data1.nextInt();
        dia = data / 10000;
        mes = data % 10000/100;
        ano = data % 100;
        System.out.println("\n");
        System.out.println("DIA: " + dia);
        System.out.println("MES: " + mes);
        System.out.println("ANO: " + ano);
        data1.close();

        //Agoritmo 26

        Scanner data1 = new Scanner(System.in);
        int data,dia,mes,ano,ndata;
        System.out.print("Digite data no formato DDMMAA: ");

        data = data1.nextInt();
        dia = data / 10000;
        mes = data % 10000/100;
        ano = data % 100;
        ndata = mes *10000 + dia * 100 + ano ;

        System.out.println("DIA: " + dia);
        System.out.println("MES: " + mes);
        System.out.println("ANO: " + ano);
        System.out.println("DATA NO FORMATO MMDDAA: " + ndata);

        data1.close();

        //Agoritmo 27

        int x, y ;
        x = 2;
        y = 5;
        System.out.println("x = " + x);
        x ++;
        System.out.println("y = " + y);
        y --;
        System.out.println("Novo valor de x = " + x);
        System.out.println("Novo valor de y = " + y);

        //Agoritmo 31

        int mediaaitimetica;
        mediaaitimetica = (8+9+7)/3;
        System.out.println("A media aritmetica eh "+ mediaaitimetica);

        //Agoritmo 40

        Scanner numero = new Scanner(System.in);
        int quoc, rest, val1, val2;
        System.out.println("Entre com o dividendo: ");
        val1 = numero.nextInt();
        System.out.println("Entre com divisor: ");
        val2 = numero.nextInt();
        quoc = val1 / val2 ;
        rest = val1 % val2 ; 

        System.out.println("ndividendo : " + val1);
        System.out.println("ndivisor :  " + val2);
        System.out.println("nquociente : " + quoc);
        System.out.println("nresto : " + rest);

        numero.close();

        //Agoritmo 41

        Scanner numero = new Scanner(System.in);
        int a, b, c, d, mp;
        System.out.println("entre com 1 numero: ");
        a = numero.nextInt();
        System.out.println("entre com 2 numero: ");
        b = numero.nextInt();
        System.out.println("entre com 3 numero: ");
        c = numero.nextInt();
        System.out.println("entre com 4 numero: ");
        d = numero.nextInt();
        mp = (a*1 + b*2 + c*3 + d*4)/10;
        System.out.println("media ponderada: " + mp); 
        
        numero.close();

        //Agoritmo 42

        Scanner numero = new Scanner(System.in);
        double angulo, rang;
        System.out.println("Digite um angulo em graus: ");
        angulo = numero.nextDouble();
        rang = angulo * Math.PI / 180;
        
        System.out.println("seno:" + Math.sin(rang) );
        System.out.println("co-seno: " + Math.cos(rang));
        System.out.println("tangente: " + 1/ Math.tan(rang));
        System.out.println("co-secante: " + 1/Math.sin(rang));
        System.out.println("secante: " + 1/Math.cos(rang));
        System.out.println("cotangente: " + 1/Math.tan(rang));
        
        numero.close();

        //Agoritmo 43

        Scanner numero = new Scanner(System.in);
        double num, logaritmo;
        System.out.print("Entre com o logaritmando: ");
        num = numero.nextDouble();
        logaritmo = Math.log(num)/Math.log(10);
        System.out.println("Logaritmo: " + logaritmo);

        numero.close();

        //Agoritmo 44

        Scanner numero = new Scanner(System.in);
        double num, base, logaritmo;
        System.out.println("Entre com o logaritmando: ");
        num = numero.nextDouble();
        System.out.println("Entre com a base: ");
        base = numero.nextDouble();
        logaritmo = Math.log(num)/Math.log(base);
        System.out.printf("O logaritmo de %.1f na base %.1f eh : %.2f", num , base , logaritmo);

        numero.close();

        //Agoritmo 46

        Scanner numero = new Scanner(System.in);
        double saldo, nsaldo;
        System.out.print("Digite saldo: ");
        saldo = numero.nextDouble();
        nsaldo = saldo * 1.01;
        System.out.printf("Novo saldo: %.2f ", nsaldo);
        
        numero.close();

        //Agoritmo 48

        Scanner numero = new Scanner(System.in);
        double sm, qtdade, preco, vp, vd; 
        System.out.print("Entre com o salario minimo: ");
        sm = numero.nextDouble();
        System.out.print("Entre com a quantidade em quilowatt: ");
        qtdade = numero.nextDouble();
        preco = sm / 700;
        vp = preco * qtdade;
        vd = vp * 0.9;
        System.out.printf("Preço do quilowatt: %.2f \n Valor a ser pago: %.2f \n Valor com desconto: %.2f", preco , vp , vd);
        
        numero.close();

    }
}