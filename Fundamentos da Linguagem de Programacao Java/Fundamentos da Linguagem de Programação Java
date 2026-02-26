/*

Padrões de desenvolvimento e conceitos

    Para criar uma classe com nome composto, coloca tudo junto e as primeiras letras em maiuscula:

        MyClass

    Nome de métodos é minusculo e se for composto, tudo junto e a primeira letra da segunda letra em maiusculo:

        main
        mainMethod

    public class Main{
        public static void main(String[] args){
            //Declarar variável para leitura de dados passados pelo usuário
            Scanner scanner = new Scanner(System.in);

            //Tipar e iniciar
            //var scanner = new Scanner(System.in);

            //Imprime na tela
            System.out.println("Olá, informe o seu nome");

            //Pedir para o usuário escrever
            String name = scanner.next();
            //var name = scanner.next();

            System.out.println("Informe sua idade");
            int age = scanner.nextInt();
            //var age = scanner.nextInt();

            //Imprimir com os valores dados pulando linha
            System.out.println("Olá " + name + " sua idade é " + age);

            //ou, sem pular linha automaticamente (usa \n para  pular linha)
            System.out.printf("Olá %s sua idade é %s \n", name, age);

            //Não pode mudar o tipo da variável
            //age = "";
        }
    }
*/

/*
Keywords e tipos primitivos

    https://www.w3schools.com/java/java_ref_keywords.asp

    Tipos primitivos

        https://www.w3schools.com/java/java_ref_keywords.asp


    public class Main{
        public static void main(String[] args){
            byte number = 1;
            short number = 1;
            int number = 1;

            //Precisa colocar L no final
            long number = 1L;

            //Precisa colocar f no final
            float number = 1.0f;

            //Precisa colocar d no final
            double number = 1.0d;

            char character = 'a';
            boolean bool = true;

        }
    }
 */

/*
Trabalhando com Operadores de Atribuição e Lógicos

    Atribuição

        = -> que atribui valores para a variável

    == -> igual
    != -> diferente
    ! -> inverter o valor
    > -> maior
    >= -> maior ou igual
    < -> menor
    <= -> menor ou igual
    || -> ou (pelo menos 1 tem que ser true)
    && -> e (todos tem que ser true)

    public class Main{
        public static void main(String[] args){
            var scanner = new scanner(System.in);
            System.out.println("Quanto é 2 + 2 ?");
            var result = scanner.nextInt();

            System.out.println("Quantos anos você tem?");
            var age = scanner.nextInt();

            System.out.println("Você é emancipado(a)?");
            var isEmancipated = scanner.nextBoolean();

            //Igual
            var isRight = result == 4;

            //Diferente
            var isWrong= result != 4;

            //Maior
            var canDrive = age > 17;

            //Maior ou igual
            var canDrive = age >= 18;

            //Menor
            var canNotDrive = age < 18;

            //Menor ou igual
            var canNotDrive = age <= 17;

            //Ou - E
            var canDrive = age >= 18 || (isEmancipated && age >= 16);

            System.out.println("O resultado é 4, você acertou? (%s)", isRight);
            System.out.println("O resultado é 4, você errou? (%s)", isWrong);

            //Inverter o valor
            System.out.println("O resultado é 4, você errou? (%s)", !isWrong);

            System.out.println("Você pode dirigir? (%s)", canDrive);
            System.out.println("Você não pode dirigir? (%s)", canNotDrive);
        }
    }
 */

/*
Trabalhando com Operadores Aritméticos

    + -> soma
    - -> subtração
    / -> divisão (prioridade)
    % -> resto da divisão
    * -> multiplicação (prioridade)
    Math.sqrt() -> raiz quadrada
    Math.pow() -> potência
    ++ -> incremento
    -- -> decremento

    Sempre executa da esquerda para direita, ou, se quiser prioridade para alguma operação, coloca ela entre parenteses

public class Main{
    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        var value1 = scanner.nextInt();

        System.out.println("Informe o segundo número:");
        var value2 = scanner.nextInt();

        //Soma
        System.out.printf("%s + %s = %s\n", value1, value2, value1 + value2);

        var value = 5;
        value = value + 12;
        //OU
        value += 12;


        //Subtração
        System.out.printf("%s - %s = %s\n", value1, value2, value1 - value2);

        var value = 5;
        value = value - 12;
        //OU
        value -= 12;

        //Divisão

        //var value1 = scanner.nextFloat();
        //var value2 = scanner.nextFloat();

        System.out.printf("%s / %s = %s\n", value1, value2, value1 / value2);

        var value = 5;
        value = value / 12;
        //OU
        value /= 12;

        //Resto da divisão
        System.out.printf("%s %% %s = %s\n", value1, value2, value1 % value2);

        //Multiplicação

        //var value1 = scanner.nextFloat();
        //var value2 = scanner.nextFloat();

        System.out.printf("%s * %s = %s\n", value1, value2, value1 * value2);

        var value = 5;
        value = value * 12;
        //OU
        value *= 12;

        //Raiz quadrada
        System.out.printf("A raiz quadrada de %s é %s\n", value1, Math.sqrt(value1));

        //Potência
        //Ao quadrado
        System.out.printf("A potência de %s é %s\n", value1 Math.pow(value1, 2));

        //Ao cubo
        System.out.printf("A potência de %s é %s\n", value1 Math.pow(value1, 3));
        //...

        //Incremento
        //Incrementa antes
        var value3 = 50;
        System.out.println(++value3);
        System.out.println(value3);

        //Incrementa depois (só resolve na proxima linha)
        var value3 = 50;
        System.out.println(value3++);
        System.out.println(value3);

        //Decremento
        //Decrementa antes
        System.out.println(--value3);
        System.out.println(value3);

        //Decrementa depois (só  resolve na próxima linha)
        System.out.println(value3--);
        System.out.println(value3);
    }
}
 */

/*
Trabalhando com Operadores Bitwise (Bit-a-Bit)

    Operações com finalidades específicas
    Usa com os tipos Long, Int, Short, Char e Bytes

public class Main{
    public static void main(String[] args){

        //1 = true
        //2 = false

        //Ver quantos bytes maximos
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        //1111111111111111111111111111111

        var value1 = 6;

        //Transforma em binário (110)
        var binary1 = Integer.toBinaryStrinng(value1);

        System.out.printf("Primeiro número da operação %s (representação binária)\n", value1, binary1);

        var value2 = 5;

        //Transforma em binário (101)
        var binary2 = Integer.toBinaryStrinng(value2);

        System.out.printf("Segundo número da operação %s (representação binária)\n", value2, binary2);

        //Faz o OU com cada byte da direita para a esquerda (110 | 101)
        //(0 | 1) = 1
        //(1 | 0) = 1
        //(1 | 1) = 1
        var result = value1 | value2;

        //O resultado ficou de baixo para cima
        // 111 -> 7
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf("%s | %s =  %s (representação binária %s)\n", value1, value2, result,  binaryResult);


        //Faz o E com cada byte da direita para a esquerda (110 | 101)
        //(0 & 1) = 0
        //(1 & 0) = 0
        //(1 & 1) = 1
        var result = value1 & value2;

        //O resultado ficou de baixo para cima
        // 100 -> 4
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf("%s & %s =  %s (representação binária %s)\n", value1, value2, result,  binaryResult);


        //Faz o XOR com cada byte da direita para a esquerda (110 ^ 101)
        //Se os números forem iguais = 0, se forem diferentes = 1

        //(0 ^ 1) = 1
        //(1 ^ 0) = 1
        //(1 ^ 1) = 0
        var result = value1 ^ value2;

        //011 -> 3
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf("%s ^ %s =  %s (representação binária %s)\n", value1, value2, result,  binaryResult);



        //Faz o COMPLEMENT com cada byte da direita para a esquerda
        //Funciona igual a NEGAÇÃO de operadores

        //6
        var result = ~value1;

        //0000000000000000000000000000110
        var binaryResult = Integer.toBinaryString(result);

        //Nega os 0 a esquerda
        //1111111111111111111111111111001
        System.out.printf("~%s = %s (representação binária %s)\n", value1, result,  binaryResult);

        //Shift Operator

            //Left

                //value1 -> 9
                //value2 -> 2
                // Faz deslocamento de bytes (1001 -> value1)
                //Empurra 2 bytes para esquerda, deixando 2 espaços vazios (1001xx) e o coloca 0 nesses espações
                var result = value1 << value2;

                var binaryResult = Integer.toBinaryString(result);

                //100100 -> 36
                System.out.printf("%s << %s =  %s (representação binária %s)\n", value1, value2, result,  binaryResult);


            //Right

                //value1 = 8 (1000)
                //value2 = 2

                //Desloca 2 números para direita (xx10) e coloca o 0 no espaço vazio, mas o 0 a esquerda não imprime
                var result = value1 >> value2;
                var binaryResult = Integer.toBinaryString(result);
                System.out.printf("%s >> %s =  %s (representação binária %s)\n", value1, value2, result,  binaryResult);
                //Se for um numero negativo, ele completa o espaço vazio com 1


            //WR Shift

                //Igual ao RIGHT
                //value1 = 12 (1100)
                //value2 = 2

                //Desloca 2 números para direita (xx11) e coloca o 0 no espaço vazio, mas o 0 a esquerda não imprime
                var result = value1 >>> value2;
                var binaryResult = Integer.toBinaryString(result);
                System.out.printf("%s >>> %s =  %s (representação binária %s)\n", value1, value2, result,  binaryResult);
                //Se for um numero negativo, ele completa o espaço vazio com 0
    }
}
 */
