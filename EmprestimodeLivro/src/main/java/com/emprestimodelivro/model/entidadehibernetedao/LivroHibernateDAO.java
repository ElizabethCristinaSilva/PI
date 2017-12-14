package com.emprestimodelivro.model.entidadehibernetedao;

import com.emprestimodelivro.dao.LivroDAO;
import com.emprestimodelivro.model.entidade.Livro;
import com.emprestimodelivro.util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class LivroHibernateDAO implements LivroDAO {
    private final SessionFactory sessionFactory;

    public LivroHibernateDAO() {
        this.sessionFactory = HibernateUtil.getSessionFactory();
    }

    @Override
    public void inserir(Livro livro) {
        Session session = this.sessionFactory.openSession();
        Transaction trans = null;
        try {
            trans = session.beginTransaction();
            session.save(livro);
            trans.commit();
        } catch(HibernateException ex) {
            if(trans != null) {
                trans.rollback();
            }
            throw ex;
        } finally {
            session.close();
        }
    }

    @Override
    public void deletar(Livro livro) {
        Session session = this.sessionFactory.openSession();
        Transaction trans = null;
        try {
            trans = session.beginTransaction();
            session.delete(livro);
            trans.commit();
        } catch(HibernateException ex) {
            if(trans != null) {
                trans.rollback();
            }
            throw ex;
        } finally {
            session.close();
        }
    }

    @Override
    public Livro buscarPorCodigo(Integer codLivro) {
        Session session = this.sessionFactory.openSession();
        Livro livro = null;
        try {
          return livro = (Livro) session.createQuery("SELECT livro FROM Livro livro WHERE livro.codLivro = :codLivro").getResultList().get(0);
        } catch(RuntimeException ex) {
            throw ex;
        } finally {
            session.close();
        }
    }

    @Override
    public void alterar(Livro livro) {
        Session session = this.sessionFactory.openSession();
        Transaction trans = null;
        try {
            trans = session.beginTransaction();
            session.update(livro);
            trans.commit();
        } catch(HibernateException ex) {
            if(trans != null) {
                trans.rollback();
            }
            throw ex;
        } finally {
            session.close();
        }
    }

    @Override
    public List<Livro> recuperarTodos() {
        Session session = this.sessionFactory.openSession();
        List<Livro> livros = null;
        try {
            return livros = session.createQuery("SELECT livro FROM Livro livro").list();
        } catch(RuntimeException ex) {
            throw ex;
        } finally {
            session.close();
        }
    }

    @Override
    public Livro buscarPorTitulo(String titulo) {
        Session session = this.sessionFactory.openSession();
        Livro livro = null;
        try {
            return livro = (Livro) session.createQuery("SELECT livro FROM Livro livro WHERE livro.titulo = :titulo").setParameter("titulo", titulo).getResultList().get(0);
        } catch(RuntimeException ex) {
            throw ex;
        } finally {
            session.close();
        }
    }
    
}
