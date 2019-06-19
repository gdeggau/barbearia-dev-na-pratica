/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.JoinTable;

@Entity
@Table(name="atendimento")
public class AtendimentoEntity {
	
	public static final String SECURITY_RESOURCE = "res://senior.com.br/furb/basico/entities/atendimento";

	/**
	 * chave
	 */
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "id", updatable = false)
	private java.util.UUID id;
	
	/**
	 * cliente
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fregues")
	private FreguesEntity fregues;
	
	/**
	 * funcionario
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "funcionario")
	private FuncionarioEntity funcionario;
	
	/**
	 * data atendimento
	 */
	@Column(name = "data_atendimento")
	private java.time.LocalDate dataAtendimento;
	
	/**
	 * valor total
	 */
	@Column(name = "valor_total")
	private Double valorTotal;
	
	/**
	 * servicos
	 */
	@OneToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "atendimento_servicos",
	          joinColumns = @JoinColumn(name = "atendimento_id", referencedColumnName = "id"),
	          inverseJoinColumns = @JoinColumn(name = "servicos_id", referencedColumnName = "id"))
	private java.util.List<ServicoEntity> servicos;
	
	public java.util.UUID getId() {
		return id;
	}
	
	public FreguesEntity getFregues() {
		return fregues;
	}
	
	public FuncionarioEntity getFuncionario() {
		return funcionario;
	}
	
	public java.time.LocalDate getDataAtendimento() {
		return dataAtendimento;
	}
	
	public Double getValorTotal() {
		return valorTotal;
	}
	
	public java.util.List<ServicoEntity> getServicos() {
		return servicos;
	}
	
	public void setId(java.util.UUID id) {
		this.id = id;
	}
	
	public void setFregues(FreguesEntity fregues) {
		this.fregues = fregues;
	}
	
	public void setFuncionario(FuncionarioEntity funcionario) {
		this.funcionario = funcionario;
	}
	
	public void setDataAtendimento(java.time.LocalDate dataAtendimento) {
		this.dataAtendimento = dataAtendimento;
	}
	
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public void setServicos(java.util.List<ServicoEntity> servicos) {
		this.servicos = servicos;
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
	    if (!(obj instanceof AtendimentoEntity)) {
	        return false;
	    }
	    AtendimentoEntity other = (AtendimentoEntity) obj;
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
			Iterator<ServicoEntity> iterator = servicos.iterator();
			while (iterator.hasNext()) {
				iterator.next().toString(sb, appended);
				if (iterator.hasNext()) {
					sb.append(", ");
				}
			}
			sb.append(']');
		}
		sb.append('>');
		sb.append(']');
	}
	
}
