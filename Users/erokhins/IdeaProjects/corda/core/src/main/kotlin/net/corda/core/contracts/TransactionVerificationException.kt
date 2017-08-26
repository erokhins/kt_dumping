'FlowException' @ [10:62] ==> public constructor FlowException(message: String?) defined in net.corda.core.flows.FlowException[ClassConstructorDescriptorImpl]

'hash' @ [10:113] ==> value-parameter hash: SecureHash defined in net.corda.core.contracts.TransactionResolutionException.<init>[ValueParameterDescriptorImpl]

'FlowException' @ [11:61] ==> public constructor FlowException(message: String?) defined in net.corda.core.flows.FlowException[ClassConstructorDescriptorImpl]

'hash' @ [11:111] ==> value-parameter hash: SecureHash defined in net.corda.core.contracts.AttachmentResolutionException.<init>[ValueParameterDescriptorImpl]

'FlowException' @ [14:7] ==> public constructor FlowException(message: String?, cause: Throwable?) defined in net.corda.core.flows.FlowException[ClassConstructorDescriptorImpl]

'message' @ [14:23] ==> value-parameter message: String defined in net.corda.core.contracts.TransactionVerificationException.<init>[ValueParameterDescriptorImpl]

'txId' @ [14:46] ==> value-parameter txId: SecureHash defined in net.corda.core.contracts.TransactionVerificationException.<init>[ValueParameterDescriptorImpl]

'cause' @ [14:53] ==> value-parameter cause: Throwable? defined in net.corda.core.contracts.TransactionVerificationException.<init>[ValueParameterDescriptorImpl]

'TransactionVerificationException' @ [17:11] ==> private constructor TransactionVerificationException(txId: SecureHash, message: String, cause: Throwable?) defined in net.corda.core.contracts.TransactionVerificationException[ClassConstructorDescriptorImpl]

'txId' @ [17:44] ==> value-parameter txId: SecureHash defined in net.corda.core.contracts.TransactionVerificationException.ContractRejection.<init>[ValueParameterDescriptorImpl]

'cause' @ [17:83] ==> value-parameter cause: Throwable defined in net.corda.core.contracts.TransactionVerificationException.ContractRejection.<init>[ValueParameterDescriptorImpl]

'message' @ [17:89] ==> public open val message: String? defined in kotlin.Throwable[DeserializedPropertyDescriptor]

'contract' @ [17:110] ==> value-parameter contract: Contract defined in net.corda.core.contracts.TransactionVerificationException.ContractRejection.<init>[ValueParameterDescriptorImpl]

'cause' @ [17:121] ==> value-parameter cause: Throwable defined in net.corda.core.contracts.TransactionVerificationException.ContractRejection.<init>[ValueParameterDescriptorImpl]

'TransactionVerificationException' @ [20:11] ==> private constructor TransactionVerificationException(txId: SecureHash, message: String, cause: Throwable?) defined in net.corda.core.contracts.TransactionVerificationException[ClassConstructorDescriptorImpl]

'txId' @ [20:44] ==> value-parameter txId: SecureHash defined in net.corda.core.contracts.TransactionVerificationException.MoreThanOneNotary.<init>[ValueParameterDescriptorImpl]

'TransactionVerificationException' @ [23:11] ==> private constructor TransactionVerificationException(txId: SecureHash, message: String, cause: Throwable?) defined in net.corda.core.contracts.TransactionVerificationException[ClassConstructorDescriptorImpl]

'txId' @ [23:44] ==> value-parameter txId: SecureHash defined in net.corda.core.contracts.TransactionVerificationException.SignersMissing.<init>[ValueParameterDescriptorImpl]

'missing' @ [23:70] ==> value-parameter missing: List<PublicKey> defined in net.corda.core.contracts.TransactionVerificationException.SignersMissing.<init>[ValueParameterDescriptorImpl]

'joinToString' @ [23:78] ==> public fun <T> Iterable<PublicKey>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((PublicKey) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'TransactionVerificationException' @ [26:11] ==> private constructor TransactionVerificationException(txId: SecureHash, message: String, cause: Throwable?) defined in net.corda.core.contracts.TransactionVerificationException[ClassConstructorDescriptorImpl]

'txId' @ [26:44] ==> value-parameter txId: SecureHash defined in net.corda.core.contracts.TransactionVerificationException.DuplicateInputStates.<init>[ValueParameterDescriptorImpl]

'duplicates' @ [26:71] ==> value-parameter duplicates: NonEmptySet<StateRef> defined in net.corda.core.contracts.TransactionVerificationException.DuplicateInputStates.<init>[ValueParameterDescriptorImpl]

'joinToString' @ [26:82] ==> public fun <T> Iterable<StateRef>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((StateRef) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'TransactionVerificationException' @ [29:11] ==> private constructor TransactionVerificationException(txId: SecureHash, message: String, cause: Throwable?) defined in net.corda.core.contracts.TransactionVerificationException[ClassConstructorDescriptorImpl]

'txId' @ [29:44] ==> value-parameter txId: SecureHash defined in net.corda.core.contracts.TransactionVerificationException.InvalidNotaryChange.<init>[ValueParameterDescriptorImpl]

'TransactionVerificationException' @ [32:11] ==> private constructor TransactionVerificationException(txId: SecureHash, message: String, cause: Throwable?) defined in net.corda.core.contracts.TransactionVerificationException[ClassConstructorDescriptorImpl]

'txId' @ [32:44] ==> value-parameter txId: SecureHash defined in net.corda.core.contracts.TransactionVerificationException.NotaryChangeInWrongTransactionType.<init>[ValueParameterDescriptorImpl]

'txNotary' @ [32:110] ==> value-parameter txNotary: Party defined in net.corda.core.contracts.TransactionVerificationException.NotaryChangeInWrongTransactionType.<init>[ValueParameterDescriptorImpl]

'outputNotary' @ [32:128] ==> value-parameter outputNotary: Party defined in net.corda.core.contracts.TransactionVerificationException.NotaryChangeInWrongTransactionType.<init>[ValueParameterDescriptorImpl]

'TransactionVerificationException' @ [35:11] ==> private constructor TransactionVerificationException(txId: SecureHash, message: String, cause: Throwable?) defined in net.corda.core.contracts.TransactionVerificationException[ClassConstructorDescriptorImpl]

'txId' @ [35:44] ==> value-parameter txId: SecureHash defined in net.corda.core.contracts.TransactionVerificationException.TransactionMissingEncumbranceException.<init>[ValueParameterDescriptorImpl]

'missing' @ [35:81] ==> value-parameter missing: Int defined in net.corda.core.contracts.TransactionVerificationException.TransactionMissingEncumbranceException.<init>[ValueParameterDescriptorImpl]

'inOut' @ [35:93] ==> value-parameter inOut: TransactionVerificationException.Direction defined in net.corda.core.contracts.TransactionVerificationException.TransactionMissingEncumbranceException.<init>[ValueParameterDescriptorImpl]

'CordaSerializable' @ [37:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

