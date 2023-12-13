package com.qnenet.views.documentspublicdiaryedit;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;

@PageTitle("Documents/PublicDiary/Edit")
@Route(value = "Documents/PublicDiary/Edit")
@PermitAll
@Uses(Icon.class)
public class DocumentsPublicDiaryEditView extends Composite<VerticalLayout> {

    public DocumentsPublicDiaryEditView() {
        getContent().setHeightFull();
        getContent().setWidthFull();
    }
}
