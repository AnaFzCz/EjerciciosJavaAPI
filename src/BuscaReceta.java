import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class BuscaReceta {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("EJERCICIOS APIs ");
        System.out.println("\nEjercicio 3");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el nombre de la receta que deseas: ");
        var buscaReceta = scanner.nextLine();
        String direccion = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + buscaReceta;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(direccion)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

    }
}
