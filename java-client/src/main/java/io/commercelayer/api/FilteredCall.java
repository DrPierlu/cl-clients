package io.commercelayer.api;

import io.commercelayer.api.search.PageFilter;
import io.commercelayer.api.search.SearchFilter;
import io.commercelayer.api.search.SortFilter;

public interface FilteredCall {

	
	PageFilter getPageFilter();

	SearchFilter getSearchFilter();

	SortFilter getSortFilter();
	
}
