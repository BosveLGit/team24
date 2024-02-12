public class WirelessPhone extends AbsractPhone {

    public int hour;

    public WirelessPhone(int year, int hour){
        super(year);
        this.hour = hour;
    }


    @Override
    public void call(int outNumber) {
        System.out.println("call " + outNumber);
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("ring " + inputNumber);
    }
}
