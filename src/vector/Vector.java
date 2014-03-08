


package vector;
import javax.swing.JOptionPane;


public class Vector {
    public static void main(String[] args) {
    
    //int opcion = 0;
    int dato;
    
            ValidarV validarvector = new ValidarV();

        //do{
            //opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Una De Las Siguientes Opciones:\n 1.ingresar numero 2.mostrar numero"))
                    ;
            //switch(opcion){
               // case 1:
                    for(int j=0; j<5; j++){
                        dato=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Su Respectivo numero: "));
                        
                        if(dato>8){                        
                        
                        
                      validarvector.setnumero(j,dato);
                        }else{
                        
                        JOptionPane.showMessageDialog(null,"el numero ingresado no es mayor a 8");
                        }
                        }
                        
               // break;

               // case 2:
                    /*
                    for(int j=0;j<5;j++){
                        JOptionPane.showMessageDialog(null,"El numero en la posicion "+(j+1)+
                                " Es: \n"+validarvector.getnumero()[j]);
                    
                    
                    /*mateo es mejor
                    
                    y siempre lo sera no lo olvides
                    
                    
                    }
                            */
               // break;
                            

                
            
            
                   
        
        
            }
        
       // }while(opcion<2);
    
}

//}

