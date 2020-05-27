import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class RequestDemo{
public static void main(String[] args){
        System.out.println("Hello World!");
        
        //Creating a HttpClient object
        CloseableHttpClient httpclient = HttpClients.createDefault();

        //Creating a HttpGet object
        HttpPost httppost = new HttpPost("http://www.kaops.com/");

        //Printing the method used
        System.out.println("Request Type: "+httppost.getMethod());
}
}
