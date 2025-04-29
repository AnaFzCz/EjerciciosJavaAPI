import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class BuscaLibros {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("EJERCICIOS APIs ");
        System.out.println("\nEjercicio 1");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el nombre del libro que deseas: ");
        var buscaLibro = scanner.nextLine();
        var llave = "AIzaSyCpQvs6hoW6_SlyUJZQ7shGJVkGKu1c2Ak";
         String direccion = "https://www.googleapis.com/books/v1/volumes?q=" + buscaLibro + "+intitle:keyes&key=" + llave;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(direccion)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());


//        q: Busca volúmenes que contengan esta cadena de texto. Existen palabras clave especiales que puedes especificar en los términos de búsqueda para realizar búsquedas en campos específicos, como los siguientes:
//        intitle: Muestra resultados en los que el texto que sigue a esta palabra clave se encuentra en el título.
//        inauthor: Muestra resultados en los que el texto que sigue a esta palabra clave se encuentra en el autor.
//        inpublisher: Muestra resultados en los que el texto que sigue a esta palabra clave se encuentra en el publicador.
//        subject: Muestra resultados en los que el texto que sigue a esta palabra clave aparece en la lista de categorías del volumen.
//        isbn: Muestra resultados en los que el texto que sigue a esta palabra clave es el número de ISBN.
//        lccn: Muestra resultados en los que el texto que sigue a esta palabra clave es el número de control de la Biblioteca del Congreso.
//        oclc: Muestra resultados en los que el texto que sigue a esta palabra clave es el número de la Online Computer Library Center.



    }
}