package com.qnenet.views.about;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;

@PageTitle("About")
@Route(value = "About2")
@AnonymousAllowed
@Uses(Icon.class)
public class AboutView extends Composite<VerticalLayout> {

    public AboutView() {
        H1 h1 = new H1();
        H4 h4 = new H4();
        H2 h2 = new H2();
        H4 h42 = new H4();
        H3 h3 = new H3();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        getContent().setJustifyContentMode(JustifyContentMode.CENTER);
        getContent().setAlignItems(Alignment.CENTER);
        h1.setText("QNE Community");
        h1.setWidth("max-content");
        h4.setText("runs on");
        h4.setWidth("max-content");
        h2.setText("\"Quick N Easy\" Software");
        h2.setWidth("max-content");
        h42.setText("Founder and Developer");
        h42.setWidth("max-content");
        h3.setText("Paul F Fraser (1-pff)");
        h3.setWidth("max-content");
        getContent().add(h1);
        getContent().add(h4);
        getContent().add(h2);
        getContent().add(h42);
        getContent().add(h3);
    }
}
