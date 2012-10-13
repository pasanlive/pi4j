package com.pi4j.io.gpio.event;

/*
 * #%L
 * **********************************************************************
 * ORGANIZATION  :  Pi4J
 * PROJECT       :  Pi4J :: Java Library (Core)
 * FILENAME      :  PinEvent.java  
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


import java.util.EventObject;

import com.pi4j.io.gpio.Pin;

public class PinEvent extends EventObject
{
    /**
     * 
     */
    private static final long serialVersionUID = 5238592505805435621L;
    protected final Pin pin;
    protected final PinEventType type;

    /**
     * <h1>Default event constructor</h1>
     * 
     * @param obj <p>
     *            Ignore this parameter
     *            </p>
     * @param pin <p>
     *            GPIO pin number (not header pin number; not wiringPi pin number)
     *            </p>
     */
    public PinEvent(Object obj, Pin pin, PinEventType type)
    {
        super(obj);
        this.pin = pin;
        this.type = type;
    }

    /**
     * <p>
     * Get the pin number that changed and raised this event.
     * </p>
     * 
     * @return <p>
     *         GPIO pin number (not header pin number; not wiringPi pin number)
     *         </p>
     */
    public Pin getPin()
    {
        return pin;
    }
    
    
    public PinEventType getEventType()
    {
        return type;
    }
}
