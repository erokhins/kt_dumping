'replicaId' @ [18:21] ==> public final val replicaId: Int defined in net.corda.node.services.config.BFTSMaRtConfiguration[PropertyDescriptorImpl]

'Deprecated' @ [42:9] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'ReplaceWith' @ [44:17] ==> public constructor ReplaceWith(expression: String, vararg imports: String) defined in kotlin.ReplaceWith[DeserializedClassConstructorDescriptor]

'OldConfig' @ [59:9] ==> public constructor OldConfig(value: String) defined in net.corda.nodeapi.config.OldConfig[DeserializedClassConstructorDescriptor]

'Suppress' @ [75:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'basedir' @ [76:46] ==> @Deprecated public final val basedir: Path defined in net.corda.node.services.config.FullNodeConfiguration[PropertyDescriptorImpl]

'require' @ [81:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [81:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'useTestClock' @ [81:18] ==> public final val useTestClock: Boolean defined in net.corda.node.services.config.FullNodeConfiguration[PropertyDescriptorImpl]

'devMode' @ [81:34] ==> public open val devMode: Boolean defined in net.corda.node.services.config.FullNodeConfiguration[PropertyDescriptorImpl]

'rpcUsers' @ [83:9] ==> public open val rpcUsers: List<User> defined in net.corda.node.services.config.FullNodeConfiguration[PropertyDescriptorImpl]

'forEach' @ [83:18] ==> @HidesMembers public inline fun <T> Iterable<User>.forEach(action: (User) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> User

'require' @ [84:13] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'it' @ [84:21] ==> value-parameter it: User defined in net.corda.node.services.config.FullNodeConfiguration.<init>.<anonymous>[ValueParameterDescriptorImpl]

'username' @ [84:24] ==> @OldConfig public final val username: String defined in net.corda.nodeapi.User[DeserializedPropertyDescriptor]

'matches' @ [84:33] ==> @InlineOnly public infix inline fun CharSequence.matches(regex: Regex): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toRegex' @ [84:48] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [84:74] ==> value-parameter it: User defined in net.corda.node.services.config.FullNodeConfiguration.<init>.<anonymous>[ValueParameterDescriptorImpl]

'username' @ [84:77] ==> @OldConfig public final val username: String defined in net.corda.nodeapi.User[DeserializedPropertyDescriptor]

'extraAdvertisedServiceIds' @ [89:34] ==> public final val extraAdvertisedServiceIds: List<String> defined in net.corda.node.services.config.FullNodeConfiguration[PropertyDescriptorImpl]

'filter' @ [90:18] ==> public inline fun <T> Iterable<String>.filter(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'String' @ [90:25] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'map' @ [91:18] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> ServiceInfo): List<ServiceInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> ServiceInfo

'ServiceInfo' @ [91:24] ==> public companion object defined in net.corda.core.node.services.ServiceInfo[FakeCallableDescriptorForObject]

'parse' @ [91:36] ==> public final fun parse(encoded: String): ServiceInfo defined in net.corda.core.node.services.ServiceInfo.Companion[DeserializedSimpleFunctionDescriptor]

'it' @ [91:42] ==> value-parameter it: String defined in net.corda.node.services.config.FullNodeConfiguration.calculateServices.<anonymous>[ValueParameterDescriptorImpl]

'toMutableSet' @ [92:18] ==> public fun <T> Iterable<ServiceInfo>.toMutableSet(): MutableSet<ServiceInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceInfo

'networkMapService' @ [93:13] ==> public open val networkMapService: NetworkMapInfo? defined in net.corda.node.services.config.FullNodeConfiguration[PropertyDescriptorImpl]

'advertisedServices' @ [93:40] ==> val advertisedServices: MutableSet<ServiceInfo> defined in net.corda.node.services.config.FullNodeConfiguration.calculateServices[LocalVariableDescriptor]

'ServiceInfo' @ [93:62] ==> public constructor ServiceInfo(type: ServiceType, name: X500Name? = ...) defined in net.corda.core.node.services.ServiceInfo[DeserializedClassConstructorDescriptor]

'NetworkMapService' @ [93:74] ==> public companion object defined in net.corda.node.services.network.NetworkMapService[FakeCallableDescriptorForObject]

'type' @ [93:92] ==> public final val type: ServiceType defined in net.corda.node.services.network.NetworkMapService.Companion[PropertyDescriptorImpl]

'advertisedServices' @ [94:16] ==> val advertisedServices: MutableSet<ServiceInfo> defined in net.corda.node.services.config.FullNodeConfiguration.calculateServices[LocalVariableDescriptor]

'when (policy) {
            CertChainPolicyType.Any -> CertificateChainCheckPolicy.Any
            CertChainPolicyType.RootMustMatch -> CertificateChainCheckPolicy.RootMustMatch
            CertChainPolicyType.LeafMustMatch -> CertificateChainCheckPolicy.LeafMustMatch
            CertChainPolicyType.MustContainOneOf -> CertificateChainCheckPolicy.MustContainOneOf(trustedAliases)
        }' @ [112:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CertificateChainCheckPolicy, entry1: CertificateChainCheckPolicy, entry2: CertificateChainCheckPolicy, entry3: CertificateChainCheckPolicy): CertificateChainCheckPolicy[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> CertificateChainCheckPolicy

'policy' @ [112:22] ==> public final val policy: CertChainPolicyType defined in net.corda.node.services.config.CertChainPolicyConfig[PropertyDescriptorImpl]

'Any' @ [113:33] ==> enum entry Any defined in net.corda.node.services.config.CertChainPolicyType[FakeCallableDescriptorForObject]

'Any' @ [113:68] ==> public object Any : CertificateChainCheckPolicy defined in net.corda.node.services.messaging.CertificateChainCheckPolicy[FakeCallableDescriptorForObject]

'RootMustMatch' @ [114:33] ==> enum entry RootMustMatch defined in net.corda.node.services.config.CertChainPolicyType[FakeCallableDescriptorForObject]

'RootMustMatch' @ [114:78] ==> public object RootMustMatch : CertificateChainCheckPolicy defined in net.corda.node.services.messaging.CertificateChainCheckPolicy[FakeCallableDescriptorForObject]

'LeafMustMatch' @ [115:33] ==> enum entry LeafMustMatch defined in net.corda.node.services.config.CertChainPolicyType[FakeCallableDescriptorForObject]

'LeafMustMatch' @ [115:78] ==> public object LeafMustMatch : CertificateChainCheckPolicy defined in net.corda.node.services.messaging.CertificateChainCheckPolicy[FakeCallableDescriptorForObject]

'MustContainOneOf' @ [116:33] ==> enum entry MustContainOneOf defined in net.corda.node.services.config.CertChainPolicyType[FakeCallableDescriptorForObject]

'MustContainOneOf' @ [116:81] ==> public constructor MustContainOneOf(trustedAliases: Set<String>) defined in net.corda.node.services.messaging.CertificateChainCheckPolicy.MustContainOneOf[ClassConstructorDescriptorImpl]

'trustedAliases' @ [116:98] ==> public final val trustedAliases: Set<String> defined in net.corda.node.services.config.CertChainPolicyConfig[PropertyDescriptorImpl]

