package atividadeFaculdade;

public class Peixe extends  Animal {
    private String habitat;

    public void setHabitat(String habitat){
        this.habitat = habitat;
    }
    public String getHabitat(){
        return habitat;
    }

    public String toString() {
        return "Nome: "+getNome()+", Habitat: "+getHabitat()+", Peso: "+getPeso();
    }
}
