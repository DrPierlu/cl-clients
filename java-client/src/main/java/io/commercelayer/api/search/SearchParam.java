package io.commercelayer.api.search;

public final class SearchParam {

	public static enum MatchType {

		EQUALS("eq"), STARTS_WITH("start"), CONTAINS("cont");

		private String operation;

		private MatchType(String operation) {
			this.operation = operation;
		}

		public String operation() {
			return this.operation;
		}

	}

	private MatchType type;
	private String field;
	private String value;

	public SearchParam(MatchType type, String field, String value) {
		super();
		this.type = type;
		this.field = field;
		this.value = value;
	}

	public MatchType getType() {
		return type;
	}

	public String getField() {
		return field;
	}

	public String getValue() {
		return value;
	}

}
