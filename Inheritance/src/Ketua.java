/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TOSHIBA
 */
public class Ketua extends Dosen {
    
    private int tahunMulai;
    private int jabatanKe;
    
public Ketua (String nidn,String nama,String JenisKelamin, int tahunMulai,int jabatanKe){
    super(nidn,nama,JenisKelamin);
    this.tahunMulai=tahunMulai;
    this.jabatanKe=jabatanKe;
}
public void viewKetua(){
    System.out.println("Tahun mulai jabtaan : "+tahunMulai);
    System.out.println("Jabatan Ketua Ke-   :"+jabatanKe);
    
}


}
