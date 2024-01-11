public class Cartao implements Ipagamento{
  private float desconto;
  private  int parcela;

  public Cartao(float desconto, int parcela){
    this.desconto = desconto;
    this.parcela=parcela;
  }

  @Override
  public void pagamento(double valor){
    System.out.printf("%.2f", valor - desconto);
  }

  public float getDesconto() {
  	return desconto;
  }
  
  public void setDesconto(float desconto) {
  	this.desconto = desconto;
  }
  
  public int getParcela() {
  	return parcela;
  }
  
  public void setParcela(int parcela) {
  	this.parcela = parcela;
  }

  

}