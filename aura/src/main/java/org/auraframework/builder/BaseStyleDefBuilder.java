/*
 * Copyright (C) 2013 salesforce.com, inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.auraframework.builder;

import java.util.Set;

import org.auraframework.def.BaseStyleDef;

/**
 * Base builder for styles (css files).
 */
public interface BaseStyleDefBuilder<D extends BaseStyleDef> extends DefBuilder<D, D> {
    /**
     * Sets the parsed/preprocessed CSS content.
     */
    BaseStyleDefBuilder<D> setContent(String content);

    /**
     * Specifies all expressions found in the source.
     * <p>
     * An expression is the argument passed to the theme function. For example, in:
     *
     * <pre>
     * <code>
     * .THIS {
     *   color: theme(color);
     *   margin: theme(small + large + 'px');
     * }
     * </code>
     * </pre>
     *
     * both "color" and "small + large + 'px'" would be theme expressions.
     */
    BaseStyleDefBuilder<D> setThemeExpressions(Set<String> expressions);
}
