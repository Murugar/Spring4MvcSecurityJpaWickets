
package com.iqmsoft.spring.mvc.wickets.web.pages.edits;

import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;

import com.iqmsoft.mvc.wickets.persistence.dao.CategoryDummy;
import com.iqmsoft.mvc.wickets.persistence.dao.Dummy;
import com.iqmsoft.mvc.wickets.persistence.repository.CategoryDummyRepository;
import com.iqmsoft.mvc.wickets.persistence.repository.DummyRepository;
import com.iqmsoft.spring.mvc.wickets.web.components.Select2ChoiceBootstrapFormComponent;
import com.iqmsoft.spring.mvc.wickets.web.components.TextFieldBootstrapFormComponent;
import com.iqmsoft.spring.mvc.wickets.web.components.providers.textchoice.StringJpaTextChoiceProvider;
import com.iqmsoft.spring.mvc.wickets.web.pages.lists.ListDummyPage;


public class EditDummyPage extends AbstractEditPage<Dummy> {


	private static final long serialVersionUID = 1L;


	/* (non-Javadoc)
	 * @see org.devgateway.ccrs.web.wicket.page.AbstractEditPage#newInstance()
	 */
	@Override
	protected Dummy newInstance() {
		return new Dummy();
	}
	
	@SpringBean
	private DummyRepository dummyRepository;
	
	@SpringBean
	private CategoryDummyRepository categoryDummyRepository;
	
	
	public EditDummyPage(PageParameters parameters) {
		super(parameters);
		this.jpaRepository = dummyRepository;
		this.listPageClass = ListDummyPage.class;
		
		editForm.add(new TextFieldBootstrapFormComponent<>("name", new Model<>("Name")).required());
		
		editForm.add(new Select2ChoiceBootstrapFormComponent<CategoryDummy>("category", new Model<>(
				"Dummy Category"), new StringJpaTextChoiceProvider<CategoryDummy>(
						categoryDummyRepository)));
	
	}
	
}
