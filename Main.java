import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    int pizza = 0;
    Componente c = new Pizza();
    Scanner sc = new Scanner(System.in);

    while (true) {

      menu();
      System.out.print("Digite sua opção: ");
      int opc = sc.nextInt();

      if (opc == 1) {
        while (true) {

          menuPedido();
          System.out.println("");
          System.out.print("Digite sua opção: ");
          int opcpedido = sc.nextInt();
          pizza = 1;

          if (opcpedido == 1) {

            menuPedidoMassas();

            int opcmassa = sc.nextInt();

            if (opcmassa == 1) {
              c = new PizzaMintegral();

            } else if (opcmassa == 2) {
              c = new PizzaFit();

            } else if (opcmassa == 0) {
              c = new Pizza();

            }
          }
          if (opcpedido == 2) {
            while (true) {

              menuPedidoComp();
              System.out.print("Digite sua opção: ");
              int opcIngrediente = sc.nextInt();

              if (pizza == 0) {
                c = new Pizza();
              }
              if (opcIngrediente == 1) {
                c = new QueijoMussarela(c);
              } else if (opcIngrediente == 2) {
                c = new QueijoPrato(c);
              } else if (opcIngrediente == 3) {
                c = new Calabresa(c);
              } else if (opcIngrediente == 4) {
                c = new Frango(c);
              } else if (opcIngrediente == 0) {
                break;
              }
            }

          } else if (opcpedido == 0) {
            break;
          }
        }
      } else if (opc == 2) {

        pagamento();

        System.out.print("Digite sua opção: ");
        System.out.println("  ");
        System.out.println(" ");
        int opcPagamento = sc.nextInt();
        
        Strategy s = new Strategy();
        s.setDataHora("10/10/2022 , 10:10:10");
        s.setNomeCliente("ralf");
        s.setDescricao(c.getNome());
        s.notaFiscal();
        s.setPagamento((opcPagamento) == 1 ? new Avista(1) : new Cartao(0, 2));
        s.pagar(c.getPreco());

        System.out.println("");
        System.out.println("---------------------");
        System.out.println("Total: " + c.getPreco());
        System.out.println("----------------");
        System.out.println("");

        Pagamento p = new Pagamento();
        Pessoa p1 = new Pessoa(s.getNomeCliente(), p);
        Cliente c1 = new Cliente();
        c1.setNome(s.getNomeCliente());
        c1.setDataHora(s.getDataHora());
        c1.setNumeroMesa(10);
        p.setCliente(c1);
        p.notificar();
        break;

      }
    }
  }

  public static void menu() {
    System.out.println("--------------------");
    System.out.println(" Pizzaria Pizza");
    System.out.println("-------------------");
    System.out.println("1 - fazerPedido: ");
    System.out.println("2 - EfetuarPagamento: ");
    System.out.println("0 - Sair: ");
    System.out.println("");

  }

  public static void menuPedido() {
    System.out.println("");
    System.out.println("--------------------");
    System.out.println(" Pedido ");
    System.out.println("-------------------");
    System.out.println("1 - Massas ");
    System.out.println("2 - Recheios ");
    System.out.println("0 - Sair: ");
    System.out.println("");

  }

  public static void menuPedidoMassas() {
    System.out.println("");
    System.out.println("--------------------");
    System.out.println(" Massas ");
    System.out.println("-------------------");
    System.out.println("1 - Massa Integral ");
    System.out.println("2 - Massa Fitnes ");
    System.out.println("0 - Sair: ");
    System.out.println("");

  }

  public static void menuPedidoComp() {
    System.out.println("--------------------");
    System.out.println(" Igredientes ");
    System.out.println("-------------------");
    System.out.println("1 - Queijo Mussarela");
    System.out.println("2 - Queijo Prata");
    System.out.println("3 - Calabresa");
    System.out.println("4 - Frango");
    System.out.println("0 - Sair:");
    System.out.println("");
  }

  public static void pagamento() {
    System.out.println("--------------------");
    System.out.println(" Pagamento ");
    System.out.println(" 1- Avista ");
    System.out.println(" 2- Cartão ");
    System.out.println("-------------------");
    System.out.println("");
  }

}