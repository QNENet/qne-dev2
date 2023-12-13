package com.qnenet.views.documentsprivatediaryedit;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H6;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.richtexteditor.RichTextEditor;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;

@PageTitle("Documents/PrivateDiary/Edit")
@Route(value = "Documents/PrivateDiary/Edit")
@PermitAll
@Uses(Icon.class)
public class DocumentsPrivateDiaryEditView extends Composite<VerticalLayout> {

    public DocumentsPrivateDiaryEditView() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        Button buttonTertiary = new Button();
        Button buttonTertiary2 = new Button();
        Button buttonTertiary3 = new Button();
        RichTextEditor richTextEditor = new RichTextEditor();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        H6 h6 = new H6();
        VerticalLayout layoutColumn3 = new VerticalLayout();
        H6 h62 = new H6();
        getContent().setSpacing(false);
        getContent().setPadding(false);
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutRow.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow);
        layoutRow.setWidth("100%");
        layoutRow.setHeight("min-content");
        layoutRow.setAlignItems(Alignment.START);
        layoutRow.setJustifyContentMode(JustifyContentMode.CENTER);
        buttonTertiary.setText("Add New");
        buttonTertiary.setWidth("min-content");
        buttonTertiary.addThemeVariants(ButtonVariant.LUMO_TERTIARY);
        buttonTertiary2.setText("Publish");
        buttonTertiary2.setWidth("min-content");
        buttonTertiary2.addThemeVariants(ButtonVariant.LUMO_TERTIARY);
        buttonTertiary3.setText("Comment");
        buttonTertiary3.setWidth("min-content");
        buttonTertiary3.addThemeVariants(ButtonVariant.LUMO_TERTIARY);
        richTextEditor.setWidth("100%");
        layoutColumn2.setWidthFull();
        getContent().setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.setWidth("100%");
        layoutColumn2.getStyle().set("flex-grow", "1");
        layoutColumn2.setJustifyContentMode(JustifyContentMode.END);
        layoutColumn2.setAlignItems(Alignment.CENTER);
        h6.setText("Diary Entry");
        h6.setWidth("max-content");
        layoutColumn3.setWidthFull();
        layoutColumn2.setFlexGrow(1.0, layoutColumn3);
        layoutColumn3.setWidth("100%");
        layoutColumn3.setHeight("min-content");
        layoutColumn3.setJustifyContentMode(JustifyContentMode.END);
        layoutColumn3.setAlignItems(Alignment.CENTER);
        h62.setText("Comment");
        h62.setWidth("max-content");
        getContent().add(layoutRow);
        layoutRow.add(buttonTertiary);
        layoutRow.add(buttonTertiary2);
        layoutRow.add(buttonTertiary3);
        getContent().add(richTextEditor);
        getContent().add(layoutColumn2);
        layoutColumn2.add(h6);
        layoutColumn2.add(layoutColumn3);
        layoutColumn3.add(h62);
    }
}
