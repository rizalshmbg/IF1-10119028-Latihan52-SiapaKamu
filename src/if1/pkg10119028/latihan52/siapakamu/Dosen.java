/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119028.latihan52.siapakamu;

/**
 *
* @author RizalSihombing
 * NAMA     : Rizal Sihombing
 * KELAS    : IF1
 * NIM      : 10119028
 * Deskripsi Program : Program ini berisi program untuk menampilkan identitas dan kegiatan dosen dan mahasiswa
 */
public class Dosen extends Manusia{   
    private String nip, mataKuliah;
    
    public String getNip() {
        return this.nip;
    }
    
    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public String getMataKuliah() {
        return this.mataKuliah;
    }
    
    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    
    public void mengajarApa() {
        System.out.println("Saya " + getNama() + " umur " + getUmur() + " tahun sedang mengajar matakuliah " + mataKuliah);
    }
    
    public void siapaKamu() {
        System.out.println("Saya Dosen");
    }
    
}