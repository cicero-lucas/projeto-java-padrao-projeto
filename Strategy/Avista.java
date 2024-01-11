public class Avista implements Ipagamento{
  private float desconto;

  public Avista(float desconto){
    this.desconto = desconto;
  }
  
  @Override
  public void pagamento(double valor){
    System.out.printf("%.2f", valor - desconto);
  }

  public  float getDesconto() {
  	return desconto;
  }
  
  public void setDesconto(float desconto) {
  	this.desconto = desconto;
  }
  
}