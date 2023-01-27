/*
Programa que imprime
el nombre del empleado 
las horas diurnas laboradas
las horas norturnas laboradas
el valor de las horas diurnas
el valor de las horas nocturnas
el total a pagar HD
el total a pagar HD
LA SUMA TOTAL
*/
package informacionempleado;

/**
 *
 * @author USUARIO
 */
public class Empleado {

    private String nombre;
    private int HD;
    private int HN;
    private float valorHD;
    private float valorHN;
   
    
    
    public Empleado(String nombre, int HD, int HN, float valorHD, float valorHN){
        this.nombre = nombre;
        this.HD = HD;
        this.HN = HN;
        this.valorHD = valorHD;
        this.valorHN = valorHN;
        
    }
    public Empleado(){
        
    }
    public String getnombre(){
        return nombre;
    }
    public void setnombre(String nombre){
        this.nombre= nombre;
    }
    public int getHD(){
        return HD;
    }
    public void setHD( int HD){
        this.HD = HD;
    }
    public int  getHN(){
        return HN;
    }
    public void setHN(int HN){
        this.HN = HN;
    }
    public float getvalorHD(){
        return valorHD;
    }
    public void setvalorHD(float valorHD){
        this.valorHD = valorHD;
    }
    public float getvalorHN(){
        return valorHN;
    }
    public void setvalorHN(float valorHN){
        this.valorHN = valorHN;
    }
   
    public void datosempleado(){
        System.out.println("el nombre del empleado es :"+nombre);
        System.out.println("las horas diurnas laboradas es :"+HD);
        System.out.println("las horas norturnas laboradas son:"+HN);
        System.out.println("el valor de las horas diurnas es :"+valorHD);
        System.out.println("el valor de las horas nocturnas es :"+valorHN);
       
    }
    
    public void totalpagarempleado(){
      float PagarHD;
      PagarHD=HD*valorHD;
      System.out.println("el total a pagar HD:"+PagarHD);
      float PagarHN;
      PagarHN=HN*valorHN;
      System.out.println("el total a pagar HD:"+PagarHN);
      float Sumatotal;
      Sumatotal=PagarHD+PagarHN;
      System.out.println("LA SUMA TOTAL ES:"+Sumatotal);  
    }

       public static void main(String[] args) {
        // TODO code application logic here
        Empleado empleado1 = new Empleado("jesus",12,9,10000,20000);
        
        
        empleado1.datosempleado();
        
        empleado1.totalpagarempleado();
           System.out.println("##############################################################");
        Empleado empleado2 = new Empleado("carmen ", 24, 6, 10000, 20000);
        empleado2.datosempleado();
        empleado2.totalpagarempleado();
        empleado1.setnombre("juana");
        System.out.println(empleado2);
    }

    
    }

    

