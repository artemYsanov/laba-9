package com.company;

public class Main {

    public static void main(String[] args) {
    buyer aa = new buyer("м5", 2000000, 90, "22AB2","@evgenii");
    aa.buy();
    buyer2 bb = new buyer2("Q5", 1500000,85,"qwertyuiop","@saha");
    bb.buy2();
    buyer3 cc = new buyer3("E 63 amg", 2500000, 98,"87654321","@dima");
    cc.buy3();
    }
}
interface tovar{
   void tovarName();
   void price();
   void raiting();
}
class Car implements tovar {
    String bmw;
    int cena;
    int rait;

    Car(String bmw, int cena, int rait) {
        this.bmw = bmw;
        this.cena = cena;
        this.rait = rait;
    }

    public void tovarName(){
        System.out.println(bmw);
    }

    public void price(){
        System.out.println(cena);
    }

    public void raiting(){
        System.out.println(rait);
    }
}
class Car2 implements tovar{
    String audi;
    int cena2;
    int rait2;

    Car2(String audi, int cena2, int rait2){
        this.audi = audi;
        this.cena2 = cena2;
        this.rait2 = rait2;
    }
    public void tovarName(){
        System.out.println(audi);
    }

    public void price(){
        System.out.println(cena2);
    }

    public void raiting(){
        System.out.println(rait2);
    }
}
class Car3 implements tovar {
    String mercedes;
    int cena3;
    int rait3;

    Car3(String mercedes, int cena3, int rait3) {
        this.mercedes = mercedes;
        this.cena3 = cena3;
        this.rait3 = rait3;
    }

    public void tovarName(){
        System.out.println(mercedes);
    }

    public void price(){
        System.out.println(cena3);
    }

    public void raiting(){
        System.out.println(rait3);
    }
}
interface user{
    void password();
    void login();
}
class buyer implements user, tovar{
    String bmw;
    int cena;
    int rait;
    String pass;
    String log;
    buyer(String bmw, int cena, int rait, String pass, String log){
        this.bmw = bmw;
        this.cena = cena;
        this.rait = rait;
        this.pass = pass;
        this.log = log;
    }

    public void tovarName(){
        System.out.println(bmw);
    }

    public void price(){
        System.out.println(cena);
    }

    public void raiting(){
        System.out.println(rait);
    }
    public void password(){
        System.out.println(pass);
    }
    public void login(){
        System.out.println(log);
    }
    public void buy(){
        System.out.println("Имя пользователя - " + log + " покупает "+ bmw);
    }
}
class buyer2 implements user, tovar{
    String audi;
    int cena2;
    int rait2;
    String pass;
    String log;
    buyer2(String audi, int cena2, int rait2, String pass, String log){
        this.audi = audi;
        this.cena2 = cena2;
        this.rait2 = rait2;
        this.pass = pass;
        this.log = log;
    }

    public void tovarName(){
        System.out.println(audi);
    }

    public void price(){
        System.out.println(cena2);
    }

    public void raiting(){
        System.out.println(rait2);
    }
    public void password(){
        System.out.println(pass);
    }
    public void login(){
        System.out.println(log);
    }
    public void buy2(){
        System.out.println("Имя пользователя - " + log + " покупает "+ audi);
    }
}
class buyer3 implements user, tovar{
    String mersedes;
    int cena3;
    int rait3;
    String pass;
    String log;
    buyer3(String mersedes, int cena3, int rait3, String pass, String log){
        this.mersedes = mersedes;
        this.cena3 = cena3;
        this.rait3 = rait3;
        this.pass = pass;
        this.log = log;
    }

    public void tovarName(){
        System.out.println(mersedes);
    }

    public void price(){
        System.out.println(cena3);
    }

    public void raiting(){
        System.out.println(rait3);
    }
    public void password(){
        System.out.println(pass);
    }
    public void login(){
        System.out.println(log);
    }
    public void buy3(){
        System.out.println("Имя пользователя - " + log + " покупает "+ mersedes);
    }
}
