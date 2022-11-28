package atividadeFaculdade;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha entre peixe e cachorro.");
        String animal = sc.nextLine();
        switch (animal) {
            case "cachorro" -> {
                Cachorro dog = new Cachorro();
                System.out.println("Nome do Cachorro: ");
                dog.setNome(sc.nextLine());
                System.out.println("Peso do Cachorro:");
                dog.setPeso(sc.nextDouble());
                System.out.println("Raça do cachorro:");
                sc.nextLine();
                dog.setRaca(sc.nextLine());
                System.out.println(dog);
            }
            case "peixe" -> {
                Peixe peixe1 = new Peixe();
                System.out.println("Nome do peixe:");
                peixe1.setNome(sc.nextLine());
                System.out.println("Habitat do peixe:");
                peixe1.setHabitat(sc.nextLine());
                System.out.println("Peso do peixe:");
                peixe1.setPeso(sc.nextDouble());
                System.out.println(peixe1);

            }
        }
    }
}
