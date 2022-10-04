import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student estudante = new Student();

        System.out.println("Digite o seu nome: ");
        estudante.nome = sc.nextLine();
        System.out.println("Digite as tres notas do trimestre");
        estudante.nota1 = sc.nextDouble();
        estudante.nota2 = sc.nextDouble();
        estudante.nota3 = sc.nextDouble();
        System.out.printf("Sua nota final do trimestre foi: %.2f%n", estudante.notaFinal());
        if(estudante.notaFinal() < 60.0){
            System.out.println("Você não foi aprovado.");
            System.out.printf("Faltam %.2f pontos%n", estudante.pontosNecessarios());
        }
        else{
            System.out.println("Você passou");
        }
    }
}
