public class Bye {
    public static void main(String[] args) {
        if (args.length > 0) {
            String name = "";
            for (String s : args) {
                name += s + " ";
            }
            System.out.println("Bye " + name.trim() + "!");
        } else {
            System.out.println("Bye World!");
        }
    }
}
