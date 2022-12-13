/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance;

/**
 *
 * @author TOSHIBA
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    ketua ketua = new Ketua("2875678","Bae Inhyuk","laki laki",2017,2);
    kaprodi kaprodi = new kaprodi("2345533","Putri Natali","perempuan","RPL");
    
    ketua.viewDosen();
    ketua.viewKetua();
    
    kaprodi.viewDosen();
    kaprodi.viewKaprodi();   
        
    }
    
}
