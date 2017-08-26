'Throws' @ [33:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'TransactionResolutionException' @ [33:13] ==> public constructor TransactionResolutionException(hash: SecureHash) defined in net.corda.core.contracts.TransactionResolutionException[ClassConstructorDescriptorImpl]

'recordTransactions' @ [83:9] ==> public abstract fun recordTransactions(notifyVault: Boolean, txs: Iterable<SignedTransaction>): Unit defined in net.corda.core.node.ServiceHub[SimpleFunctionDescriptorImpl]

'notifyVault' @ [83:28] ==> value-parameter notifyVault: Boolean defined in net.corda.core.node.ServiceHub.recordTransactions[ValueParameterDescriptorImpl]

'listOf' @ [83:41] ==> public fun <T> listOf(vararg elements: SignedTransaction): List<SignedTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'first' @ [83:48] ==> value-parameter first: SignedTransaction defined in net.corda.core.node.ServiceHub.recordTransactions[ValueParameterDescriptorImpl]

'remaining' @ [83:56] ==> value-parameter vararg remaining: SignedTransaction defined in net.corda.core.node.ServiceHub.recordTransactions[ValueParameterDescriptorImpl]

'recordTransactions' @ [91:9] ==> public open fun recordTransactions(notifyVault: Boolean, first: SignedTransaction, vararg remaining: SignedTransaction): Unit defined in net.corda.core.node.ServiceHub[SimpleFunctionDescriptorImpl]

'first' @ [91:34] ==> value-parameter first: SignedTransaction defined in net.corda.core.node.ServiceHub.recordTransactions[ValueParameterDescriptorImpl]

'remaining' @ [91:42] ==> value-parameter vararg remaining: SignedTransaction defined in net.corda.core.node.ServiceHub.recordTransactions[ValueParameterDescriptorImpl]

'recordTransactions' @ [99:9] ==> public abstract fun recordTransactions(notifyVault: Boolean, txs: Iterable<SignedTransaction>): Unit defined in net.corda.core.node.ServiceHub[SimpleFunctionDescriptorImpl]

'txs' @ [99:34] ==> value-parameter txs: Iterable<SignedTransaction> defined in net.corda.core.node.ServiceHub.recordTransactions[ValueParameterDescriptorImpl]

'Throws' @ [107:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'TransactionResolutionException' @ [107:13] ==> public constructor TransactionResolutionException(hash: SecureHash) defined in net.corda.core.contracts.TransactionResolutionException[ClassConstructorDescriptorImpl]

'validatedTransactions' @ [109:19] ==> public abstract val validatedTransactions: TransactionStorage defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'getTransaction' @ [109:41] ==> public abstract fun getTransaction(id: SecureHash): SignedTransaction? defined in net.corda.core.node.services.TransactionStorage[SimpleFunctionDescriptorImpl]

'stateRef' @ [109:56] ==> value-parameter stateRef: StateRef defined in net.corda.core.node.ServiceHub.loadState[ValueParameterDescriptorImpl]

'txhash' @ [109:65] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[PropertyDescriptorImpl]

'TransactionResolutionException' @ [109:82] ==> public constructor TransactionResolutionException(hash: SecureHash) defined in net.corda.core.contracts.TransactionResolutionException[ClassConstructorDescriptorImpl]

'stateRef' @ [109:113] ==> value-parameter stateRef: StateRef defined in net.corda.core.node.ServiceHub.loadState[ValueParameterDescriptorImpl]

'txhash' @ [109:122] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[PropertyDescriptorImpl]

'if (stx.isNotaryChangeTransaction()) {
            stx.resolveNotaryChangeTransaction(this).outputs[stateRef.index]
        } else stx.tx.outputs[stateRef.index]' @ [110:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TransactionState<*>, elseBranch: TransactionState<*>): TransactionState<*>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TransactionState<*>

'stx' @ [110:20] ==> val stx: SignedTransaction defined in net.corda.core.node.ServiceHub.loadState[LocalVariableDescriptor]

'isNotaryChangeTransaction' @ [110:24] ==> public final fun isNotaryChangeTransaction(): Boolean defined in net.corda.core.transactions.SignedTransaction[SimpleFunctionDescriptorImpl]

'stx' @ [111:13] ==> val stx: SignedTransaction defined in net.corda.core.node.ServiceHub.loadState[LocalVariableDescriptor]

'resolveNotaryChangeTransaction' @ [111:17] ==> public final fun resolveNotaryChangeTransaction(services: ServiceHub): NotaryChangeLedgerTransaction defined in net.corda.core.transactions.SignedTransaction[SimpleFunctionDescriptorImpl]

'this' @ [111:48] ==> <this> defined in net.corda.core.node.ServiceHub[LazyClassReceiverParameterDescriptor]

'outputs' @ [111:54] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.NotaryChangeLedgerTransaction[PropertyDescriptorImpl]

'stateRef' @ [111:62] ==> value-parameter stateRef: StateRef defined in net.corda.core.node.ServiceHub.loadState[ValueParameterDescriptorImpl]

'index' @ [111:71] ==> public final val index: Int defined in net.corda.core.contracts.StateRef[PropertyDescriptorImpl]

'stx' @ [112:16] ==> val stx: SignedTransaction defined in net.corda.core.node.ServiceHub.loadState[LocalVariableDescriptor]

'tx' @ [112:20] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'outputs' @ [112:23] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'stateRef' @ [112:31] ==> value-parameter stateRef: StateRef defined in net.corda.core.node.ServiceHub.loadState[ValueParameterDescriptorImpl]

'index' @ [112:40] ==> public final val index: Int defined in net.corda.core.contracts.StateRef[PropertyDescriptorImpl]

'Throws' @ [120:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'TransactionResolutionException' @ [120:13] ==> public constructor TransactionResolutionException(hash: SecureHash) defined in net.corda.core.contracts.TransactionResolutionException[ClassConstructorDescriptorImpl]

'validatedTransactions' @ [122:19] ==> public abstract val validatedTransactions: TransactionStorage defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'getTransaction' @ [122:41] ==> public abstract fun getTransaction(id: SecureHash): SignedTransaction? defined in net.corda.core.node.services.TransactionStorage[SimpleFunctionDescriptorImpl]

'stateRef' @ [122:56] ==> value-parameter stateRef: StateRef defined in net.corda.core.node.ServiceHub.toStateAndRef[ValueParameterDescriptorImpl]

'txhash' @ [122:65] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[PropertyDescriptorImpl]

'TransactionResolutionException' @ [122:82] ==> public constructor TransactionResolutionException(hash: SecureHash) defined in net.corda.core.contracts.TransactionResolutionException[ClassConstructorDescriptorImpl]

'stateRef' @ [122:113] ==> value-parameter stateRef: StateRef defined in net.corda.core.node.ServiceHub.toStateAndRef[ValueParameterDescriptorImpl]

'txhash' @ [122:122] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[PropertyDescriptorImpl]

'if (stx.isNotaryChangeTransaction()) {
            stx.resolveNotaryChangeTransaction(this).outRef<T>(stateRef.index)
        } else {
            stx.tx.outRef<T>(stateRef.index)
        }' @ [123:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: StateAndRef<T>, elseBranch: StateAndRef<T>): StateAndRef<T>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> StateAndRef<T>

'stx' @ [123:20] ==> val stx: SignedTransaction defined in net.corda.core.node.ServiceHub.toStateAndRef[LocalVariableDescriptor]

'isNotaryChangeTransaction' @ [123:24] ==> public final fun isNotaryChangeTransaction(): Boolean defined in net.corda.core.transactions.SignedTransaction[SimpleFunctionDescriptorImpl]

'stx' @ [124:13] ==> val stx: SignedTransaction defined in net.corda.core.node.ServiceHub.toStateAndRef[LocalVariableDescriptor]

'resolveNotaryChangeTransaction' @ [124:17] ==> public final fun resolveNotaryChangeTransaction(services: ServiceHub): NotaryChangeLedgerTransaction defined in net.corda.core.transactions.SignedTransaction[SimpleFunctionDescriptorImpl]

'this' @ [124:48] ==> <this> defined in net.corda.core.node.ServiceHub[LazyClassReceiverParameterDescriptor]

'outRef' @ [124:54] ==> @Suppress public final fun <T : ContractState> outRef(index: Int): StateAndRef<T> defined in net.corda.core.transactions.NotaryChangeLedgerTransaction[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'stateRef' @ [124:64] ==> value-parameter stateRef: StateRef defined in net.corda.core.node.ServiceHub.toStateAndRef[ValueParameterDescriptorImpl]

'index' @ [124:73] ==> public final val index: Int defined in net.corda.core.contracts.StateRef[PropertyDescriptorImpl]

'stx' @ [126:13] ==> val stx: SignedTransaction defined in net.corda.core.node.ServiceHub.toStateAndRef[LocalVariableDescriptor]

'tx' @ [126:17] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'outRef' @ [126:20] ==> @Suppress public final fun <T : ContractState> outRef(index: Int): StateAndRef<T> defined in net.corda.core.transactions.WireTransaction[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'stateRef' @ [126:30] ==> value-parameter stateRef: StateRef defined in net.corda.core.node.ServiceHub.toStateAndRef[ValueParameterDescriptorImpl]

'index' @ [126:39] ==> public final val index: Int defined in net.corda.core.contracts.StateRef[PropertyDescriptorImpl]

'this' @ [139:45] ==> <this> defined in net.corda.core.node.ServiceHub[LazyClassReceiverParameterDescriptor]

'myInfo' @ [139:50] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'legalIdentity' @ [139:57] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[PropertyDescriptorImpl]

'owningKey' @ [139:71] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[PropertyDescriptorImpl]

'this' @ [151:46] ==> <this> defined in net.corda.core.node.ServiceHub[LazyClassReceiverParameterDescriptor]

'myInfo' @ [151:51] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'notaryIdentity' @ [151:58] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[PropertyDescriptorImpl]

'owningKey' @ [151:73] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[PropertyDescriptorImpl]

'builder' @ [155:16] ==> value-parameter builder: TransactionBuilder defined in net.corda.core.node.ServiceHub.signInitialTransaction[ValueParameterDescriptorImpl]

'toSignedTransaction' @ [155:24] ==> public final fun toSignedTransaction(keyManagementService: KeyManagementService, publicKey: PublicKey, signatureMetadata: SignatureMetadata): SignedTransaction defined in net.corda.core.transactions.TransactionBuilder[SimpleFunctionDescriptorImpl]

'keyManagementService' @ [155:44] ==> public abstract val keyManagementService: KeyManagementService defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'publicKey' @ [155:66] ==> value-parameter publicKey: PublicKey defined in net.corda.core.node.ServiceHub.signInitialTransaction[ValueParameterDescriptorImpl]

'signatureMetadata' @ [155:77] ==> value-parameter signatureMetadata: SignatureMetadata defined in net.corda.core.node.ServiceHub.signInitialTransaction[ValueParameterDescriptorImpl]

'signInitialTransaction' @ [169:13] ==> private final fun signInitialTransaction(builder: TransactionBuilder, publicKey: PublicKey, signatureMetadata: SignatureMetadata): SignedTransaction defined in net.corda.core.node.ServiceHub[SimpleFunctionDescriptorImpl]

'builder' @ [169:36] ==> value-parameter builder: TransactionBuilder defined in net.corda.core.node.ServiceHub.signInitialTransaction[ValueParameterDescriptorImpl]

'publicKey' @ [169:45] ==> value-parameter publicKey: PublicKey defined in net.corda.core.node.ServiceHub.signInitialTransaction[ValueParameterDescriptorImpl]

'SignatureMetadata' @ [169:56] ==> public constructor SignatureMetadata(platformVersion: Int, schemeNumberID: Int) defined in net.corda.core.crypto.SignatureMetadata[ClassConstructorDescriptorImpl]

'myInfo' @ [169:74] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'platformVersion' @ [169:81] ==> public final val platformVersion: Int defined in net.corda.core.node.NodeInfo[PropertyDescriptorImpl]

'Crypto' @ [169:98] ==> public object Crypto defined in net.corda.core.crypto in file Crypto.kt[FakeCallableDescriptorForObject]

'findSignatureScheme' @ [169:105] ==> @JvmStatic public final fun findSignatureScheme(key: PublicKey): SignatureScheme defined in net.corda.core.crypto.Crypto[SimpleFunctionDescriptorImpl]

'publicKey' @ [169:125] ==> value-parameter publicKey: PublicKey defined in net.corda.core.node.ServiceHub.signInitialTransaction[ValueParameterDescriptorImpl]

'schemeNumberID' @ [169:136] ==> public final val schemeNumberID: Int defined in net.corda.core.crypto.SignatureScheme[PropertyDescriptorImpl]

'signInitialTransaction' @ [178:82] ==> public open fun signInitialTransaction(builder: TransactionBuilder, publicKey: PublicKey): SignedTransaction defined in net.corda.core.node.ServiceHub[SimpleFunctionDescriptorImpl]

'builder' @ [178:105] ==> value-parameter builder: TransactionBuilder defined in net.corda.core.node.ServiceHub.signInitialTransaction[ValueParameterDescriptorImpl]

'legalIdentityKey' @ [178:114] ==> public open val legalIdentityKey: PublicKey defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'signingPubKeys' @ [190:18] ==> value-parameter signingPubKeys: Iterable<PublicKey> defined in net.corda.core.node.ServiceHub.signInitialTransaction[ValueParameterDescriptorImpl]

'iterator' @ [190:33] ==> public abstract operator fun iterator(): Iterator<PublicKey> defined in kotlin.collections.Iterable[DeserializedSimpleFunctionDescriptor]

'signInitialTransaction' @ [191:19] ==> public open fun signInitialTransaction(builder: TransactionBuilder, publicKey: PublicKey): SignedTransaction defined in net.corda.core.node.ServiceHub[SimpleFunctionDescriptorImpl]

'builder' @ [191:42] ==> value-parameter builder: TransactionBuilder defined in net.corda.core.node.ServiceHub.signInitialTransaction[ValueParameterDescriptorImpl]

'it' @ [191:51] ==> val it: Iterator<PublicKey> defined in net.corda.core.node.ServiceHub.signInitialTransaction[LocalVariableDescriptor]

'next' @ [191:54] ==> public abstract operator fun next(): PublicKey defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'it' @ [192:16] ==> val it: Iterator<PublicKey> defined in net.corda.core.node.ServiceHub.signInitialTransaction[LocalVariableDescriptor]

'hasNext' @ [192:19] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'stx' @ [193:13] ==> var stx: SignedTransaction defined in net.corda.core.node.ServiceHub.signInitialTransaction[LocalVariableDescriptor]

'addSignature' @ [193:19] ==> public open fun addSignature(signedTransaction: SignedTransaction, publicKey: PublicKey): SignedTransaction defined in net.corda.core.node.ServiceHub[SimpleFunctionDescriptorImpl]

'stx' @ [193:32] ==> var stx: SignedTransaction defined in net.corda.core.node.ServiceHub.signInitialTransaction[LocalVariableDescriptor]

'it' @ [193:37] ==> val it: Iterator<PublicKey> defined in net.corda.core.node.ServiceHub.signInitialTransaction[LocalVariableDescriptor]

'next' @ [193:40] ==> public abstract operator fun next(): PublicKey defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'stx' @ [195:16] ==> var stx: SignedTransaction defined in net.corda.core.node.ServiceHub.signInitialTransaction[LocalVariableDescriptor]

'SignableData' @ [200:28] ==> public constructor SignableData(txId: SecureHash, signatureMetadata: SignatureMetadata) defined in net.corda.core.crypto.SignableData[ClassConstructorDescriptorImpl]

'signedTransaction' @ [200:41] ==> value-parameter signedTransaction: SignedTransaction defined in net.corda.core.node.ServiceHub.createSignature[ValueParameterDescriptorImpl]

'id' @ [200:59] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'signatureMetadata' @ [200:63] ==> value-parameter signatureMetadata: SignatureMetadata defined in net.corda.core.node.ServiceHub.createSignature[ValueParameterDescriptorImpl]

'keyManagementService' @ [201:16] ==> public abstract val keyManagementService: KeyManagementService defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'sign' @ [201:37] ==> @Suspendable public abstract fun sign(signableData: SignableData, publicKey: PublicKey): TransactionSignature defined in net.corda.core.node.services.KeyManagementService[SimpleFunctionDescriptorImpl]

'signableData' @ [201:42] ==> val signableData: SignableData defined in net.corda.core.node.ServiceHub.createSignature[LocalVariableDescriptor]

'publicKey' @ [201:56] ==> value-parameter publicKey: PublicKey defined in net.corda.core.node.ServiceHub.createSignature[ValueParameterDescriptorImpl]

'createSignature' @ [213:13] ==> private final fun createSignature(signedTransaction: SignedTransaction, publicKey: PublicKey, signatureMetadata: SignatureMetadata): TransactionSignature defined in net.corda.core.node.ServiceHub[SimpleFunctionDescriptorImpl]

'signedTransaction' @ [213:29] ==> value-parameter signedTransaction: SignedTransaction defined in net.corda.core.node.ServiceHub.createSignature[ValueParameterDescriptorImpl]

'publicKey' @ [213:48] ==> value-parameter publicKey: PublicKey defined in net.corda.core.node.ServiceHub.createSignature[ValueParameterDescriptorImpl]

'SignatureMetadata' @ [213:59] ==> public constructor SignatureMetadata(platformVersion: Int, schemeNumberID: Int) defined in net.corda.core.crypto.SignatureMetadata[ClassConstructorDescriptorImpl]

'myInfo' @ [213:77] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'platformVersion' @ [213:84] ==> public final val platformVersion: Int defined in net.corda.core.node.NodeInfo[PropertyDescriptorImpl]

'Crypto' @ [213:101] ==> public object Crypto defined in net.corda.core.crypto in file Crypto.kt[FakeCallableDescriptorForObject]

'findSignatureScheme' @ [213:108] ==> @JvmStatic public final fun findSignatureScheme(key: PublicKey): SignatureScheme defined in net.corda.core.crypto.Crypto[SimpleFunctionDescriptorImpl]

'publicKey' @ [213:128] ==> value-parameter publicKey: PublicKey defined in net.corda.core.node.ServiceHub.createSignature[ValueParameterDescriptorImpl]

'schemeNumberID' @ [213:139] ==> public final val schemeNumberID: Int defined in net.corda.core.crypto.SignatureScheme[PropertyDescriptorImpl]

'createSignature' @ [222:16] ==> public open fun createSignature(signedTransaction: SignedTransaction, publicKey: PublicKey): TransactionSignature defined in net.corda.core.node.ServiceHub[SimpleFunctionDescriptorImpl]

'signedTransaction' @ [222:32] ==> value-parameter signedTransaction: SignedTransaction defined in net.corda.core.node.ServiceHub.createSignature[ValueParameterDescriptorImpl]

'legalIdentityKey' @ [222:51] ==> public open val legalIdentityKey: PublicKey defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'signedTransaction' @ [234:16] ==> value-parameter signedTransaction: SignedTransaction defined in net.corda.core.node.ServiceHub.addSignature[ValueParameterDescriptorImpl]

'createSignature' @ [234:36] ==> public open fun createSignature(signedTransaction: SignedTransaction, publicKey: PublicKey): TransactionSignature defined in net.corda.core.node.ServiceHub[SimpleFunctionDescriptorImpl]

'signedTransaction' @ [234:52] ==> value-parameter signedTransaction: SignedTransaction defined in net.corda.core.node.ServiceHub.addSignature[ValueParameterDescriptorImpl]

'publicKey' @ [234:71] ==> value-parameter publicKey: PublicKey defined in net.corda.core.node.ServiceHub.addSignature[ValueParameterDescriptorImpl]

'addSignature' @ [243:81] ==> public open fun addSignature(signedTransaction: SignedTransaction, publicKey: PublicKey): SignedTransaction defined in net.corda.core.node.ServiceHub[SimpleFunctionDescriptorImpl]

'signedTransaction' @ [243:94] ==> value-parameter signedTransaction: SignedTransaction defined in net.corda.core.node.ServiceHub.addSignature[ValueParameterDescriptorImpl]

'legalIdentityKey' @ [243:113] ==> public open val legalIdentityKey: PublicKey defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

