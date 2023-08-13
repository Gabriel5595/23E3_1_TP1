import java.util.Scanner;

class OpSoma {
    public void Soma(float a, float b){
        System.out.println("Resultado: " + (a + b));
        System.out.println();
    }
}

class OpSub {
    public void Sub(float a, float b){
        System.out.println("Resultado: " + (a - b));
        System.out.println();
    }
}

class OpMult {
    public void Mult(float a, float b){
        System.out.println("Resultado: " + (a * b));
        System.out.println();
    }
}

class OpDiv {
    public void Div(float a, float b){
        System.out.println("Resultado: " + (a / b));
        System.out.println("Resto: " + (a % b));
        System.out.println();
    }
}

public class App {
    public static void main(String[] args) throws Exception {        
        Scanner scanner = new Scanner(System.in);
        int OpSelecionada = 0;
        float a;
        float b;
        
        while(OpSelecionada != 5){
            System.out.println("Bem vindo à calculadora!");
            System.out.println("Selecione a operação desejada:");
            System.out.println("1 = Soma");
            System.out.println("2 = Subtração");
            System.out.println("3 = Multiplicação");
            System.out.println("4 = Divisão");
            System.out.println("5 = Sair");
            OpSelecionada = scanner.nextInt();

            switch(OpSelecionada)
            {
                case 1:
                    System.out.println();
                    System.out.println("A opção selecionada foi Soma");
                    System.out.println("Digite o primeiro número: ");
                    a = scanner.nextFloat();
                    System.out.println("Digite o segundo número: ");
                    b = scanner.nextFloat();
                    OpSoma soma = new OpSoma();
                    soma.Soma(a, b);
                    break;
                case 2:
                    System.out.println();
                    System.out.println("A opção selecionada foi Subtração");
                    System.out.println("Digite o primeiro número: ");
                    a = scanner.nextFloat();
                    System.out.println("Digite o segundo número: ");
                    b = scanner.nextFloat();
                    OpSub sub = new OpSub();
                    sub.Sub(a, b);
                    break;
                case 3:
                    System.out.println();
                    System.out.println("A opção selecionada foi Multiplicação");
                    System.out.println("Digite o primeiro número: ");
                    a = scanner.nextFloat();
                    System.out.println("Digite o segundo número: ");
                    b = scanner.nextFloat();
                    OpMult mult = new OpMult();
                    mult.Mult(a, b);
                    break;
                case 4:
                    System.out.println();
                    System.out.println("A opção selecionada foi Divisão");
                    System.out.println("Digite o primeiro número: ");
                    a = scanner.nextFloat();
                    System.out.println("Digite o segundo número: ");
                    b = scanner.nextFloat();
                    OpDiv div = new OpDiv();
                    div.Div(a, b);
                    break;
                case 5:
                    System.out.println();
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println();
                    System.out.println("Opção selecionada não é válida. Por favor, selecione outra.");
                    break;
            }
        }
    }
}
