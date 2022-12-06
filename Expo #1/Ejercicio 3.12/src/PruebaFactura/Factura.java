
package PruebaFactura;


public class Factura {
    String NumP;
    String Des;
    int cant;
    double Prec;
    double montoFactura;
    
    public Factura(String NumP, String Des, int cant, double Prec){
        this.NumP = NumP;
        this.Des = Des;
        this.cant = cant;
        if(Prec > 0.0){
            this.Prec = Prec;            
        }
    }
    
    public String getNumP(){
        return NumP;
    }    
    public void setNumP(String NumP){
        this.NumP = NumP;
    }
    
    
     public String getDes(){
        return Des;
    }    
    public void setDes(String Des){
        this.Des = Des;
    }
    
    
     public int getcant(){
        return cant;
    }    
    public void setcant(int cant){
        this.cant = cant;
    }
    
    
     public double getPrec(){
        return Prec;
    }
    public void setPrec(double Prec){
        this.Prec = Prec;
    }
    
    
    public double obtenerMontoFactura (int cant, double Prec){
        this.montoFactura += cant * Prec;
        return this.montoFactura;
    }       
}
