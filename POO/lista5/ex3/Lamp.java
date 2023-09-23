// Mariana Alves - F2211313


public class Lamp 
{	
	private String marca;
	private String modelo;
	private String tipo;
	private String estado;
	
	//CONSTRUCTOR
	public Lamp ()
	{
		setEstado(0);
	}
	
	
	// GETTERS AND SETTERS
	//marca
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //modelo
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //tipo
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    //estado
    public String getEstado() {
        return estado;
    }

    public void setEstado(int e) {
        
        if(e == 1)
		{
			this.estado = "acesa";
		}
		else if(e == 2)
		{
			this.estado = "à meia-luz";
		}
		else
		{
			this.estado = "apagada";
		}
    }
   
}
