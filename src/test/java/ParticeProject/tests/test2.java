package ParticeProject.tests;

public class test2 {
    public static void main(String[] args) {
        String nr = "I am Karim Bagheri";
        String sbnr = nr.substring(0,4);
        String sb2nr = nr.substring(nr.indexOf("I am Karim"), nr.indexOf("Karim"));
        System.out.println(sb2nr);

        System.out.println(sbnr);

        PageFactoryDemo demo = new PageFactoryDemo();
        demo.shangol.click();
    }

}
