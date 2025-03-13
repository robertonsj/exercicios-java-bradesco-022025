package exercicios.watch;

public class TimeWithoutAPI {
	
	    private int horas;
	    private int minutos;
	    private int segundos;

	    public TimeWithoutAPI(int horas, int minutos, int segundos) {
	        if (horas < 0 || horas > 23 || minutos < 0 || minutos > 59 || segundos < 0 || segundos > 59) {
	            throw new IllegalArgumentException("Hora inválida! Use valores entre 00:00:00 e 23:59:59.");
	        }
	        this.horas = horas;
	        this.minutos = minutos;
	        this.segundos = segundos;
	    }

	    // Método para formatar e retornar a hora
	    public String getHorarioFormatado() {
	        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
	    }

	    // Método principal para teste
	    public static void main(String[] args) {
	        TimeWithoutAPI horario = new TimeWithoutAPI(14, 5, 9);
	        System.out.println(horario.getHorarioFormatado()); // Saída: 14:05:09
	    }

}
