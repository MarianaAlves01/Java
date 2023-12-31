// Mariana Alves - F2211313


public class Mes
{
	private int dia;
    private int mes;
    private int ano;

    public Mes(int dia, int mes, int ano) 
    {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public boolean valida() 
    {
        boolean v = false;
        
        if(dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12 && ano >= 1 && ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) || ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia <= 30) || (mes == 2 && (dia <= 29 && ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) || dia <= 28))) 
        {
            v = true;
        }
        return v;
    }
    
    public String exibir() 
    {
        if(valida()) 
        {
            return String.format("Data formatada: %d/%d/%d", this.dia, this.mes, this.ano);
        } 
        else 
        {
            return String.format("A data inserida (%d/%d/%d) n�o � v�lida!", this.dia, this.mes, this.ano);
        }
    }
    
    
}
