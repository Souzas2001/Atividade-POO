package atividadeFaculdade;

public class Cachorro extends Animal {

    private String raca;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String toString() {

        return "Nome: " + getNome() + ", Raça: " + getRaca()+", Peso: "+getPeso();
    }
}
