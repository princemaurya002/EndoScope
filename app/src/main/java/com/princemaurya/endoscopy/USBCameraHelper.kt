package com.princemaurya.endoscopy

import android.content.Context


class USBCameraHelper(context: Context) {
//    private val usbMonitor = USBMonitor(context, object : USBMonitor.OnDeviceConnectListener {
//        override fun onAttach(device: UsbDevice) {
//            // Handle device attachment
//            device?.let {
//                usbMonitor.requestPermission(it)
//            }
//        }
//
//        override fun onDettach(p0: UsbDevice?) {
//            TODO("Not yet implemented")
//        }
//
//        override fun onConnect(
//            device: UsbDevice?,
//            ctrlBlock: USBMonitor.UsbControlBlock?,
//            createNew: Boolean){
//            ctrlBlock?.let {
//                val camera = UVCCamera()
//                camera.open(it)
//                camera.setPreviewTexture(640, 480, UVCCamera.FRAME_FORMAT_MJPEG)
//                camera.startPreview()
//                // Handle device connection
//            }
//        }
//
//        override fun onDisconnect(p0: UsbDevice?, p1: USBMonitor.UsbControlBlock?) {
//            TODO("Not yet implemented")
//        }
//
//        override fun onCancel(p0: UsbDevice?) {
//            TODO("Not yet implemented")
//        }
//    })
//    fun register() {
//        usbMonitor.register()
//    }
//
//    fun unregister() {
//        usbMonitor.unregister()
//    }
}