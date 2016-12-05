
package ejercicio28;


public class Nadador {
    private int s,a,b,l,r;
    private String nombre;
    
    public boolean setNombre(String n){
        if(n!=null){
            nombre=n;
            return true;
        }else
            return false;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public boolean setSidney(int s){
        if(s>=0){
            this.s=s;
            return true;
        }else
            return false;
    }
    
    public int getSidney(){
        return s;
    }
    
    public boolean setAtenas(int a){
        if(a>=0){
            this.a=a;
            return true;
        }else
            return false;
    }
    
    public int getAtenas(){
        return a;   
    }
    
    public boolean setBeijing(int b){
        if(b>=0){
            this.b=b;
            return true;
        }else
            return false;
    }
    
    public int getBeijing(){
        return b;
    }
    
    public boolean setLondres(int l){
        if(l>=0){
            this.l=l;
            return true;
        }else
            return false;
    }
    
    public int getLondres(){
        return b;
    }    
    
    public boolean setRio(int r){
        if(r>=0){
            this.r=r;
            return true;
        }else
            return false;
    }
    
    public int getRio(){
        return r;
    }
    
    public String printStates(){
        return "El nadador: "+nombre+"\n"
                +"gano: "+s+" medallas en Sidney,\n"
                +a+" en Atenas,\n"
                +b+" en Beijing,\n"
                +l+" en Londres,\n"
                +r+" en Rio de Janeiro\n";
                
    }
}
