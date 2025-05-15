package src.solid.p3_lsp;

public class LSPMain {

    public static void main(String[] args) {
        Bird bird=new Bird();
        bird.move();

        Bird parrot=new Parrot();
        parrot.move();

        Bird ostrictch=new Ostrich();
        ostrictch.move();
    }
}
