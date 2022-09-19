public class Main {
    public static void main(String[] args) {
        char harf = 'E';

        switch (harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                    System.out.println("Kalın sesli harf");
                    return;
            default:
                System.out.println("İnce sesli harf");
        }




    }
}