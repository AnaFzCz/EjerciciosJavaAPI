import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class BuscaCriptomoneda {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("EJERCICIOS APIs ");
        System.out.println("\nEjercicio 2");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el nombre de la criptomoneda del que debeas ver la cotización: ");
        var buscaMoneda = scanner.nextLine();
        String direccion = "https://api.coingecko.com/api/v3/simple/price?ids=" + buscaMoneda + "&vs_currencies=usd";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(direccion)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());


        //https://www.coingecko.com/pt/moedas/bitcoin

    }
}
