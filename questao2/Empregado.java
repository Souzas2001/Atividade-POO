package questao2;

public class Empregado extends Pessoa {
    private double salario;
    private String matricula;

    private double ValorInss() {
        return this.salario * 0.11;
    }
    public double getValorInss(){ return ValorInss();}


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
