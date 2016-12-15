package io.commercelayer.api.search;

import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.FilteredCall;
import io.commercelayer.api.operation.SearchOperation;

public class ApiSearchRequest extends ApiRequest<SearchOperation> implements FilteredCall {

	private PageFilter pageFilter;
	private SearchFilter searchFilter;
	private SortFilter sortFilter;

	public ApiSearchRequest() {
		super();
	}
	
	public ApiSearchRequest(SearchOperation searchOperation) {
		this();
		setOperation(searchOperation);
	}

	public ApiSearchRequest(PageFilter pageFilter, SearchFilter searchFilter, SortFilter sortFilter) {
		this();
		this.pageFilter = pageFilter;
		this.searchFilter = searchFilter;
		this.sortFilter = sortFilter;
	}

	public PageFilter getPageFilter() {
		return pageFilter;
	}

	public void setPageFilter(PageFilter pageFilter) {
		this.pageFilter = pageFilter;
	}

	public SearchFilter getSearchFilter() {
		return searchFilter;
	}

	public void setSearchFilter(SearchFilter searchFilter) {
		this.searchFilter = searchFilter;
	}

	public SortFilter getSortFilter() {
		return sortFilter;
	}

	public void setSortFilter(SortFilter sortFilter) {
		this.sortFilter = sortFilter;
	}
	
}
