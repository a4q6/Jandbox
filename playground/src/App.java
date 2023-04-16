import java.util.Arrays;
import java.util.ArrayList;

import playground.lib.tableware.Cabinet;
import playground.lib.tableware.Tableware;
import playground.lib.tableware.Teacup;
import playground.lib.tableware.Wineglass;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        main1();
    }

    public static void main1() {
        var wineglass1 = new Wineglass(10, "red");
        var teacup1 = new Teacup(5, "blue");
        var teacup2 = new Teacup(10, "green");
        var muyCups = new ArrayList<Tableware>(Arrays.asList(teacup1, wineglass1, teacup2));

        var myCabinet = new Cabinet(muyCups);
        var hoge = myCabinet.suggestOneByUsecase("tea");
        hoge.use();
    }
}
