/*
 *  Copyright (C) 2015 JPEXS, All rights reserved.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library.
package com.jpexs.debugger.flash.messages.in;

import com.jpexs.debugger.flash.DebuggerConnection;

import com.jpexs.debugger.flash.InDebuggerMessage;

/**
 *
 * @author JPEXS
 */
public class InPlaceObject extends InDebuggerMessage {

    public static final int ID = 13;

    public long objId;
    public String path;

    @Override
    public String toString() {
        return super.toString() + "(objId=" + objId + ", path=" + path + ")";
    }

    public InPlaceObject(DebuggerConnection c, byte[] data) {
        super(c, ID, data);
        objId = readPtr(c);
        path = readString();
    }

}