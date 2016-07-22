/*Crea una clase llamada Pelicula con las siguientes características:
• Atributos: titulo, genero, creador, año, duracion y visto. OK

• Constructores:

• Un constructor default. OK

• Un constructor con el titulo y creador. Los demás campos tendrán su valor default por tipo de dato. Visto tendrá false por defecto. OK

•	Un constructor con todos los atributos, excepto visto. OK

• Métodos:

• Métodos get de todos los atributos, excepto visto. OK

• Métodos set de todos los atributos, excepto visto. OK

• Sobreescribe el método toString.*/

public class Pelicula {
  private String titulo;
  private String genero;
  private String creador;
  private short año;
  private short duracion; //en minutos
  private boolean visto;

  public Pelicula(){
    //Constructor por default
  }

  public Pelicula(String titulo, String genero){
    //Segundo constructor
    this.creador = null;
    this.año = 0;
    this.duracion = 0;
    this.visto = false;
  }

  public Pelicula(String titulo, String genero, String creador, short año, short duracion){
    //Tercer constructor
    this.visto = false;//No dice que lo creemos pero por logica asumo que es la mejor forma de iniciar el objeto en este contructor
  }

  public String getTitulo(){
    return this.titulo;
  }

  public String getGenero(){
    return this.genero;
  }

  public String getCreador(){
    return this.creador;
  }

  public short getAño(){
    return this.año;
  }

  public short getDuracion(){
    return this.duracion;
  }

  public void setTitulo(String titulo){
    this.titulo = titulo;
  }

  public void setGenero(String genero){
    this.genero = genero;
  }

  public void setCreador(String creador){
    this.creador = creador;
  }

  public void setAño(short año){
    this.año = año;
  }

  public void setDuracion(short  duracion){
    this.duracion = duracion;
  }

  
}
