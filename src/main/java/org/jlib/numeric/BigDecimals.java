/*
 * jlib - Open Source Java Library
 *
 *     www.jlib.org
 *
 *
 *     Copyright 2005-2018 Igor Akkerman
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */

package org.jlib.numeric;

import lombok.experimental.UtilityClass;

import java.math.BigDecimal;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@UtilityClass
public class BigDecimals {
    public static Collector<BigDecimal, ?, BigDecimal> summing() {
        return Collectors.reducing(BigDecimal.ZERO, BigDecimal::add);
    }
}
