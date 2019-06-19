package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import br.com.senior.messaging.model.EntityDescription;
import br.com.senior.messaging.model.EntityId;

/**
 * Atendimento entidade
 */
@EntityDescription
public class Atendimento {
    
    public static class Id {
    	
        public String id;
        
        public Id() {
        }
        
        public Id(String atendimentoId) {
            this.id = atendimentoId;
        }
        
        public String getAtendimentoId() {
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
    	
        public List<Atendimento> contents;
        
        public PagedResults() {
        }
        
        public PagedResults(List<Atendimento> contents) {
            this.contents = contents;
        }
        
        public PagedResults(List<Atendimento> contents, Long totalPages, Long totalElements) {
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
     * cliente
     */
    public Fregues fregues;
    /**
     * funcionario
     */
    public Funcionario funcionario;
    /**
     * data atendimento
     */
    public java.time.LocalDate dataAtendimento;
    /**
     * valor total
     */
    public Double valorTotal;
    /**
     * servicos
     */
    public java.util.List<Servico> servicos;
    
    public Atendimento() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public Atendimento(String id, Fregues fregues, Funcionario funcionario, java.time.LocalDate dataAtendimento, Double valorTotal, java.util.List<Servico> servicos) {
        this.id = id;
        this.fregues = fregues;
        this.funcionario = funcionario;
        this.dataAtendimento = dataAtendimento;
        this.valorTotal = valorTotal;
        this.servicos = servicos;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public Atendimento(Fregues fregues, Funcionario funcionario, java.time.LocalDate dataAtendimento, Double valorTotal, java.util.List<Servico> servicos) {
        this.fregues = fregues;
        this.funcionario = funcionario;
        this.dataAtendimento = dataAtendimento;
        this.valorTotal = valorTotal;
        this.servicos = servicos;
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
        if (!(obj instanceof Atendimento)) {
            return false;
        }
        Atendimento other = (Atendimento) obj;
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
    	sb.append("fregues=<");
    	if (fregues == null) {
    		sb.append("null");
    	} else {
    		fregues.toString(sb, appended);
    	}
    	sb.append('>').append(", ");
    	sb.append("funcionario=<");
    	if (funcionario == null) {
    		sb.append("null");
    	} else {
    		funcionario.toString(sb, appended);
    	}
    	sb.append('>').append(", ");
    	sb.append("dataAtendimento=").append(dataAtendimento == null ? "null" : dataAtendimento).append(", ");
    	sb.append("valorTotal=").append(valorTotal == null ? "null" : valorTotal).append(", ");
    	sb.append("servicos=<");
    	if (servicos == null) {
    		sb.append("null");
    	} else {
    		sb.append('[');
    		int last = servicos.size() - 1;
    		for (int i = 0; i <= last; i++) {
    			servicos.get(i).toString(sb, appended);
    			if (i < last) {
    				sb.append(", ");
    			}
    		}
    		sb.append(']');
    	}
    	sb.append('>');
    	sb.append(']');
    }
    
}
