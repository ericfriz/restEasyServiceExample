package com.example.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.example.persistence.core.model.po.PersistentObject;

public abstract class AbstractJpaDAO< PO extends PersistentObject, ID > {
	 
	   private Class< PO > persistentObjectClazz;
	 
	   @PersistenceContext
	   protected EntityManager entityManager;
	 
		public AbstractJpaDAO(Class<PO> persistentObjectClazz) {
			super();
			this.persistentObjectClazz = persistentObjectClazz;
		}
		
	   public final void setClazz( Class< PO > persistentObjectClazz ){
	      this.persistentObjectClazz = persistentObjectClazz;
	   }
	 
	   public PO findOne( ID persistentObjectId ){
	      return entityManager.find( persistentObjectClazz, persistentObjectId );
	   }
	   public List< PO > findAll(){
	      return entityManager.createQuery( "from " + persistentObjectClazz.getName() )
	       .getResultList();
	   }
	 
	   public void create(PO entity ){
	      entityManager.persist( entity );
	   }
	 
	   public PO update( PO entity ){
	      return entityManager.merge( entity );
	   }
	 
	   public void delete( PO entity ){
	      entityManager.remove( entity );
	   }
	   public void deleteById( ID persistentObjectId ){
		   PO entity = findOne( persistentObjectId );
	      delete( entity );
	   }
	}