public class Ebook extends Livro {

    public Ebook(String nome, String autor, String reservar, String emprestar, String cancelarReserva,
            String devolver) {
        super(nome, autor, reservar, emprestar, cancelarReserva, devolver);
        this.nome = nome;
        this.autor = autor;
        this.emprestar = emprestar;
        if (emprestar.equals("Ebook")) {
            System.out.println("Impossivel de emprestar");
        } else {
            System.out.println("emprestimo possivel");
        }
        this.reservar = reservar;
        if (reservar.equals("disponivel")) {
            System.out.println("Livros reservados");
        } else {
            System.out.println("ja esta reservado");
        } 
        this.cancelarReserva = cancelarReserva;
        if (cancelarReserva.equals("Livros reservados")) {
            System.out.println("cancelou a reserva");
        }
        this.devolver = devolver;
        if (devolver.equals("na blibioteca")) {
            System.out.println("livros devolvidos");
        }
    }
}
    
