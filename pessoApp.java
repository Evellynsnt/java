public class pessoApp {
    
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Evellyn","222222222");
        System.out.println("O nome "+p1.getNome()+"Telefone"+p1.getTelefone());
        p1.setNome("Julia");
        
        Pessoa p2 = new Pessoa("Laura","1111111");
        System.out.println("O nome "+p2.getNome()+"Telefone"+p2.getTelefone());
        p2.setNome("Luana");



    }
}
