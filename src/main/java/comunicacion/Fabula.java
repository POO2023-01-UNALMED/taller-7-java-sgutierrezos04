package comunicacion;

public class Fabula extends Escrito{
    private String ensenanza;
    private String interpretacion;
    private static int factor=1;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza,String interpretacion){
        super(origen,titulo,autor,paginas);
        this.ensenanza=ensenanza;
        this.interpretacion=interpretacion;
    }

    public String getEnsenanza() {
        return ensenanza;
    }

    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    
    public String interpretacion() {
        return interpretacion;
    }

    @Override
    public int palabrasTotales(int palabras) {
        return palabras*factor*this.getPaginas();
    }

    @Override
    public String toString() {
        return this.getOrigen()+ "\n"+
        this.getTitulo()+ "\n"+
        this.getAutor()+ "\n"+
        this.getPaginas()+ "\n"+
        this.getEnsenanza();
    }
}