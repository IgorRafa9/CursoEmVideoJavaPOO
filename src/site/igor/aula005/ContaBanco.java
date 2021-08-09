package Aula005A;

public class ContaBanco {
	public String numConta;
	protected String tipoConta;
	private String dono;
	private double saldo;
	private boolean status;
	
	public ContaBanco() {
		this.saldo=0;
		this.status=false;
	}
	
	
	//Methods
	public void abrirConta(String t) {
		this.setTipoConta(t);
		this.setStatus(true);
		this.status=true;
		if (t=="CC") {
			this.setSaldo(50);
		}else if(t=="CP"){
			this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso!");
	}
	
	public void fecharConta() {
		if(this.getSaldo()>0) {
			System.out.println("Conta não pode ser fechada. Ainda possui quantia.");
		}else if(this.getSaldo()<0) {
			System.out.println("Conta não pode ser fechada. Contém débito.");
		}else {
			this.setStatus(false);
			System.out.println("Conta encerrada!");
		}
	}
	
	public void depositar(double dep) {
		if(this.status==true) {
			this.setSaldo(this.getSaldo()+dep);
			System.out.println("Depósito de " +this.getSaldo()+" realizado!");
		}else {
			System.out.println("Conta não existente!");
		}
	}
	
	public void sacar(double saq) {
		if(this.getStatus()) {
			if(this.saldo<saq) {
				System.out.println("Impossível realizar saque!");
			}else if(this.saldo>=saq) {
				this.setSaldo(this.getSaldo()-saq);
				System.out.println("Saque de "+saq+" realizado com sucesso na conta de "
						+ this.getDono());
			}
		}
	}
	
	public void pagarMensal() {
		int v=0;
		if(this.getTipoConta()=="CC") {
			v = 12;
		}else if(this.getTipoConta()=="CP"){
			v = 20;
		}
		if(this.getStatus()) {
			this.setSaldo(this.getSaldo()-v);
			System.out.println("Mensalidade paga por "+this.getDono());			
		}else {
			System.out.println("Conta já encerrada");
		}
	}
	
	//All setters
	public void setNumConta(String conta) {
		this.numConta=conta;
	}
	
	public void setDono(String nome) {
		this.dono=nome;
	}
	
	public void setSaldo(double sal) {
		this.saldo=sal;
	}
	
	public void setTipoConta(String tc) {
		this.tipoConta=tc;
	}
	public void setStatus(boolean status) {
		this.status=status;
	}
	
	//All getters
	public String getNumConta() {
		return numConta;
	}
	
	public String getDono() {
		return dono;
	}
	
	public String getTipoConta() {
		return tipoConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public boolean getStatus() {
		return status;
	}
	
	public void mostrarInfo() {
		System.out.println("Conta: "+this.getNumConta()+"\nTipo de conta: "
				+this.getTipoConta()+"\nNome: "+this.getDono()+"\nSaldo: "+this.getSaldo()
				+"\nStatus: "+this.getStatus());
	}
}
