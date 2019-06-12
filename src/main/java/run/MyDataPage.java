package run;

import wicket.Component;
import wicket.markup.html.basic.Label;
import wicket.model.Model;
import net.databinder.components.DataPage;

public class MyDataPage extends DataPage {
	
	/**
	 * @return name appears in page title, and often within the page
	 */
	@Override
	protected String getName() {
		return "1";
	}
	
	/**
	 * Add components to page.
	 */
	public MyDataPage() {
		super();
		
		// if getName() is invariant, simplify to Model(getName())
		add(new Label("pageTitleHeader", new Model() {
			@Override
			public Object getObject(Component component) {
				return getName();
			}
		}));	
	}
}
