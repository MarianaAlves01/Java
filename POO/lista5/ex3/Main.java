// Mariana Alves - F2211313


public class Main 
{	
	public static void main (String[] args) 
	{
		//////////////// Primeira versão ////////////////////

			Lamp l = new Lamp();
			
			l.setMarca("Philips");
			l.setModelo("Bulbo");
			l.setTipo("LED");
			l.setEstado(2);
			
			
			
			
			System.out.println("\n Marca: "+ l.getMarca()+
							   "\n Modelo: " +l.getModelo()+
							   "\n Tipo: " + l.getTipo() +
							   "\n Estado: " + l.getEstado());
		
        
		
	}
}

