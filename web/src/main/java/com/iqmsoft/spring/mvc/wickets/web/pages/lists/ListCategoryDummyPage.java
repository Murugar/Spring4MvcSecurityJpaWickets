
package com.iqmsoft.spring.mvc.wickets.web.pages.lists;

import org.apache.wicket.extensions.markup.html.repeater.data.table.PropertyColumn;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;

import com.iqmsoft.mvc.wickets.persistence.dao.CategoryDummy;
import com.iqmsoft.mvc.wickets.persistence.repository.CategoryDummyRepository;
import com.iqmsoft.spring.mvc.wickets.web.pages.edits.EditCategoryDummyPage;


public class ListCategoryDummyPage extends AbstractListPage<CategoryDummy> {
	
	private static final long serialVersionUID = 1L;
	
	@SpringBean
	protected CategoryDummyRepository categoryDummyRepository;
	
	public ListCategoryDummyPage(PageParameters pageParameters) {

		this.jpaRepository=categoryDummyRepository;
		this.editPageClass=EditCategoryDummyPage.class;
		columns.add(new PropertyColumn<CategoryDummy,String>(new Model<String>("Name"), "name", "name"));
	}


}
