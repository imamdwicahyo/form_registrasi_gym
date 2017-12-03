/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author MSW98
 */
public class ModelRegistrasi {

    private String noKtp, nama, jKelamin = "", cabang,
            handuk = "", paket = "", biaya = "";

    public String getNoKtp() {
        return noKtp;
    }

    public void setNoKtp(String noKtp) {
        this.noKtp = noKtp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getjKelamin() {
        return jKelamin;
    }

    public void setjKelamin(String jKelamin) {
        this.jKelamin = jKelamin;
    }

    public String getCabang() {
        return cabang;
    }

    public void setCabang(String cabang) {
        this.cabang = cabang;
    }

    public String getHanduk() {
        return handuk;
    }

    public void setHanduk(String handuk) {
        this.handuk = handuk;
    }

    public String getPaket() {
        return paket;
    }

    public void setPaket(String paket) {
        this.paket = paket;
    }

    public String getBiaya() {
        return biaya;
    }

    public void setBiaya(String biaya) {
        this.biaya = biaya;
    }

    public void hargaPaket() {
        if (paket=="Reguler"){
            biaya = "Rp.450.000 / Bln";
        }else if (paket == "Mahasiswa"){
            biaya = "Rp.300.000 / Bln";
        }else if (paket == "Private"){
            biaya = "Rp.750.000 / Bln";
        }else if (paket == "Premium"){
            biaya = "Rp.1.000.000 / Bln";
        }
    }

    public void jenisHanduk(String jenis) {
        this.handuk = handuk + " " +jenis;
    }

}
