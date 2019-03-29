package tech.visuallatam.evaluacion.Model;



public class Factura {
    String cp1,cp2,cp3,cp4,cp5,cp6,cp7,cp8,cp9;
    String username,email;
    int counter;

    public Factura(String cp1, String cp2, String cp3, String cp4, String cp5, String cp6, String cp7, String cp8, String cp9, String username, String email) {
        this.cp1 = cp1;
        this.cp2 = cp2;
        this.cp3 = cp3;
        this.cp4 = cp4;
        this.cp5 = cp5;
        this.cp6 = cp6;
        this.cp7 = cp7;
        this.cp8 = cp8;
        this.cp9 = cp9;
        this.username = username;
        this.email = email;

        counter = Integer.parseInt(cp1)+Integer.parseInt(cp2)+Integer.parseInt(cp3)+Integer.parseInt(cp4)+Integer.parseInt(cp5)+Integer.parseInt(cp6)+Integer.parseInt(cp7)+Integer.parseInt(cp8)+Integer.parseInt(cp9);

    }


    public String getCp1() {
        return cp1;
    }

    public void setCp1(String cp1) {
        this.cp1 = cp1;
    }

    public String getCp2() {
        return cp2;
    }

    public void setCp2(String cp2) {
        this.cp2 = cp2;
    }

    public String getCp3() {
        return cp3;
    }

    public void setCp3(String cp3) {
        this.cp3 = cp3;
    }

    public String getCp4() {
        return cp4;
    }

    public void setCp4(String cp4) {
        this.cp4 = cp4;
    }

    public String getCp5() {
        return cp5;
    }

    public void setCp5(String cp5) {
        this.cp5 = cp5;
    }

    public String getCp6() {
        return cp6;
    }

    public void setCp6(String cp6) {
        this.cp6 = cp6;
    }

    public String getCp7() {
        return cp7;
    }

    public void setCp7(String cp7) {
        this.cp7 = cp7;
    }

    public String getCp8() {
        return cp8;
    }

    public void setCp8(String cp8) {
        this.cp8 = cp8;
    }

    public String getCp9() {
        return cp9;
    }

    public void setCp9(String cp9) {
        this.cp9 = cp9;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }


}
