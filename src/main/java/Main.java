import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int result = service.squareRoot(200,350);

        System.out.println(result);
    }

}
