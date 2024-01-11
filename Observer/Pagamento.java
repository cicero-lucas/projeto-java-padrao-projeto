import java.util.ArrayList;
import java.util.List;

public class Pagamento implements Ipagamentoo {
  
  private Cliente cliente;

  private List<ICliente> clientes = new ArrayList<>();

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  @Override
  public void notificar() {

    for (ICliente c : clientes) {
      c.update(cliente);
    }
  }

  @Override
  public void adicionarCliente(ICliente c) {
    clientes.add(c);

  }

  @Override
  public void deletarCliente(ICliente c) {
    clientes.remove(c);
  }

}
