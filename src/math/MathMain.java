package math;

public class MathMain {
    public static void main(String[] args) {

        // degree to radian
        int d = 60;
        double r = Math.toRadians(d);
        System.out.println("r = " + r);

        // radian to degree
        double nd = Math.toDegrees(r);
        System.out.println("nd = " + nd);


        int a = 2;
        int b = 1;
        double c = Math.sqrt(3);

        // radian 값 반환
        double aRad = Math.asin(c / a);

        // radian to degree
        double aDegree = Math.toDegrees(aRad);
        System.out.println("aDegree = " + aDegree);

        double bRad = Math.asin((double) b / a);
        double bDegree = Math.toDegrees(bRad);
        System.out.println("bDegree = " + bDegree);

        // sin 30 구하기
        int degree = 30;
        double rad = Math.toRadians(degree);
        double sin30 = Math.sin(rad);
        System.out.println("sin(30) = " + sin30);

        // cos 60 구하기
        degree = 60;
        rad = Math.toRadians(degree);
        double cos60 = Math.cos(rad);
        System.out.println("cos(60) = " + cos60);

        // tan 60 구하기
        double tan60 = Math.tan(rad);
        System.out.println("tan60 = " + tan60);
        System.out.println("root 3 = " + Math.sqrt(3));

    }
}
