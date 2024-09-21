public class Containerrally {
    int carnumber;
    String manufacturer;
    String driver;
    Kenyarally kenyarally;
    public Containerrally(int carnumber, String manufacturer, String driver, Kenyarally kenyarally){
        this.carnumber=carnumber;
        this.manufacturer=manufacturer;
        this.driver=driver;
        this.kenyarally=kenyarally;
        System.out.println(carnumber+" "+manufacturer+" "+driver);
        System.out.println(kenyarally.race1+" "+kenyarally.race2+" "+kenyarally.race3);

    }
}
