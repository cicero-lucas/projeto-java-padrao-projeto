public class Strategy{
  private String nomeCliente;
  private String dataHora;
  private String descricao;
  private Ipagamento pagamento;
  

  public void setPagamento(Ipagamento pagamento) {
  	this.pagamento = pagamento;
  }
  
 public void pagar(double valor){
   this.pagamento.pagamento(valor);
 }
  public String getNomeCliente() {
  	return nomeCliente;
  }
  
  public void setNomeCliente(String nomeCliente) {
  	this.nomeCliente = nomeCliente;
  }
  
  public String getDataHora() {
  	return dataHora;
  }
  
  public void setDataHora(String dataHora) {
  	this.dataHora = dataHora;
  }
  
  public String getDescricao() {
  	return descricao;
  }
  
  public void setDescricao(String descricao) {
  	this.descricao = descricao;
  }
  
  public Ipagamento getPagamento() {
  	return pagamento;
  }

  public void notaFiscal(){
    String data=this.getDataHora();
    String[] splitData = data.split(",");
    System.out.println("----------------------");
     System.out.printf("Data:  %s      hora: %s \n ",splitData[0],splitData[1]);
    System.out.println("Nome: "+this.getNomeCliente());
    System.out.println("Descrição: "+this.getDescricao());
    System.out.println("------------------------");
    System.out.println("");
  }
  
}