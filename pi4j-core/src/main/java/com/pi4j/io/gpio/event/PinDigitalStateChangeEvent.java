package com.pi4j.io.gpio.event;

/*
 * #%L
 * **********************************************************************
 * ORGANIZATION  :  Pi4J
 * PROJECT       :  Pi4J :: Java Library (Core)
 * FILENAME      :  PinDigitalStateChangeEvent.java  
 * 
 * This file is part of the Pi4J project. More information about 
 * this project can be found here:  http://www.pi4j.com/
 * **********************************************************************
 * %%
 * Copyright (C) 2012 Pi4J
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import com.pi4j.io.gpio.Pin;
import com.pi4j.io.gpio.PinState;

public class PinDigitalStateChangeEvent extends PinEvent
{
    /**
     * 
     */
    private static final long serialVersionUID = -7643355305429082626L;
    private final PinState state;

    /**
     * <h1>Default event constructor</h1>
     * 
     * @param obj <p>
     *            Ignore this parameter
     *            </p>
     * @param pin <p>
     *            GPIO pin number (not header pin number; not wiringPi pin number)
     *            </p>
     * @param state <p>
     *            New GPIO pin state.
     *            </p>
     */
    public PinDigitalStateChangeEvent(Object obj, Pin pin, PinState state)
    {
        super(obj, pin, PinEventType.DIGITAL_STATE_CHANGE);
        this.state = state;
    }

    /**
     * <p>
     * Get the new pin state raised in this event.
     * </p>
     * 
     * @return <p>
     *         GPIO pin state (HIGH, LOW)
     *         </p>
     */
    public PinState getState()
    {
        return state;
    }
}
