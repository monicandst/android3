package com.example.tugas3;

public class MovieModel {
    String judulfilm;

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    String sinopsis;
    int gambarfilm;

    public String getJudulfilm() {
        return judulfilm;
    }

    public void setJudulfilm(String judulfilm) {
        this.judulfilm = judulfilm;
    }

    public int getGambarfilm() {
        return gambarfilm;
    }

    public void setGambarfilm(int gambarfilm) {
        this.gambarfilm = gambarfilm;
    }
}
