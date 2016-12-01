package io.commercelayer.api.codegen.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Model extends AbstractModelObject {

	private Map<String, ClassGroup> classGroups = new HashMap<>();
	
	
	
	public Map<String, ClassGroup> getClassGroups() {
		return classGroups;
	}
	
	public ClassGroup getClassGroup(String classPackage) {
		return getClassGroups().get(classPackage);
	}
	
	public void addClass(ModelClass class_) {
		
		String key = class_.getClassPackage();
		ClassGroup cg = this.classGroups.get(key);
		
		if (cg == null) cg = new ClassGroup();
		cg.addClass(class_);
		
		this.classGroups.put(key, cg);
		
	}



	public static final class ClassGroup {
		
		private List<ModelClass> groupClasses = new ArrayList<>();

		public List<ModelClass> getGroupClasses() {
			return groupClasses;
		}
		
		public void addClass(ModelClass class_) {
			this.groupClasses.add(class_);
		}
		
	}
	
	
	public String generate() {
		return null;
	}
	
}
