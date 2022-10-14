package primo;

public class test {
    public static void main(String[] args) {
        Person frank=new English("Frank");
        Person francesco=new Italian("Francesco",29);
        francesco.friends.add(frank);
        frank.say();
        francesco.say();
    }
}
