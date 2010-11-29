/*
 * Copyright (c) 2010. Axon Framework
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.axonframework.saga;

import org.axonframework.domain.Event;
import org.axonframework.eventhandling.EventListener;

/**
 * @author Allard Buijze
 * @since 0.7
 */
public interface SagaManager extends EventListener {

    /**
     * Handles the event by passing it to all saga that have an Association Value found in the given event.
     *
     * @param event the event to handle
     */
    @Override
    void handle(Event event);
}
