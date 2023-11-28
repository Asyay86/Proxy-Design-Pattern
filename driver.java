public class driver{

    public static void main(String[] args){

    Internet internet = new ProxyInternet();
    internet.connectTo("google.com");
    internet.connectTo("banned.com");

    System.out.println("Done");
    }

}