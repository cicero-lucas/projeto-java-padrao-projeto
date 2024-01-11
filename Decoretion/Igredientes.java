public abstract class Igredientes extends Componente{
  private Componente componente;
  public Igredientes(Componente componente){
    this.componente = componente;
  }

  public Componente getComponente(){
    return componente;
  }

  @Override
  public double getPreco(){
    return this.preco + this.componente.getPreco();
  }

  @Override
 public void valorProduto(){
   System.out.println("Valor do ingrediente: " + this.componente.getPreco() + " -> " + this.preco);
 }

  @Override
  public String getNome(){
    return this.componente.getNome() + " -> " +  this.nome ;
  }
}