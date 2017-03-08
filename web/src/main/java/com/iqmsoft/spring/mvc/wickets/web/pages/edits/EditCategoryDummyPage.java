
package com.iqmsoft.spring.mvc.wickets.web.pages.edits;

import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;

import com.iqmsoft.mvc.wickets.persistence.dao.CategoryDummy;
import com.iqmsoft.mvc.wickets.persistence.repository.CategoryDummyRepository;
import com.iqmsoft.spring.mvc.wickets.web.components.TextFieldBootstrapFormComponent;
import com.iqmsoft.spring.mvc.wickets.web.pages.lists.ListCategoryDummyPage;


public class EditCategoryDummyPage extends AbstractEditPage<CategoryDummy> {


	private static final long serialVersionUID = 1L;


	/* (non-Javadoc)
	 * @see org.devgateway.ccrs.web.wicket.page.AbstractEditPage#newInstance()
	 */
	@Override
	protected CategoryDummy newInstance() {
		return new CategoryDummy();
	}
	
	@SpringBean
	private CategoryDummyRepository categoryDummyRepository;
	

	
	public EditCategoryDummyPage(PageParameters parameters) {
		super(parameters);
		this.jpaRepository = categoryDummyRepository;
		this.listPageClass = ListCategoryDummyPage.class;
		
		editForm.add(new TextFieldBootstrapFormComponent<>("name", new Model<>("Name")).required());
		
	
	}
	
}
