package org.orange.metier;

import java.util.List;

public interface IFilter {

	public List<String> getListField(String field);
	public List<List<String>> getListFilter();
}
