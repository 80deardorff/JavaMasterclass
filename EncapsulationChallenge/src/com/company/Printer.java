package com.company;

public class Printer {
    private int tonerLevel = 100;
    private int pagesPrinted = 0;
    private boolean duplex = false;

    public Printer(int tonerLevel, boolean duplex) {
        if ((tonerLevel >= 0) && (tonerLevel <= 100)) {
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if ((tonerAmount > 0) && (tonerAmount <= 100)) {
            if ((tonerLevel + tonerAmount) > 100) {
                return -1;
            } else {
                return (tonerLevel += tonerAmount);
            }
        }
        return -1;
    }

    public int printPages(int pages) {
        int pagesToPrint = (duplex) ? (pages / 2) + (pages % 2) : pages;
        System.out.println("Printing " + pages + " pages in " + (duplex ? "duplex" : "single") + " mode");
        if (pages >= 0) {
            pagesPrinted += pagesToPrint;
            return pagesToPrint;
        } else {
            return -1;
        }
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
