package desafiocapgemini;

public class SenhaForte {
	
	static String ValidaSenha(String senha) {	
		String resultado = "";
		int [] erros = ValidaCaracteres(senha);
		boolean temErro= false;
		
		
		if (senha.length() > 1) {
			for (int i = 0; i < erros.length; i++) {
				if (erros[i] == 1){
				  resultado = resultado + "- A senha precisa ter pelo menos 1 letra minúscula \n";
				  temErro = true;
				}
				
				if (erros[i] == 2){
					  resultado = resultado + "- A senha precisa ter pelo menos 1 letra maiúscula \n";
					  temErro = true;
					}
				
				if (erros[i] == 3){
					  resultado = resultado + "- Sua senha tem apenas " + senha.length()+ " dígitos, ela senha precisa ter pelo menos 6 dígitos \n";
					  temErro = true;
					}
				
				if (erros[i] == 4){
					  resultado = resultado + "- A senha precisa ter pelo menos 1 caráter especial \n";
					  temErro = true;
					}
		    }
		} else {
			resultado = "Senha precisa ter + que 1 dígito" ;
		}
		
		if(temErro) {
			return "SUA SENHA É CONSIDERADA FRACA PELOS SEGUINTES MOTIVOS: \n \n" + resultado;
		} else {
		    return "SUA SENHA É FORTE";
		}
	}	
	
	/*
	 Erro 1 = Sem letra minúscula
	 Erro 2 = Sem letra maiúscula
	 Erro 3 = Menos de 6 dígitos
	 Erro 4 = Sem caracter especial  
	 */
	static int[] ValidaCaracteres(String senha) {    
		int[] erros = new int[4]; 
		char[] especiais = {'!','@','#','$','%','^','&','*','(',')','-','+'};
		boolean esp = false;
		
		if (!senha.matches(".*[a-z].*")){
	    	erros[0] = 1;
	    }
	    
	    if (!senha.matches(".*[A-Z].*")) {
	    	erros[1] = 2;;
		}
		
		if (senha.length() < 6) {
			erros[2] = 3;;
		}
		
		for (int i = 0; i <= senha.length()-1; i++) {
			char letra = senha.charAt(i);
			
			for (int j = 0; j <= especiais.length-1;j++) {
				if (letra == especiais[j]) {
				    esp = true;
					break;
				} 
			}	
		}
		
		if (!esp) {
			erros[3] = 4;
		}
		
		return erros;
	}
}
