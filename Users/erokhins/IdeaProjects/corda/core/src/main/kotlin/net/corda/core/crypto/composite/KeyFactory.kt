'KeyFactorySpi' @ [8:20] ==> public constructor KeyFactorySpi() defined in java.security.KeyFactorySpi[JavaClassConstructorDescriptor]

'Throws' @ [10:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'InvalidKeySpecException' @ [10:13] ==> public constructor InvalidKeySpecException() defined in java.security.spec.InvalidKeySpecException[JavaClassConstructorDescriptor]

'InvalidKeySpecException' @ [13:15] ==> public constructor InvalidKeySpecException(p0: (String..String?)) defined in java.security.spec.InvalidKeySpecException[JavaClassConstructorDescriptor]

'+' @ [13:39] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'keySpec' @ [13:69] ==> value-parameter keySpec: KeySpec defined in net.corda.core.crypto.composite.KeyFactory.engineGeneratePrivate[ValueParameterDescriptorImpl]

'javaClass' @ [13:77] ==> public val <T : Any> KeySpec.javaClass: Class<KeySpec> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> KeySpec

'Throws' @ [16:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'InvalidKeySpecException' @ [16:13] ==> public constructor InvalidKeySpecException() defined in java.security.spec.InvalidKeySpecException[JavaClassConstructorDescriptor]

'when (keySpec) {
            is X509EncodedKeySpec -> CompositeKey.getInstance(keySpec.encoded)
            else -> throw InvalidKeySpecException("key spec not recognised: " + keySpec.javaClass)
        }' @ [18:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PublicKey?, entry1: PublicKey?): PublicKey?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PublicKey?

'keySpec' @ [18:22] ==> value-parameter keySpec: KeySpec defined in net.corda.core.crypto.composite.KeyFactory.engineGeneratePublic[ValueParameterDescriptorImpl]

'getInstance' @ [19:51] ==> public final fun getInstance(encoded: ByteArray): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Companion[SimpleFunctionDescriptorImpl]

'keySpec' @ [19:63] ==> value-parameter keySpec: KeySpec defined in net.corda.core.crypto.composite.KeyFactory.engineGeneratePublic[ValueParameterDescriptorImpl]

'encoded' @ [19:71] ==> public final val X509EncodedKeySpec.encoded: (ByteArray..ByteArray?)[MyPropertyDescriptor]

'InvalidKeySpecException' @ [20:27] ==> public constructor InvalidKeySpecException(p0: (String..String?)) defined in java.security.spec.InvalidKeySpecException[JavaClassConstructorDescriptor]

'+' @ [20:51] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'keySpec' @ [20:81] ==> value-parameter keySpec: KeySpec defined in net.corda.core.crypto.composite.KeyFactory.engineGeneratePublic[ValueParameterDescriptorImpl]

'javaClass' @ [20:89] ==> public val <T : Any> KeySpec.javaClass: Class<KeySpec> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> KeySpec

'Throws' @ [24:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'InvalidKeySpecException' @ [24:13] ==> public constructor InvalidKeySpecException() defined in java.security.spec.InvalidKeySpecException[JavaClassConstructorDescriptor]

'InvalidKeySpecException' @ [27:15] ==> public constructor InvalidKeySpecException(p0: (String..String?)) defined in java.security.spec.InvalidKeySpecException[JavaClassConstructorDescriptor]

'key' @ [27:61] ==> value-parameter key: Key defined in net.corda.core.crypto.composite.KeyFactory.engineGetKeySpec[ValueParameterDescriptorImpl]

'keySpec' @ [27:66] ==> value-parameter keySpec: Class<T> defined in net.corda.core.crypto.composite.KeyFactory.engineGetKeySpec[ValueParameterDescriptorImpl]

'Throws' @ [30:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'InvalidKeyException' @ [30:13] ==> public constructor InvalidKeyException() defined in java.security.InvalidKeyException[JavaClassConstructorDescriptor]

'InvalidKeyException' @ [32:15] ==> public constructor InvalidKeyException(p0: (String..String?)) defined in java.security.InvalidKeyException[JavaClassConstructorDescriptor]

