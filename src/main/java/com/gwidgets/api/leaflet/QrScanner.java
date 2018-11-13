package com.gwidgets.api.leaflet;

import jsinterop.annotations.JsType;
import elemental2.dom.Element;
import jsinterop.annotations.JsPackage;

@JsType(namespace=JsPackage.GLOBAL, isNative=true)
public class QrScanner {
    public QrScanner(Element element, Decode onDecode) {};
	//public QrScanner(Element elementById, Object onDecode) {}
	public native void start();
}
