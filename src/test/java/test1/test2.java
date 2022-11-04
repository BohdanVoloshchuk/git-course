package test1;

public class test2 {
    public static void main(String[] args) {
    String str = "string from second task";
    String reverse = "";

    for (int i = str.length()-1; i >= 0; i --){
        reverse += str.charAt(i);
    }
    System.out.println(reverse);
    System.out.println(str);
}
}
