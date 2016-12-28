package io.commercelayer.api.codegen.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Model {

	private Map<String, ClassGroup> classGroups = new HashMap<>();
	
	
	public Map<String, ClassGroup> getClassGroups() {
		return classGroups;
	}
	
	public ClassGroup getClassGroup(String classPackage) {
		return getClassGroups().get(classPackage);
	}
	
	public boolean addClass(ModelClass class_) {
		
		if (class_ == null) return false;
		
		String key = class_.getClassPackage();
		ClassGroup cg = this.classGroups.get(key);
		
		if (cg == null) this.classGroups.put(key, cg = new ClassGroup());
			
		cg.addClass(class_);
		
		
		return true;
		
	}



	public static final class ClassGroup {
		
		private List<ModelClass> groupClasses = new ArrayList<>();

		public List<ModelClass> getGroupClasses() {
			return groupClasses;
		}
		
		public void addClass(ModelClass class_) {
			if (!this.groupClasses.contains(class_)) this.groupClasses.add(class_);
			else {
				for (ModelClass mc : this.groupClasses)
					if (mc.equals(class_)) {
						mc.getMethodList().addAll(class_.getMethodList());
						break;
					}
			}
		}
		
	}
	
	
	public boolean containsClass(String pkg, ModelClass mc) {
		
		ClassGroup cg = classGroups.get(pkg);
		
		for (ModelClass mc_ : cg.getGroupClasses()) {
			if (mc_.getName().equals(mc.getName())) return true;
		}
		
		return false;
		
	}

}
