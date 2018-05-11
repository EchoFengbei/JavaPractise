package ch6;

public class LeapYearTest {
    boolean isLeapYear(int year){
        //能被4整除，但同时不能被100整除
        //能被400整除
        if ((year%400)==0 || (year%4)==0 && (year%100)!=0){
            return true;
        }else return false;
    }
}
