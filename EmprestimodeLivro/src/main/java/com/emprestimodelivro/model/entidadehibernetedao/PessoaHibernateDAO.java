package com.emprestimodelivro.model.entidadehibernetedao;

import com.emprestimodelivro.dao.PessoaDAO;
import com.emprestimodelivro.model.entidade.Pessoa;
import com.emprestimodelivro.util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class PessoaHibernateDAO implements PessoaDAO {
    private final SessionFactory sessionFactory;

    public PessoaHibernateDAO() {
        this.sessionFactory = HibernateUtil.getSessionFactory();
    }

    @Override
    public void inserir(Pessoa pessoa) {
        Session session = this.sessionFactory.openSession();
        Transaction trans = null;
        try {
            trans = session.beginTransaction();
            session.save(pessoa);
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
    public Pessoa buscarPorCodigo(Integer codigo) {
        Session session = this.sessionFactory.openSession();
        Pessoa pessoa = null;
        try {
            return pessoa = (Pessoa) session.createQuery("SELECT pessoa FROM Pessoa pessoa WHERE pessoa.codPessoa = :codPessoa").getResultList().get(0);
        } catch(RuntimeException ex) {
            throw ex;
        } finally {
            session.close();
        }
    }

    @Override
    public void deletar(Pessoa pessoa) {
        Session session = this.sessionFactory.openSession();
        Transaction trans = null;
        try {
            trans = session.beginTransaction();
            session.delete(pessoa);
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
    public void alterar(Pessoa pessoa) {
        Session session = this.sessionFactory.openSession();
        Transaction trans = null;
        try {
            trans = session.beginTransaction();
            session.update(pessoa);
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
    public List<Pessoa> recuperarTodos() {
        Session session = this.sessionFactory.openSession();
        List<Pessoa> pessoas = null;
        try {
            return pessoas = session.createQuery("SELECT pessoa FROM Pessoa pessoa").list();
        } catch(RuntimeException ex) {
            throw ex;
        } finally {
            session.close();
        }
    }

    @Override
    public Pessoa buscarPorNome(String nome) {
        Session session = this.sessionFactory.openSession();
        Pessoa pessoa = null;
        try {
            return pessoa = (Pessoa) session.createQuery("SELECT pessoa FROM Pessoa pessoa WHERE pessoa.nome = :nome").setParameter("nome", nome).getResultList().get(0);
        } catch(RuntimeException ex) {
            throw ex;
        } finally {
            session.close();
        }
    }
    
}
