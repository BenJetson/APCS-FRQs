public class HiddenWordTester {

    public static void main(String[] args) {
        
        HiddenWord computer = new HiddenWord("computer");
        
        System.out.println(computer.getHint("zomputer"));
        System.out.println(computer.getHint("voidmain"));
        System.out.println(computer.getHint("pureevil"));
        System.out.println(computer.getHint("zxmputkf"));
        System.out.println(computer.getHint("computer"));

    }

}