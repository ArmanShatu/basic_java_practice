public class Assignment_1 {
    public static void main(String[] args) {
        String body =  "<html>\n" +
                "<title>Test</title>\n" +
                "<body>\n" +
                "Your trnx is successful. Trnx Id is: TXN123456\n" +
                "</body>\n" +
                "</html>";
        int pos = body.indexOf("Trnx Id is: ");
        int strPos = (pos+"Trnx Id is: ".length());
        String data = body.substring(strPos,strPos+9);
        System.out.println(data);

    }
}
