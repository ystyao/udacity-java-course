// Complete the code to find the volume of a cone with radius r and height h.
// Use Math.PI for pi

public class Cone
{
    private int r;
    private int h;

    /**
     * Constructor for the Cone class
     * @param r, the radius of the cone
     * @param h, the height of the cone
     */
    public Cone(int r, int h)
    {
        this.r = r;
        this.h = h;
    }
   
    /**
     * Calculates the volume of the cone
     * @return the volume of the cone
     * (Volume of a cone = 1/3 * PI * r^2 * h)
     */
    public double getVolume()
    {
        double volume;
        double rDouble = (double)(this.r);
        double hDouble = (double)(this.h);
        double third = 1.0/3.0;
        double rSquared = Math.pow(rDouble, 2);
        
        volume = third * Math.PI * rSquared * hDouble;
        // TODO write the code to assign the volume of the cone to the variable volume. Use Math.PI
        return volume;
    }
}
