package com.qnenet.views.diarycomment;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.richtexteditor.RichTextEditor;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;

@PageTitle("DiaryComment")
@Route(value = "DiaryComment")
@AnonymousAllowed
@Uses(Icon.class)
public class DiaryCommentView extends Composite<VerticalLayout> {

    public DiaryCommentView() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        Button buttonTertiary = new Button();
        Button buttonTertiary2 = new Button();
        RichTextEditor richTextEditor = new RichTextEditor();
        RichTextEditor richTextEditor2 = new RichTextEditor();
        getContent().setWidth("100%");
        getContent().setHeight("300px");
        layoutRow.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.setHeight("min-content");
        buttonTertiary.setText("Add Comment");
        buttonTertiary.setWidth("min-content");
        buttonTertiary.addThemeVariants(ButtonVariant.LUMO_TERTIARY);
        buttonTertiary2.setText("Publish Comment");
        buttonTertiary2.setWidth("min-content");
        buttonTertiary2.addThemeVariants(ButtonVariant.LUMO_TERTIARY);
        richTextEditor.setWidth("100%");
        richTextEditor2.setWidth("100%");
        getContent().add(layoutRow);
        layoutRow.add(buttonTertiary);
        layoutRow.add(buttonTertiary2);
        getContent().add(richTextEditor);
        getContent().add(richTextEditor2);
    }
}
