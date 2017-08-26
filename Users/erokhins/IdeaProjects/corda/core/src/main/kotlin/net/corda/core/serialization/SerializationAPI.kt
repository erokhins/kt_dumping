'getValue' @ [99:56] ==> public final operator fun getValue(thisRef: Any?, property: KProperty<*>): T defined in net.corda.core.internal.WriteOnceProperty[SimpleFunctionDescriptorImpl]

'getValue' @ [100:46] ==> public final operator fun getValue(thisRef: Any?, property: KProperty<*>): T defined in net.corda.core.internal.WriteOnceProperty[SimpleFunctionDescriptorImpl]

'getValue' @ [101:53] ==> public final operator fun getValue(thisRef: Any?, property: KProperty<*>): T defined in net.corda.core.internal.WriteOnceProperty[SimpleFunctionDescriptorImpl]

'getValue' @ [102:53] ==> public final operator fun getValue(thisRef: Any?, property: KProperty<*>): T defined in net.corda.core.internal.WriteOnceProperty[SimpleFunctionDescriptorImpl]

'getValue' @ [103:50] ==> public final operator fun getValue(thisRef: Any?, property: KProperty<*>): T defined in net.corda.core.internal.WriteOnceProperty[SimpleFunctionDescriptorImpl]

'getValue' @ [104:53] ==> public final operator fun getValue(thisRef: Any?, property: KProperty<*>): T defined in net.corda.core.internal.WriteOnceProperty[SimpleFunctionDescriptorImpl]

'SERIALIZATION_FACTORY' @ [110:100] ==> public final var SERIALIZATION_FACTORY: SerializationFactory defined in net.corda.core.serialization.SerializationDefaults[PropertyImportedFromObject]

'P2P_CONTEXT' @ [110:155] ==> public final var P2P_CONTEXT: SerializationContext defined in net.corda.core.serialization.SerializationDefaults[PropertyImportedFromObject]

'serializationFactory' @ [111:12] ==> value-parameter serializationFactory: SerializationFactory = ... defined in net.corda.core.serialization.deserialize[ValueParameterDescriptorImpl]

'deserialize' @ [111:33] ==> public abstract fun <T : Any> deserialize(byteSequence: ByteSequence, clazz: Class<T>, context: SerializationContext): T defined in net.corda.core.serialization.SerializationFactory[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'this' @ [111:45] ==> <this> defined in net.corda.core.serialization.deserialize[ReceiverParameterDescriptorImpl]

'java' @ [111:60] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'context' @ [111:66] ==> value-parameter context: SerializationContext = ... defined in net.corda.core.serialization.deserialize[ValueParameterDescriptorImpl]

'SERIALIZATION_FACTORY' @ [117:106] ==> public final var SERIALIZATION_FACTORY: SerializationFactory defined in net.corda.core.serialization.SerializationDefaults[PropertyImportedFromObject]

'P2P_CONTEXT' @ [117:161] ==> public final var P2P_CONTEXT: SerializationContext defined in net.corda.core.serialization.SerializationDefaults[PropertyImportedFromObject]

'serializationFactory' @ [118:12] ==> value-parameter serializationFactory: SerializationFactory = ... defined in net.corda.core.serialization.deserialize[ValueParameterDescriptorImpl]

'deserialize' @ [118:33] ==> public abstract fun <T : Any> deserialize(byteSequence: ByteSequence, clazz: Class<T>, context: SerializationContext): T defined in net.corda.core.serialization.SerializationFactory[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'this' @ [118:45] ==> <this> defined in net.corda.core.serialization.deserialize[ReceiverParameterDescriptorImpl]

'java' @ [118:60] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'context' @ [118:66] ==> value-parameter context: SerializationContext = ... defined in net.corda.core.serialization.deserialize[ValueParameterDescriptorImpl]

'SERIALIZATION_FACTORY' @ [124:97] ==> public final var SERIALIZATION_FACTORY: SerializationFactory defined in net.corda.core.serialization.SerializationDefaults[PropertyImportedFromObject]

'P2P_CONTEXT' @ [124:152] ==> public final var P2P_CONTEXT: SerializationContext defined in net.corda.core.serialization.SerializationDefaults[PropertyImportedFromObject]

'this' @ [124:170] ==> <this> defined in net.corda.core.serialization.deserialize[ReceiverParameterDescriptorImpl]

'sequence' @ [124:175] ==> public fun ByteArray.sequence(offset: Int = ..., size: Int = ...): ByteSequence defined in net.corda.core.utilities in file ByteArrays.kt[SimpleFunctionDescriptorImpl]

'deserialize' @ [124:186] ==> public inline fun <reified T : Any> ByteSequence.deserialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): T defined in net.corda.core.serialization[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : Any> -> T

'serializationFactory' @ [124:198] ==> value-parameter serializationFactory: SerializationFactory = ... defined in net.corda.core.serialization.deserialize[ValueParameterDescriptorImpl]

'context' @ [124:220] ==> value-parameter context: SerializationContext = ... defined in net.corda.core.serialization.deserialize[ValueParameterDescriptorImpl]

'SERIALIZATION_FACTORY' @ [129:72] ==> public final var SERIALIZATION_FACTORY: SerializationFactory defined in net.corda.core.serialization.SerializationDefaults[PropertyImportedFromObject]

'P2P_CONTEXT' @ [129:127] ==> public final var P2P_CONTEXT: SerializationContext defined in net.corda.core.serialization.SerializationDefaults[PropertyImportedFromObject]

'serializationFactory' @ [130:12] ==> value-parameter serializationFactory: SerializationFactory = ... defined in net.corda.core.serialization.serialize[ValueParameterDescriptorImpl]

'serialize' @ [130:33] ==> public abstract fun <T : Any> serialize(obj: T, context: SerializationContext): SerializedBytes<T> defined in net.corda.core.serialization.SerializationFactory[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'this' @ [130:43] ==> <this> defined in net.corda.core.serialization.serialize[ReceiverParameterDescriptorImpl]

'context' @ [130:49] ==> value-parameter context: SerializationContext = ... defined in net.corda.core.serialization.serialize[ValueParameterDescriptorImpl]

'Suppress' @ [137:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'OpaqueBytes' @ [138:52] ==> public constructor OpaqueBytes(bytes: ByteArray) defined in net.corda.core.utilities.OpaqueBytes[ClassConstructorDescriptorImpl]

'bytes' @ [138:64] ==> value-parameter bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes.<init>[ValueParameterDescriptorImpl]

'getValue' @ [140:29] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'bytes' @ [140:36] ==> value-parameter bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes.<init>[ValueParameterDescriptorImpl]

'sha256' @ [140:42] ==> public fun ByteArray.sha256(): SecureHash.SHA256 defined in net.corda.core.crypto in file SecureHash.kt[SimpleFunctionDescriptorImpl]

