package io.commercelayer.api.operation.common;

import io.commercelayer.api.search.PageFilter;
import io.commercelayer.api.search.RequestFilter;
import io.commercelayer.api.search.SearchFilter;
import io.commercelayer.api.search.SortFilter;

public class SearchOperation extends GetOperation {

	private PageFilter pageFilter;
	private SearchFilter searchFilter;
	private SortFilter sortFilter;

	protected SearchOperation(String path) {
		super(path);
	}
	
	protected SearchOperation(String path, RequestFilter... filters) {
		this(path);
		for (RequestFilter filter : filters) {
			if (filter instanceof PageFilter) this.pageFilter = (PageFilter)filter;
			else
			if (filter instanceof SearchFilter) this.searchFilter = (SearchFilter)filter;
			else
			if (filter instanceof SortFilter) this.sortFilter = (SortFilter)filter;
		}
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
