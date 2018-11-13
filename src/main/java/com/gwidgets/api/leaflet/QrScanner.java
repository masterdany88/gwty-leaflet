package com.gwidgets.api.leaflet;

import jsinterop.annotations.JsType;
import elemental2.dom.Element;
import jsinterop.annotations.JsPackage;

@JsType(isNative = true)
public class QrScanner {
    public QrScanner(Element element, Decode onDecode) {};
	//public QrScanner(Element elementById, Object onDecode) {}
	public native void start();
}
