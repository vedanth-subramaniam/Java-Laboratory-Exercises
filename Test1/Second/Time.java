abstract class Time {
    protected int seconds;
    protected int minutes;
    protected int hour;

    public Time() {
        this.seconds = 0;
        this.minutes = 0;
        this.hour = 0;
   }

    public Time(int _hour, int _minutes, int _seconds) {
        sethour(_hour);
        setminutes(_minutes);
        setseconds(_seconds);
    }

    public void display() {
        System.out.println(gethour() + " - " + getminutes() + " - " + getseconds());
    }

    public void setseconds(int _seconds) {
        this.seconds = _seconds;
    }

    public void setminutes(int _minutes) {
        this.minutes = _minutes;
    }

    public void sethour(int _hour) {
        this.hour = _hour;
    }

    public int getseconds() {
        return this.seconds;
    }

    public int getminutes() {
        return this.minutes;
    }

    public int gethour() {
        return this.hour;
    }
}