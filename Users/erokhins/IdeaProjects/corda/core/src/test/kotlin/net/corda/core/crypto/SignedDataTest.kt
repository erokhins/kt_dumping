'TestDependencyInjectionBase' @ [11:24] ==> public constructor TestDependencyInjectionBase() defined in net.corda.testing.TestDependencyInjectionBase[DeserializedClassConstructorDescriptor]

'Before' @ [12:5] ==> public constructor Before() defined in org.junit.Before[JavaClassConstructorDescriptor]

'serialized' @ [14:9] ==> public final lateinit var serialized: SerializedBytes<String> defined in net.corda.core.crypto.SignedDataTest[PropertyDescriptorImpl]

'data' @ [14:22] ==> public final val data: String defined in net.corda.core.crypto.SignedDataTest[PropertyDescriptorImpl]

'serialize' @ [14:27] ==> public fun <T : Any> String.serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<String> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> String

'Test' @ [20:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'generateKeyPair' @ [22:23] ==> public fun generateKeyPair(): KeyPair defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'keyPair' @ [23:19] ==> val keyPair: KeyPair defined in net.corda.core.crypto.SignedDataTest.`make sure correctly signed data is released`[LocalVariableDescriptor]

'private' @ [23:27] ==> public final val KeyPair.private: (PrivateKey..PrivateKey?)[MyPropertyDescriptor]

'sign' @ [23:35] ==> public fun PrivateKey.sign(bytesToSign: ByteArray, publicKey: PublicKey): DigitalSignature.WithKey defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'serialized' @ [23:40] ==> public final lateinit var serialized: SerializedBytes<String> defined in net.corda.core.crypto.SignedDataTest[PropertyDescriptorImpl]

'bytes' @ [23:51] ==> public open val bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes[DeserializedPropertyDescriptor]

'keyPair' @ [23:58] ==> val keyPair: KeyPair defined in net.corda.core.crypto.SignedDataTest.`make sure correctly signed data is released`[LocalVariableDescriptor]

'public' @ [23:66] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'SignedData' @ [24:27] ==> public constructor SignedData<T : Any>(raw: SerializedBytes<String>, sig: DigitalSignature.WithKey) defined in net.corda.core.crypto.SignedData[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> String

'serialized' @ [24:38] ==> public final lateinit var serialized: SerializedBytes<String> defined in net.corda.core.crypto.SignedDataTest[PropertyDescriptorImpl]

'sig' @ [24:50] ==> val sig: DigitalSignature.WithKey defined in net.corda.core.crypto.SignedDataTest.`make sure correctly signed data is released`[LocalVariableDescriptor]

'wrappedData' @ [25:29] ==> val wrappedData: SignedData<String> defined in net.corda.core.crypto.SignedDataTest.`make sure correctly signed data is released`[LocalVariableDescriptor]

'verified' @ [25:41] ==> public final fun verified(): String defined in net.corda.core.crypto.SignedData[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [27:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'data' @ [27:22] ==> public final val data: String defined in net.corda.core.crypto.SignedDataTest[PropertyDescriptorImpl]

'unwrappedData' @ [27:28] ==> val unwrappedData: String defined in net.corda.core.crypto.SignedDataTest.`make sure correctly signed data is released`[LocalVariableDescriptor]

'Test' @ [30:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'SignatureException' @ [30:22] ==> public constructor SignatureException() defined in java.security.SignatureException[JavaClassConstructorDescriptor]

'generateKeyPair' @ [32:24] ==> public fun generateKeyPair(): KeyPair defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'generateKeyPair' @ [33:24] ==> public fun generateKeyPair(): KeyPair defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'keyPairA' @ [34:19] ==> val keyPairA: KeyPair defined in net.corda.core.crypto.SignedDataTest.`make sure incorrectly signed data raises an exception`[LocalVariableDescriptor]

'private' @ [34:28] ==> public final val KeyPair.private: (PrivateKey..PrivateKey?)[MyPropertyDescriptor]

'sign' @ [34:36] ==> public fun PrivateKey.sign(bytesToSign: ByteArray, publicKey: PublicKey): DigitalSignature.WithKey defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'serialized' @ [34:41] ==> public final lateinit var serialized: SerializedBytes<String> defined in net.corda.core.crypto.SignedDataTest[PropertyDescriptorImpl]

'bytes' @ [34:52] ==> public open val bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes[DeserializedPropertyDescriptor]

'keyPairB' @ [34:59] ==> val keyPairB: KeyPair defined in net.corda.core.crypto.SignedDataTest.`make sure incorrectly signed data raises an exception`[LocalVariableDescriptor]

'public' @ [34:68] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'SignedData' @ [35:27] ==> public constructor SignedData<T : Any>(raw: SerializedBytes<String>, sig: DigitalSignature.WithKey) defined in net.corda.core.crypto.SignedData[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> String

'serialized' @ [35:38] ==> public final lateinit var serialized: SerializedBytes<String> defined in net.corda.core.crypto.SignedDataTest[PropertyDescriptorImpl]

'sig' @ [35:50] ==> val sig: DigitalSignature.WithKey defined in net.corda.core.crypto.SignedDataTest.`make sure incorrectly signed data raises an exception`[LocalVariableDescriptor]

'wrappedData' @ [36:9] ==> val wrappedData: SignedData<String> defined in net.corda.core.crypto.SignedDataTest.`make sure incorrectly signed data raises an exception`[LocalVariableDescriptor]

'verified' @ [36:21] ==> public final fun verified(): String defined in net.corda.core.crypto.SignedData[DeserializedSimpleFunctionDescriptor]

