package net.ayld.core.service;

import java.io.Serializable;

import net.ayld.core.dto.Dto;

public interface CrudService<D extends Dto<I>, I extends Serializable> {
	
	public D read(I id);
	
	public D find(I id);
	
	public D update(D dto);
	
	public D create(D dto);
	
	public D delete(I id);
}
