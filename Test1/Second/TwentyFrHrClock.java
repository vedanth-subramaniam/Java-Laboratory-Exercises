public class TwentyFrHrClock extends Time {

    TwentyFrHrClock() {
        super();
    }

    TwentyFrHrClock(int _hour, int _minutes, int _seconds) {
        super(_hour, _minutes, _seconds);
    }

    public void timeelapsed(int _seconds) {

        setseconds(getseconds() + _seconds);

        while (getseconds() >= 60) {
            setseconds(getseconds() - 60);
            setminutes(getminutes() + 1);
        }

        while (getminutes() >= 60) {
            setminutes(getminutes() - 60);
            sethour(gethour() + 1);
        }

    }

    @Override
    public void display() {
        System.out.println("24 Hour Clock---\n" + gethour() + " - " + getminutes() + " - " + getseconds());
    }

}
