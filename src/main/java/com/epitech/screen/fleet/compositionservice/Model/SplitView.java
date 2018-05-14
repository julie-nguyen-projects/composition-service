package com.epitech.screen.fleet.compositionservice.Model;

import javax.persistence.Entity;

@Entity
public class SplitView extends AModule {

    private AModule content1;
    private AModule content2;
    private TypeSplit typeSplit;

    public SplitView() {
    }

    public SplitView(long id) {
        super(id);
    }

    public SplitView(long id, AModule content1, AModule content2, TypeSplit typeSplit) {
        super(id);
        this.content1 = content1;
        this.content2 = content2;
        this.typeSplit = typeSplit;
    }

    public SplitView(AModule content1, AModule content2, TypeSplit typeSplit) {
        this.content1 = content1;
        this.content2 = content2;
        this.typeSplit = typeSplit;
    }

    public AModule getContent1() {
        return content1;
    }

    public void setContent1(AModule content1) {
        this.content1 = content1;
    }

    public AModule getContent2() {
        return content2;
    }

    public void setContent2(AModule content2) {
        this.content2 = content2;
    }

    public TypeSplit getTypeSplit() {
        return typeSplit;
    }

    public void setTypeSplit(TypeSplit typeSplit) {
        this.typeSplit = typeSplit;
    }
}
