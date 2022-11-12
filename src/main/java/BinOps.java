public class BinOps {

    public String sum(String a, String b) {

        Integer sumInt = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);
        return Integer.toBinaryString(sumInt);

    }

    public String mult(String a, String b) {
        Integer multInt = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);
        return Integer.toBinaryString(multInt);
    }
}
