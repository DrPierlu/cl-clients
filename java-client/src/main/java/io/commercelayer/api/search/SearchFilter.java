package io.commercelayer.api.search;

import java.util.ArrayList;
import java.util.List;

import io.commercelayer.api.search.SearchParam.MatchType;

public class SearchFilter implements RequestFilter {

	private static final long serialVersionUID = 2371876649744098587L;
	
	private List<SearchParam> searchParams = new ArrayList<>();

	public List<SearchParam> getSearchParams() {
		return this.searchParams;
	}

	public void addSearchParam(MatchType type, String field, String value) {
		this.searchParams.add(new SearchParam(type, field, value));
	}
	
	public void addSearchParam(SearchParam param) {
		this.searchParams.add(param);
	}

}
