void main(){
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	IO.println("Escreva um número representando o dia da semana: ");
	int x = sc.nextInt();
	String dia;
	
	if (x == 1) {
		dia = "domingo";
	} else if (x == 2) {
		dia = "segunda";
	} else if (x == 3) {
		dia = "terça";
	} else if (x == 4) {
		dia = "quarta";
	} else if (x == 5) {
		dia = "quinta";
	} else if (x == 6) {
		dia = "sexta";
	} else if (x == 7) {
		dia = "sábado";
	} else {
		dia = "Valor inválido";
	}
	IO.println("Dia da semana: " + dia);
	
	
	sc.close();
}