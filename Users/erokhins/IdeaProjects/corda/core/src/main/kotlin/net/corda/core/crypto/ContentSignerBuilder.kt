'signatureScheme' @ [17:24] ==> value-parameter signatureScheme: SignatureScheme defined in net.corda.core.crypto.ContentSignerBuilder.build[ValueParameterDescriptorImpl]

'signatureOID' @ [17:40] ==> public final val signatureOID: AlgorithmIdentifier defined in net.corda.core.crypto.SignatureScheme[PropertyDescriptorImpl]

'getInstance' @ [18:29] ==> public open fun getInstance(p0: (String..String?), p1: (Provider..Provider?)): (Signature..Signature?) defined in java.security.Signature[JavaMethodDescriptor]

'signatureScheme' @ [18:41] ==> value-parameter signatureScheme: SignatureScheme defined in net.corda.core.crypto.ContentSignerBuilder.build[ValueParameterDescriptorImpl]

'signatureName' @ [18:57] ==> public final val signatureName: String defined in net.corda.core.crypto.SignatureScheme[PropertyDescriptorImpl]

'provider' @ [18:72] ==> value-parameter provider: Provider defined in net.corda.core.crypto.ContentSignerBuilder.build[ValueParameterDescriptorImpl]

'apply' @ [18:82] ==> @InlineOnly public inline fun <T> (Signature..Signature?).apply(block: (Signature..Signature?).() -> Unit): (Signature..Signature?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.security.Signature..java.security.Signature?)

'if (random != null) {
                initSign(privateKey, random)
            } else {
                initSign(privateKey)
            }' @ [19:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'random' @ [19:17] ==> value-parameter random: SecureRandom? = ... defined in net.corda.core.crypto.ContentSignerBuilder.build[ValueParameterDescriptorImpl]

'initSign' @ [20:17] ==> public final fun initSign(p0: (PrivateKey..PrivateKey?), p1: (SecureRandom..SecureRandom?)): Unit defined in java.security.Signature[JavaMethodDescriptor]

'privateKey' @ [20:26] ==> value-parameter privateKey: PrivateKey defined in net.corda.core.crypto.ContentSignerBuilder.build[ValueParameterDescriptorImpl]

'random' @ [20:38] ==> value-parameter random: SecureRandom? = ... defined in net.corda.core.crypto.ContentSignerBuilder.build[ValueParameterDescriptorImpl]

'initSign' @ [22:17] ==> public final fun initSign(p0: (PrivateKey..PrivateKey?)): Unit defined in java.security.Signature[JavaMethodDescriptor]

'privateKey' @ [22:26] ==> value-parameter privateKey: PrivateKey defined in net.corda.core.crypto.ContentSignerBuilder.build[ValueParameterDescriptorImpl]

'SignatureOutputStream' @ [26:34] ==> public constructor SignatureOutputStream(sig: Signature) defined in net.corda.core.crypto.ContentSignerBuilder.SignatureOutputStream[ClassConstructorDescriptorImpl]

'sig' @ [26:56] ==> val sig: (Signature..Signature?) defined in net.corda.core.crypto.ContentSignerBuilder.build[LocalVariableDescriptor]

'sigAlgId' @ [27:74] ==> val sigAlgId: AlgorithmIdentifier defined in net.corda.core.crypto.ContentSignerBuilder.build[LocalVariableDescriptor]

'stream' @ [28:60] ==> private final val stream: ContentSignerBuilder.SignatureOutputStream defined in net.corda.core.crypto.ContentSignerBuilder.build.<no name provided>[PropertyDescriptorImpl]

'stream' @ [29:54] ==> private final val stream: ContentSignerBuilder.SignatureOutputStream defined in net.corda.core.crypto.ContentSignerBuilder.build.<no name provided>[PropertyDescriptorImpl]

'signature' @ [29:61] ==> internal final val signature: ByteArray defined in net.corda.core.crypto.ContentSignerBuilder.SignatureOutputStream[PropertyDescriptorImpl]

'OutputStream' @ [33:71] ==> public constructor OutputStream() defined in java.io.OutputStream[JavaClassConstructorDescriptor]

'sig' @ [34:51] ==> private final val sig: Signature defined in net.corda.core.crypto.ContentSignerBuilder.SignatureOutputStream[PropertyDescriptorImpl]

'sign' @ [34:55] ==> public final fun sign(): (ByteArray..ByteArray?) defined in java.security.Signature[JavaMethodDescriptor]

'sig' @ [35:68] ==> private final val sig: Signature defined in net.corda.core.crypto.ContentSignerBuilder.SignatureOutputStream[PropertyDescriptorImpl]

'update' @ [35:72] ==> public final fun update(p0: (ByteArray..ByteArray?), p1: Int, p2: Int): Unit defined in java.security.Signature[JavaMethodDescriptor]

'bytes' @ [35:79] ==> value-parameter bytes: ByteArray defined in net.corda.core.crypto.ContentSignerBuilder.SignatureOutputStream.write[ValueParameterDescriptorImpl]

'off' @ [35:86] ==> value-parameter off: Int defined in net.corda.core.crypto.ContentSignerBuilder.SignatureOutputStream.write[ValueParameterDescriptorImpl]

'len' @ [35:91] ==> value-parameter len: Int defined in net.corda.core.crypto.ContentSignerBuilder.SignatureOutputStream.write[ValueParameterDescriptorImpl]

'sig' @ [36:48] ==> private final val sig: Signature defined in net.corda.core.crypto.ContentSignerBuilder.SignatureOutputStream[PropertyDescriptorImpl]

'update' @ [36:52] ==> public final fun update(p0: (ByteArray..ByteArray?)): Unit defined in java.security.Signature[JavaMethodDescriptor]

'bytes' @ [36:59] ==> value-parameter bytes: ByteArray defined in net.corda.core.crypto.ContentSignerBuilder.SignatureOutputStream.write[ValueParameterDescriptorImpl]

'sig' @ [37:38] ==> private final val sig: Signature defined in net.corda.core.crypto.ContentSignerBuilder.SignatureOutputStream[PropertyDescriptorImpl]

'update' @ [37:42] ==> public final fun update(p0: Byte): Unit defined in java.security.Signature[JavaMethodDescriptor]

'b' @ [37:49] ==> value-parameter b: Int defined in net.corda.core.crypto.ContentSignerBuilder.SignatureOutputStream.write[ValueParameterDescriptorImpl]

'toByte' @ [37:51] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

