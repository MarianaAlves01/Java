// Mariana Alves - F2211313


public class Bhaskara {
	
	private int a;
    private int b;
    private int c;

    public Bhaskara(int a, int b, int c) 
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private int calc() 
    {
        if(this.a == 0) 
        {
            return -1;
        }
        
        int delta = (int) Math.pow(this.b, 2) - 4 * this.a * this.c;
        
        if(delta < 0) 
        {
            return -1;
        } 
        else 
        {
            return delta;
        }
    }

    public String exibir() 
    {
        double x1 = (-this.b + (Math.sqrt(calc()))) / (2 * this.a);
        
        double x2 = (-this.b - (Math.sqrt(calc()))) / (2 * this.a);
        
        return String.format("\nX\' = %.2f\nX\" = %.2f", x1, x2);
    }
}

