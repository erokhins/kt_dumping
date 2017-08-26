'Transient' @ [16:5] ==> public constructor Transient() defined in kotlin.jvm.Transient[DeserializedClassConstructorDescriptor]

'require' @ [18:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'certPath' @ [18:17] ==> public final val certPath: CertPath defined in net.corda.core.identity.PartyAndCertificate[PropertyDescriptorImpl]

'type' @ [18:26] ==> public final val CertPath.type: (String..String?)[MyPropertyDescriptor]

'certPath' @ [19:21] ==> public final val certPath: CertPath defined in net.corda.core.identity.PartyAndCertificate[PropertyDescriptorImpl]

'certificates' @ [19:30] ==> public final val CertPath.certificates: (MutableList<out (Certificate..Certificate?)>..List<(Certificate..Certificate?)>?)[MyPropertyDescriptor]

'require' @ [20:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'certs' @ [20:17] ==> val certs: (MutableList<out (Certificate..Certificate?)>..List<(Certificate..Certificate?)>?) defined in net.corda.core.identity.PartyAndCertificate.<init>[LocalVariableDescriptor]

'size' @ [20:23] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'certificate' @ [21:9] ==> @Transient public final val certificate: X509CertificateHolder defined in net.corda.core.identity.PartyAndCertificate[PropertyDescriptorImpl]

'certs' @ [21:23] ==> val certs: (MutableList<out (Certificate..Certificate?)>..List<(Certificate..Certificate?)>?) defined in net.corda.core.identity.PartyAndCertificate.<init>[LocalVariableDescriptor]

'toX509CertHolder' @ [21:32] ==> public fun Certificate.toX509CertHolder(): X509CertificateHolder defined in net.corda.core.internal in file InternalUtils.kt[SimpleFunctionDescriptorImpl]

'Transient' @ [24:5] ==> public constructor Transient() defined in kotlin.jvm.Transient[DeserializedClassConstructorDescriptor]

'Party' @ [24:35] ==> public constructor Party(certificate: X509CertificateHolder) defined in net.corda.core.identity.Party[ClassConstructorDescriptorImpl]

'certificate' @ [24:41] ==> @Transient public final val certificate: X509CertificateHolder defined in net.corda.core.identity.PartyAndCertificate[PropertyDescriptorImpl]

'party' @ [26:38] ==> @Transient public final val party: Party defined in net.corda.core.identity.PartyAndCertificate[PropertyDescriptorImpl]

'owningKey' @ [26:44] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[PropertyDescriptorImpl]

'party' @ [27:32] ==> @Transient public final val party: Party defined in net.corda.core.identity.PartyAndCertificate[PropertyDescriptorImpl]

'name' @ [27:38] ==> public final val name: X500Name defined in net.corda.core.identity.Party[PropertyDescriptorImpl]

'party' @ [29:40] ==> @Transient public final val party: Party defined in net.corda.core.identity.PartyAndCertificate[PropertyDescriptorImpl]

'certificate' @ [30:56] ==> @Transient public final val certificate: X509CertificateHolder defined in net.corda.core.identity.PartyAndCertificate[PropertyDescriptorImpl]

'other' @ [32:49] ==> value-parameter other: Any? defined in net.corda.core.identity.PartyAndCertificate.equals[ValueParameterDescriptorImpl]

'this' @ [32:59] ==> <this> defined in net.corda.core.identity.PartyAndCertificate[LazyClassReceiverParameterDescriptor]

'other' @ [32:67] ==> value-parameter other: Any? defined in net.corda.core.identity.PartyAndCertificate.equals[ValueParameterDescriptorImpl]

'other' @ [32:99] ==> value-parameter other: Any? defined in net.corda.core.identity.PartyAndCertificate.equals[ValueParameterDescriptorImpl]

'party' @ [32:105] ==> @Transient public final val party: Party defined in net.corda.core.identity.PartyAndCertificate[PropertyDescriptorImpl]

'party' @ [32:114] ==> @Transient public final val party: Party defined in net.corda.core.identity.PartyAndCertificate[PropertyDescriptorImpl]

'party' @ [33:36] ==> @Transient public final val party: Party defined in net.corda.core.identity.PartyAndCertificate[PropertyDescriptorImpl]

'hashCode' @ [33:42] ==> public open fun hashCode(): Int defined in net.corda.core.identity.Party[SimpleFunctionDescriptorImpl]

'party' @ [34:39] ==> @Transient public final val party: Party defined in net.corda.core.identity.PartyAndCertificate[PropertyDescriptorImpl]

'toString' @ [34:45] ==> public open fun toString(): String defined in net.corda.core.identity.Party[SimpleFunctionDescriptorImpl]

'PKIXParameters' @ [38:26] ==> public constructor PKIXParameters(p0: (MutableSet<(TrustAnchor..TrustAnchor?)>..Set<(TrustAnchor..TrustAnchor?)>?)) defined in java.security.cert.PKIXParameters[JavaClassConstructorDescriptor]

'setOf' @ [38:41] ==> public fun <T> setOf(element: TrustAnchor): Set<TrustAnchor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TrustAnchor

'trustAnchor' @ [38:47] ==> value-parameter trustAnchor: TrustAnchor defined in net.corda.core.identity.PartyAndCertificate.verify[ValueParameterDescriptorImpl]

'apply' @ [38:61] ==> @InlineOnly public inline fun <T> PKIXParameters.apply(block: PKIXParameters.() -> Unit): PKIXParameters defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PKIXParameters

'isRevocationEnabled' @ [38:69] ==> public final var PKIXParameters.isRevocationEnabled: Boolean[MyPropertyDescriptor]

'getInstance' @ [39:43] ==> public open fun getInstance(p0: (String..String?)): (CertPathValidator..CertPathValidator?) defined in java.security.cert.CertPathValidator[JavaMethodDescriptor]

'validator' @ [40:16] ==> val validator: (CertPathValidator..CertPathValidator?) defined in net.corda.core.identity.PartyAndCertificate.verify[LocalVariableDescriptor]

'validate' @ [40:26] ==> public final fun validate(p0: (CertPath..CertPath?), p1: (CertPathParameters..CertPathParameters?)): (CertPathValidatorResult..CertPathValidatorResult?) defined in java.security.cert.CertPathValidator[JavaMethodDescriptor]

'certPath' @ [40:35] ==> public final val certPath: CertPath defined in net.corda.core.identity.PartyAndCertificate[PropertyDescriptorImpl]

'parameters' @ [40:45] ==> val parameters: PKIXParameters defined in net.corda.core.identity.PartyAndCertificate.verify[LocalVariableDescriptor]

