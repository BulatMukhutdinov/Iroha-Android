/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package jp.co.soramitsu.sample.bindings;

public class ModelProtoTransaction {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ModelProtoTransaction(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ModelProtoTransaction obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        irohaJNI.delete_ModelProtoTransaction(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Blob signAndAddSignature(UnsignedTx us, Keypair keypair) {
    return new Blob(irohaJNI.ModelProtoTransaction_signAndAddSignature(swigCPtr, this, UnsignedTx.getCPtr(us), us, Keypair.getCPtr(keypair), keypair), true);
  }

  public ModelProtoTransaction() {
    this(irohaJNI.new_ModelProtoTransaction(), true);
  }

}