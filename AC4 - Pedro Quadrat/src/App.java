public class App {
    public static void main(String[] args) throws Exception {
        Livro livro1 = new Livro("aventura em java", "JoãoAutor","disponivel", null, "livros reservados", "em posse");
        Ebook ebook1 = new Ebook("Programação Java Avançada", "JoãoAutor", "disponivel", null, "livros reservados", "em posse");
        

        livro1.emprestar(null);

        livro1.reservar();
        ebook1.reservar();

        ebook1.cancelarReserva();


        livro1.emprestar();
        livro1.emprestar();
        livro1.devolver();
    }
}




