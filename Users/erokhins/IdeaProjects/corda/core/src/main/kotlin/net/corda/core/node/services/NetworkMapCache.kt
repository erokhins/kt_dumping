'CordaSerializable' @ [23:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'MapChange' @ [27:57] ==> private constructor MapChange() defined in net.corda.core.node.services.NetworkMapCache.MapChange[ClassConstructorDescriptorImpl]

'MapChange' @ [28:59] ==> private constructor MapChange() defined in net.corda.core.node.services.NetworkMapCache.MapChange[ClassConstructorDescriptorImpl]

'MapChange' @ [29:88] ==> private constructor MapChange() defined in net.corda.core.node.services.NetworkMapCache.MapChange[ClassConstructorDescriptorImpl]

'getNodesWithService' @ [37:45] ==> public open fun getNodesWithService(serviceType: ServiceType): List<NodeInfo> defined in net.corda.core.node.services.NetworkMapCache[SimpleFunctionDescriptorImpl]

'notary' @ [37:77] ==> public final val notary: ServiceType defined in net.corda.core.node.services.ServiceType.Companion[PropertyDescriptorImpl]

'getNodesWithService' @ [43:48] ==> public open fun getNodesWithService(serviceType: ServiceType): List<NodeInfo> defined in net.corda.core.node.services.NetworkMapCache[SimpleFunctionDescriptorImpl]

'regulator' @ [43:80] ==> public final val regulator: ServiceType defined in net.corda.core.node.services.ServiceType.Companion[PropertyDescriptorImpl]

'partyNodes' @ [57:16] ==> public abstract val partyNodes: List<NodeInfo> defined in net.corda.core.node.services.NetworkMapCache[PropertyDescriptorImpl]

'filter' @ [57:27] ==> public inline fun <T> Iterable<NodeInfo>.filter(predicate: (NodeInfo) -> Boolean): List<NodeInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeInfo

'it' @ [57:36] ==> value-parameter it: NodeInfo defined in net.corda.core.node.services.NetworkMapCache.getNodesWithService.<anonymous>[ValueParameterDescriptorImpl]

'advertisedServices' @ [57:39] ==> public final val advertisedServices: List<ServiceEntry> defined in net.corda.core.node.NodeInfo[PropertyDescriptorImpl]

'any' @ [57:58] ==> public inline fun <T> Iterable<ServiceEntry>.any(predicate: (ServiceEntry) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceEntry

'it' @ [57:64] ==> value-parameter it: ServiceEntry defined in net.corda.core.node.services.NetworkMapCache.getNodesWithService.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'info' @ [57:67] ==> public final val info: ServiceInfo defined in net.corda.core.node.ServiceEntry[PropertyDescriptorImpl]

'type' @ [57:72] ==> public final val type: ServiceType defined in net.corda.core.node.services.ServiceInfo[PropertyDescriptorImpl]

'isSubTypeOf' @ [57:77] ==> public final fun isSubTypeOf(superType: ServiceType): Boolean defined in net.corda.core.node.services.ServiceType[SimpleFunctionDescriptorImpl]

'serviceType' @ [57:89] ==> value-parameter serviceType: ServiceType defined in net.corda.core.node.services.NetworkMapCache.getNodesWithService[ValueParameterDescriptorImpl]

'getNodesWithService' @ [65:97] ==> public open fun getNodesWithService(serviceType: ServiceType): List<NodeInfo> defined in net.corda.core.node.services.NetworkMapCache[SimpleFunctionDescriptorImpl]

'type' @ [65:117] ==> value-parameter type: ServiceType defined in net.corda.core.node.services.NetworkMapCache.getRecommended[ValueParameterDescriptorImpl]

'firstOrNull' @ [65:123] ==> public fun <T> List<NodeInfo>.firstOrNull(): NodeInfo? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeInfo

'partyNodes' @ [79:62] ==> public abstract val partyNodes: List<NodeInfo> defined in net.corda.core.node.services.NetworkMapCache[PropertyDescriptorImpl]

'singleOrNull' @ [79:73] ==> public inline fun <T> Iterable<NodeInfo>.singleOrNull(predicate: (NodeInfo) -> Boolean): NodeInfo? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeInfo

'it' @ [79:88] ==> value-parameter it: NodeInfo defined in net.corda.core.node.services.NetworkMapCache.getNodeByLegalName.<anonymous>[ValueParameterDescriptorImpl]

'legalIdentity' @ [79:91] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[PropertyDescriptorImpl]

'name' @ [79:105] ==> public final val name: X500Name defined in net.corda.core.identity.Party[PropertyDescriptorImpl]

'principal' @ [79:113] ==> value-parameter principal: X500Name defined in net.corda.core.node.services.NetworkMapCache.getNodeByLegalName[ValueParameterDescriptorImpl]

'partyNodes' @ [92:16] ==> public abstract val partyNodes: List<NodeInfo> defined in net.corda.core.node.services.NetworkMapCache[PropertyDescriptorImpl]

'filter' @ [92:27] ==> public inline fun <T> Iterable<NodeInfo>.filter(predicate: (NodeInfo) -> Boolean): List<NodeInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeInfo

'it' @ [92:36] ==> value-parameter it: NodeInfo defined in net.corda.core.node.services.NetworkMapCache.getNodesByAdvertisedServiceIdentityKey.<anonymous>[ValueParameterDescriptorImpl]

'advertisedServices' @ [92:39] ==> public final val advertisedServices: List<ServiceEntry> defined in net.corda.core.node.NodeInfo[PropertyDescriptorImpl]

'any' @ [92:58] ==> public inline fun <T> Iterable<ServiceEntry>.any(predicate: (ServiceEntry) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceEntry

'it' @ [92:64] ==> value-parameter it: ServiceEntry defined in net.corda.core.node.services.NetworkMapCache.getNodesByAdvertisedServiceIdentityKey.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'identity' @ [92:67] ==> public final val identity: PartyAndCertificate defined in net.corda.core.node.ServiceEntry[PropertyDescriptorImpl]

'owningKey' @ [92:76] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.PartyAndCertificate[PropertyDescriptorImpl]

'publicKey' @ [92:89] ==> value-parameter publicKey: PublicKey defined in net.corda.core.node.services.NetworkMapCache.getNodesByAdvertisedServiceIdentityKey[ValueParameterDescriptorImpl]

'notaryNodes' @ [100:26] ==> public open val notaryNodes: List<NodeInfo> defined in net.corda.core.node.services.NetworkMapCache[PropertyDescriptorImpl]

'filter' @ [100:38] ==> public inline fun <T> Iterable<NodeInfo>.filter(predicate: (NodeInfo) -> Boolean): List<NodeInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeInfo

'it' @ [101:13] ==> value-parameter it: NodeInfo defined in net.corda.core.node.services.NetworkMapCache.getNotary.<anonymous>[ValueParameterDescriptorImpl]

'advertisedServices' @ [101:16] ==> public final val advertisedServices: List<ServiceEntry> defined in net.corda.core.node.NodeInfo[PropertyDescriptorImpl]

'any' @ [101:35] ==> public inline fun <T> Iterable<ServiceEntry>.any(predicate: (ServiceEntry) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceEntry

'it' @ [101:41] ==> value-parameter it: ServiceEntry defined in net.corda.core.node.services.NetworkMapCache.getNotary.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'info' @ [101:44] ==> public final val info: ServiceInfo defined in net.corda.core.node.ServiceEntry[PropertyDescriptorImpl]

'type' @ [101:49] ==> public final val type: ServiceType defined in net.corda.core.node.services.ServiceInfo[PropertyDescriptorImpl]

'isSubTypeOf' @ [101:54] ==> public final fun isSubTypeOf(superType: ServiceType): Boolean defined in net.corda.core.node.services.ServiceType[SimpleFunctionDescriptorImpl]

'notary' @ [101:78] ==> public final val notary: ServiceType defined in net.corda.core.node.services.ServiceType.Companion[PropertyDescriptorImpl]

'it' @ [101:89] ==> value-parameter it: ServiceEntry defined in net.corda.core.node.services.NetworkMapCache.getNotary.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'info' @ [101:92] ==> public final val info: ServiceInfo defined in net.corda.core.node.ServiceEntry[PropertyDescriptorImpl]

'name' @ [101:97] ==> public final val name: X500Name? defined in net.corda.core.node.services.ServiceInfo[PropertyDescriptorImpl]

'principal' @ [101:105] ==> value-parameter principal: X500Name defined in net.corda.core.node.services.NetworkMapCache.getNotary[ValueParameterDescriptorImpl]

'randomOrNull' @ [102:11] ==> public fun <T> List<NodeInfo>.randomOrNull(): NodeInfo? defined in net.corda.core.internal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> NodeInfo

'notaryNode' @ [103:16] ==> val notaryNode: NodeInfo? defined in net.corda.core.node.services.NetworkMapCache.getNotary[LocalVariableDescriptor]

'notaryIdentity' @ [103:28] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[PropertyDescriptorImpl]

'if (type == null) {
            notaryNodes
        } else {
            require(type != ServiceType.notary && type.isSubTypeOf(ServiceType.notary)) {
                "The provided type must be a specific notary sub-type"
            }
            notaryNodes.filter { it.advertisedServices.any { it.info.type == type } }
        }' @ [111:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<NodeInfo>, elseBranch: List<NodeInfo>): List<NodeInfo>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<NodeInfo>

'type' @ [111:25] ==> value-parameter type: ServiceType? = ... defined in net.corda.core.node.services.NetworkMapCache.getAnyNotary[ValueParameterDescriptorImpl]

'notaryNodes' @ [112:13] ==> public open val notaryNodes: List<NodeInfo> defined in net.corda.core.node.services.NetworkMapCache[PropertyDescriptorImpl]

'require' @ [114:13] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'type' @ [114:21] ==> value-parameter type: ServiceType? = ... defined in net.corda.core.node.services.NetworkMapCache.getAnyNotary[ValueParameterDescriptorImpl]

'notary' @ [114:41] ==> public final val notary: ServiceType defined in net.corda.core.node.services.ServiceType.Companion[PropertyDescriptorImpl]

'type' @ [114:51] ==> value-parameter type: ServiceType? = ... defined in net.corda.core.node.services.NetworkMapCache.getAnyNotary[ValueParameterDescriptorImpl]

'isSubTypeOf' @ [114:56] ==> public final fun isSubTypeOf(superType: ServiceType): Boolean defined in net.corda.core.node.services.ServiceType[SimpleFunctionDescriptorImpl]

'notary' @ [114:80] ==> public final val notary: ServiceType defined in net.corda.core.node.services.ServiceType.Companion[PropertyDescriptorImpl]

'notaryNodes' @ [117:13] ==> public open val notaryNodes: List<NodeInfo> defined in net.corda.core.node.services.NetworkMapCache[PropertyDescriptorImpl]

'filter' @ [117:25] ==> public inline fun <T> Iterable<NodeInfo>.filter(predicate: (NodeInfo) -> Boolean): List<NodeInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeInfo

'it' @ [117:34] ==> value-parameter it: NodeInfo defined in net.corda.core.node.services.NetworkMapCache.getAnyNotary.<anonymous>[ValueParameterDescriptorImpl]

'advertisedServices' @ [117:37] ==> public final val advertisedServices: List<ServiceEntry> defined in net.corda.core.node.NodeInfo[PropertyDescriptorImpl]

'any' @ [117:56] ==> public inline fun <T> Iterable<ServiceEntry>.any(predicate: (ServiceEntry) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceEntry

'it' @ [117:62] ==> value-parameter it: ServiceEntry defined in net.corda.core.node.services.NetworkMapCache.getAnyNotary.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'info' @ [117:65] ==> public final val info: ServiceInfo defined in net.corda.core.node.ServiceEntry[PropertyDescriptorImpl]

'type' @ [117:70] ==> public final val type: ServiceType defined in net.corda.core.node.services.ServiceInfo[PropertyDescriptorImpl]

'type' @ [117:78] ==> value-parameter type: ServiceType? = ... defined in net.corda.core.node.services.NetworkMapCache.getAnyNotary[ValueParameterDescriptorImpl]

'nodes' @ [119:16] ==> val nodes: List<NodeInfo> defined in net.corda.core.node.services.NetworkMapCache.getAnyNotary[LocalVariableDescriptor]

'randomOrNull' @ [119:22] ==> public fun <T> List<NodeInfo>.randomOrNull(): NodeInfo? defined in net.corda.core.internal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> NodeInfo

'notaryIdentity' @ [119:38] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[PropertyDescriptorImpl]

'partyNodes' @ [127:22] ==> public abstract val partyNodes: List<NodeInfo> defined in net.corda.core.node.services.NetworkMapCache[PropertyDescriptorImpl]

'node' @ [128:37] ==> val node: NodeInfo defined in net.corda.core.node.services.NetworkMapCache.getAnyServiceOfType[LocalVariableDescriptor]

'serviceIdentities' @ [128:42] ==> public final fun serviceIdentities(type: ServiceType): List<Party> defined in net.corda.core.node.NodeInfo[SimpleFunctionDescriptorImpl]

'type' @ [128:60] ==> value-parameter type: ServiceType defined in net.corda.core.node.services.NetworkMapCache.getAnyServiceOfType[ValueParameterDescriptorImpl]

'serviceIdentities' @ [129:17] ==> val serviceIdentities: List<Party> defined in net.corda.core.node.services.NetworkMapCache.getAnyServiceOfType[LocalVariableDescriptor]

'isNotEmpty' @ [129:35] ==> @InlineOnly public inline fun <T> Collection<Party>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'serviceIdentities' @ [130:24] ==> val serviceIdentities: List<Party> defined in net.corda.core.node.services.NetworkMapCache.getAnyServiceOfType[LocalVariableDescriptor]

'randomOrNull' @ [130:42] ==> public fun <T> List<Party>.randomOrNull(): Party? defined in net.corda.core.internal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Party

'notaryNodes' @ [137:43] ==> public open val notaryNodes: List<NodeInfo> defined in net.corda.core.node.services.NetworkMapCache[PropertyDescriptorImpl]

'any' @ [137:55] ==> public inline fun <T> Iterable<NodeInfo>.any(predicate: (NodeInfo) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeInfo

'it' @ [137:61] ==> value-parameter it: NodeInfo defined in net.corda.core.node.services.NetworkMapCache.isNotary.<anonymous>[ValueParameterDescriptorImpl]

'notaryIdentity' @ [137:64] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[PropertyDescriptorImpl]

'party' @ [137:82] ==> value-parameter party: Party defined in net.corda.core.node.services.NetworkMapCache.isNotary[ValueParameterDescriptorImpl]

'notaryNodes' @ [141:22] ==> public open val notaryNodes: List<NodeInfo> defined in net.corda.core.node.services.NetworkMapCache[PropertyDescriptorImpl]

'firstOrNull' @ [141:34] ==> public inline fun <T> Iterable<NodeInfo>.firstOrNull(predicate: (NodeInfo) -> Boolean): NodeInfo? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeInfo

'it' @ [141:48] ==> value-parameter it: NodeInfo defined in net.corda.core.node.services.NetworkMapCache.isValidatingNotary.<anonymous>[ValueParameterDescriptorImpl]

'notaryIdentity' @ [141:51] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[PropertyDescriptorImpl]

'party' @ [141:69] ==> value-parameter party: Party defined in net.corda.core.node.services.NetworkMapCache.isValidatingNotary[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [142:26] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'+' @ [142:51] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'party' @ [142:83] ==> value-parameter party: Party defined in net.corda.core.node.services.NetworkMapCache.isValidatingNotary[ValueParameterDescriptorImpl]

'notaryNodes' @ [144:38] ==> public open val notaryNodes: List<NodeInfo> defined in net.corda.core.node.services.NetworkMapCache[PropertyDescriptorImpl]

'map' @ [144:50] ==> public inline fun <T, R> Iterable<NodeInfo>.map(transform: (NodeInfo) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeInfo
    <R> -> String

'it' @ [144:61] ==> value-parameter it: NodeInfo defined in net.corda.core.node.services.NetworkMapCache.isValidatingNotary.<anonymous>[ValueParameterDescriptorImpl]

'notaryIdentity' @ [144:64] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[PropertyDescriptorImpl]

'name' @ [144:79] ==> public final val name: X500Name defined in net.corda.core.identity.Party[PropertyDescriptorImpl]

'joinToString' @ [144:90] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'notary' @ [145:16] ==> val notary: NodeInfo defined in net.corda.core.node.services.NetworkMapCache.isValidatingNotary[LocalVariableDescriptor]

'advertisedServices' @ [145:23] ==> public final val advertisedServices: List<ServiceEntry> defined in net.corda.core.node.NodeInfo[PropertyDescriptorImpl]

'any' @ [145:42] ==> public inline fun <T> Iterable<ServiceEntry>.any(predicate: (ServiceEntry) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceEntry

'it' @ [145:48] ==> value-parameter it: ServiceEntry defined in net.corda.core.node.services.NetworkMapCache.isValidatingNotary.<anonymous>[ValueParameterDescriptorImpl]

'info' @ [145:51] ==> public final val info: ServiceInfo defined in net.corda.core.node.ServiceEntry[PropertyDescriptorImpl]

'type' @ [145:56] ==> public final val type: ServiceType defined in net.corda.core.node.services.ServiceInfo[PropertyDescriptorImpl]

'isValidatingNotary' @ [145:61] ==> public final fun isValidatingNotary(): Boolean defined in net.corda.core.node.services.ServiceType[SimpleFunctionDescriptorImpl]

