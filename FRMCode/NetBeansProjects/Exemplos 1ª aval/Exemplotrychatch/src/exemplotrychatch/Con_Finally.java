
package exemplotrychatch;

import javax.swing.JOptionPane;

public class Con_Finally {
    private int numerador,denominador;
    
    public Con_Finally(){}

    public void dividirCF(){
        try{
        numerador=Integer.parseInt(JOptionPane.showInputDialog("Introduza o numerador"));
        denominador=Integer.parseInt(JOptionPane.showInputDialog("Introduza o denominador"));
            int resultado=numerador/denominador;
            System.out.println(numerador+"/"+denominador+"="+resultado);
        }catch(ArithmeticException e1){
            System.out.println("Erro1:Non se pode dividir entre 0.");
         }catch(NumberFormatException e2){
            System.out.println("Erro2:"+e2.toString());
         }finally{
            System.out.println("Finalmente, executome.");
        }
}
}
