package com.demoaxon.services.queries;

import java.util.List;
import java.util.stream.Collectors;

import org.axonframework.eventsourcing.eventstore.EventStore;
import org.springframework.stereotype.Service;

@Service
public class AccountQueryServiceImpl implements AccountQueryService {

    private final EventStore eventStore;

    public AccountQueryServiceImpl(EventStore eventStore) {
        this.eventStore = eventStore;
    }

    @Override
    public List<Object> listEventsForAccount(String accountNumber) {
    	System.out.println(eventStore.readEvents(accountNumber).asStream().collect(Collectors.toList()));
        return eventStore.readEvents(accountNumber).asStream().map( s -> s.getPayload()).collect(Collectors.toList());
    }
}