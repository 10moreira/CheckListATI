package modelo.bean;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Atividade.class)
public abstract class Atividade_ {

	public static volatile SingularAttribute<Atividade, Setor> nomeSetor;
	public static volatile SingularAttribute<Atividade, Projeto> projeto;
	public static volatile SingularAttribute<Atividade, ProcessoDivul> processoDivul;
	public static volatile SingularAttribute<Atividade, String> tipoAtividade;
	public static volatile SingularAttribute<Atividade, Integer> id;
	public static volatile SingularAttribute<Atividade, String> especificaAtividade;

}

