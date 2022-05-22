package censo_demografico;

import java.util.Scanner;

public class censo_demografico {
		@SuppressWarnings({ "resource" }) //suprimir ou ignorar avisos do compilador
		public static void main(String[] args) {
			
		// Novo Scanner: ("ler")

		Scanner ler = new Scanner(System.in);
		
		//    | Variaveis | 
		
		// Explicações
		
		// (" total_ ") 	: total do grupo
		// (" cont_ ")  	: Contagem
		// (" media_ ") 	: media
		// (" tam_ ") 		: tamanho
		// (" result_ ") 	: resultado
		
		
		// (" _alt_ ")  	: altura
		// (" _idade_ ")	: idade
		
		// (" _f ")     	: feminino
		// (" _m ")     	: masculino
		// (" _g ")     	: grupo
		
		//Varivel de quantidade de pessoas do grupo
		
		int total_g = 1000; 								// Numero total de pessoas grupo 
		
		//variaveis de leitura
		
		int[] sexo = new int[1000]; 						// array do sexo em int
			
		int[] idade = new int[1000];						// array da idade em int
		
		float[] altura = new float[1000]; 					// array da altura em float
		
		// Variaveis Contagem
		
		int i; 												// contagem do FOR
		
		int cont_femi = 0, cont_masc = 0, cont_outros = 0;	// Contagem dos sexos
		
		int cont_idade_18a35 = 0;							// Contagem do percentual de pessoas com 18 a 35 anos
		
		// Variaveis Media
		
		float media_alt_f = 0;								// Media de altura feminino
		
		float media_idade_g = 0;							// Media de idade do Grupo
		
		float media_idade_m = 0;							// Media de idade dos masculino
		
		//Resultados Calculos
		
		float result_idade_g = 0;							//Resultado Final da idade "Media" do grupo
		
		float result_alt_f = 0;								//Resultado Final da altura "Media" feminino
		
		float result_idade_m = 0;							//Resultado Final da idade "Media" do masculino
		
		// Inicio For
		
	    for( i=0; i < total_g; i++){
	    	
	    	//leitura dos dados
	    	
	    	//sexo
	    	System.out.printf("\n Digite o sexo \n | Feminino( 0 ) \n | Masculino ( 1 ) \n | Outros ( 2 )\n Aqui: ");
	        sexo[i] = ler.nextInt(); //leitura do sexo da pessoa
	        switch (sexo[i]) {
			case 0: {
				cont_femi++;// contador do feminino | adição
				break;
			}
			case 1: {
				cont_masc++;// contador do masculino | adição
				break;
			}
			case 2: {
				cont_outros++;// contador dos outros| adição
				break;
			}    
	        }
	        //idade
	        
	        System.out.printf("Digite a idade: ");
	        idade[i] = ler.nextInt(); //leitura da idade da pessoa
	        
	        //Adição das idades 
	        media_idade_g += idade[i];
	        
	        // caso a pessoa seja masculino sera adicionado a 
	        if (sexo[i] == 1) {
				media_idade_m += idade[i];
			}
	        
	        // Caso a pessoa seja dentre 18 a 35 anos sera contado
	        if( idade[i] >= 18 && idade[i] <= 35) {
	        	cont_idade_18a35++;
	        }
	        
	        //altura
	        System.out.printf("Digite a altura: ");
	        altura[i] = ler.nextFloat();//leitura da altura da pessoa
	        
	        //se sexo = 0 adicionar a altura no array (media_alt_f)
	        if(sexo[i] == 0){	 
	        	media_alt_f += altura[i];
	        }
	    }
	    
	    //Fim FOR
	    
	    //Calculos Finais
	    
	    //Calculo Idade media do Grupo
	    result_idade_g = media_idade_g / total_g;
	    
	    //Calculo Altura media Feminina
	    result_alt_f = media_alt_f / cont_femi;
	    
	    //Calculo idade media Masculina
	    result_idade_m = media_idade_m / cont_masc;
	    
	    //Resultados
	    
	    //Titulo
	    System.out.printf("\n Resultado do Censo Demográfico de %d Habitantes \n", total_g);
	    
		//Exibição do resultado da idade media do Grupo
		System.out.printf("\n Média da idade do grupo: %.2f", result_idade_g);
		    
		//Exibição do resultado da Altura media Feminina
		System.out.printf("\n Média de altura das mulheres: %.2f", result_alt_f);
	    
		//Exibição do resultado da idade media Masculina
		System.out.printf("\n Média da idade dos homens: %.2f", result_idade_m);
		    
		//Exibição de quantidade de pessoas que identificaram como outros
		System.out.printf("\n pessoas que identificam como outros: %d", cont_outros);
		    
		//Percentual de pessoas com idade entre 18 e 35 anos (inclusive)
		System.out.printf("\n Pessoas com idade entre 18 e 35 anos: %d", cont_idade_18a35);
       
	}
		
}

