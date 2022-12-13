/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TOSHIBA
 */
public class Kaprodi extends Dosen {
    
    
    private String jurusan;
    
public Kaprodi(String nidn,String nama,String JenisKelamin,String Jurusan){
    super(nidn,nama,JenisKelamin);
    this. jurusan=  jurusan;
}

public void viewKaprodi(){
    System.out.println("Jurusan "+jurusan);
    
    
}
    
}


