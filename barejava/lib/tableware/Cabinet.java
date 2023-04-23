package barejava.lib.tableware;

import java.util.ArrayList;

public class Cabinet {
    private ArrayList<Tableware> contents;

    // constructor
    public Cabinet(ArrayList<Tableware> contents) {
        this.contents = contents;
    }

    // constructor -2
    public Cabinet() {
        contents = new ArrayList<Tableware>();
    }

    // Add a tableware to the cabinet
    public void addItem(Tableware tableware) {
        contents.add(tableware);
    }

    //
    public Tableware suggestOneByUsecase(String usecase) {

        var tmpList = new ArrayList<Tableware>();
        for (Tableware tableware : contents) {
            if (tableware.usecase == usecase) {
                tmpList.add(tableware);
            }
        }

        if (tmpList.size() == 0) {
            throw new IllegalArgumentException("No tableware found for usecase: " + usecase);
        } else {
            // generate random integer
            int randomIndex = (int) (Math.random() * tmpList.size());
            // pick a tableware from the list
            Tableware suggestedItem = tmpList.get(randomIndex);
            return suggestedItem;
        }
    }
}
