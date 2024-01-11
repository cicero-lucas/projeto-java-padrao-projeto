public class Pessoa implements ICliente{
  
  private String nome;
  private Ipagamentoo p;
  
  public Pessoa(String nome, Ipagamentoo p){
    this.nome=nome;
    this.p=p;
    p.adicionarCliente(this);
  }
  
  @Override
  public void update(Cliente cliente){
    System.out.println("Nota: " + cliente.getNome() + " mesa: "+  cliente.getNumeroMesa() + 
    " data e Hora: "+ cliente.getDataHora());
  }
}