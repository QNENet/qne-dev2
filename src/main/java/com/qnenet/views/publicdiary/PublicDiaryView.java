package com.qnenet.views.publicdiary;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;

@PageTitle("PublicDiary")
@Route(value = "PublicDiary")
@AnonymousAllowed
@Uses(Icon.class)
public class PublicDiaryView extends Composite<VerticalLayout> {

    public PublicDiaryView() {
        getContent().setHeightFull();
        getContent().setWidthFull();
    }
}
