/// Mariana Alves - F2211313

/*
 * 1) 
 * 	  Criar uma classe para representar uma l�mpada vendida em um supermercado. 
 * 	  Al�m de marca, modelo e tipo, esta deve conter um atributo que indique um dos dois poss�veis estados da l�mpada (acesa ou apagada).
 */
 
public class Main 
{	
	public static void main (String[] args) 
	{
		Lamp l = new Lamp ();
        
        l.setMarca("Philips");
        l.setModelo("Bulbo");
        l.setTipo("LED");
        l.setEstado(true);
        
        
        System.out.println("\n Marca: "+ l.getMarca()+
                           "\n Modelo: " +l.getModelo()+
                           "\n Tipo: " + l.getTipo() +
                           "\n Est� acesa? " +l.isEstado());
	}
}

