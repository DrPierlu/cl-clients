package io.commercelayer.api.search;

public final class SortParam {

	public static enum OrderType {

		ASCENDING("asc"), DESCENDING("desc");

		private String order;

		private OrderType(String order) {
			this.order = order;
		}

		public String order() {
			return this.order;
		}

	}

	private OrderType type;
	private String field;

	public SortParam(OrderType type, String field) {
		super();
		this.type = type;
		this.field = field;
	}
	
	public OrderType getType() {
		return type;
	}

	public String getField() {
		return field;
	}

}
