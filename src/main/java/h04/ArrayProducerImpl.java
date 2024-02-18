package h04;

public class ArrayProducerImpl implements ArrayProducer {

    @Override
    public RepetitiveRobotImpl[] produceArray1(int arraySize) {
        RepetitiveRobotImpl[] testArray1 = new RepetitiveRobotImpl[arraySize];
        for (int i = 0; i < arraySize; i++) {
            RepetitiveRobotImpl rob = new RepetitiveRobotImpl(0);
            rob.setY(i);
            rob.setX(2 * i);
            rob.putCoin(i);
            testArray1[i] = rob;
        }
        return testArray1;
    }

    @Override
    public FloorVector[] produceArray2(int arraySize) {
        FloorVector[] vectors = new FloorVector[arraySize];
        for (int i = 0; i < arraySize; i++) {
            FloorVector vector = new FloorVector(3 * i + 0.1);
            vector.setRealY(4 * i + 0.2);
            vector.setRealZ(5 * i + 0.3);
            vector.setFirstAxis(Axis.values()[i % 3]);
            vector.setSecondAxis(Axis.values()[(i + 1) % 3]);

            vectors[i] = vector;
        }
        return vectors;
    }

    @Override
    public WithNaturalCoordinates[] produceArray3(RepetitiveRobotImpl[] array1, FloorVector[] array2) {
        WithNaturalCoordinates[] coordinates = new WithNaturalCoordinates[2* array1.length];
        for (int i = 0; i < array1.length; i++) {
            coordinates[2 * i] = array1[i];
            coordinates[2 * i + 1] = array2[i];
        }
        return coordinates;
    }

    @Override
    public WithNaturalCoordinates[] produceArray4(WithNaturalCoordinates[] array) {
        WithNaturalCoordinates[] coordinates = new WithNaturalCoordinates[array.length];
        for (int i = 0; i < coordinates.length / 2; i++) {
            coordinates[2 * i + 1] = array[2 * i];
            coordinates[2 * i] = array[2 * i + 1];
        }
        return coordinates;
    }
}
