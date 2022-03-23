public class Launcher{
    public static void main(String[] args){
        String os;
        System.getProperty("os.name");
        os = System.getProperty("os.name");
        System.out.println(os);
        Double r = Math.random();
        Double t = r*10;
        Double d = (double) Math.round(t * 10) / 10;
        String s = d.toString();
        String v = os + " " + s;
        System.out.println("Betriebssystem: " + v);
    }
}