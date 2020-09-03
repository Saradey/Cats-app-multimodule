package com.evgeny.goncharov.wallcats.ui.events;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/evgeny/goncharov/wallcats/ui/events/CatDescriptionEvents;", "", "()V", "EventHideProgressAndShowContent", "EventHideProgressAndShowSomethingWrong", "EventShowProgress", "Lcom/evgeny/goncharov/wallcats/ui/events/CatDescriptionEvents$EventShowProgress;", "Lcom/evgeny/goncharov/wallcats/ui/events/CatDescriptionEvents$EventHideProgressAndShowContent;", "Lcom/evgeny/goncharov/wallcats/ui/events/CatDescriptionEvents$EventHideProgressAndShowSomethingWrong;", "wallCats_debug"})
public abstract class CatDescriptionEvents {
    
    private CatDescriptionEvents() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/evgeny/goncharov/wallcats/ui/events/CatDescriptionEvents$EventShowProgress;", "Lcom/evgeny/goncharov/wallcats/ui/events/CatDescriptionEvents;", "()V", "wallCats_debug"})
    public static final class EventShowProgress extends com.evgeny.goncharov.wallcats.ui.events.CatDescriptionEvents {
        public static final com.evgeny.goncharov.wallcats.ui.events.CatDescriptionEvents.EventShowProgress INSTANCE = null;
        
        private EventShowProgress() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/evgeny/goncharov/wallcats/ui/events/CatDescriptionEvents$EventHideProgressAndShowContent;", "Lcom/evgeny/goncharov/wallcats/ui/events/CatDescriptionEvents;", "()V", "wallCats_debug"})
    public static final class EventHideProgressAndShowContent extends com.evgeny.goncharov.wallcats.ui.events.CatDescriptionEvents {
        public static final com.evgeny.goncharov.wallcats.ui.events.CatDescriptionEvents.EventHideProgressAndShowContent INSTANCE = null;
        
        private EventHideProgressAndShowContent() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/evgeny/goncharov/wallcats/ui/events/CatDescriptionEvents$EventHideProgressAndShowSomethingWrong;", "Lcom/evgeny/goncharov/wallcats/ui/events/CatDescriptionEvents;", "()V", "wallCats_debug"})
    public static final class EventHideProgressAndShowSomethingWrong extends com.evgeny.goncharov.wallcats.ui.events.CatDescriptionEvents {
        public static final com.evgeny.goncharov.wallcats.ui.events.CatDescriptionEvents.EventHideProgressAndShowSomethingWrong INSTANCE = null;
        
        private EventHideProgressAndShowSomethingWrong() {
            super();
        }
    }
}