'CordaSerializable' @ [21:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'InitiatedBy' @ [24:5] ==> public constructor InitiatedBy(value: KClass<out FlowLogic<*>>) defined in net.corda.core.flows.InitiatedBy[DeserializedClassConstructorDescriptor]

'Broadcast' @ [24:18] ==> public companion object defined in net.corda.irs.flows.UpdateBusinessDayFlow.Broadcast[FakeCallableDescriptorForObject]

'FlowLogic<Unit>' @ [25:69] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> Unit

'receive' @ [27:27] ==> public final inline fun <reified R : Any> receive(otherParty: Party): UntrustworthyData<UpdateBusinessDayFlow.UpdateBusinessDayMessage> defined in net.corda.irs.flows.UpdateBusinessDayFlow.UpdateBusinessDayHandler[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R : Any> -> UpdateBusinessDayMessage

'otherParty' @ [27:61] ==> public final val otherParty: Party defined in net.corda.irs.flows.UpdateBusinessDayFlow.UpdateBusinessDayHandler[PropertyDescriptorImpl]

'unwrap' @ [27:73] ==> public inline fun <T, R> UntrustworthyData<UpdateBusinessDayFlow.UpdateBusinessDayMessage>.unwrap(validator: (UpdateBusinessDayFlow.UpdateBusinessDayMessage) -> UpdateBusinessDayFlow.UpdateBusinessDayMessage): UpdateBusinessDayFlow.UpdateBusinessDayMessage defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UpdateBusinessDayMessage
    <R> -> UpdateBusinessDayMessage

'it' @ [27:82] ==> value-parameter it: UpdateBusinessDayFlow.UpdateBusinessDayMessage defined in net.corda.irs.flows.UpdateBusinessDayFlow.UpdateBusinessDayHandler.call.<anonymous>[ValueParameterDescriptorImpl]

'serviceHub' @ [28:14] ==> public final val serviceHub: ServiceHub defined in net.corda.irs.flows.UpdateBusinessDayFlow.UpdateBusinessDayHandler[DeserializedPropertyDescriptor]

'clock' @ [28:25] ==> public abstract val clock: Clock defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'updateDate' @ [28:45] ==> public final fun updateDate(date: LocalDate): Boolean defined in net.corda.node.utilities.TestClock[DeserializedSimpleFunctionDescriptor]

'message' @ [28:56] ==> val message: UpdateBusinessDayFlow.UpdateBusinessDayMessage defined in net.corda.irs.flows.UpdateBusinessDayFlow.UpdateBusinessDayHandler.call[LocalVariableDescriptor]

'date' @ [28:64] ==> public final val date: LocalDate defined in net.corda.irs.flows.UpdateBusinessDayFlow.UpdateBusinessDayMessage[PropertyDescriptorImpl]

'InitiatingFlow' @ [32:5] ==> public constructor InitiatingFlow(version: Int = ...) defined in net.corda.core.flows.InitiatingFlow[DeserializedClassConstructorDescriptor]

'StartableByRPC' @ [33:5] ==> public constructor StartableByRPC() defined in net.corda.core.flows.StartableByRPC[DeserializedClassConstructorDescriptor]

'FlowLogic<Unit>' @ [34:91] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> Unit

'this' @ [35:40] ==> public constructor Broadcast(date: LocalDate, progressTracker: ProgressTracker) defined in net.corda.irs.flows.UpdateBusinessDayFlow.Broadcast[ClassConstructorDescriptorImpl]

'date' @ [35:45] ==> value-parameter date: LocalDate defined in net.corda.irs.flows.UpdateBusinessDayFlow.Broadcast.<init>[ValueParameterDescriptorImpl]

'tracker' @ [35:51] ==> public final fun tracker(): ProgressTracker defined in net.corda.irs.flows.UpdateBusinessDayFlow.Broadcast.Companion[SimpleFunctionDescriptorImpl]

'ProgressTracker.Step' @ [38:32] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'ProgressTracker' @ [40:29] ==> public constructor ProgressTracker(vararg steps: ProgressTracker.Step) defined in net.corda.core.utilities.ProgressTracker[DeserializedClassConstructorDescriptor]

'NOTIFYING' @ [40:45] ==> public object NOTIFYING : ProgressTracker.Step defined in net.corda.irs.flows.UpdateBusinessDayFlow.Broadcast.Companion[FakeCallableDescriptorForObject]

'Suspendable' @ [43:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'progressTracker' @ [45:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.irs.flows.UpdateBusinessDayFlow.Broadcast[PropertyDescriptorImpl]

'currentStep' @ [45:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'NOTIFYING' @ [45:43] ==> public object NOTIFYING : ProgressTracker.Step defined in net.corda.irs.flows.UpdateBusinessDayFlow.Broadcast.Companion[FakeCallableDescriptorForObject]

'getRecipients' @ [46:31] ==> private final fun getRecipients(): Iterable<NodeInfo> defined in net.corda.irs.flows.UpdateBusinessDayFlow.Broadcast[SimpleFunctionDescriptorImpl]

'doNextRecipient' @ [47:17] ==> @Suspendable private final fun doNextRecipient(recipient: NodeInfo): Unit defined in net.corda.irs.flows.UpdateBusinessDayFlow.Broadcast[SimpleFunctionDescriptorImpl]

'recipient' @ [47:33] ==> val recipient: NodeInfo defined in net.corda.irs.flows.UpdateBusinessDayFlow.Broadcast.call[LocalVariableDescriptor]

'serviceHub' @ [57:31] ==> public final val serviceHub: ServiceHub defined in net.corda.irs.flows.UpdateBusinessDayFlow.Broadcast[DeserializedPropertyDescriptor]

'networkMapCache' @ [57:42] ==> public abstract val networkMapCache: NetworkMapCache defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'notaryNodes' @ [57:58] ==> public open val notaryNodes: List<NodeInfo> defined in net.corda.core.node.services.NetworkMapCache[DeserializedPropertyDescriptor]

'serviceHub' @ [58:31] ==> public final val serviceHub: ServiceHub defined in net.corda.irs.flows.UpdateBusinessDayFlow.Broadcast[DeserializedPropertyDescriptor]

'networkMapCache' @ [58:42] ==> public abstract val networkMapCache: NetworkMapCache defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'partyNodes' @ [58:58] ==> public abstract val partyNodes: List<NodeInfo> defined in net.corda.core.node.services.NetworkMapCache[DeserializedPropertyDescriptor]

'notaryNodes' @ [58:71] ==> val notaryNodes: List<NodeInfo> defined in net.corda.irs.flows.UpdateBusinessDayFlow.Broadcast.getRecipients[LocalVariableDescriptor]

'sortedBy' @ [58:84] ==> public inline fun <T, R : Comparable<String>> Iterable<NodeInfo>.sortedBy(crossinline selector: (NodeInfo) -> String?): List<NodeInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeInfo
    <R : Comparable<R>> -> String

'it' @ [58:95] ==> value-parameter it: NodeInfo defined in net.corda.irs.flows.UpdateBusinessDayFlow.Broadcast.getRecipients.<anonymous>[ValueParameterDescriptorImpl]

'legalIdentity' @ [58:98] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'name' @ [58:112] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'toString' @ [58:117] ==> public open fun toString(): String defined in org.bouncycastle.asn1.x500.X500Name[JavaMethodDescriptor]

'notaryNodes' @ [59:20] ==> val notaryNodes: List<NodeInfo> defined in net.corda.irs.flows.UpdateBusinessDayFlow.Broadcast.getRecipients[LocalVariableDescriptor]

'partyNodes' @ [59:34] ==> val partyNodes: List<NodeInfo> defined in net.corda.irs.flows.UpdateBusinessDayFlow.Broadcast.getRecipients[LocalVariableDescriptor]

'Suspendable' @ [62:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'send' @ [64:13] ==> @Suspendable public open fun send(otherParty: Party, payload: Any): Unit defined in net.corda.irs.flows.UpdateBusinessDayFlow.Broadcast[DeserializedSimpleFunctionDescriptor]

'recipient' @ [64:18] ==> value-parameter recipient: NodeInfo defined in net.corda.irs.flows.UpdateBusinessDayFlow.Broadcast.doNextRecipient[ValueParameterDescriptorImpl]

'legalIdentity' @ [64:28] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'UpdateBusinessDayMessage' @ [64:43] ==> public constructor UpdateBusinessDayMessage(date: LocalDate) defined in net.corda.irs.flows.UpdateBusinessDayFlow.UpdateBusinessDayMessage[ClassConstructorDescriptorImpl]

'date' @ [64:68] ==> public final val date: LocalDate defined in net.corda.irs.flows.UpdateBusinessDayFlow.Broadcast[PropertyDescriptorImpl]

