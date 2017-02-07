package months;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class MonthParser {
    public Month parseMonth(int numberOfMonth) {
        Month month;
        if(numberOfMonth == 1) {
            month = new Month("January", 31);
        }
        else if(numberOfMonth == 2) {
            month = new Month("February", 28);
        }
        else if(numberOfMonth == 3) {
            month = new Month("Mars", 31);
        }
        else if(numberOfMonth == 4) {
            month = new Month("April", 28);
        }
        else if(numberOfMonth == 5) {
            month = new Month("May", 31);
        }
        else if(numberOfMonth == 6) {
            month = new Month("June", 30);
        }
        else if(numberOfMonth == 7) {
            month = new Month("July", 31);
        }
        else if(numberOfMonth == 8) {
            month = new Month("August", 31);
        }
        else if(numberOfMonth == 9) {
            month = new Month("September", 28);
        }
        else if(numberOfMonth == 10) {
            month = new Month("October", 31);
        }
        else if(numberOfMonth == 11) {
            month = new Month("November", 30);
        }
        else if(numberOfMonth == 12) {
            month = new Month("Desember", 31);
        }
        else month = null;
        return month;
    }
}
