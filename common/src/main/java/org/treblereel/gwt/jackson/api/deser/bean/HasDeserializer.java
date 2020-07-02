/*
 * Copyright 2013 Nicolas Morel
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

package org.treblereel.gwt.jackson.api.deser.bean;

import org.treblereel.gwt.jackson.api.XMLDeserializer;
import org.treblereel.gwt.jackson.api.stream.XMLReader;

/**
 * Lazy initialize a {@link XMLDeserializer}
 *
 * @author Nicolas Morel
 * @version $Id: $
 */
public abstract class HasDeserializer<V, S extends XMLDeserializer<V>> {

    private S deserializer;

    /**
     * <p>Getter for the field <code>deserializer</code>.</p>
     *
     * @return a S object.
     */
    public S getDeserializer(XMLReader reader) {
        if (null == deserializer) {
            deserializer = (S) newDeserializer(reader);
        }
        return deserializer;
    }

    /**
     * <p>newDeserializer</p>
     *
     * @return a {@link XMLDeserializer} object.
     */
    protected abstract XMLDeserializer<?> newDeserializer(XMLReader reader);
}
