public class MathFunc implements MathCalculate{
    @Override
    public float[] pow(float r, float i, int times) {
        float[] tuple = {1, 1};
        for (int iter= 0 ; iter<times; iter++){
            tuple = multiply(r,i, tuple[0], tuple[1]);
        }
        return tuple;
    }

    @Override
    public float abs(float r, float i) {
        return (float)Math.sqrt(r*r + i*i);
    }

    @Override
    public float[] multiply(float r1, float i1, float r2, float i2) {
        float[] tuple = {r1* r2 + Math.abs(i1*i2), r1*i2 + i1*r2};
        return tuple;
    }
}
