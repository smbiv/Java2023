package edu.seminars.threads.synchronize;

import java.util.UUID;

public interface SubscriptionService {
    void createSubscription(UUID subscriptionId, long fee);

    void subscribeUser(UUID subscriptionId, UUID userId);

    void deleteSubscription(UUID subscriptionId);

    long calculateTotalFee(UUID userId);
}
