public class Person {
     private String bname;

    private int bage;

    private String adress;

    public Person(String pbname, int pbage, String padress){
        bname = pbname;
        bage = pbage;
        adress = padress;
    }


    public String getNames(){
        return bname;
    }
    public void setName(String newName){
        this.bname = newName;
    }

    public int getAge(){
        return bage;
    }
    public void setAge(int newAge){
        this.bage = newAge;
    }
    public String getAdress(){
        return adress;
    }
    public void setAdress(String newAdress){
        this.adress = newAdress;
    }
    public void printInfo(){
        System.out.println(bname + bage + adress);
    }

}

