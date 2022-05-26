package PMedidas;



/**
 * Class Medida
 */
abstract public class Medida {
 //David Abner Bautista Ayala
 
 /**
 *Rodriguez Garcia Juan Alonso
 *Se agrego el atributo tipo_medida
 */
private double tipo_medida;
  //
  // Fields
  //

  
  //
  // Constructors
 //
 /**
  *Rodriguez Garcia Juan Alonso
  *Se agrego el constructor de la clase medida
  */
  public Medida () { };
  //Herrera improvement
   
  
  //
  // Methods
 //
 /**
 *Rodriguez Garcia Juan Alonso
 *Se creo el metodo compare 
 */
  boolean compare (Medida m){
    return this.getClass().equals(m.getClass());
   }
   

  //
  // Accessor methods
  //

  //
  // Other methods
  //

}
