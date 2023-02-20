public class Test {
    public static void main(String[] args) {
        String introduction = "Hello Peter";

        System.out.println(introduction.substring(3,7));
        // 3 - remove characters from the start
        // 7 - remove all remaining characters after including seventh elements

        String bobsAge = "23";
        System.out.println("Bob is " + bobsAge + " years old");

        int bobsAgeAsInteger = Integer.parseInt(bobsAge);
    }
}
