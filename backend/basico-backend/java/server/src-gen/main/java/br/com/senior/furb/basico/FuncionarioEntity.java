/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="funcionario")
public class FuncionarioEntity {
	
	public static final String SECURITY_RESOURCE = "res://senior.com.br/furb/basico/entities/funcionario";

	/**
	 * chave
	 */
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "id", updatable = false)
	private java.util.UUID id;
	
	/**
	 * nome
	 */
	@Column(name = "nome")
	private String nome;
	
	/**
	 * data nascimento
	 */
	@Column(name = "data_nascimento")
	private java.time.LocalDate dataNascimento;
	
	/**
	 * email
	 */
	@Column(name = "email")
	private String email;
	
	/**
	 * cpf
	 */
	@Column(name = "cpf")
	private String cpf;
	
	/**
	 * endereco
	 */
	@Column(name = "endereco")
	private String endereco;
	
	/**
	 * nomeUsuario
	 */
	@Column(name = "nome_usuario")
	private String nomeUsuario;
	
	/**
	 * senha
	 */
	@Column(name = "senha")
	private String senha;
	
	/**
	 * flag tipo
	 */
	@Column(name = "tipo")
	private String tipo;
	
	/**
	 * salario
	 */
	@Column(name = "salario")
	private Double salario;
	
	/**
	 * idFoto
	 */
	@Column(name = "id_foto")
	private String idFoto;
	
	public java.util.UUID getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public java.time.LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public Double getSalario() {
		return salario;
	}
	
	public String getIdFoto() {
		return idFoto;
	}
	
	public void setId(java.util.UUID id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDataNascimento(java.time.LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public void setIdFoto(String idFoto) {
		this.idFoto = idFoto;
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
	    if (!(obj instanceof FuncionarioEntity)) {
	        return false;
	    }
	    FuncionarioEntity other = (FuncionarioEntity) obj;
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
