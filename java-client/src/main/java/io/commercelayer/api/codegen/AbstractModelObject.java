package io.commercelayer.api.codegen;

public abstract class AbstractModelObject {

	public int linesBefore = 0;
	public int linesAfter = 0;

	public abstract String generate();

	public int getLinesBefore() {
		return linesBefore;
	}

	public void setLinesBefore(int linesBefore) {
		this.linesBefore = linesBefore;
	}

	public int getLinesAfter() {
		return linesAfter;
	}

	public void setLinesAfter(int linesAfter) {
		this.linesAfter = linesAfter;
	}

}
