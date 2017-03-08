
package com.iqmsoft.spring.mvc.wickets.web.pages.lists;

import org.apache.wicket.extensions.markup.html.repeater.data.table.PropertyColumn;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;

import com.iqmsoft.mvc.wickets.persistence.dao.Dummy;
import com.iqmsoft.mvc.wickets.persistence.repository.DummyRepository;
import com.iqmsoft.spring.mvc.wickets.web.pages.edits.EditDummyPage;


public class ListDummyPage extends AbstractListPage<Dummy> {
	
	private static final long serialVersionUID = 1L;
	
	@SpringBean
	protected DummyRepository dummyRepository;
	
	public ListDummyPage(PageParameters pageParameters) {

		this.jpaRepository=dummyRepository;
		this.editPageClass=EditDummyPage.class;
		columns.add(new PropertyColumn<Dummy,String>(new Model<String>("Name"), "name", "name"));
	}


}
