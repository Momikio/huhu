package hanoi.ha ;

import java.time.LocalDate;

class tes{
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
       LocalDate date2=date.plusDays(100);
       date.getDayOfMonth();
       System.out.println(date);
       System.out.println(date2);
       
    }
}