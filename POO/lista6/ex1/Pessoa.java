// Mariana Alves - F2211313


public class Pessoa 
{
	//atributos
	private String nome;
	private int idade;
	private double altura;
	
	//constructor
	public Pessoa()
	{
		this.nome = null;
        this.idade = 0;
        this.altura= 0.0;
	}
	
	//getters and setters
	
	/* NOME */
	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /* IDADE */
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    /* ALTURA */
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    //methods
    public void fazAniversario(boolean b) {
        if(b)
        {
			this.idade++;
		}
    }
    
    
}

