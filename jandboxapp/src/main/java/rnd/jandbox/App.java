package rnd.jandbox;

import java.util.ArrayList;
import java.util.Arrays;

import tableware.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        main1();
    }

    public static void main1() {
        Wineglass wineglass1 = new Wineglass(10, "red");
        Teacup teacup1 = new Teacup(5, "blue");
        Teacup teacup2 = new Teacup(10, "green");
        var muyCups = new ArrayList<Tableware>(Arrays.asList(teacup1, wineglass1, teacup2));

        var myCabinet = new Cabinet(muyCups);
        var hoge = myCabinet.suggestOneByUsecase("tea");
        hoge.use();
    }
}
