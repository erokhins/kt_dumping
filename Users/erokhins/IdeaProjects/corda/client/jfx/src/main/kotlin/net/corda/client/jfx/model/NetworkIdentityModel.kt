'getValue' @ [16:46] ==> public final operator fun getValue(thisRef: Any, property: KProperty<*>): Observable<T> defined in net.corda.client.jfx.model.TrackedDelegate.ObservableDelegate[SimpleFunctionDescriptorImpl]

'NodeMonitorModel' @ [16:57] ==> public constructor NodeMonitorModel() defined in net.corda.client.jfx.model.NodeMonitorModel[ClassConstructorDescriptorImpl]

'networkMap' @ [16:75] ==> public final val networkMap: Observable<NetworkMapCache.MapChange> defined in net.corda.client.jfx.model.NodeMonitorModel[PropertyDescriptorImpl]

'networkIdentityObservable' @ [19:13] ==> private final val networkIdentityObservable: Observable<NetworkMapCache.MapChange> defined in net.corda.client.jfx.model.NetworkIdentityModel[PropertyDescriptorImpl]

'fold' @ [19:39] ==> public fun <T, R> Observable<NetworkMapCache.MapChange>.fold(accumulator: (ObservableList<(NodeInfo..NodeInfo?)>..ObservableList<(NodeInfo..NodeInfo?)>?), folderFun: ((ObservableList<(NodeInfo..NodeInfo?)>..ObservableList<(NodeInfo..NodeInfo?)>?), NetworkMapCache.MapChange) -> Unit): (ObservableList<(NodeInfo..NodeInfo?)>..ObservableList<(NodeInfo..NodeInfo?)>?) defined in net.corda.client.jfx.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> MapChange
    <R> -> (javafx.collections.ObservableList<(net.corda.core.node.NodeInfo..net.corda.core.node.NodeInfo?)>..javafx.collections.ObservableList<(net.corda.core.node.NodeInfo..net.corda.core.node.NodeInfo?)>?)

'observableArrayList' @ [19:58] ==> public open fun <E : (Any..Any?)> observableArrayList(): (ObservableList<(NodeInfo..NodeInfo?)>..ObservableList<(NodeInfo..NodeInfo?)>?) defined in javafx.collections.FXCollections[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (net.corda.core.node.NodeInfo..net.corda.core.node.NodeInfo?)

'list' @ [20:17] ==> value-parameter list: (ObservableList<(NodeInfo..NodeInfo?)>..ObservableList<(NodeInfo..NodeInfo?)>?) defined in net.corda.client.jfx.model.NetworkIdentityModel.networkIdentities.<anonymous>[ValueParameterDescriptorImpl]

'removeIf' @ [20:22] ==> public final fun removeIf(p0: ((NodeInfo..NodeInfo?)) -> Boolean): Boolean defined in javafx.collections.ObservableList[MyFunctionDescriptor]

'when (update) {
                        is MapChange.Removed -> it == update.node
                        is MapChange.Modified -> it == update.previousNode
                        else -> false
                    }' @ [21:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'update' @ [21:27] ==> value-parameter update: NetworkMapCache.MapChange defined in net.corda.client.jfx.model.NetworkIdentityModel.networkIdentities.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [22:49] ==> value-parameter it: (NodeInfo..NodeInfo?) defined in net.corda.client.jfx.model.NetworkIdentityModel.networkIdentities.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'update' @ [22:55] ==> value-parameter update: NetworkMapCache.MapChange defined in net.corda.client.jfx.model.NetworkIdentityModel.networkIdentities.<anonymous>[ValueParameterDescriptorImpl]

'node' @ [22:62] ==> public abstract val node: NodeInfo defined in net.corda.core.node.services.NetworkMapCache.MapChange[DeserializedPropertyDescriptor]

'it' @ [23:50] ==> value-parameter it: (NodeInfo..NodeInfo?) defined in net.corda.client.jfx.model.NetworkIdentityModel.networkIdentities.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'update' @ [23:56] ==> value-parameter update: NetworkMapCache.MapChange defined in net.corda.client.jfx.model.NetworkIdentityModel.networkIdentities.<anonymous>[ValueParameterDescriptorImpl]

'previousNode' @ [23:63] ==> public final val previousNode: NodeInfo defined in net.corda.core.node.services.NetworkMapCache.MapChange.Modified[DeserializedPropertyDescriptor]

'list' @ [27:17] ==> value-parameter list: (ObservableList<(NodeInfo..NodeInfo?)>..ObservableList<(NodeInfo..NodeInfo?)>?) defined in net.corda.client.jfx.model.NetworkIdentityModel.networkIdentities.<anonymous>[ValueParameterDescriptorImpl]

'addAll' @ [27:22] ==> public abstract fun addAll(vararg p0: (NodeInfo..NodeInfo?)): Boolean defined in javafx.collections.ObservableList[JavaMethodDescriptor]

'update' @ [27:29] ==> value-parameter update: NetworkMapCache.MapChange defined in net.corda.client.jfx.model.NetworkIdentityModel.networkIdentities.<anonymous>[ValueParameterDescriptorImpl]

'node' @ [27:36] ==> public abstract val node: NodeInfo defined in net.corda.core.node.services.NetworkMapCache.MapChange[DeserializedPropertyDescriptor]

'getValue' @ [30:29] ==> public final operator fun getValue(thisRef: Any, property: KProperty<*>): ObservableValue<T> defined in net.corda.client.jfx.model.TrackedDelegate.ObservableValueDelegate[SimpleFunctionDescriptorImpl]

'NodeMonitorModel' @ [30:45] ==> public constructor NodeMonitorModel() defined in net.corda.client.jfx.model.NodeMonitorModel[ClassConstructorDescriptorImpl]

'proxyObservable' @ [30:63] ==> public final val proxyObservable: SimpleObjectProperty<CordaRPCOps?> defined in net.corda.client.jfx.model.NodeMonitorModel[PropertyDescriptorImpl]

'networkIdentities' @ [32:45] ==> public final val networkIdentities: ObservableList<NodeInfo> defined in net.corda.client.jfx.model.NetworkIdentityModel[PropertyDescriptorImpl]

'filtered' @ [32:63] ==> public final fun filtered(p0: (((NodeInfo..NodeInfo?)) -> Boolean..(((NodeInfo..NodeInfo?)) -> Boolean)?)): (FilteredList<(NodeInfo..NodeInfo?)>..FilteredList<(NodeInfo..NodeInfo?)>?) defined in javafx.collections.ObservableList[MyFunctionDescriptor]

'!' @ [32:74] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [32:75] ==> value-parameter it: (NodeInfo..NodeInfo?) defined in net.corda.client.jfx.model.NetworkIdentityModel.parties.<anonymous>[ValueParameterDescriptorImpl]

'isCordaService' @ [32:78] ==> private final fun NodeInfo.isCordaService(): Boolean defined in net.corda.client.jfx.model.NetworkIdentityModel[SimpleFunctionDescriptorImpl]

'networkIdentities' @ [33:46] ==> public final val networkIdentities: ObservableList<NodeInfo> defined in net.corda.client.jfx.model.NetworkIdentityModel[PropertyDescriptorImpl]

'filtered' @ [33:64] ==> public final fun filtered(p0: (((NodeInfo..NodeInfo?)) -> Boolean..(((NodeInfo..NodeInfo?)) -> Boolean)?)): (FilteredList<(NodeInfo..NodeInfo?)>..FilteredList<(NodeInfo..NodeInfo?)>?) defined in javafx.collections.ObservableList[MyFunctionDescriptor]

'it' @ [33:75] ==> value-parameter it: (NodeInfo..NodeInfo?) defined in net.corda.client.jfx.model.NetworkIdentityModel.notaries.<anonymous>[ValueParameterDescriptorImpl]

'advertisedServices' @ [33:78] ==> public final val advertisedServices: List<ServiceEntry> defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'any' @ [33:97] ==> public inline fun <T> Iterable<ServiceEntry>.any(predicate: (ServiceEntry) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceEntry

'it' @ [33:103] ==> value-parameter it: ServiceEntry defined in net.corda.client.jfx.model.NetworkIdentityModel.notaries.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'info' @ [33:106] ==> public final val info: ServiceInfo defined in net.corda.core.node.ServiceEntry[DeserializedPropertyDescriptor]

'type' @ [33:111] ==> public final val type: ServiceType defined in net.corda.core.node.services.ServiceInfo[DeserializedPropertyDescriptor]

'isNotary' @ [33:116] ==> public final fun isNotary(): Boolean defined in net.corda.core.node.services.ServiceType[DeserializedSimpleFunctionDescriptor]

'rpcProxy' @ [34:22] ==> private final val rpcProxy: ObservableValue<CordaRPCOps?> defined in net.corda.client.jfx.model.NetworkIdentityModel[PropertyDescriptorImpl]

'map' @ [34:31] ==> public fun <A, B> ObservableValue<out CordaRPCOps?>.map(function: (CordaRPCOps?) -> NodeInfo?): ObservableValue<NodeInfo?> defined in net.corda.client.jfx.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> CordaRPCOps?
    <B> -> NodeInfo?

'it' @ [34:37] ==> value-parameter it: CordaRPCOps? defined in net.corda.client.jfx.model.NetworkIdentityModel.myIdentity.<anonymous>[ValueParameterDescriptorImpl]

'nodeIdentity' @ [34:41] ==> public abstract fun nodeIdentity(): NodeInfo defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'advertisedServices' @ [38:16] ==> public final val advertisedServices: List<ServiceEntry> defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'any' @ [38:35] ==> public inline fun <T> Iterable<ServiceEntry>.any(predicate: (ServiceEntry) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceEntry

'it' @ [38:41] ==> value-parameter it: ServiceEntry defined in net.corda.client.jfx.model.NetworkIdentityModel.isCordaService.<anonymous>[ValueParameterDescriptorImpl]

'info' @ [38:44] ==> public final val info: ServiceInfo defined in net.corda.core.node.ServiceEntry[DeserializedPropertyDescriptor]

'type' @ [38:49] ==> public final val type: ServiceType defined in net.corda.core.node.services.ServiceInfo[DeserializedPropertyDescriptor]

'isNetworkMap' @ [38:54] ==> public final fun isNetworkMap(): Boolean defined in net.corda.core.node.services.ServiceType[DeserializedSimpleFunctionDescriptor]

'it' @ [38:72] ==> value-parameter it: ServiceEntry defined in net.corda.client.jfx.model.NetworkIdentityModel.isCordaService.<anonymous>[ValueParameterDescriptorImpl]

'info' @ [38:75] ==> public final val info: ServiceInfo defined in net.corda.core.node.ServiceEntry[DeserializedPropertyDescriptor]

'type' @ [38:80] ==> public final val type: ServiceType defined in net.corda.core.node.services.ServiceInfo[DeserializedPropertyDescriptor]

'isNotary' @ [38:85] ==> public final fun isNotary(): Boolean defined in net.corda.core.node.services.ServiceType[DeserializedSimpleFunctionDescriptor]

'parties' @ [42:68] ==> public final val parties: ObservableList<NodeInfo> defined in net.corda.client.jfx.model.NetworkIdentityModel[PropertyDescriptorImpl]

'firstOrDefault' @ [42:76] ==> public fun <A> ObservableList<NodeInfo>.firstOrDefault(default: ObservableValue<NodeInfo?>, predicate: (NodeInfo) -> Boolean): ObservableValue<NodeInfo?> defined in net.corda.client.jfx.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> NodeInfo

'notaries' @ [42:91] ==> public final val notaries: ObservableList<NodeInfo> defined in net.corda.client.jfx.model.NetworkIdentityModel[PropertyDescriptorImpl]

'firstOrNullObservable' @ [42:100] ==> public fun <A> ObservableList<NodeInfo>.firstOrNullObservable(predicate: (NodeInfo) -> Boolean): ObservableValue<NodeInfo?> defined in net.corda.client.jfx.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> NodeInfo

'it' @ [42:124] ==> value-parameter it: NodeInfo defined in net.corda.client.jfx.model.NetworkIdentityModel.lookup.<anonymous>[ValueParameterDescriptorImpl]

'notaryIdentity' @ [42:127] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'owningKey' @ [42:142] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'keys' @ [42:152] ==> public val PublicKey.keys: Set<PublicKey> defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'any' @ [42:157] ==> public inline fun <T> Iterable<PublicKey>.any(predicate: (PublicKey) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'it' @ [42:163] ==> value-parameter it: PublicKey defined in net.corda.client.jfx.model.NetworkIdentityModel.lookup.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'publicKey' @ [42:169] ==> value-parameter publicKey: PublicKey defined in net.corda.client.jfx.model.NetworkIdentityModel.lookup[ValueParameterDescriptorImpl]

'it' @ [43:9] ==> value-parameter it: NodeInfo defined in net.corda.client.jfx.model.NetworkIdentityModel.lookup.<anonymous>[ValueParameterDescriptorImpl]

'legalIdentity' @ [43:12] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'owningKey' @ [43:26] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'keys' @ [43:36] ==> public val PublicKey.keys: Set<PublicKey> defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'any' @ [43:41] ==> public inline fun <T> Iterable<PublicKey>.any(predicate: (PublicKey) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'it' @ [43:47] ==> value-parameter it: PublicKey defined in net.corda.client.jfx.model.NetworkIdentityModel.lookup.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'publicKey' @ [43:53] ==> value-parameter publicKey: PublicKey defined in net.corda.client.jfx.model.NetworkIdentityModel.lookup[ValueParameterDescriptorImpl]

