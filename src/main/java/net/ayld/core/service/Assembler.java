package net.ayld.core.service;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import net.ayld.core.dto.Dto;
import net.ayld.core.domain.Entity;

public interface Assembler<D extends Dto<I>, E extends Entity<I>, I extends Serializable> {
	
	public D toDto(E entity);
	
	public E toEntity(D dto);
	
	public List<D> toDtos(List<E> entities);
	
	public List<E> toEntities(List<D> dtos);
	
	public Set<D> toDtos(Set<E> entities);
	
	public Set<E> toEntities(Set<D> dtos);
}
