'StartableByRPC' @ [15:1] ==> public constructor StartableByRPC() defined in net.corda.core.flows.StartableByRPC[ClassConstructorDescriptorImpl]

'InitiatingFlow' @ [16:1] ==> public constructor InitiatingFlow(version: Int = ...) defined in net.corda.core.flows.InitiatingFlow[ClassConstructorDescriptorImpl]

'FlowLogic<LinkedHashMap<Party, AnonymousParty>>' @ [19:75] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> LinkedHashMap<Party, AnonymousParty>

'this' @ [20:37] ==> public constructor TransactionKeyFlow(otherSide: Party, revocationEnabled: Boolean, progressTracker: ProgressTracker) defined in net.corda.core.flows.TransactionKeyFlow[ClassConstructorDescriptorImpl]

'otherSide' @ [20:42] ==> value-parameter otherSide: Party defined in net.corda.core.flows.TransactionKeyFlow.<init>[ValueParameterDescriptorImpl]

'tracker' @ [20:60] ==> public final fun tracker(): ProgressTracker defined in net.corda.core.flows.TransactionKeyFlow.Companion[SimpleFunctionDescriptorImpl]

'ProgressTracker.Step' @ [23:31] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[ClassConstructorDescriptorImpl]

'ProgressTracker' @ [25:25] ==> public constructor ProgressTracker(vararg steps: ProgressTracker.Step) defined in net.corda.core.utilities.ProgressTracker[ClassConstructorDescriptorImpl]

'AWAITING_KEY' @ [25:41] ==> public object AWAITING_KEY : ProgressTracker.Step defined in net.corda.core.flows.TransactionKeyFlow.Companion[FakeCallableDescriptorForObject]

'require' @ [27:13] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'anonymousOtherSide' @ [27:21] ==> value-parameter anonymousOtherSide: PartyAndCertificate defined in net.corda.core.flows.TransactionKeyFlow.Companion.validateAndRegisterIdentity[ValueParameterDescriptorImpl]

'name' @ [27:40] ==> public final val name: X500Name defined in net.corda.core.identity.PartyAndCertificate[PropertyDescriptorImpl]

'otherSide' @ [27:48] ==> value-parameter otherSide: Party defined in net.corda.core.flows.TransactionKeyFlow.Companion.validateAndRegisterIdentity[ValueParameterDescriptorImpl]

'name' @ [27:58] ==> public final val name: X500Name defined in net.corda.core.identity.Party[PropertyDescriptorImpl]

'identityService' @ [30:13] ==> value-parameter identityService: IdentityService defined in net.corda.core.flows.TransactionKeyFlow.Companion.validateAndRegisterIdentity[ValueParameterDescriptorImpl]

'verifyAndRegisterIdentity' @ [30:29] ==> @Throws public abstract fun verifyAndRegisterIdentity(identity: PartyAndCertificate): PartyAndCertificate? defined in net.corda.core.node.services.IdentityService[SimpleFunctionDescriptorImpl]

'anonymousOtherSide' @ [30:55] ==> value-parameter anonymousOtherSide: PartyAndCertificate defined in net.corda.core.flows.TransactionKeyFlow.Companion.validateAndRegisterIdentity[ValueParameterDescriptorImpl]

'anonymousOtherSide' @ [31:20] ==> value-parameter anonymousOtherSide: PartyAndCertificate defined in net.corda.core.flows.TransactionKeyFlow.Companion.validateAndRegisterIdentity[ValueParameterDescriptorImpl]

'Suspendable' @ [35:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'progressTracker' @ [37:9] ==> public open val progressTracker: ProgressTracker defined in net.corda.core.flows.TransactionKeyFlow[PropertyDescriptorImpl]

'currentStep' @ [37:25] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[PropertyDescriptorImpl]

'AWAITING_KEY' @ [37:39] ==> public object AWAITING_KEY : ProgressTracker.Step defined in net.corda.core.flows.TransactionKeyFlow.Companion[FakeCallableDescriptorForObject]

'serviceHub' @ [38:38] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.TransactionKeyFlow[PropertyDescriptorImpl]

'keyManagementService' @ [38:49] ==> public abstract val keyManagementService: KeyManagementService defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'freshKeyAndCert' @ [38:70] ==> @Suspendable public abstract fun freshKeyAndCert(identity: PartyAndCertificate, revocationEnabled: Boolean): PartyAndCertificate defined in net.corda.core.node.services.KeyManagementService[SimpleFunctionDescriptorImpl]

'serviceHub' @ [38:86] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.TransactionKeyFlow[PropertyDescriptorImpl]

'myInfo' @ [38:97] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'legalIdentityAndCert' @ [38:104] ==> public final val legalIdentityAndCert: PartyAndCertificate defined in net.corda.core.node.NodeInfo[PropertyDescriptorImpl]

'revocationEnabled' @ [38:126] ==> public final val revocationEnabled: Boolean defined in net.corda.core.flows.TransactionKeyFlow[PropertyDescriptorImpl]

'LinkedHashMap' @ [41:26] ==> public final fun <K, V> <init>(): LinkedHashMap<Party, AnonymousParty> /* = LinkedHashMap<Party, AnonymousParty> */ defined in kotlin.collections.LinkedHashMap[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <K> -> Party
    <V> -> AnonymousParty

'if (otherSide == serviceHub.myInfo.legalIdentity) {
            identities.put(otherSide, legalIdentityAnonymous.party.anonymise())
        } else {
            val anonymousOtherSide = sendAndReceive<PartyAndCertificate>(otherSide, legalIdentityAnonymous).unwrap { confidentialIdentity ->
                validateAndRegisterIdentity(serviceHub.identityService, otherSide, confidentialIdentity)
            }
            identities.put(serviceHub.myInfo.legalIdentity, legalIdentityAnonymous.party.anonymise())
            identities.put(otherSide, anonymousOtherSide.party.anonymise())
        }' @ [42:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: AnonymousParty?, elseBranch: AnonymousParty?): AnonymousParty?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> AnonymousParty?

'otherSide' @ [42:13] ==> public final val otherSide: Party defined in net.corda.core.flows.TransactionKeyFlow[PropertyDescriptorImpl]

'serviceHub' @ [42:26] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.TransactionKeyFlow[PropertyDescriptorImpl]

'myInfo' @ [42:37] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'legalIdentity' @ [42:44] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[PropertyDescriptorImpl]

'identities' @ [43:13] ==> val identities: LinkedHashMap<Party, AnonymousParty> /* = LinkedHashMap<Party, AnonymousParty> */ defined in net.corda.core.flows.TransactionKeyFlow.call[LocalVariableDescriptor]

'put' @ [43:24] ==> public open fun put(key: Party, value: AnonymousParty): AnonymousParty? defined in java.util.LinkedHashMap[JavaMethodDescriptor]

'otherSide' @ [43:28] ==> public final val otherSide: Party defined in net.corda.core.flows.TransactionKeyFlow[PropertyDescriptorImpl]

'legalIdentityAnonymous' @ [43:39] ==> val legalIdentityAnonymous: PartyAndCertificate defined in net.corda.core.flows.TransactionKeyFlow.call[LocalVariableDescriptor]

'party' @ [43:62] ==> @Transient public final val party: Party defined in net.corda.core.identity.PartyAndCertificate[PropertyDescriptorImpl]

'anonymise' @ [43:68] ==> public final fun anonymise(): AnonymousParty defined in net.corda.core.identity.Party[SimpleFunctionDescriptorImpl]

'sendAndReceive' @ [45:38] ==> public final inline fun <reified R : Any> sendAndReceive(otherParty: Party, payload: Any): UntrustworthyData<PartyAndCertificate> defined in net.corda.core.flows.TransactionKeyFlow[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified R : Any> -> PartyAndCertificate

'otherSide' @ [45:74] ==> public final val otherSide: Party defined in net.corda.core.flows.TransactionKeyFlow[PropertyDescriptorImpl]

'legalIdentityAnonymous' @ [45:85] ==> val legalIdentityAnonymous: PartyAndCertificate defined in net.corda.core.flows.TransactionKeyFlow.call[LocalVariableDescriptor]

'unwrap' @ [45:109] ==> @Suppress public inline fun <T, R> UntrustworthyData<PartyAndCertificate>.unwrap(validator: (PartyAndCertificate) -> PartyAndCertificate): PartyAndCertificate defined in net.corda.core.utilities[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> PartyAndCertificate
    <R> -> PartyAndCertificate

'validateAndRegisterIdentity' @ [46:17] ==> public final fun validateAndRegisterIdentity(identityService: IdentityService, otherSide: Party, anonymousOtherSide: PartyAndCertificate): PartyAndCertificate defined in net.corda.core.flows.TransactionKeyFlow.Companion[SimpleFunctionDescriptorImpl]

'serviceHub' @ [46:45] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.TransactionKeyFlow[PropertyDescriptorImpl]

'identityService' @ [46:56] ==> public abstract val identityService: IdentityService defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'otherSide' @ [46:73] ==> public final val otherSide: Party defined in net.corda.core.flows.TransactionKeyFlow[PropertyDescriptorImpl]

'confidentialIdentity' @ [46:84] ==> value-parameter confidentialIdentity: PartyAndCertificate defined in net.corda.core.flows.TransactionKeyFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'identities' @ [48:13] ==> val identities: LinkedHashMap<Party, AnonymousParty> /* = LinkedHashMap<Party, AnonymousParty> */ defined in net.corda.core.flows.TransactionKeyFlow.call[LocalVariableDescriptor]

'put' @ [48:24] ==> public open fun put(key: Party, value: AnonymousParty): AnonymousParty? defined in java.util.LinkedHashMap[JavaMethodDescriptor]

'serviceHub' @ [48:28] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.TransactionKeyFlow[PropertyDescriptorImpl]

'myInfo' @ [48:39] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'legalIdentity' @ [48:46] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[PropertyDescriptorImpl]

'legalIdentityAnonymous' @ [48:61] ==> val legalIdentityAnonymous: PartyAndCertificate defined in net.corda.core.flows.TransactionKeyFlow.call[LocalVariableDescriptor]

'party' @ [48:84] ==> @Transient public final val party: Party defined in net.corda.core.identity.PartyAndCertificate[PropertyDescriptorImpl]

'anonymise' @ [48:90] ==> public final fun anonymise(): AnonymousParty defined in net.corda.core.identity.Party[SimpleFunctionDescriptorImpl]

'identities' @ [49:13] ==> val identities: LinkedHashMap<Party, AnonymousParty> /* = LinkedHashMap<Party, AnonymousParty> */ defined in net.corda.core.flows.TransactionKeyFlow.call[LocalVariableDescriptor]

'put' @ [49:24] ==> public open fun put(key: Party, value: AnonymousParty): AnonymousParty? defined in java.util.LinkedHashMap[JavaMethodDescriptor]

'otherSide' @ [49:28] ==> public final val otherSide: Party defined in net.corda.core.flows.TransactionKeyFlow[PropertyDescriptorImpl]

'anonymousOtherSide' @ [49:39] ==> val anonymousOtherSide: PartyAndCertificate defined in net.corda.core.flows.TransactionKeyFlow.call[LocalVariableDescriptor]

'party' @ [49:58] ==> @Transient public final val party: Party defined in net.corda.core.identity.PartyAndCertificate[PropertyDescriptorImpl]

'anonymise' @ [49:64] ==> public final fun anonymise(): AnonymousParty defined in net.corda.core.identity.Party[SimpleFunctionDescriptorImpl]

'identities' @ [51:16] ==> val identities: LinkedHashMap<Party, AnonymousParty> /* = LinkedHashMap<Party, AnonymousParty> */ defined in net.corda.core.flows.TransactionKeyFlow.call[LocalVariableDescriptor]

