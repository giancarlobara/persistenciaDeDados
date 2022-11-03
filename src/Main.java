import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.println("Digite a sigla do estado");
            String pesquisa = leitor.nextLine();
            FileReader arq = new FileReader("src/UF.csv");
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine();

            while(linha != null){
                linha = lerArq.readLine(); // lê da segunda até a última linha
                String linhas[] = linha.split(",");
                String regiao, regiaoBrasil = linhas[3];
                switch (regiaoBrasil) {
                    case "1":
                        regiao = "Norte";
                        break;
                    case "2":
                        regiao = "Nordeste";
                        break;
                    case "3":
                        regiao = "Sudeste";
                        break;
                    case "4":
                        regiao = "Sul";
                        break;
                    case "5":
                        regiao = "Centro Oeste";
                        break;
                }
                System.out.println(regiaoBrasil);
                if(pesquisa == linhas[1]){
                    System.out.println(linhas[2] + " da região " + regiaoBrasil);
                }
            }
            arq.close();
        }catch (IOException e){
            System.out.println(e.getMessage());;
        }

    }
}
