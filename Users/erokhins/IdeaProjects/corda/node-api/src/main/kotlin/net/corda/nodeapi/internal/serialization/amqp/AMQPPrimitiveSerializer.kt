'SerializerFactory' @ [13:43] ==> public companion object defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[FakeCallableDescriptorForObject]

'primitiveTypeName' @ [13:61] ==> public final fun primitiveTypeName(type: Type): String? defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion[SimpleFunctionDescriptorImpl]

'clazz' @ [13:79] ==> value-parameter clazz: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.AMQPPrimitiveSerializer.<init>[ValueParameterDescriptorImpl]

'clazz' @ [14:31] ==> value-parameter clazz: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.AMQPPrimitiveSerializer.<init>[ValueParameterDescriptorImpl]

'if (obj is ByteArray) {
            data.putObject(Binary(obj))
        } else {
            data.putObject(obj)
        }' @ [21:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'obj' @ [21:13] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.amqp.AMQPPrimitiveSerializer.writeObject[ValueParameterDescriptorImpl]

'data' @ [22:13] ==> value-parameter data: Data defined in net.corda.nodeapi.internal.serialization.amqp.AMQPPrimitiveSerializer.writeObject[ValueParameterDescriptorImpl]

'putObject' @ [22:18] ==> public abstract fun putObject(p0: (Any..Any?)): Unit defined in org.apache.qpid.proton.codec.Data[JavaMethodDescriptor]

'Binary' @ [22:28] ==> public constructor Binary(p0: (ByteArray..ByteArray?)) defined in org.apache.qpid.proton.amqp.Binary[JavaClassConstructorDescriptor]

'obj' @ [22:35] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.amqp.AMQPPrimitiveSerializer.writeObject[ValueParameterDescriptorImpl]

'data' @ [24:13] ==> value-parameter data: Data defined in net.corda.nodeapi.internal.serialization.amqp.AMQPPrimitiveSerializer.writeObject[ValueParameterDescriptorImpl]

'putObject' @ [24:18] ==> public abstract fun putObject(p0: (Any..Any?)): Unit defined in org.apache.qpid.proton.codec.Data[JavaMethodDescriptor]

'obj' @ [24:28] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.amqp.AMQPPrimitiveSerializer.writeObject[ValueParameterDescriptorImpl]

'?:' @ [28:91] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Any?, right: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Any

'obj' @ [28:92] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.amqp.AMQPPrimitiveSerializer.readObject[ValueParameterDescriptorImpl]

'array' @ [28:109] ==> public final val Binary.array: (ByteArray..ByteArray?)[MyPropertyDescriptor]

'obj' @ [28:118] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.amqp.AMQPPrimitiveSerializer.readObject[ValueParameterDescriptorImpl]

