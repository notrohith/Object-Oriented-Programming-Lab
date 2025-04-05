import java.util.ArrayList;  
import java.net.InetAddress;  
import java.io.FileWriter;  
import java.io.IOException;  

public class BuiltIn {
    public static void main(String[] args) {
        ArrayList<String> websites = new ArrayList<>();
        websites.add("www.google.com");
        websites.add("www.github.com");
        websites.add("www.oracle.com");

        try {
            FileWriter writer = new FileWriter("WebsiteIPs.txt");

            for (String site : websites) {
                InetAddress address = InetAddress.getByName(site);
                String ip = address.getHostAddress();
                System.out.println("Website: " + site + " | IP: " + ip);

                writer.write("Website: " + site + " | IP: " + ip + "\n");
            }

            writer.close();
            System.out.println("Data written to WebsiteIPs.txt");

        } catch (IOException e) {
            System.out.println("File writing error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Network error: " + e.getMessage());
        }
    }
}
