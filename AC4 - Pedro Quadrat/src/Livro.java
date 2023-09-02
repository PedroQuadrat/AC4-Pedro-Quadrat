public abstract class Livro {
    String nome, autor, reservar, emprestar, cancelarReserva, devolver;

    public Livro(String nome, String autor, String reservar, String emprestar,String cancelarReserva, String devolver) {
        this.nome = nome;
        this.autor = autor;
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
        if (devolver.equals("em posse")) {
            System.out.println("livros devolvidos");
        }
    }
     
    public void emprestar(String emprestar) {
        this.emprestar = emprestar;
    }



}






    


