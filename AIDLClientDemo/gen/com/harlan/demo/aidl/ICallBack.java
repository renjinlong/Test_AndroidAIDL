/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: C:\\Users\\jinlong\\Desktop\\medata\\TestAIDL\\AIDLClientDemo\\src\\com\\harlan\\demo\\aidl\\ICallBack.aidl
 */
package com.harlan.demo.aidl;
public interface ICallBack extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.harlan.demo.aidl.ICallBack
{
private static final java.lang.String DESCRIPTOR = "com.harlan.demo.aidl.ICallBack";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.harlan.demo.aidl.ICallBack interface,
 * generating a proxy if needed.
 */
public static com.harlan.demo.aidl.ICallBack asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.harlan.demo.aidl.ICallBack))) {
return ((com.harlan.demo.aidl.ICallBack)iin);
}
return new com.harlan.demo.aidl.ICallBack.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_handleByServer:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.handleByServer(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.harlan.demo.aidl.ICallBack
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
/**
	*callback of AIDLClient
	*handle by server
	*/
@Override public void handleByServer(java.lang.String param) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(param);
mRemote.transact(Stub.TRANSACTION_handleByServer, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_handleByServer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
/**
	*callback of AIDLClient
	*handle by server
	*/
public void handleByServer(java.lang.String param) throws android.os.RemoteException;
}
