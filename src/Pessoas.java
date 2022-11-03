import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Pessoas {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        String nome;
        int idade;
        Double salario;

        FileOutputStream arquivo = new FileOutputStream("src/pessoas.dat");
        DataOutputStream gravarArq = new DataOutputStream(arquivo);

        System.out.println("Informe o seu nome:");
        nome = leitor.nextLine();

        System.out.println("Informe a sua idade: ");
        idade = leitor.nextInt();

        System.out.println("Informe o seu Salário: ");
        salario = leitor.nextDouble();


        gravarArq.writeUTF(nome);
        gravarArq.writeInt(idade);
        gravarArq.writeDouble(salario);

        arquivo.close();

        System.out.println("\nDados gravados com sucesso.\n");
    }
}
