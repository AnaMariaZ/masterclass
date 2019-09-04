public class Printer {
    // Create a class and demonstrate proper encapsulation techniques
    // The class will be called Printer
    // It will simulate a real Computer Printer
    // It should have fields for the toner level; number of pages printed and
    // also weather its a duplex printer ( capable of printing on both sides of the paper)
    // Add methods to fill up the toner (up to a maximum of 100%) , another method to simulate printing a page
    // (which should increase the number of pages printed)
    // Decide on the scope, whether to use constructors, and anything else you think is needed


    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <=100){
            this.tonerLevel = tonerLevel;
        } else {
            tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int fillToner(int tonerAmount){
//        if (tonerLevel < 100 ){
//            double toner = 100 - tonerLevel;
//            tonerLevel = tonerLevel + toner;
//            System.out.println("The toner level was adjusted with " + toner + "% percent");
//        } else if (tonerLevel == 100 ){
//            System.out.println("Level maximum of toner, no need to fill");
//        }
        if (tonerAmount > 0 && tonerAmount <= 100){
            if (this.tonerLevel + tonerAmount > 100){
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if (this.duplex){
            pagesToPrint = ((pages/2) + (pages%2));
            System.out.println("Case of duplex printer");
        }
        this.pagesPrinted = pagesPrinted + pagesToPrint;
       return pagesToPrint;
    }
    public double getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }
}
