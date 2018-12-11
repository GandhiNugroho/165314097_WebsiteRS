package POJOs;
// Generated Dec 11, 2018 3:35:22 PM by Hibernate Tools 4.3.1

import java.util.Date;

/**
 * Antrian generated by hbm2java
 */
public class Antrian implements java.io.Serializable {

  private Long id;
    private Date tanggal;
    private String noRm;
    private String nama;
    private String alamat;
    private String namaKlinik;

    public Antrian() {
    }

    public Antrian(Date tanggal, String noRm, String nama, String alamat, String namaKlinik) {
        this.tanggal = tanggal;
        this.noRm = noRm;
        this.nama = nama;
        this.alamat = alamat;
        this.namaKlinik = namaKlinik;
    }

    public Antrian(Long id, Date tanggal, String noRm, String nama, String alamat, String namaKlinik) {
        this.id = id;
        this.tanggal = tanggal;
        this.noRm = noRm;
        this.nama = nama;
        this.alamat = alamat;
        this.namaKlinik = namaKlinik;

    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTanggal() {
        return this.tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public String getNoRm() {
        return this.noRm;
    }

    public void setNoRm(String noRm) {
        this.noRm = noRm;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNamaKlinik() {
        return this.namaKlinik;
    }

    public void setNamaKlinik(String namaKlinik) {
        this.namaKlinik = namaKlinik;
    }

    public String toJson() {
        return "{\"id\":" + getId() + ",\"tanggal\":" + getTanggal() + ",\"noRm\":" + getNoRm() + ",\"nama\":" + getNama() 
                + ",\"alamat\":" + getAlamat() + ",\"namaKlinik\":" + getNamaKlinik() + "}";

    }
}
