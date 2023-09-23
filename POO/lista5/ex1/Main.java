/// Mariana Alves - F2211313

/*
 * 1) 
 * 	  Criar uma classe para representar uma lâmpada vendida em um supermercado. 
 * 	  Além de marca, modelo e tipo, esta deve conter um atributo que indique um dos dois possíveis estados da lâmpada (acesa ou apagada).
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
                           "\n Está acesa? " +l.isEstado());
	}
}

