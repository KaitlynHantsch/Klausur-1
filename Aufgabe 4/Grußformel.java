public class Grußformel{
    public static void main(String[] args){
        System.out.println(greet(false));
        System.out.println(greet(true));
    }
    static String greet(boolean evening){
        String s = "Guten Tag!";
        if(evening){
            s = "Guten Abend!";
        }
        return s;
    }
}