package Observer_book;

public class DigitalClock  implements Observer {
    private ClockTimer subject;

    public DigitalClock(ClockTimer s) {
        this.subject = s;
        this.subject.attach(this);
    }

    @Override
    public void update(Subject theChangedSubject) {
        if (theChangedSubject == this.subject) {
            draw();
        }
    }

    public void draw() {
        int hour = this.subject.getHour();
        int minute = this.subject.getMinute();
        int second = this.subject.getSecond();
        System.out.println("Hour: "+hour+" minute: "+minute+" second: "+second);
    }

    public static void main(String[] args) {
        ClockTimer clockTimer = new ClockTimer();
        DigitalClock digitalClock = new DigitalClock(clockTimer);

        while (true) {
            clockTimer.tick();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

