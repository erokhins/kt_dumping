'CordaSerializable' @ [15:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'CordaSerializable' @ [22:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'emptyList' @ [27:66] ==> public fun <T> emptyList(): List<ServiceEntry> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceEntry

'require' @ [30:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'advertisedServices' @ [30:17] ==> public final val advertisedServices: List<ServiceEntry> defined in net.corda.core.node.NodeInfo[PropertyDescriptorImpl]

'none' @ [30:36] ==> public inline fun <T> Iterable<ServiceEntry>.none(predicate: (ServiceEntry) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceEntry

'it' @ [30:43] ==> value-parameter it: ServiceEntry defined in net.corda.core.node.NodeInfo.<init>.<anonymous>[ValueParameterDescriptorImpl]

'identity' @ [30:46] ==> public final val identity: PartyAndCertificate defined in net.corda.core.node.ServiceEntry[PropertyDescriptorImpl]

'legalIdentityAndCert' @ [30:58] ==> public final val legalIdentityAndCert: PartyAndCertificate defined in net.corda.core.node.NodeInfo[PropertyDescriptorImpl]

'legalIdentityAndCert' @ [35:38] ==> public final val legalIdentityAndCert: PartyAndCertificate defined in net.corda.core.node.NodeInfo[PropertyDescriptorImpl]

'party' @ [35:59] ==> @Transient public final val party: Party defined in net.corda.core.identity.PartyAndCertificate[PropertyDescriptorImpl]

'advertisedServices' @ [36:39] ==> public final val advertisedServices: List<ServiceEntry> defined in net.corda.core.node.NodeInfo[PropertyDescriptorImpl]

'single' @ [36:58] ==> public inline fun <T> Iterable<ServiceEntry>.single(predicate: (ServiceEntry) -> Boolean): ServiceEntry defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceEntry

'it' @ [36:67] ==> value-parameter it: ServiceEntry defined in net.corda.core.node.NodeInfo.<get-notaryIdentity>.<anonymous>[ValueParameterDescriptorImpl]

'info' @ [36:70] ==> public final val info: ServiceInfo defined in net.corda.core.node.ServiceEntry[PropertyDescriptorImpl]

'type' @ [36:75] ==> public final val type: ServiceType defined in net.corda.core.node.services.ServiceInfo[PropertyDescriptorImpl]

'isNotary' @ [36:80] ==> public final fun isNotary(): Boolean defined in net.corda.core.node.services.ServiceType[SimpleFunctionDescriptorImpl]

'identity' @ [36:93] ==> public final val identity: PartyAndCertificate defined in net.corda.core.node.ServiceEntry[PropertyDescriptorImpl]

'party' @ [36:102] ==> @Transient public final val party: Party defined in net.corda.core.identity.PartyAndCertificate[PropertyDescriptorImpl]

'advertisedServices' @ [38:16] ==> public final val advertisedServices: List<ServiceEntry> defined in net.corda.core.node.NodeInfo[PropertyDescriptorImpl]

'mapNotNull' @ [38:35] ==> public inline fun <T, R : Any> Iterable<ServiceEntry>.mapNotNull(transform: (ServiceEntry) -> Party?): List<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceEntry
    <R : Any> -> Party

'if (it.info.type.isSubTypeOf(type)) it.identity.party else null' @ [38:48] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Party?, elseBranch: Party?): Party?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Party?

'it' @ [38:52] ==> value-parameter it: ServiceEntry defined in net.corda.core.node.NodeInfo.serviceIdentities.<anonymous>[ValueParameterDescriptorImpl]

'info' @ [38:55] ==> public final val info: ServiceInfo defined in net.corda.core.node.ServiceEntry[PropertyDescriptorImpl]

'type' @ [38:60] ==> public final val type: ServiceType defined in net.corda.core.node.services.ServiceInfo[PropertyDescriptorImpl]

'isSubTypeOf' @ [38:65] ==> public final fun isSubTypeOf(superType: ServiceType): Boolean defined in net.corda.core.node.services.ServiceType[SimpleFunctionDescriptorImpl]

'type' @ [38:77] ==> value-parameter type: ServiceType defined in net.corda.core.node.NodeInfo.serviceIdentities[ValueParameterDescriptorImpl]

'it' @ [38:84] ==> value-parameter it: ServiceEntry defined in net.corda.core.node.NodeInfo.serviceIdentities.<anonymous>[ValueParameterDescriptorImpl]

'identity' @ [38:87] ==> public final val identity: PartyAndCertificate defined in net.corda.core.node.ServiceEntry[PropertyDescriptorImpl]

'party' @ [38:96] ==> @Transient public final val party: Party defined in net.corda.core.identity.PartyAndCertificate[PropertyDescriptorImpl]

