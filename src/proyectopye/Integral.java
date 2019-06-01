package proyectopye;

import org.nfunk.jep.JEP;

public class Integral {
    
    public String metodoSimpson(String a1, String b1, String fx, String particiones){
        String mensaje = null;
        
    try{
        JEP jep = new JEP();
        jep.addStandardFunctions();
        jep.addStandardConstants();
        jep.setImplicitMul(true);
        
        jep.parseExpression(a1);
        double a = jep.getValue();
        
        jep.parseExpression(b1);
        double b = jep.getValue();
        
        int n = Integer.parseInt(particiones);
        
        if(n%2!=0){
            throw new Exception ("error");
        }
        
        double h= (b-a)/n;
        double x[] = new double [n+1];
        x[0]=a;
        x[n]=b;
        
        for(int i=1; i<x.length-1; i++){
            x[i]=x[0]+(i*h);
        }
        
        double fxi[] = new double [n+1];
        
        double m=0;
        
        for(int i=0; i<x.length; i++){
            fxi[i]=jep.addVariable("x", x[i]);
            jep.parseExpression(fx);
            fxi[i]=jep.getValue();
            
        }
        for(int i=1; i<n-1;i++){
            if(i%2!=0){
                m=m+(4*fxi[i]);
            }
            else{
                m=m+(2*fxi[i]);
            }
            m=m+fxi[0]+fxi[n];
        }
        
        m=(h*m)/3;
        mensaje=Double.toString(m);
        } catch (Exception e){
            mensaje="error de datos";
        }
    System.out.println(mensaje);
    return mensaje;
    }
}