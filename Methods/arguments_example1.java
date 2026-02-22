public class arguments_example1 {
    public static int prasun(){
        System.out.println("mayank");
        System.out.println("sumay");
        return 5 ;
    }
    public static void main(String[] args) {
        int x = prasun();
        // System.out.println(3+prasun());
        System.out.println(x+9);
        // lekin agr hum sirf function kocall kregen without store or print in 
        // the main function then it will print only the print values of that functionn
    }
}
