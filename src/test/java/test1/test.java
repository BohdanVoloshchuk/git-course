package test1;

public class test {
    public static void main(String[] args) {
        String str = "ababalamaga";
        String reverse = "";

        for (int i = str.length()-1; i >= 0; i --){
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
        System.out.println(str);

        System.out.println("I added some changes ");
        System.out.println("added something else");
    }
}
