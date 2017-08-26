'generateAmount' @ [23:12] ==> public fun <T : Any> generateAmount(min: Long, max: Long, tokenGenerator: Generator<Currency>): Generator<Amount<Currency>> defined in net.corda.client.mock[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Currency

'max' @ [23:30] ==> value-parameter max: Long defined in net.corda.loadtest.tests.generateIssue[ValueParameterDescriptorImpl]

'Generator' @ [23:35] ==> public companion object defined in net.corda.client.mock.Generator[FakeCallableDescriptorForObject]

'pure' @ [23:45] ==> public final fun <A> pure(value: Currency): Generator<Currency> defined in net.corda.client.mock.Generator.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Currency

'currency' @ [23:50] ==> value-parameter currency: Currency defined in net.corda.loadtest.tests.generateIssue[ValueParameterDescriptorImpl]

'combine' @ [23:61] ==> public final fun <B, C, R> combine(other1: Generator<OpaqueBytes>, other2: Generator<Party>, function: (Amount<Currency>, OpaqueBytes, Party) -> CashIssueAndPaymentFlow.IssueAndPaymentRequest): Generator<CashIssueAndPaymentFlow.IssueAndPaymentRequest> defined in net.corda.client.mock.Generator[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <B> -> OpaqueBytes
    <C> -> Party
    <R> -> IssueAndPaymentRequest

'Generator' @ [24:13] ==> public companion object defined in net.corda.client.mock.Generator[FakeCallableDescriptorForObject]

'pure' @ [24:23] ==> public final fun <A> pure(value: OpaqueBytes): Generator<OpaqueBytes> defined in net.corda.client.mock.Generator.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> OpaqueBytes

'OpaqueBytes' @ [24:28] ==> public companion object defined in net.corda.core.utilities.OpaqueBytes[FakeCallableDescriptorForObject]

'of' @ [24:40] ==> @JvmStatic public final fun of(vararg b: Byte): OpaqueBytes defined in net.corda.core.utilities.OpaqueBytes.Companion[DeserializedSimpleFunctionDescriptor]

'Generator' @ [25:13] ==> public companion object defined in net.corda.client.mock.Generator[FakeCallableDescriptorForObject]

'pickOne' @ [25:23] ==> public fun <A> Generator.Companion.pickOne(list: List<Party>): Generator<Party> defined in net.corda.client.mock[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Party

'possibleRecipients' @ [25:31] ==> value-parameter possibleRecipients: List<Party> defined in net.corda.loadtest.tests.generateIssue[ValueParameterDescriptorImpl]

'IssueAndPaymentRequest' @ [27:9] ==> public constructor IssueAndPaymentRequest(amount: Amount<Currency>, issueRef: OpaqueBytes, recipient: Party, notary: Party, anonymous: Boolean) defined in net.corda.finance.flows.CashIssueAndPaymentFlow.IssueAndPaymentRequest[DeserializedClassConstructorDescriptor]

'amount' @ [27:32] ==> value-parameter amount: Amount<Currency> defined in net.corda.loadtest.tests.generateIssue.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [27:40] ==> value-parameter ref: OpaqueBytes defined in net.corda.loadtest.tests.generateIssue.<anonymous>[ValueParameterDescriptorImpl]

'recipient' @ [27:45] ==> value-parameter recipient: Party defined in net.corda.loadtest.tests.generateIssue.<anonymous>[ValueParameterDescriptorImpl]

'notary' @ [27:56] ==> value-parameter notary: Party defined in net.corda.loadtest.tests.generateIssue[ValueParameterDescriptorImpl]

'anonymous' @ [27:64] ==> value-parameter anonymous: Boolean defined in net.corda.loadtest.tests.generateIssue[ValueParameterDescriptorImpl]

'generateAmount' @ [38:12] ==> public fun <T : Any> generateAmount(min: Long, max: Long, tokenGenerator: Generator<Issued<Currency>>): Generator<Amount<Issued<Currency>>> defined in net.corda.client.mock[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Issued<Currency>

'max' @ [38:30] ==> value-parameter max: Long defined in net.corda.loadtest.tests.generateMove[ValueParameterDescriptorImpl]

'Generator' @ [38:35] ==> public companion object defined in net.corda.client.mock.Generator[FakeCallableDescriptorForObject]

'pure' @ [38:45] ==> public final fun <A> pure(value: Issued<Currency>): Generator<Issued<Currency>> defined in net.corda.client.mock.Generator.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Issued<Currency>

'Issued' @ [38:50] ==> public constructor Issued<out P : Any>(issuer: PartyAndReference, product: Currency) defined in net.corda.core.contracts.Issued[DeserializedClassConstructorDescriptor]
Inferred types:
    <out P : Any> -> Currency

'PartyAndReference' @ [38:57] ==> public constructor PartyAndReference(party: AbstractParty, reference: OpaqueBytes) defined in net.corda.core.contracts.PartyAndReference[DeserializedClassConstructorDescriptor]

'issuer' @ [38:75] ==> value-parameter issuer: Party defined in net.corda.loadtest.tests.generateMove[ValueParameterDescriptorImpl]

'OpaqueBytes' @ [38:83] ==> public companion object defined in net.corda.core.utilities.OpaqueBytes[FakeCallableDescriptorForObject]

'of' @ [38:95] ==> @JvmStatic public final fun of(vararg b: Byte): OpaqueBytes defined in net.corda.core.utilities.OpaqueBytes.Companion[DeserializedSimpleFunctionDescriptor]

'currency' @ [38:103] ==> value-parameter currency: Currency defined in net.corda.loadtest.tests.generateMove[ValueParameterDescriptorImpl]

'combine' @ [38:115] ==> public final fun <B, R> combine(other1: Generator<Party>, function: (Amount<Issued<Currency>>, Party) -> CashPaymentFlow.PaymentRequest): Generator<CashPaymentFlow.PaymentRequest> defined in net.corda.client.mock.Generator[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <B> -> Party
    <R> -> PaymentRequest

'Generator' @ [39:13] ==> public companion object defined in net.corda.client.mock.Generator[FakeCallableDescriptorForObject]

'pickOne' @ [39:23] ==> public fun <A> Generator.Companion.pickOne(list: List<Party>): Generator<Party> defined in net.corda.client.mock[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Party

'possibleRecipients' @ [39:31] ==> value-parameter possibleRecipients: List<Party> defined in net.corda.loadtest.tests.generateMove[ValueParameterDescriptorImpl]

'PaymentRequest' @ [41:9] ==> public constructor PaymentRequest(amount: Amount<Currency>, recipient: Party, anonymous: Boolean, issuerConstraint: Set<Party> = ...) defined in net.corda.finance.flows.CashPaymentFlow.PaymentRequest[DeserializedClassConstructorDescriptor]

'amount' @ [41:24] ==> value-parameter amount: Amount<Issued<Currency>> defined in net.corda.loadtest.tests.generateMove.<anonymous>[ValueParameterDescriptorImpl]

'withoutIssuer' @ [41:31] ==> public fun <T : Any> Amount<Issued<Currency>>.withoutIssuer(): Amount<Currency> defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Currency

'recipient' @ [41:48] ==> value-parameter recipient: Party defined in net.corda.loadtest.tests.generateMove.<anonymous>[ValueParameterDescriptorImpl]

'anonymous' @ [41:59] ==> value-parameter anonymous: Boolean defined in net.corda.loadtest.tests.generateMove[ValueParameterDescriptorImpl]

'setOf' @ [41:70] ==> public fun <T> setOf(element: Party): Set<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'issuer' @ [41:76] ==> value-parameter issuer: Party defined in net.corda.loadtest.tests.generateMove[ValueParameterDescriptorImpl]

'generateAmount' @ [49:12] ==> public fun <T : Any> generateAmount(min: Long, max: Long, tokenGenerator: Generator<Currency>): Generator<Amount<Currency>> defined in net.corda.client.mock[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Currency

'max' @ [49:30] ==> value-parameter max: Long defined in net.corda.loadtest.tests.generateExit[ValueParameterDescriptorImpl]

'Generator' @ [49:35] ==> public companion object defined in net.corda.client.mock.Generator[FakeCallableDescriptorForObject]

'pure' @ [49:45] ==> public final fun <A> pure(value: Currency): Generator<Currency> defined in net.corda.client.mock.Generator.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Currency

'currency' @ [49:50] ==> value-parameter currency: Currency defined in net.corda.loadtest.tests.generateExit[ValueParameterDescriptorImpl]

'map' @ [49:61] ==> public final fun <B> map(function: (Amount<Currency>) -> CashExitFlow.ExitRequest): Generator<CashExitFlow.ExitRequest> defined in net.corda.client.mock.Generator[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <B> -> ExitRequest

'ExitRequest' @ [50:9] ==> public constructor ExitRequest(amount: Amount<Currency>, issueRef: OpaqueBytes) defined in net.corda.finance.flows.CashExitFlow.ExitRequest[DeserializedClassConstructorDescriptor]

'amount' @ [50:21] ==> value-parameter amount: Amount<Currency> defined in net.corda.loadtest.tests.generateExit.<anonymous>[ValueParameterDescriptorImpl]

'OpaqueBytes' @ [50:29] ==> public companion object defined in net.corda.core.utilities.OpaqueBytes[FakeCallableDescriptorForObject]

'of' @ [50:41] ==> @JvmStatic public final fun of(vararg b: Byte): OpaqueBytes defined in net.corda.core.utilities.OpaqueBytes.Companion[DeserializedSimpleFunctionDescriptor]

