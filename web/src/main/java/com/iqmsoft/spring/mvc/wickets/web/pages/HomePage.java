package com.iqmsoft.spring.mvc.wickets.web.pages;

import org.apache.wicket.authroles.authorization.strategies.role.annotations.AuthorizeInstantiation;
import org.apache.wicket.model.Model;

import com.iqmsoft.spring.mvc.wickets.web.app.security.Roles;
import com.iqmsoft.spring.mvc.wickets.web.components.IconPanel;
import com.iqmsoft.spring.mvc.wickets.web.pages.lists.ListCategoryDummyPage;
import com.iqmsoft.spring.mvc.wickets.web.pages.lists.ListDummyPage;
import com.iqmsoft.spring.mvc.wickets.web.pages.nav.AbstractNavPage;



@AuthorizeInstantiation({ Roles.USER })
public class HomePage extends AbstractNavPage {
	private static final long serialVersionUID = 1L;



	public HomePage() {
		super();

		listIcons.add(new IconPanel<ListDummyPage>(listIcons.newChildId(),
				Model.of("Dummy"), ListDummyPage.class, "fa-book"));
		
		listIcons.add(new IconPanel<ListCategoryDummyPage>(listIcons.newChildId(),
				Model.of("Category Dummy"), ListCategoryDummyPage.class, "fa-eye"));

	}

}