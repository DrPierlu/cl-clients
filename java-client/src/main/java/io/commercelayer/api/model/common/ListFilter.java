package io.commercelayer.api.model.common;

public final class ListFilter {

	public Integer page; // Page offset to fetch
	public Integer perPage; // Number of results to return per page
	public Integer offset; // Pad a number of results

	public ListFilter() {
		super();
	}
	
	public ListFilter(Integer page, Integer perPage, Integer offset) {
		this.page = page;
		this.perPage = perPage;
		this.offset = offset;
	}
	
	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPerPage() {
		return perPage;
	}

	public void setPerPage(Integer perPage) {
		this.perPage = perPage;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

}
