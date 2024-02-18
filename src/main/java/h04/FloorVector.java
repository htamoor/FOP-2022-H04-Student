package h04;

public class FloorVector implements WithNaturalCoordinates {
    private double x;
    private double y;
    private double z;
    private Axis firstAxis;
    private Axis secondAxis;

    public FloorVector(double x) {
        this.x = x;
        this.y = 3.14;
        this.z = 2.71;
    }


    public Axis getFirstAxis() {
        return firstAxis;
    }

    public Axis getSecondAxis() {
        return secondAxis;
    }

    public void setFirstAxis(Axis axis) {
        this.firstAxis = axis;
    }

    public void setSecondAxis(Axis axis) {
        this.secondAxis = axis;
    }

    public int getX() {
        if (firstAxis == Axis.X) {
            return Math.abs((int) x);
        } else if (firstAxis == Axis.Y) {
            return Math.abs((int) y);
        } else {
            return Math.abs((int) z);
        }
    }

    public int getY() {
        if (secondAxis == Axis.X) {
            return (int) x;
        } else if (secondAxis == Axis.Y) {
            return (int) y;
        } else {
            return (int) z;
        }
    }


    public void setX(int x) {
        setValueForAxis(firstAxis, x);
    }

    private void setValueForAxis(Axis axis, int value) {
        switch (axis) {
            case X:
                x = value;
                break;
            case Y:
                y = value;
                break;
            case Z:
                z = value;
                break;
            default:
                throw new IllegalArgumentException();
        }
    }

    public void setY(int y) {
        setValueForAxis(secondAxis, y);
    }

    public double getRealX() {
        return x;
    }

    public double getRealY() {
        return y;
    }

    public double getRealZ() {
        return z;
    }

    public void setRealX(double x) {
        this.x = x;
    }

    public void setRealY(double y) {
        this.y = y;
    }

    public void setRealZ(double z) {
        this.z = z;
    }
}
