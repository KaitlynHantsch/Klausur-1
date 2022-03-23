public class Osterhase{
    public static void main(String[] args){
        String text = "Ostereier suchend hoppelte das Häschen durch den weißen Schnee,juchhe!";
        System.out.println(text);
        text = text.replace("den weißen Schnee", "das grüne Gras und fand etwas");
        System.out.println(text);
        String[] result = text.split("[\\p{Punct}\\s+]");
        for(String wort:result){
            System.out.println(wort);
        }
    }
}