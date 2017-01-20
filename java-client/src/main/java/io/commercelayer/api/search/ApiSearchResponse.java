package io.commercelayer.api.search;

import java.util.ArrayList;
import java.util.List;

import io.commercelayer.api.model.common.ApiResource;

public class ApiSearchResponse<T extends ApiResource> implements PaginatedResponse {

	private List<T> itemList;
	private PaginationInfo paginationInfo;


	public ApiSearchResponse(List<T> itemList) {
		super();
		this.itemList = (itemList == null) ? new ArrayList<>() : itemList;
	}


	public List<? extends ApiResource> getItemList() {
		return itemList;
	}


	public void setItemList(List<T> itemList) {
		this.itemList = itemList;
	}


	public PaginationInfo getPaginationInfo() {
		return paginationInfo;
	}


	public void setPaginationInfo(PaginationInfo paginationInfo) {
		this.paginationInfo = paginationInfo;
	}
	
}
