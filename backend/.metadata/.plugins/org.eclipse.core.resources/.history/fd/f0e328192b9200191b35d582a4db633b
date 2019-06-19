package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import br.com.senior.messaging.model.EntityDescription;
import br.com.senior.messaging.model.EntityId;

/**
 * cliente entidade
 */
@EntityDescription
public class Funcionario {
    
    public static class Id {
    	
        public String id;
        
        public Id() {
        }
        
        public Id(String funcionarioId) {
            this.id = funcionarioId;
        }
        
        public String getFuncionarioId() {
            return id;
        }
        
        public String getId() {
            return id;
        }
        
    	public void normalize(Map<String, Object> headers) {
    		BasicoNormalizer.normalize(this, headers);
    	}
    	
    }
    
    public static class PagedResults {
    	public Long totalPages;
    	public Long totalElements;
    	
        public List<Funcionario> contents;
        
        public PagedResults() {
        }
        
        public PagedResults(List<Funcionario> contents) {
            this.contents = contents;
        }
        
        public PagedResults(List<Funcionario> contents, Long totalPages, Long totalElements) {
            this.contents = contents;
            this.totalPages = totalPages;
            this.totalElements = totalElements;
        }
    }
    
    public static class PageRequest {
        public Long offset;
        public Long size;
        public boolean translations;
        public String orderBy;
        public String filter;
        public List<String> displayFields;
        public boolean useCustomFilter;
        
        public PageRequest() {
        }
        
        public PageRequest(Long offset, Long size) {
            this(offset, size, null, null);
        }
        
        public PageRequest(Long offset, Long size, String orderBy) {
            this(offset, size, orderBy, null);
        }
        
        public PageRequest(Long offset, Long size, String orderBy, String filter) {
            this(offset, size, orderBy, filter, null);
       	}
       	
        public PageRequest(Long offset, Long size, String orderBy, String filter, List<String> displayFields) {
            this(offset, size, orderBy, filter, displayFields, false);
       	}
        
        public PageRequest(Long offset, Long size, String orderBy, String filter, List<String> displayFields, boolean useCustomFilter) {
        	this.offset = offset;
        	this.size = size;
        	this.orderBy = orderBy;
        	this.filter = filter;
        	this.displayFields = displayFields;
        	this.useCustomFilter = useCustomFilter;
        }
    }

    @EntityId
    /**
     * chave
     */
    public String id;
    /**
     * nome
     */
    public String nome;
    /**
     * data nascimento
     */
    public java.time.LocalDate dataNascimento;
    /**
     * email
     */
    public String email;
    /**
     * cpf
     */
    public String cpf;
    /**
     * endereco
     */
    public String endereco;
    /**
     * nomeUsuario
     */
    public String nomeUsuario;
    /**
     * senha
     */
    public String senha;
    /**
     * flag tipo
     */
    public String tipo;
    /**
     * salario
     */
    public Double salario;
    /**
     * idFoto
     */
    public String idFoto;
    
    public Funcionario() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public Funcionario(String id, String nome, java.time.LocalDate dataNascimento, String email, String cpf, String endereco, String nomeUsuario, String senha, String tipo, Double salario, String idFoto) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.cpf = cpf;
        this.endereco = endereco;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.tipo = tipo;
        this.salario = salario;
        this.idFoto = idFoto;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public Funcionario(String nome, java.time.LocalDate dataNascimento, String email, String cpf, String endereco, String nomeUsuario, String senha, String tipo, Double salario) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.cpf = cpf;
        this.endereco = endereco;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.tipo = tipo;
        this.salario = salario;
    }
    
    public void normalize(Map<String, Object> headers) {
    	BasicoNormalizer.normalize(this, headers);
    }
    
    public void validate() {
    	validate(true);
    }
    
    public void validate(boolean required) {
    	validate(null, true);
    }
    
    public void validate(Map<String, Object> headers, boolean required) {
    	validate(headers, required, new ArrayList<>());
    }
    
    void validate(Map<String, Object> headers, boolean required, List<Object> validated) {
    	BasicoValidator.validate(this, headers, required, validated);
    }
    @Override
    public int hashCode() {
        int ret = 1;
        if (id != null) {
            ret = 31 * ret + id.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Funcionario)) {
            return false;
        }
        Funcionario other = (Funcionario) obj;
        if ((id == null) != (other.id == null)) {
            return false;
        }
        if ((id != null) && !id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
    	StringBuilder sb = new StringBuilder();
    	toString(sb, new ArrayList<>());
    	return sb.toString();
    }
    
    void toString(StringBuilder sb, List<Object> appended) {
    	sb.append(getClass().getSimpleName()).append(" [");
    	if (appended.contains(this)) {
    		sb.append("<Previously appended object>").append(']');
    		return;
    	}
    	appended.add(this);
    	sb.append("id=").append(id == null ? "null" : id).append(", ");
    	sb.append("nome=").append(nome == null ? "null" : nome).append(", ");
    	sb.append("dataNascimento=").append(dataNascimento == null ? "null" : dataNascimento).append(", ");
    	sb.append("email=").append(email == null ? "null" : email).append(", ");
    	sb.append("cpf=").append(cpf == null ? "null" : cpf).append(", ");
    	sb.append("endereco=").append(endereco == null ? "null" : endereco).append(", ");
    	sb.append("nomeUsuario=").append(nomeUsuario == null ? "null" : nomeUsuario).append(", ");
    	sb.append("senha=").append(senha == null ? "null" : senha).append(", ");
    	sb.append("tipo=").append(tipo == null ? "null" : tipo).append(", ");
    	sb.append("salario=").append(salario == null ? "null" : salario).append(", ");
    	sb.append("idFoto=").append(idFoto == null ? "null" : idFoto);
    	sb.append(']');
    }
    
}
