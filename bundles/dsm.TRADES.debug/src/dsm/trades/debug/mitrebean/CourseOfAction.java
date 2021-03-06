package dsm.trades.debug.mitrebean;

import java.util.List;

public class CourseOfAction {

	private List<MitreObject> objects;

	private String type;

	public CourseOfAction() {
	}

	public CourseOfAction(List<MitreObject> objects, String type) {
		super();
		this.objects = objects;
		this.type = type;
	}

	public List<MitreObject> getObjects() {
		return objects;
	}

	public void setObjects(List<MitreObject> objects) {
		this.objects = objects;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
