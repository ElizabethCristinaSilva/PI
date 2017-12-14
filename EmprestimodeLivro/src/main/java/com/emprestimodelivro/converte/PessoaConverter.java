package com.emprestimodelivro.converte;

import javax.faces.convert.FacesConverter;
import com.emprestimodelivro.model.entidade.Livro;
import com.emprestimodelivro.model.entidade.Pessoa;
import com.emprestimodelivro.model.entidadehibernetedao.PessoaHibernateDAO;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

@FacesConverter(forClass=Pessoa.class, value="pessoaConverter")
public class PessoaConverter implements Converter{
    
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value){
        if(value == null || value.isEmpty()){
            return null;
        }else{
            Pessoa pessoa = new PessoaHibernateDAO().buscarPorNome(value);
            return pessoa;
        } 
    }
    
    @Override
    public String getAsString (FacesContext context, UIComponent component, Object value){
        if (value instanceof String) {
            return value.toString();
        }       
        
        return ((Pessoa)value).getNome();
    }
    
}
