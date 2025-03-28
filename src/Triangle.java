public class Triangle {

    private Point pointA;
    private int sideA, sideB, sideC;

    public static int counter = 0;
    public int counterForObject = 0;

    public Triangle(Point pointA, int sideA, int sideB, int sideC) {
        this.pointA = pointA;
        setSideA(sideA);
        setSideB(sideB);
        setSideC(sideC);
        counter++;
        counterForObject++;
    }

    public Triangle(Point pointA, int sideA) {
        this.pointA = pointA;
        setSideA(sideA);
        setSideB(sideA);
        setSideC(sideA); // eşkenar üçgen gibi
        counter++;
        counterForObject++;
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA < 0){
            this.sideA = 0;
            throw new IllegalArgumentException("Side A can't be negative!!");
        } else {
            this.sideA = sideA;
        }
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB < 0){
            this.sideB = 0;
            throw new IllegalArgumentException("Side B can't be negative!!");
        } else {
            this.sideB = sideB;
        }
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        if (sideC < 0){
            this.sideC = 0;
            throw new IllegalArgumentException("Side C can't be negative!!");
        } else {
            this.sideC = sideC;
        }
    }

    public int perimeter() {
        return sideA + sideB + sideC;
    }

    public double area() {
        double s = perimeter() / 2.0;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
}
