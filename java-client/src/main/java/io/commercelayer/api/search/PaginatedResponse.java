package io.commercelayer.api.search;

public interface PaginatedResponse {

	PaginationInfo getPaginationInfo();
	
	void setPaginationInfo(PaginationInfo pInfo);
	
	
	public static final class PaginationInfo {

		private Integer total; 		// X-Total
		private Integer totalPages; // X-Total-Pages
		private Integer perPage; 	// X-Per-Page
		private Integer page; 		// X-Page
		private Integer nextPage;	// X-Next-Page
		private Integer prevPage; 	// X-Prev-Page
		private Integer offset; 	// X-Offset


		public Integer getTotal() {
			return total;
		}


		public void setTotal(Integer total) {
			this.total = total;
		}


		public Integer getTotalPages() {
			return totalPages;
		}


		public void setTotalPages(Integer totalPages) {
			this.totalPages = totalPages;
		}


		public Integer getPerPage() {
			return perPage;
		}


		public void setPerPage(Integer perPage) {
			this.perPage = perPage;
		}


		public Integer getPage() {
			return page;
		}


		public void setPage(Integer page) {
			this.page = page;
		}


		public Integer getNextPage() {
			return nextPage;
		}


		public void setNextPage(Integer nextPage) {
			this.nextPage = nextPage;
		}


		public Integer getPrevPage() {
			return prevPage;
		}


		public void setPrevPage(Integer prevPage) {
			this.prevPage = prevPage;
		}


		public Integer getOffset() {
			return offset;
		}


		public void setOffset(Integer offset) {
			this.offset = offset;
		}

		public static interface Params {
			String TOTAL = "X-Total";
			String TOTAL_PAGES = "X-Total-Pages";
			String PER_PAGE = "X-Per-Page";
			String PAGE = "X-Page";
			String NEXT_PAGE = "X-Next-Page";
			String PREV_PAGE = "X-Prev-Page";
			String OFFSET = "X-Offset";
		}

	}

	
}
