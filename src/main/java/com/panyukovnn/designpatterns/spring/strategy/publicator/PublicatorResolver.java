package com.panyukovnn.designpatterns.spring.strategy.publicator;

import com.panyukovnn.designpatterns.spring.strategy.model.PublicatorType;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Service
public class PublicatorResolver {

    private final Map<PublicatorType, Publicator> strategyMap = new HashMap<>();

    public PublicatorResolver(Set<Publicator> publicators) {
        publicators.forEach(publicator -> strategyMap.put(publicator.getType(), publicator));
    }

    public Publicator getPublicator(PublicatorType type) {
        return strategyMap.get(type);
    }
}
