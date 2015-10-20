
package bol51;

/**
 *
 * @author miglezlor
 */
public class Coche {
    private int velocidade;
    private int valor;
    private int menos;
    
    public Coche(){
         velocidade=0;
    }
    
    public void setVelocidade(int velocidade){
        this.velocidade=velocidade;
    }
    
    public int getVelocidade(){
       
        return velocidade;
    }
    
    public void frenar(int menos){
          velocidade=this.velocidade+menos;
    }
        
    public void acelerar (int valor){
    
           velocidade=this.velocidade+valor;
    }
    
    
}
