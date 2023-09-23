// Mariana Alves - F2211313

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	
	public static void main (String[] args)throws Exception {
		
		Scanner sc = new Scanner(System.in);

        Date datas[] = new Date[2];
        SimpleDateFormat formatacaoData = new SimpleDateFormat("dd-MM-yyyy");
        Data data = new Data();
        for(int i = 0; i < datas.length; i++) {
            System.out.print("Entre com a " + (i + 1) + "� data separando os elementos com h�fen (dd-mm-aaaa): ");
            String dataStr = sc.nextLine();
            datas[i] = formatacaoData.parse(dataStr);
        }
        sc.close();

        System.out.println("As datas s�o iguais? " + (data.isDatasIguais(datas) ? "Sim" : "N�o" ));
        System.out.println("Ordem das datas: " + data.ordemDatas(datas));
        System.out.println("Diferen�a de dias entre as datas: " + Math.abs(data.diferencaDias(datas)));
	}
}

