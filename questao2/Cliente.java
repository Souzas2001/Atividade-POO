package questao2;

public class Cliente extends Pessoa {
    private double valorDivida;
    private int anoNascim;

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public int getAnoNascim() {
        return anoNascim;
    }

    public void setAnoNascim(int anoNascim) {
        this.anoNascim = anoNascim;
    }

    public String toString() {
        return "Nome: "+getNome()+", Idade: "+getIdade()+", Sexo: "+getSexo()
                +", Valor da dívida: R$"+getValorDivida()+", Ano de Nascimento: "+getAnoNascim();
    }
}
