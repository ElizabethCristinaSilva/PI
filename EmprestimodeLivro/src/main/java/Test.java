
import com.emprestimodelivro.controller.LivroController;
import com.emprestimodelivro.model.entidade.Livro;
import java.util.List;
import java.util.Arrays;

public class Test {
//    public static void main(String[] args) {
//        HibernateUtil.fabricaSessionFactory();
//        HibernateUtil.fabricaSessionFactory().openSession();
    
    public static void main(String args[]) {
        List<Livro> livro;
        LivroController livros = new LivroController();
        livro = livros.recuperarTodos();
        System.out.println(livro.toString());
    }
    
}