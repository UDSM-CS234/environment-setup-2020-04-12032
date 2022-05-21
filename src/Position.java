public class Position {
    public static void main(String[] args){
        double a = -9.81;
        double Xi = 0;
        double Vi = 0;
        int t = 10;
        double Xt = 0.5*a*t*t + Vi*t + Xi;
        System.out.println("The value of position after time t is " + Xt + "m");
    }
}
