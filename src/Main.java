import com.denizburcuaydin.bank.BankAccount;
import com.denizburcuaydin.objects.Car;
import com.denizburcuaydin.person.Person;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());

        Person person = new Person();
        person.setFirstName("burcu");
        person.setLastName("aydın");
        person.setAge(23);
        System.out.println(person.getFullName());
        System.out.println(person.getLastName());
        System.out.println(person.isTeen());

        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(3456789);
        bankAccount.setPhoneNumber("98765");
        bankAccount.setBalance(900.8);
        System.out.println(bankAccount.getBalance());

        bankAccount.depositBalance(200.8);
        System.out.println(bankAccount.getBalance());

        bankAccount.withdrawalBalance(2000);
        System.out.println(bankAccount.getBalance());



        String name = "burcu";
        VipCustomer vipCustomer = new VipCustomer();
        vipCustomer.setEmail("deniz@gmail.com");
        System.out.println(vipCustomer.getEmail());
        VipCustomer vipCustomer2 = new VipCustomer("burcu", 80.000, "burcu@gmail.com");
        System.out.println(vipCustomer2.getEmail());
        vipCustomer2.setEmail("aydın@gmail.com");
        System.out.println();

        Wall wall = new Wall();
        wall.setHeight(-1);
        wall.setWidth(4);
        System.out.println(wall.getArea());

        Point firstPoint = new Point(2, 3);
        System.out.println(firstPoint.distance());

        Point secondPoint = new Point();
        secondPoint.setX(3);
        secondPoint.setY(3);
        System.out.println(secondPoint.distance(1, 1));
        System.out.println(firstPoint.distance(secondPoint));
        System.out.println(firstPoint.distance(secondPoint.getX(), secondPoint.getY()));

        Point thirdPoint = new Point();
        thirdPoint.setY(4);
        thirdPoint.setX(5);
        System.out.println(thirdPoint.distance());
        System.out.println(thirdPoint.distance(new Point(0, 0)));
        System.out.println(thirdPoint.distance(0, 0));

    }

}