/*
Estrutura Condicional If else e else if

    Uma expressão que vai resultar em um valor booleano e vai ser verificado pelo if. Se esse vaalor for TRUE, vai executar um determinado código, se for FALSE, ele vai ignorar esse código
    public class Main {
        public static void main(String[] args){
            var scanner = new Scanner(System.in);
            System.out.println("Informe seu nome:");
            var name = scanner.next();
            System.out.println("Informe sua idade:");
            var age = scanner.nextInt();
            System.out.println("Você é emancipado? (s/n)");

            //Se for 's', retorna TRUE
            var isEmancipated = scanner.next().equalsIgnoreCase("s");

            //Usando com 1 linha de código
            //if (age >= 18) System.out.printf("%s você tem %s anos e pode dirigir \n", name, age);

            //var message = "";

            //Se tiver 18 ou mais
            if (age >= 18){
                System.out.println("Bem vindo(a)");
                System.out.printf("%s você tem %s anos e pode dirigir \n", name, age);
                //message  = name + ", você pode dirigir \n"
            }
            //Outra condição
            else if (age >= 16 && isEmancipated) {
                System.out.printf("%s, apesar de você ter %s anos, você é emancipado e pode dirigir \n", name, age);
            }
            //Se não
            else {
                System.out.printf("%s, você não pode dirigir \n", name);
                //message  = name + ", você não pode dirigir \n"
            }

            //System.out.println(message);
            System.out.println("Fim da execução");

            //Elvis Operator

                //Somente se tiver 1 linha

                // ? -> se TRUE
                //: -> se FALSE

                //var message = age >= 18 ?
                // name + ", você pode dirigir \n" :
                // name + ", você não pode dirigir \n"
        }
    }
*/

/*
Estrutura Condicional switch case



    public class Main {
        public static void main(String[] args){
            var scanner = new Scanner(System.in);
            System.out.println("Informe um número de 1 à 7");
            var option = scanner.nextInt();

            //Irá para a opção (case) que foi escolhida
            switch (option){

                //Agrupar mais de 1 opção
                case 1:
                case 7:
                    System.out.println("Fim de semana");
                    break;

                    //Interromper
                    break;
                case 2:
                    System.out.println("Segunda");
                    break;
                case 3:
                    System.out.println("Terça");
                    break;
                case 4:
                    System.out.println("Quarta");
                    break;
                case 5:
                    System.out.println("Quinta");
                    break;
                case 6:
                    System.out.println("Sexta");
                    break;

                //Se não tiver nas opções
                default:
                    System.out.println("Opção inválida");


                //Outra forma
                    //Agrupar
                    case 1, 7 -> System.out.println("Fim de semana");
                    case 2 -> System.out.println("Segunda");
                    case 3 -> System.out.println("Terça");
                    case 4 -> System.out.println("Quarta");
                    case 5 -> System.out.println("Quinta");
                    case 6 -> System.out.println("Sexta");
                    default -> System.out.println("Opção inválida");

            }
                //Outra forma
                    var message = switch (option){

                        //Agrupar e mais de 1 mensagem  (linha)
                        case 1, 7 -> {
                            var day = option == 1 ? "Domingo" : "Sábado"
                            //Interpolação
                            yield String.format("Hoje é %s, fim de semana", day);
                        }
                        case 2 -> "Segunda";
                        case 3 -> "Terça";
                        case 4 -> "Quarta";
                        case 5 -> "Quinta";
                        case 6 -> "Sexta";
                        default -> "Opção inválida";
                    };
                    System.out.println(message);
        }
    }
 */

/*
Estrutura de Repetição for

    Um bloco de código criado para ser repetido N vezes até que atinja uma determinada condição.

    public class Main {
        public static void main(String[] args){
            var scanner = new Scanner(Sytem.in);

            //Loop infinito
            //for (;;){
                //System.out.println("Digite um nome: ");
                //var name = scanner.next();

                //Quebra o fluxo
                //if (name.equalsIgnoreCase("exit")) break;

                //System.out.println(name);
            //}

            //Declarar uma variável de interação começando por umm número; Define quando o laço termina; Forma de incrementar/decrementar
            for (var i = 1; i <= 100; i++){

                //Decrementando
                //for (var i = 200; i >= 0; i--)

                //Qubrar o loop se o i = 100
                if (i == 100) {
                    System.out.println("Fim da execução");
                    break;
                }

                //Imprimir impares
                if (i % 2 == 0)
                    //Continua para a próxima interação
                    continue;
                System.out.println(i);

                //Imprimir todos os números
                System.out.println(i);
            }

            //Imprimir somente os pares
            for (var j = 2; j <= 100; j+= 2){
            //for (var j = 200;  j > 0; j-=2)
                System.out.println(j);
            }

            //Só imprimir a lista, sem se importar com o índica
            for (var lista : args){
                System.out.println(lista);
            }
        }
    }
 */

/*
Estruturas de repetição while e do while

    While

        Precisa informar uma condição para que, enquanto ela for verdadeira, vai continuar rodando

    Do While

        Ele roda pelo menos 1x antes de verificar se a condição é verdadeira

    public class Main {
        public static void main(String[] args){
            var scanner = new Scanner(System.in);
            var name = "";

            var i = 0;

            //Vai roda ate o nome ser diferente de 'exit'
            while (!name.equals("exit")){
                //while (args.length > i)

                //while (true)

                System.out.println("Informe um nome:");
                name = scanner.next();
                System.out.println(name);

                //System.out.println(args[i]);
                //i++

                //if (name.equalsIgnoreCase("exit")) break;
            }

            do {
                System.out.println("Informe um nome:");
                name = scanner.next();
                System.out.println(name);

                //System.out.println(args[i]);
                //i++

            }while (name.equalsIgnoreCase("exit"))
            //while (args.length > i)
        }
    }
 */
