public class Conta 
{
    private double valor;
    private double total;
    private double gorjeta;
    private int pessoas;

	//M�TODO CONSTRUTOR
    public Conta() 
    {
        this.valor = 0.0;
        this.total = 0.0;
        this.gorjeta = 0.0;
    }
    
    //M�TODOS
    public double close (double v, int p)
    {
			this.valor = v;
			this.pessoas = p;
			
			this.total = v/p;
			
			return this.total;
	}
	
	public double tips (double v, int p)
    {
			this.valor = v;
			this.pessoas = p;
			
			this.total = ( v + (v*0.10) ) / p;
			
			return this.total;
	}


      
}

