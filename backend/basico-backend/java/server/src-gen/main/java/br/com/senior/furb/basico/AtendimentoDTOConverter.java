/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

import br.com.senior.custom.ConversionContext;
import br.com.senior.custom.ConvertedObjectCondition;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

import br.com.senior.custom.EntityDTOConverter;

@Component("furb.basico.AtendimentoDTOConverter")
@Lazy
public class AtendimentoDTOConverter extends EntityDTOConverter {

	@Autowired
	private FreguesDTOConverter freguesConverter;
	@Autowired
	private FuncionarioDTOConverter funcionarioConverter;
	@Autowired
	private ServicoDTOConverter servicoConverter;

	@Override
	public void setupMapperToEntity(ModelMapper mapper, ConversionContext conversionContext) {
		Converter<Fregues, FreguesEntity> freguesConverter = new ContextualizedConverter<Fregues, FreguesEntity>() {
			@Override
			public FreguesEntity convert(Fregues source) {
				return toEntity(source, FreguesEntity.class, conversionContext);
			}
		};
		Converter<Funcionario, FuncionarioEntity> funcionarioConverter = new ContextualizedConverter<Funcionario, FuncionarioEntity>() {
			@Override
			public FuncionarioEntity convert(Funcionario source) {
				return toEntity(source, FuncionarioEntity.class, conversionContext);
			}
		};
		Converter <List<Servico>, List<ServicoEntity>> servicosConverter = new ContextualizedConverter<List<Servico>, List<ServicoEntity>>() {
			@Override
			public List<ServicoEntity> convert(List<Servico> source) {
				if (source == null) {
					return Collections.emptyList();
				}
				return source.stream().map(d -> toEntity(d, ServicoEntity.class, conversionContext)).collect(Collectors.toList());
			}
		};

		PropertyMap<Atendimento, AtendimentoEntity> atendimentoMap = new PropertyMap<Atendimento, AtendimentoEntity>() {
			@Override
			protected void configure() {
				using(freguesConverter).map(source.fregues).setFregues(null);
				using(funcionarioConverter).map(source.funcionario).setFuncionario(null);
				using(servicosConverter).map(source.servicos).setServicos(null);
			}
		};
		mapper.addMappings(atendimentoMap);
		if (mapper.getTypeMap(Fregues.class, FreguesEntity.class) == null) {
			this.freguesConverter.setupMapperToEntity(mapper, conversionContext);
		}
		if (mapper.getTypeMap(Funcionario.class, FuncionarioEntity.class) == null) {
			this.funcionarioConverter.setupMapperToEntity(mapper, conversionContext);
		}
		if (mapper.getTypeMap(Servico.class, ServicoEntity.class) == null) {
			this.servicoConverter.setupMapperToEntity(mapper, conversionContext);
		}
		mapper.getTypeMap(Atendimento.class, AtendimentoEntity.class).setPropertyCondition(new ConvertedObjectCondition(conversionContext));
	}

	@Override
	public void setupMapperToDTO(ModelMapper mapper, ConversionContext conversionContext) {
		
		Converter<FreguesEntity, Fregues> freguesConverter = new ContextualizedConverter<FreguesEntity, Fregues>() {
			@Override
			public Fregues convert(FreguesEntity source) {
				if (conversionContext.isIncludeTranslations()) {
					return toDTOWithTranslations(source, Fregues.class, conversionContext.getRelationshipFields("fregues"), conversionContext);
				}
				return toDTO(source, Fregues.class, conversionContext.getRelationshipFields("fregues"), conversionContext);
			}
		};
		
		
		Converter<FuncionarioEntity, Funcionario> funcionarioConverter = new ContextualizedConverter<FuncionarioEntity, Funcionario>() {
			@Override
			public Funcionario convert(FuncionarioEntity source) {
				if (conversionContext.isIncludeTranslations()) {
					return toDTOWithTranslations(source, Funcionario.class, conversionContext.getRelationshipFields("funcionario"), conversionContext);
				}
				return toDTO(source, Funcionario.class, conversionContext.getRelationshipFields("funcionario"), conversionContext);
			}
		};
		
		
		Converter <List<ServicoEntity>, List<Servico>> servicosConverter = new ContextualizedConverter<List<ServicoEntity>, List<Servico>>() {
			@Override
			public List<Servico> convert(List<ServicoEntity> source) {
				if (conversionContext.isIncludeTranslations()) {
					return source.stream().map(e -> toDTOWithTranslations(e, Servico.class, conversionContext.getRelationshipFields("servicos"), conversionContext)).collect(Collectors.toList());
				}
				return source.stream().map(e -> toDTO(e, Servico.class, conversionContext.getRelationshipFields("servicos"), conversionContext)).collect(Collectors.toList());
			}
		};
		
		//eager relationships
		PropertyMap<AtendimentoEntity, Atendimento> atendimentoMap = new PropertyMap<AtendimentoEntity, Atendimento>() {
			@Override
			public void configure() {
				using(freguesConverter).map(source.getFregues(), destination.fregues);
				using(funcionarioConverter).map(source.getFuncionario(), destination.funcionario);
				using(servicosConverter).map(source.getServicos(), destination.servicos);
			}
		};
		//lazy relationships
		
		mapper.addMappings(atendimentoMap);
		
		if (mapper.getTypeMap(FreguesEntity.class, Fregues.class) == null) {
		    this.freguesConverter.setupMapperToDTO(mapper, conversionContext);
		}
		if (mapper.getTypeMap(FuncionarioEntity.class, Funcionario.class) == null) {
		    this.funcionarioConverter.setupMapperToDTO(mapper, conversionContext);
		}
		if (mapper.getTypeMap(ServicoEntity.class, Servico.class) == null) {
		    this.servicoConverter.setupMapperToDTO(mapper, conversionContext);
		}
		mapper.getTypeMap(AtendimentoEntity.class, Atendimento.class).setPropertyCondition(new ConvertedObjectCondition(conversionContext));
	}
}
