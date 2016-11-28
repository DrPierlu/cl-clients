package io.commercelayer.api.codegen;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractModelObject {

	protected String comment;
	protected int linesBefore = 0;
	protected int linesAfter = 0;

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

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	protected String newLine() {
		return "\n";
	}

	protected String newLines(int numLines) {
		if (numLines <= 0)
			return "";
		else {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < numLines; i++)
				sb.append('\n');
			return sb.toString();
		}
	}

	protected String emptyLine() {
		return "";
	}

	protected List<String> emptyLines(int numLines) {
		List<String> lines = new ArrayList<>();
		if (numLines > 0)
			for (int i = 0; i < numLines; i++)
				lines.add("");
		return lines;
	}

}
