package io.commercelayer.api.search;

public final class PageFilter implements RequestFilter {

	private static final long serialVersionUID = 6205032079070692138L;
	
	public Integer page; // Page offset to fetch
	public Integer perPage; // Number of results to return per page
	public Integer offset; // Pad a number of results

	public PageFilter() {
		super();
	}
	
	public PageFilter(Integer page, Integer perPage, Integer offset) {
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
	
	
	public static interface Params {
		String PAGE 		= "page";
		String PER_PAGE 	= "per_page";
		String OFFSET 		= "offset";
	}

}
