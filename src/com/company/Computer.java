package com.company;

public class Computer {

    private String name;
    private int ram;
    private int hdd;
    private double weight;
    private boolean cdReadable =true;

    private Computer[] userComps;
    private boolean adminComp;
    private String status = "nothing";

    public Computer() {
    }

    public Computer(String name) {
        this.name = name;
    }

    public Computer(String name, boolean adminComp) {
        this.name = name;
        this.adminComp = adminComp;
    }
    public Computer(int ram){
        this.ram = ram;
    }

    public Computer(boolean cdReadable) {
        this.cdReadable = cdReadable;
    }

    public Computer(String name, int ram, int hdd, double weight, boolean cdReadable, Computer[] userComps, boolean adminComp, String status) {

        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.weight = weight;
        this.cdReadable = cdReadable;
        this.userComps = userComps;
        this.adminComp = adminComp;
        this.status = status;
    }

    public  void  on(){
        Print(name+" :turn on");
    }

    public void off(){
        if (!status.equals("running")){
            Print(name+" :turn off");
        }else{
            Print(name+" can not turn off still  ongoing process ");
        }
    }

    public void load(){
        Print("I am laidng my size of hard disk "+getHdd());
    }
public void reboot(){
        Print(name+ " loading... ");
}

public void readCd(){
        if(cdReadable){
          Print("Reading cd");
        }else{
            Print("can not read cd");
        }
}

public void rebootUserComps(){
        if(!adminComp){
            System.out.println("This "+name+" computer has not right to reboot>>>THIS NOT ADMIN COMPUTER<<<");
        return;
        }

    for (int i = 0; i < userComps.length; i++) {
       userComps[i].reboot();
    }
    System.out.println();
}

public void shutdownUserComps(){
        if(!adminComp)
        {
            System.out.println("This computer can not turn off"+name);
            return;
        }
        for (int i = 0; i <userComps.length ; i++) {
            userComps[i].off();
        }
        System.out.println();
    }
    public void switchOnUserComps(){
        if(!adminComp)
        {
            System.out.println("This computer can not turn on"+name);
            return;
        }
        for (int i = 0; i <userComps.length ; i++) {
            userComps[i].on();
        }
        System.out.println();
    }
    protected void Print(String str){
        System.out.println(str);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean getCdReadable() {
        return cdReadable;
    }

    public void setCdReadable(boolean cdReadable) {
        this.cdReadable = cdReadable;
    }

    public Computer[] getUserComps() {
        return userComps;
    }

    public void setUserComps(Computer[] userComps) {
        this.userComps = userComps;
    }

    public boolean isAdminComp() {
        return adminComp;
    }

    public void setAdminComp(boolean adminComp) {
        this.adminComp = adminComp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
