public class ThomasEdissonPhone extends AbsractPhone {

    public ThomasEdissonPhone(int year) {
        super(year);
    }

    @Override
    public void call(int outNumber) {
        System.out.println("Вращайте ручку");
        System.out.println("Сообщите номер");
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Телефон звонит");
    }
}
