public class Main {

    public static void main(String[] args) {
        char harf='A';

        switch (harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                        System.out.println("Harf kalın seslidir");
                        break;
            default:
                System.out.println("Harf ince seslidir");
        }
    }
}
