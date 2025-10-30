package Methods;

public class passbyvalueANDreference {
    public static void change(int x){
        x = 10;
        return ;
    }
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
}
