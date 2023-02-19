package items;

import Enums.Genre;
import Enums.StringType;

public class Strings extends MusicItem{

    private String name;
    private StringType bestFor;

    public Strings(double boughtPrice, double sellingPrice, String name, StringType bestFor) {
        super(boughtPrice, sellingPrice);
        this.name = name;
        this.bestFor = bestFor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StringType getBestFor() {
        return bestFor;
    }

    public void setBestFor(StringType bestFor) {
        this.bestFor = bestFor;
    }
}
