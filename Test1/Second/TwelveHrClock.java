public class TwelveHrClock extends Time {

    TwelveHrClock() {
        super();
    }

    TwelveHrClock(int _hour, int _minutes, int _seconds) {
        super(_hour, _minutes, _seconds);
    }

    public int difference(Time _time) {
        int hourDiff = (gethour() - _time.gethour()) * 60 * 60;
        int minutesDiff = (getminutes() - _time.getminutes()) * 60;
        int secondsDiff = (getseconds() - _time.getseconds());

        return hourDiff + minutesDiff + secondsDiff;
    }

    @Override
    public void display() {
        if (gethour() >= 12) {
            System.out.println("12 Hour Clock---\n" + ((gethour() == 12) ? gethour() : gethour() - 12) + " - "
                    + getminutes() + " - " + getseconds() + " PM");
        } else {
            System.out.println("12 Hour Clock---\n" + ((gethour() == 0) ? (gethour() + 12) : gethour()) + " - "
                    + getminutes() + " - " + getseconds() + " AM");
        }

    }

}
