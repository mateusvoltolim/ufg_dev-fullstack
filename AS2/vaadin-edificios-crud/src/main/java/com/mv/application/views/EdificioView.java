package com.mv.application.views;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.splitlayout.SplitLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class EdificioView extends VerticalLayout {

    public EdificioView(EdificioLayout edificioLayout, ApartamentoLayout apartamentoLayout) {

        edificioLayout.addReceiverToGridSelection(apartamentoLayout.component());

        var splitLayout = new SplitLayout(edificioLayout, apartamentoLayout);
        splitLayout.setSizeFull();
        splitLayout.setSplitterPosition(40);
        add(splitLayout);
        setSizeFull();
    }
}
