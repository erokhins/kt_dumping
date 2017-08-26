'UniversalContract' @ [13:28] ==> public constructor UniversalContract() defined in net.corda.finance.contracts.universal.UniversalContract[ClassConstructorDescriptorImpl]

'UNIVERSAL_PROGRAM_ID' @ [18:33] ==> public val UNIVERSAL_PROGRAM_ID: UniversalContract defined in net.corda.finance.contracts.universal in file UniversalContract.kt[PropertyDescriptorImpl]

'TypeOnlyCommandData' @ [30:54] ==> public constructor TypeOnlyCommandData() defined in net.corda.core.contracts.TypeOnlyCommandData[DeserializedClassConstructorDescriptor]

'TypeOnlyCommandData' @ [33:23] ==> public constructor TypeOnlyCommandData() defined in net.corda.core.contracts.TypeOnlyCommandData[DeserializedClassConstructorDescriptor]

'Suppress' @ [40:14] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'when (expr) {
        is Const -> expr.value
        is StartDate -> null
        is EndDate -> null
        else -> throw Error("Unable to evaluate")
    }' @ [40:107] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Instant?, entry1: Instant?, entry2: Instant?, entry3: Instant?): Instant?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Instant?

'expr' @ [40:113] ==> value-parameter expr: Perceivable<Instant> defined in net.corda.finance.contracts.universal.UniversalContract.eval[ValueParameterDescriptorImpl]

'expr' @ [41:21] ==> value-parameter expr: Perceivable<Instant> defined in net.corda.finance.contracts.universal.UniversalContract.eval[ValueParameterDescriptorImpl]

'value' @ [41:26] ==> public final val value: Instant defined in net.corda.finance.contracts.universal.Const[PropertyDescriptorImpl]

'Error' @ [44:23] ==> public final fun <init>(p0: (String..String?)): Error /* = Error */ defined in kotlin.Error[TypeAliasConstructorDescriptorImpl]

'when (expr) {
        is PerceivableAnd -> eval(tx, expr.left) && eval(tx, expr.right)
        is PerceivableOr -> eval(tx, expr.left) || eval(tx, expr.right)
        is Const<Boolean> -> expr.value
        is TimePerceivable -> when (expr.cmp) {
            Comparison.LTE -> tx.timeWindow!!.fromTime!! <= eval(tx, expr.instant)
            Comparison.GTE -> tx.timeWindow!!.untilTime!! >= eval(tx, expr.instant)
            else -> throw NotImplementedError("eval special")
        }
        is ActorPerceivable -> tx.commands.single().signers.contains(expr.actor.owningKey)
        else -> throw NotImplementedError("eval - Boolean - " + expr.javaClass.name)
    }' @ [47:76] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean, entry4: Boolean, entry5: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'expr' @ [47:82] ==> value-parameter expr: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.UniversalContract.eval[ValueParameterDescriptorImpl]

'eval' @ [48:30] ==> public final fun eval(tx: LedgerTransaction, expr: Perceivable<Boolean>): Boolean defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]

'tx' @ [48:35] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.eval[ValueParameterDescriptorImpl]

'expr' @ [48:39] ==> value-parameter expr: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.UniversalContract.eval[ValueParameterDescriptorImpl]

'left' @ [48:44] ==> public final val left: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.PerceivableAnd[PropertyDescriptorImpl]

'eval' @ [48:53] ==> public final fun eval(tx: LedgerTransaction, expr: Perceivable<Boolean>): Boolean defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]

'tx' @ [48:58] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.eval[ValueParameterDescriptorImpl]

'expr' @ [48:62] ==> value-parameter expr: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.UniversalContract.eval[ValueParameterDescriptorImpl]

'right' @ [48:67] ==> public final val right: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.PerceivableAnd[PropertyDescriptorImpl]

'eval' @ [49:29] ==> public final fun eval(tx: LedgerTransaction, expr: Perceivable<Boolean>): Boolean defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]

'tx' @ [49:34] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.eval[ValueParameterDescriptorImpl]

'expr' @ [49:38] ==> value-parameter expr: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.UniversalContract.eval[ValueParameterDescriptorImpl]

'left' @ [49:43] ==> public final val left: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.PerceivableOr[PropertyDescriptorImpl]

'eval' @ [49:52] ==> public final fun eval(tx: LedgerTransaction, expr: Perceivable<Boolean>): Boolean defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]

'tx' @ [49:57] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.eval[ValueParameterDescriptorImpl]

'expr' @ [49:61] ==> value-parameter expr: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.UniversalContract.eval[ValueParameterDescriptorImpl]

'right' @ [49:66] ==> public final val right: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.PerceivableOr[PropertyDescriptorImpl]

'expr' @ [50:30] ==> value-parameter expr: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.UniversalContract.eval[ValueParameterDescriptorImpl]

'value' @ [50:35] ==> public final val value: Boolean defined in net.corda.finance.contracts.universal.Const[PropertyDescriptorImpl]

'when (expr.cmp) {
            Comparison.LTE -> tx.timeWindow!!.fromTime!! <= eval(tx, expr.instant)
            Comparison.GTE -> tx.timeWindow!!.untilTime!! >= eval(tx, expr.instant)
            else -> throw NotImplementedError("eval special")
        }' @ [51:31] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'expr' @ [51:37] ==> value-parameter expr: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.UniversalContract.eval[ValueParameterDescriptorImpl]

'cmp' @ [51:42] ==> public final val cmp: Comparison defined in net.corda.finance.contracts.universal.TimePerceivable[PropertyDescriptorImpl]

'LTE' @ [52:24] ==> enum entry LTE defined in net.corda.finance.contracts.universal.Comparison[FakeCallableDescriptorForObject]

'tx' @ [52:31] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.eval[ValueParameterDescriptorImpl]

'timeWindow' @ [52:34] ==> public final val timeWindow: TimeWindow? defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'fromTime' @ [52:47] ==> public abstract val fromTime: Instant? defined in net.corda.core.contracts.TimeWindow[DeserializedPropertyDescriptor]

'eval' @ [52:61] ==> public final fun eval(@Suppress tx: LedgerTransaction, expr: Perceivable<Instant>): Instant? defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]

'tx' @ [52:66] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.eval[ValueParameterDescriptorImpl]

'expr' @ [52:70] ==> value-parameter expr: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.UniversalContract.eval[ValueParameterDescriptorImpl]

'instant' @ [52:75] ==> public final val instant: Perceivable<Instant> defined in net.corda.finance.contracts.universal.TimePerceivable[PropertyDescriptorImpl]

'GTE' @ [53:24] ==> enum entry GTE defined in net.corda.finance.contracts.universal.Comparison[FakeCallableDescriptorForObject]

'tx' @ [53:31] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.eval[ValueParameterDescriptorImpl]

'timeWindow' @ [53:34] ==> public final val timeWindow: TimeWindow? defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'untilTime' @ [53:47] ==> public abstract val untilTime: Instant? defined in net.corda.core.contracts.TimeWindow[DeserializedPropertyDescriptor]

'eval' @ [53:62] ==> public final fun eval(@Suppress tx: LedgerTransaction, expr: Perceivable<Instant>): Instant? defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]

'tx' @ [53:67] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.eval[ValueParameterDescriptorImpl]

'expr' @ [53:71] ==> value-parameter expr: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.UniversalContract.eval[ValueParameterDescriptorImpl]

'instant' @ [53:76] ==> public final val instant: Perceivable<Instant> defined in net.corda.finance.contracts.universal.TimePerceivable[PropertyDescriptorImpl]

'NotImplementedError' @ [54:27] ==> public constructor NotImplementedError(message: String = ...) defined in kotlin.NotImplementedError[DeserializedClassConstructorDescriptor]

'tx' @ [56:32] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.eval[ValueParameterDescriptorImpl]

'commands' @ [56:35] ==> public final val commands: List<AuthenticatedObject<CommandData>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'single' @ [56:44] ==> public fun <T> List<AuthenticatedObject<CommandData>>.single(): AuthenticatedObject<CommandData> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AuthenticatedObject<CommandData>

'signers' @ [56:53] ==> public final val signers: List<PublicKey> defined in net.corda.core.contracts.AuthenticatedObject[DeserializedPropertyDescriptor]

'contains' @ [56:61] ==> public abstract fun contains(element: PublicKey): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'expr' @ [56:70] ==> value-parameter expr: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.UniversalContract.eval[ValueParameterDescriptorImpl]

'actor' @ [56:75] ==> public final val actor: Party defined in net.corda.finance.contracts.universal.ActorPerceivable[PropertyDescriptorImpl]

'owningKey' @ [56:81] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'NotImplementedError' @ [57:23] ==> public constructor NotImplementedError(message: String = ...) defined in kotlin.NotImplementedError[DeserializedClassConstructorDescriptor]

'+' @ [57:43] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'expr' @ [57:65] ==> value-parameter expr: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.UniversalContract.eval[ValueParameterDescriptorImpl]

'javaClass' @ [57:70] ==> public val <T : Any> Perceivable<Boolean>.javaClass: Class<Perceivable<Boolean>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Perceivable<Boolean>

'name' @ [57:80] ==> public final val <T : (Any..Any?)> Class<Perceivable<Boolean>>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Perceivable<Boolean>

'when (expr) {
                is Const<BigDecimal> -> expr.value
                is UnaryPlus -> {
                    val x = eval(tx, expr.arg)
                    if (x > BigDecimal.ZERO)
                        x
                    else
                        BigDecimal.ZERO
                }
                is PerceivableOperation -> {
                    val l = eval(tx, expr.left)
                    val r = eval(tx, expr.right)

                    when (expr.op) {
                        Operation.DIV -> l / r
                        Operation.MINUS -> l - r
                        Operation.PLUS -> l + r
                        Operation.TIMES -> l * r
                        else -> throw NotImplementedError("eval - amount - operation " + expr.op)
                    }
                }
                is Fixing -> {
                    requireThat { "Fixing must be included" using false }
                    0.0.bd
                }
                is Interest -> {
                    val a = eval(tx, expr.amount)
                    val i = eval(tx, expr.interest)

                    //TODO

                    a * i / 100.0.bd
                }
                else -> throw NotImplementedError("eval - BigDecimal - " + expr.javaClass.name)
            }' @ [61:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: BigDecimal, entry1: BigDecimal, entry2: BigDecimal, entry3: BigDecimal, entry4: BigDecimal, entry5: BigDecimal): BigDecimal[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> BigDecimal

'expr' @ [61:19] ==> value-parameter expr: Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal.UniversalContract.eval[ValueParameterDescriptorImpl]

'expr' @ [62:41] ==> value-parameter expr: Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal.UniversalContract.eval[ValueParameterDescriptorImpl]

'value' @ [62:46] ==> public final val value: BigDecimal defined in net.corda.finance.contracts.universal.Const[PropertyDescriptorImpl]

'eval' @ [64:29] ==> public final fun eval(tx: LedgerTransaction, expr: Perceivable<BigDecimal>): BigDecimal defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]

'tx' @ [64:34] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.eval[ValueParameterDescriptorImpl]

'expr' @ [64:38] ==> value-parameter expr: Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal.UniversalContract.eval[ValueParameterDescriptorImpl]

'arg' @ [64:43] ==> public final val arg: Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal.UnaryPlus[PropertyDescriptorImpl]

'if (x > BigDecimal.ZERO)
                        x
                    else
                        BigDecimal.ZERO' @ [65:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: BigDecimal, elseBranch: BigDecimal): BigDecimal[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> BigDecimal

'x' @ [65:25] ==> val x: BigDecimal defined in net.corda.finance.contracts.universal.UniversalContract.eval[LocalVariableDescriptor]

'ZERO' @ [65:40] ==> public final val ZERO: (BigDecimal..BigDecimal?) defined in java.math.BigDecimal[JavaPropertyDescriptor]

'x' @ [66:25] ==> val x: BigDecimal defined in net.corda.finance.contracts.universal.UniversalContract.eval[LocalVariableDescriptor]

'ZERO' @ [68:36] ==> public final val ZERO: (BigDecimal..BigDecimal?) defined in java.math.BigDecimal[JavaPropertyDescriptor]

'eval' @ [71:29] ==> public final fun eval(tx: LedgerTransaction, expr: Perceivable<BigDecimal>): BigDecimal defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]

'tx' @ [71:34] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.eval[ValueParameterDescriptorImpl]

'expr' @ [71:38] ==> value-parameter expr: Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal.UniversalContract.eval[ValueParameterDescriptorImpl]

'left' @ [71:43] ==> public final val left: Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal.PerceivableOperation[PropertyDescriptorImpl]

'eval' @ [72:29] ==> public final fun eval(tx: LedgerTransaction, expr: Perceivable<BigDecimal>): BigDecimal defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]

'tx' @ [72:34] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.eval[ValueParameterDescriptorImpl]

'expr' @ [72:38] ==> value-parameter expr: Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal.UniversalContract.eval[ValueParameterDescriptorImpl]

'right' @ [72:43] ==> public final val right: Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal.PerceivableOperation[PropertyDescriptorImpl]

'when (expr.op) {
                        Operation.DIV -> l / r
                        Operation.MINUS -> l - r
                        Operation.PLUS -> l + r
                        Operation.TIMES -> l * r
                        else -> throw NotImplementedError("eval - amount - operation " + expr.op)
                    }' @ [74:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: BigDecimal, entry1: BigDecimal, entry2: BigDecimal, entry3: BigDecimal, entry4: BigDecimal): BigDecimal[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> BigDecimal

'expr' @ [74:27] ==> value-parameter expr: Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal.UniversalContract.eval[ValueParameterDescriptorImpl]

'op' @ [74:32] ==> public final val op: Operation defined in net.corda.finance.contracts.universal.PerceivableOperation[PropertyDescriptorImpl]

'DIV' @ [75:35] ==> enum entry DIV defined in net.corda.finance.contracts.universal.Operation[FakeCallableDescriptorForObject]

'l' @ [75:42] ==> val l: BigDecimal defined in net.corda.finance.contracts.universal.UniversalContract.eval[LocalVariableDescriptor]

'r' @ [75:46] ==> val r: BigDecimal defined in net.corda.finance.contracts.universal.UniversalContract.eval[LocalVariableDescriptor]

'MINUS' @ [76:35] ==> enum entry MINUS defined in net.corda.finance.contracts.universal.Operation[FakeCallableDescriptorForObject]

'l' @ [76:44] ==> val l: BigDecimal defined in net.corda.finance.contracts.universal.UniversalContract.eval[LocalVariableDescriptor]

'r' @ [76:48] ==> val r: BigDecimal defined in net.corda.finance.contracts.universal.UniversalContract.eval[LocalVariableDescriptor]

'PLUS' @ [77:35] ==> enum entry PLUS defined in net.corda.finance.contracts.universal.Operation[FakeCallableDescriptorForObject]

'l' @ [77:43] ==> val l: BigDecimal defined in net.corda.finance.contracts.universal.UniversalContract.eval[LocalVariableDescriptor]

'r' @ [77:47] ==> val r: BigDecimal defined in net.corda.finance.contracts.universal.UniversalContract.eval[LocalVariableDescriptor]

'TIMES' @ [78:35] ==> enum entry TIMES defined in net.corda.finance.contracts.universal.Operation[FakeCallableDescriptorForObject]

'l' @ [78:44] ==> val l: BigDecimal defined in net.corda.finance.contracts.universal.UniversalContract.eval[LocalVariableDescriptor]

'r' @ [78:48] ==> val r: BigDecimal defined in net.corda.finance.contracts.universal.UniversalContract.eval[LocalVariableDescriptor]

'NotImplementedError' @ [79:39] ==> public constructor NotImplementedError(message: String = ...) defined in kotlin.NotImplementedError[DeserializedClassConstructorDescriptor]

'+' @ [79:59] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'expr' @ [79:90] ==> value-parameter expr: Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal.UniversalContract.eval[ValueParameterDescriptorImpl]

'op' @ [79:95] ==> public final val op: Operation defined in net.corda.finance.contracts.universal.PerceivableOperation[PropertyDescriptorImpl]

'requireThat' @ [83:21] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'using' @ [83:35] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'bd' @ [84:25] ==> public val Double.bd: BigDecimal defined in net.corda.finance.contracts.universal in file Literal.kt[PropertyDescriptorImpl]

'eval' @ [87:29] ==> public final fun eval(tx: LedgerTransaction, expr: Perceivable<BigDecimal>): BigDecimal defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]

'tx' @ [87:34] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.eval[ValueParameterDescriptorImpl]

'expr' @ [87:38] ==> value-parameter expr: Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal.UniversalContract.eval[ValueParameterDescriptorImpl]

'amount' @ [87:43] ==> public final val amount: Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal.Interest[PropertyDescriptorImpl]

'eval' @ [88:29] ==> public final fun eval(tx: LedgerTransaction, expr: Perceivable<BigDecimal>): BigDecimal defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]

'tx' @ [88:34] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.eval[ValueParameterDescriptorImpl]

'expr' @ [88:38] ==> value-parameter expr: Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal.UniversalContract.eval[ValueParameterDescriptorImpl]

'interest' @ [88:43] ==> public final val interest: Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal.Interest[PropertyDescriptorImpl]

'a' @ [92:21] ==> val a: BigDecimal defined in net.corda.finance.contracts.universal.UniversalContract.eval[LocalVariableDescriptor]

'i' @ [92:25] ==> val i: BigDecimal defined in net.corda.finance.contracts.universal.UniversalContract.eval[LocalVariableDescriptor]

'bd' @ [92:35] ==> public val Double.bd: BigDecimal defined in net.corda.finance.contracts.universal in file Literal.kt[PropertyDescriptorImpl]

'NotImplementedError' @ [94:31] ==> public constructor NotImplementedError(message: String = ...) defined in kotlin.NotImplementedError[DeserializedClassConstructorDescriptor]

'+' @ [94:51] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'expr' @ [94:76] ==> value-parameter expr: Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal.UniversalContract.eval[ValueParameterDescriptorImpl]

'javaClass' @ [94:81] ==> public val <T : Any> Perceivable<BigDecimal>.javaClass: Class<Perceivable<BigDecimal>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Perceivable<BigDecimal>

'name' @ [94:91] ==> public final val <T : (Any..Any?)> Class<Perceivable<BigDecimal>>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Perceivable<BigDecimal>

'when (arrangement) {
        is Obligation -> {
            val amount = eval(tx, arrangement.amount)
            requireThat { "transferred quantity is non-negative" using (amount >= BigDecimal.ZERO) }
            Obligation(const(amount), arrangement.currency, arrangement.from, arrangement.to)
        }
        is And -> And(arrangement.arrangements.map { validateImmediateTransfers(tx, it) }.toSet())
        else -> arrangement
    }' @ [97:100] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Arrangement, entry1: Arrangement, entry2: Arrangement): Arrangement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Arrangement

'arrangement' @ [97:106] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.validateImmediateTransfers[ValueParameterDescriptorImpl]

'eval' @ [99:26] ==> public final fun eval(tx: LedgerTransaction, expr: Perceivable<BigDecimal>): BigDecimal defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]

'tx' @ [99:31] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.validateImmediateTransfers[ValueParameterDescriptorImpl]

'arrangement' @ [99:35] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.validateImmediateTransfers[ValueParameterDescriptorImpl]

'amount' @ [99:47] ==> public final val amount: Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal.Obligation[PropertyDescriptorImpl]

'requireThat' @ [100:13] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'using' @ [100:27] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'amount' @ [100:73] ==> val amount: BigDecimal defined in net.corda.finance.contracts.universal.UniversalContract.validateImmediateTransfers[LocalVariableDescriptor]

'ZERO' @ [100:94] ==> public final val ZERO: (BigDecimal..BigDecimal?) defined in java.math.BigDecimal[JavaPropertyDescriptor]

'Obligation' @ [101:13] ==> public constructor Obligation(amount: Perceivable<BigDecimal>, currency: Currency, from: Party, to: Party) defined in net.corda.finance.contracts.universal.Obligation[ClassConstructorDescriptorImpl]

'const' @ [101:24] ==> public fun <T> const(k: BigDecimal): Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> BigDecimal

'amount' @ [101:30] ==> val amount: BigDecimal defined in net.corda.finance.contracts.universal.UniversalContract.validateImmediateTransfers[LocalVariableDescriptor]

'arrangement' @ [101:39] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.validateImmediateTransfers[ValueParameterDescriptorImpl]

'currency' @ [101:51] ==> public final val currency: Currency defined in net.corda.finance.contracts.universal.Obligation[PropertyDescriptorImpl]

'arrangement' @ [101:61] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.validateImmediateTransfers[ValueParameterDescriptorImpl]

'from' @ [101:73] ==> public final val from: Party defined in net.corda.finance.contracts.universal.Obligation[PropertyDescriptorImpl]

'arrangement' @ [101:79] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.validateImmediateTransfers[ValueParameterDescriptorImpl]

'to' @ [101:91] ==> public final val to: Party defined in net.corda.finance.contracts.universal.Obligation[PropertyDescriptorImpl]

'And' @ [103:19] ==> public constructor And(arrangements: Set<Arrangement>) defined in net.corda.finance.contracts.universal.And[ClassConstructorDescriptorImpl]

'arrangement' @ [103:23] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.validateImmediateTransfers[ValueParameterDescriptorImpl]

'arrangements' @ [103:35] ==> public final val arrangements: Set<Arrangement> defined in net.corda.finance.contracts.universal.And[PropertyDescriptorImpl]

'map' @ [103:48] ==> public inline fun <T, R> Iterable<Arrangement>.map(transform: (Arrangement) -> Arrangement): List<Arrangement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Arrangement
    <R> -> Arrangement

'validateImmediateTransfers' @ [103:54] ==> public final fun validateImmediateTransfers(tx: LedgerTransaction, arrangement: Arrangement): Arrangement defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]

'tx' @ [103:81] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.validateImmediateTransfers[ValueParameterDescriptorImpl]

'it' @ [103:85] ==> value-parameter it: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.validateImmediateTransfers.<anonymous>[ValueParameterDescriptorImpl]

'toSet' @ [103:91] ==> public fun <T> Iterable<Arrangement>.toSet(): Set<Arrangement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Arrangement

'arrangement' @ [104:17] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.validateImmediateTransfers[ValueParameterDescriptorImpl]

'rollOut' @ [109:21] ==> value-parameter rollOut: RollOut defined in net.corda.finance.contracts.universal.UniversalContract.reduceRollOut[ValueParameterDescriptorImpl]

'startDate' @ [109:29] ==> public final val startDate: LocalDate defined in net.corda.finance.contracts.universal.RollOut[PropertyDescriptorImpl]

'rollOut' @ [110:19] ==> value-parameter rollOut: RollOut defined in net.corda.finance.contracts.universal.UniversalContract.reduceRollOut[ValueParameterDescriptorImpl]

'endDate' @ [110:27] ==> public final val endDate: LocalDate defined in net.corda.finance.contracts.universal.RollOut[PropertyDescriptorImpl]

'BusinessCalendar' @ [113:24] ==> public companion object defined in net.corda.finance.contracts.BusinessCalendar[FakeCallableDescriptorForObject]

'createGenericSchedule' @ [113:41] ==> public final fun createGenericSchedule(startDate: LocalDate, period: Frequency, calendar: BusinessCalendar = ..., dateRollConvention: DateRollConvention = ..., noOfAdditionalPeriods: Int = ..., endDate: LocalDate? = ..., periodOffset: Int? = ...): List<LocalDate> defined in net.corda.finance.contracts.BusinessCalendar.Companion[DeserializedSimpleFunctionDescriptor]

'start' @ [113:63] ==> val start: LocalDate defined in net.corda.finance.contracts.universal.UniversalContract.reduceRollOut[LocalVariableDescriptor]

'rollOut' @ [113:70] ==> value-parameter rollOut: RollOut defined in net.corda.finance.contracts.universal.UniversalContract.reduceRollOut[ValueParameterDescriptorImpl]

'frequency' @ [113:78] ==> public final val frequency: Frequency defined in net.corda.finance.contracts.universal.RollOut[PropertyDescriptorImpl]

'end' @ [113:126] ==> val end: LocalDate defined in net.corda.finance.contracts.universal.UniversalContract.reduceRollOut[LocalVariableDescriptor]

'schedule' @ [115:25] ==> val schedule: List<LocalDate> defined in net.corda.finance.contracts.universal.UniversalContract.reduceRollOut[LocalVariableDescriptor]

'first' @ [115:34] ==> public fun <T> List<LocalDate>.first(): LocalDate defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LocalDate

'replaceStartEnd' @ [118:19] ==> public final fun replaceStartEnd(arrangement: Arrangement, start: Instant, end: Instant): Arrangement defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]

'rollOut' @ [118:35] ==> value-parameter rollOut: RollOut defined in net.corda.finance.contracts.universal.UniversalContract.reduceRollOut[ValueParameterDescriptorImpl]

'template' @ [118:43] ==> public final val template: Arrangement defined in net.corda.finance.contracts.universal.RollOut[PropertyDescriptorImpl]

'start' @ [118:53] ==> val start: LocalDate defined in net.corda.finance.contracts.universal.UniversalContract.reduceRollOut[LocalVariableDescriptor]

'toInstant' @ [118:59] ==> public fun LocalDate.toInstant(): Instant defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'nextStart' @ [118:72] ==> val nextStart: LocalDate defined in net.corda.finance.contracts.universal.UniversalContract.reduceRollOut[LocalVariableDescriptor]

'toInstant' @ [118:82] ==> public fun LocalDate.toInstant(): Instant defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'if (nextStart < end) {
            // TODO: we may have to save original start date in order to roll out correctly
            val newRollOut = RollOut(nextStart, end, rollOut.frequency, rollOut.template)
            return replaceNext(arr, newRollOut)
        } else {
            return removeNext(arr)
        }' @ [120:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'nextStart' @ [120:13] ==> val nextStart: LocalDate defined in net.corda.finance.contracts.universal.UniversalContract.reduceRollOut[LocalVariableDescriptor]

'end' @ [120:25] ==> val end: LocalDate defined in net.corda.finance.contracts.universal.UniversalContract.reduceRollOut[LocalVariableDescriptor]

'RollOut' @ [122:30] ==> public constructor RollOut(startDate: LocalDate, endDate: LocalDate, frequency: Frequency, template: Arrangement) defined in net.corda.finance.contracts.universal.RollOut[ClassConstructorDescriptorImpl]

'nextStart' @ [122:38] ==> val nextStart: LocalDate defined in net.corda.finance.contracts.universal.UniversalContract.reduceRollOut[LocalVariableDescriptor]

'end' @ [122:49] ==> val end: LocalDate defined in net.corda.finance.contracts.universal.UniversalContract.reduceRollOut[LocalVariableDescriptor]

'rollOut' @ [122:54] ==> value-parameter rollOut: RollOut defined in net.corda.finance.contracts.universal.UniversalContract.reduceRollOut[ValueParameterDescriptorImpl]

'frequency' @ [122:62] ==> public final val frequency: Frequency defined in net.corda.finance.contracts.universal.RollOut[PropertyDescriptorImpl]

'rollOut' @ [122:73] ==> value-parameter rollOut: RollOut defined in net.corda.finance.contracts.universal.UniversalContract.reduceRollOut[ValueParameterDescriptorImpl]

'template' @ [122:81] ==> public final val template: Arrangement defined in net.corda.finance.contracts.universal.RollOut[PropertyDescriptorImpl]

'replaceNext' @ [123:20] ==> public final fun replaceNext(arrangement: Arrangement, nextReplacement: RollOut): Arrangement defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]

'arr' @ [123:32] ==> val arr: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.reduceRollOut[LocalVariableDescriptor]

'newRollOut' @ [123:37] ==> val newRollOut: RollOut defined in net.corda.finance.contracts.universal.UniversalContract.reduceRollOut[LocalVariableDescriptor]

'removeNext' @ [125:20] ==> public final fun removeNext(arrangement: Arrangement): Arrangement defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]

'arr' @ [125:31] ==> val arr: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.reduceRollOut[LocalVariableDescriptor]

'Suppress' @ [129:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'when (p) {
                is Const -> p
                is TimePerceivable -> TimePerceivable(p.cmp, replaceStartEnd(p.instant, start, end)) as Perceivable<T>
                is EndDate -> const(end) as Perceivable<T>
                is StartDate -> const(start) as Perceivable<T>
                is UnaryPlus -> UnaryPlus(replaceStartEnd(p.arg, start, end))
                is PerceivableOperation -> PerceivableOperation<T>(replaceStartEnd(p.left, start, end), p.op, replaceStartEnd(p.right, start, end))
                is Interest -> Interest(replaceStartEnd(p.amount, start, end), p.dayCountConvention, replaceStartEnd(p.interest, start, end), replaceStartEnd(p.start, start, end), replaceStartEnd(p.end, start, end)) as Perceivable<T>
                is Fixing -> Fixing(p.source, replaceStartEnd(p.date, start, end), p.tenor) as Perceivable<T>
                is PerceivableAnd -> (replaceStartEnd(p.left, start, end) and replaceStartEnd(p.right, start, end)) as Perceivable<T>
                is PerceivableOr -> (replaceStartEnd(p.left, start, end) or replaceStartEnd(p.right, start, end)) as Perceivable<T>
                is ActorPerceivable -> p
                else -> throw NotImplementedError("replaceStartEnd " + p.javaClass.name)
            }' @ [131:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Perceivable<T>, entry1: Perceivable<T>, entry2: Perceivable<T>, entry3: Perceivable<T>, entry4: Perceivable<T>, entry5: Perceivable<T>, entry6: Perceivable<T>, entry7: Perceivable<T>, entry8: Perceivable<T>, entry9: Perceivable<T>, entry10: Perceivable<T>, entry11: Perceivable<T>): Perceivable<T>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Perceivable<T>

'p' @ [131:19] ==> value-parameter p: Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'p' @ [132:29] ==> value-parameter p: Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'TimePerceivable' @ [133:39] ==> public constructor TimePerceivable(cmp: Comparison, instant: Perceivable<Instant>) defined in net.corda.finance.contracts.universal.TimePerceivable[ClassConstructorDescriptorImpl]

'p' @ [133:55] ==> value-parameter p: Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'cmp' @ [133:57] ==> public final val cmp: Comparison defined in net.corda.finance.contracts.universal.TimePerceivable[PropertyDescriptorImpl]

'replaceStartEnd' @ [133:62] ==> @Suppress public final fun <T> replaceStartEnd(p: Perceivable<Instant>, start: Instant, end: Instant): Perceivable<Instant> defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Instant

'p' @ [133:78] ==> value-parameter p: Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'instant' @ [133:80] ==> public final val instant: Perceivable<Instant> defined in net.corda.finance.contracts.universal.TimePerceivable[PropertyDescriptorImpl]

'start' @ [133:89] ==> value-parameter start: Instant defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'end' @ [133:96] ==> value-parameter end: Instant defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'const' @ [134:31] ==> public fun <T> const(k: Instant): Perceivable<Instant> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Instant

'end' @ [134:37] ==> value-parameter end: Instant defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'const' @ [135:33] ==> public fun <T> const(k: Instant): Perceivable<Instant> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Instant

'start' @ [135:39] ==> value-parameter start: Instant defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'UnaryPlus' @ [136:33] ==> public constructor UnaryPlus<T>(arg: Perceivable<T>) defined in net.corda.finance.contracts.universal.UnaryPlus[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T

'replaceStartEnd' @ [136:43] ==> @Suppress public final fun <T> replaceStartEnd(p: Perceivable<T>, start: Instant, end: Instant): Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'p' @ [136:59] ==> value-parameter p: Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'arg' @ [136:61] ==> public final val arg: Perceivable<T> defined in net.corda.finance.contracts.universal.UnaryPlus[PropertyDescriptorImpl]

'start' @ [136:66] ==> value-parameter start: Instant defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'end' @ [136:73] ==> value-parameter end: Instant defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'PerceivableOperation' @ [137:44] ==> public constructor PerceivableOperation<T>(left: Perceivable<T>, op: Operation, right: Perceivable<T>) defined in net.corda.finance.contracts.universal.PerceivableOperation[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T

'replaceStartEnd' @ [137:68] ==> @Suppress public final fun <T> replaceStartEnd(p: Perceivable<T>, start: Instant, end: Instant): Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'p' @ [137:84] ==> value-parameter p: Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'left' @ [137:86] ==> public final val left: Perceivable<T> defined in net.corda.finance.contracts.universal.PerceivableOperation[PropertyDescriptorImpl]

'start' @ [137:92] ==> value-parameter start: Instant defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'end' @ [137:99] ==> value-parameter end: Instant defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'p' @ [137:105] ==> value-parameter p: Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'op' @ [137:107] ==> public final val op: Operation defined in net.corda.finance.contracts.universal.PerceivableOperation[PropertyDescriptorImpl]

'replaceStartEnd' @ [137:111] ==> @Suppress public final fun <T> replaceStartEnd(p: Perceivable<T>, start: Instant, end: Instant): Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'p' @ [137:127] ==> value-parameter p: Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'right' @ [137:129] ==> public final val right: Perceivable<T> defined in net.corda.finance.contracts.universal.PerceivableOperation[PropertyDescriptorImpl]

'start' @ [137:136] ==> value-parameter start: Instant defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'end' @ [137:143] ==> value-parameter end: Instant defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'Interest' @ [138:32] ==> public constructor Interest(amount: Perceivable<BigDecimal>, dayCountConvention: String, interest: Perceivable<BigDecimal>, start: Perceivable<Instant>, end: Perceivable<Instant>) defined in net.corda.finance.contracts.universal.Interest[ClassConstructorDescriptorImpl]

'replaceStartEnd' @ [138:41] ==> @Suppress public final fun <T> replaceStartEnd(p: Perceivable<BigDecimal>, start: Instant, end: Instant): Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> BigDecimal

'p' @ [138:57] ==> value-parameter p: Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'amount' @ [138:59] ==> public final val amount: Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal.Interest[PropertyDescriptorImpl]

'start' @ [138:67] ==> value-parameter start: Instant defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'end' @ [138:74] ==> value-parameter end: Instant defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'p' @ [138:80] ==> value-parameter p: Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'dayCountConvention' @ [138:82] ==> public final val dayCountConvention: String defined in net.corda.finance.contracts.universal.Interest[PropertyDescriptorImpl]

'replaceStartEnd' @ [138:102] ==> @Suppress public final fun <T> replaceStartEnd(p: Perceivable<BigDecimal>, start: Instant, end: Instant): Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> BigDecimal

'p' @ [138:118] ==> value-parameter p: Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'interest' @ [138:120] ==> public final val interest: Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal.Interest[PropertyDescriptorImpl]

'start' @ [138:130] ==> value-parameter start: Instant defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'end' @ [138:137] ==> value-parameter end: Instant defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'replaceStartEnd' @ [138:143] ==> @Suppress public final fun <T> replaceStartEnd(p: Perceivable<Instant>, start: Instant, end: Instant): Perceivable<Instant> defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Instant

'p' @ [138:159] ==> value-parameter p: Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'start' @ [138:161] ==> public final val start: Perceivable<Instant> defined in net.corda.finance.contracts.universal.Interest[PropertyDescriptorImpl]

'start' @ [138:168] ==> value-parameter start: Instant defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'end' @ [138:175] ==> value-parameter end: Instant defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'replaceStartEnd' @ [138:181] ==> @Suppress public final fun <T> replaceStartEnd(p: Perceivable<Instant>, start: Instant, end: Instant): Perceivable<Instant> defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Instant

'p' @ [138:197] ==> value-parameter p: Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'end' @ [138:199] ==> public final val end: Perceivable<Instant> defined in net.corda.finance.contracts.universal.Interest[PropertyDescriptorImpl]

'start' @ [138:204] ==> value-parameter start: Instant defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'end' @ [138:211] ==> value-parameter end: Instant defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'Fixing' @ [139:30] ==> public constructor Fixing(source: String, date: Perceivable<Instant>, tenor: Tenor) defined in net.corda.finance.contracts.universal.Fixing[ClassConstructorDescriptorImpl]

'p' @ [139:37] ==> value-parameter p: Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'source' @ [139:39] ==> public final val source: String defined in net.corda.finance.contracts.universal.Fixing[PropertyDescriptorImpl]

'replaceStartEnd' @ [139:47] ==> @Suppress public final fun <T> replaceStartEnd(p: Perceivable<Instant>, start: Instant, end: Instant): Perceivable<Instant> defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Instant

'p' @ [139:63] ==> value-parameter p: Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'date' @ [139:65] ==> public final val date: Perceivable<Instant> defined in net.corda.finance.contracts.universal.Fixing[PropertyDescriptorImpl]

'start' @ [139:71] ==> value-parameter start: Instant defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'end' @ [139:78] ==> value-parameter end: Instant defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'p' @ [139:84] ==> value-parameter p: Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'tenor' @ [139:86] ==> public final val tenor: Tenor defined in net.corda.finance.contracts.universal.Fixing[PropertyDescriptorImpl]

'replaceStartEnd' @ [140:39] ==> @Suppress public final fun <T> replaceStartEnd(p: Perceivable<Boolean>, start: Instant, end: Instant): Perceivable<Boolean> defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Boolean

'p' @ [140:55] ==> value-parameter p: Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'left' @ [140:57] ==> public final val left: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.PerceivableAnd[PropertyDescriptorImpl]

'start' @ [140:63] ==> value-parameter start: Instant defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'end' @ [140:70] ==> value-parameter end: Instant defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'replaceStartEnd' @ [140:79] ==> @Suppress public final fun <T> replaceStartEnd(p: Perceivable<Boolean>, start: Instant, end: Instant): Perceivable<Boolean> defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Boolean

'p' @ [140:95] ==> value-parameter p: Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'right' @ [140:97] ==> public final val right: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.PerceivableAnd[PropertyDescriptorImpl]

'start' @ [140:104] ==> value-parameter start: Instant defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'end' @ [140:111] ==> value-parameter end: Instant defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'replaceStartEnd' @ [141:38] ==> @Suppress public final fun <T> replaceStartEnd(p: Perceivable<Boolean>, start: Instant, end: Instant): Perceivable<Boolean> defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Boolean

'p' @ [141:54] ==> value-parameter p: Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'left' @ [141:56] ==> public final val left: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.PerceivableOr[PropertyDescriptorImpl]

'start' @ [141:62] ==> value-parameter start: Instant defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'end' @ [141:69] ==> value-parameter end: Instant defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'replaceStartEnd' @ [141:77] ==> @Suppress public final fun <T> replaceStartEnd(p: Perceivable<Boolean>, start: Instant, end: Instant): Perceivable<Boolean> defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Boolean

'p' @ [141:93] ==> value-parameter p: Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'right' @ [141:95] ==> public final val right: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.PerceivableOr[PropertyDescriptorImpl]

'start' @ [141:102] ==> value-parameter start: Instant defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'end' @ [141:109] ==> value-parameter end: Instant defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'p' @ [142:40] ==> value-parameter p: Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'NotImplementedError' @ [143:31] ==> public constructor NotImplementedError(message: String = ...) defined in kotlin.NotImplementedError[DeserializedClassConstructorDescriptor]

'+' @ [143:51] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'p' @ [143:72] ==> value-parameter p: Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'javaClass' @ [143:74] ==> public val <T : Any> Perceivable<T>.javaClass: Class<Perceivable<T>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Perceivable<T>

'name' @ [143:84] ==> public final val <T : (Any..Any?)> Class<Perceivable<T>>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Perceivable<T>

'when (arrangement) {
                is And -> And(arrangement.arrangements.map { replaceStartEnd(it, start, end) }.toSet())
                is Zero -> arrangement
                is Obligation -> Obligation(replaceStartEnd(arrangement.amount, start, end), arrangement.currency, arrangement.from, arrangement.to)
                is Actions -> Actions(arrangement.actions.map { Action(it.name, replaceStartEnd(it.condition, start, end), replaceStartEnd(it.arrangement, start, end)) }.toSet())
                is Continuation -> arrangement
                else -> throw NotImplementedError("replaceStartEnd " + arrangement.javaClass.name)
            }' @ [147:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Arrangement, entry1: Arrangement, entry2: Arrangement, entry3: Arrangement, entry4: Arrangement, entry5: Arrangement): Arrangement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Arrangement

'arrangement' @ [147:19] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'And' @ [148:27] ==> public constructor And(arrangements: Set<Arrangement>) defined in net.corda.finance.contracts.universal.And[ClassConstructorDescriptorImpl]

'arrangement' @ [148:31] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'arrangements' @ [148:43] ==> public final val arrangements: Set<Arrangement> defined in net.corda.finance.contracts.universal.And[PropertyDescriptorImpl]

'map' @ [148:56] ==> public inline fun <T, R> Iterable<Arrangement>.map(transform: (Arrangement) -> Arrangement): List<Arrangement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Arrangement
    <R> -> Arrangement

'replaceStartEnd' @ [148:62] ==> public final fun replaceStartEnd(arrangement: Arrangement, start: Instant, end: Instant): Arrangement defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]

'it' @ [148:78] ==> value-parameter it: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd.<anonymous>[ValueParameterDescriptorImpl]

'start' @ [148:82] ==> value-parameter start: Instant defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'end' @ [148:89] ==> value-parameter end: Instant defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'toSet' @ [148:96] ==> public fun <T> Iterable<Arrangement>.toSet(): Set<Arrangement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Arrangement

'arrangement' @ [149:28] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'Obligation' @ [150:34] ==> public constructor Obligation(amount: Perceivable<BigDecimal>, currency: Currency, from: Party, to: Party) defined in net.corda.finance.contracts.universal.Obligation[ClassConstructorDescriptorImpl]

'replaceStartEnd' @ [150:45] ==> @Suppress public final fun <T> replaceStartEnd(p: Perceivable<BigDecimal>, start: Instant, end: Instant): Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> BigDecimal

'arrangement' @ [150:61] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'amount' @ [150:73] ==> public final val amount: Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal.Obligation[PropertyDescriptorImpl]

'start' @ [150:81] ==> value-parameter start: Instant defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'end' @ [150:88] ==> value-parameter end: Instant defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'arrangement' @ [150:94] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'currency' @ [150:106] ==> public final val currency: Currency defined in net.corda.finance.contracts.universal.Obligation[PropertyDescriptorImpl]

'arrangement' @ [150:116] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'from' @ [150:128] ==> public final val from: Party defined in net.corda.finance.contracts.universal.Obligation[PropertyDescriptorImpl]

'arrangement' @ [150:134] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'to' @ [150:146] ==> public final val to: Party defined in net.corda.finance.contracts.universal.Obligation[PropertyDescriptorImpl]

'Actions' @ [151:31] ==> public constructor Actions(actions: Set<Action>) defined in net.corda.finance.contracts.universal.Actions[ClassConstructorDescriptorImpl]

'arrangement' @ [151:39] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'actions' @ [151:51] ==> public final val actions: Set<Action> defined in net.corda.finance.contracts.universal.Actions[PropertyDescriptorImpl]

'map' @ [151:59] ==> public inline fun <T, R> Iterable<Action>.map(transform: (Action) -> Action): List<Action> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Action
    <R> -> Action

'Action' @ [151:65] ==> public constructor Action(name: String, condition: Perceivable<Boolean>, arrangement: Arrangement) defined in net.corda.finance.contracts.universal.Action[ClassConstructorDescriptorImpl]

'it' @ [151:72] ==> value-parameter it: Action defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [151:75] ==> public final val name: String defined in net.corda.finance.contracts.universal.Action[PropertyDescriptorImpl]

'replaceStartEnd' @ [151:81] ==> @Suppress public final fun <T> replaceStartEnd(p: Perceivable<Boolean>, start: Instant, end: Instant): Perceivable<Boolean> defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Boolean

'it' @ [151:97] ==> value-parameter it: Action defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd.<anonymous>[ValueParameterDescriptorImpl]

'condition' @ [151:100] ==> public final val condition: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.Action[PropertyDescriptorImpl]

'start' @ [151:111] ==> value-parameter start: Instant defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'end' @ [151:118] ==> value-parameter end: Instant defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'replaceStartEnd' @ [151:124] ==> public final fun replaceStartEnd(arrangement: Arrangement, start: Instant, end: Instant): Arrangement defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]

'it' @ [151:140] ==> value-parameter it: Action defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd.<anonymous>[ValueParameterDescriptorImpl]

'arrangement' @ [151:143] ==> public final val arrangement: Arrangement defined in net.corda.finance.contracts.universal.Action[PropertyDescriptorImpl]

'start' @ [151:156] ==> value-parameter start: Instant defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'end' @ [151:163] ==> value-parameter end: Instant defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'toSet' @ [151:171] ==> public fun <T> Iterable<Action>.toSet(): Set<Action> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Action

'arrangement' @ [152:36] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'NotImplementedError' @ [153:31] ==> public constructor NotImplementedError(message: String = ...) defined in kotlin.NotImplementedError[DeserializedClassConstructorDescriptor]

'+' @ [153:51] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'arrangement' @ [153:72] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.replaceStartEnd[ValueParameterDescriptorImpl]

'javaClass' @ [153:84] ==> public val <T : Any> Arrangement.javaClass: Class<Arrangement> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Arrangement

'name' @ [153:94] ==> public final val <T : (Any..Any?)> Class<Arrangement>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Arrangement

'when (arrangement) {
                is Actions -> Actions(arrangement.actions.map { Action(it.name, it.condition, replaceNext(it.arrangement, nextReplacement)) }.toSet())
                is And -> And(arrangement.arrangements.map { replaceNext(it, nextReplacement) }.toSet())
                is Obligation -> arrangement
                is Zero -> arrangement
                is Continuation -> nextReplacement
                else -> throw NotImplementedError("replaceNext " + arrangement.javaClass.name)
            }' @ [157:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Arrangement, entry1: Arrangement, entry2: Arrangement, entry3: Arrangement, entry4: Arrangement, entry5: Arrangement): Arrangement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Arrangement

'arrangement' @ [157:19] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.replaceNext[ValueParameterDescriptorImpl]

'Actions' @ [158:31] ==> public constructor Actions(actions: Set<Action>) defined in net.corda.finance.contracts.universal.Actions[ClassConstructorDescriptorImpl]

'arrangement' @ [158:39] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.replaceNext[ValueParameterDescriptorImpl]

'actions' @ [158:51] ==> public final val actions: Set<Action> defined in net.corda.finance.contracts.universal.Actions[PropertyDescriptorImpl]

'map' @ [158:59] ==> public inline fun <T, R> Iterable<Action>.map(transform: (Action) -> Action): List<Action> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Action
    <R> -> Action

'Action' @ [158:65] ==> public constructor Action(name: String, condition: Perceivable<Boolean>, arrangement: Arrangement) defined in net.corda.finance.contracts.universal.Action[ClassConstructorDescriptorImpl]

'it' @ [158:72] ==> value-parameter it: Action defined in net.corda.finance.contracts.universal.UniversalContract.replaceNext.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [158:75] ==> public final val name: String defined in net.corda.finance.contracts.universal.Action[PropertyDescriptorImpl]

'it' @ [158:81] ==> value-parameter it: Action defined in net.corda.finance.contracts.universal.UniversalContract.replaceNext.<anonymous>[ValueParameterDescriptorImpl]

'condition' @ [158:84] ==> public final val condition: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.Action[PropertyDescriptorImpl]

'replaceNext' @ [158:95] ==> public final fun replaceNext(arrangement: Arrangement, nextReplacement: RollOut): Arrangement defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]

'it' @ [158:107] ==> value-parameter it: Action defined in net.corda.finance.contracts.universal.UniversalContract.replaceNext.<anonymous>[ValueParameterDescriptorImpl]

'arrangement' @ [158:110] ==> public final val arrangement: Arrangement defined in net.corda.finance.contracts.universal.Action[PropertyDescriptorImpl]

'nextReplacement' @ [158:123] ==> value-parameter nextReplacement: RollOut defined in net.corda.finance.contracts.universal.UniversalContract.replaceNext[ValueParameterDescriptorImpl]

'toSet' @ [158:143] ==> public fun <T> Iterable<Action>.toSet(): Set<Action> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Action

'And' @ [159:27] ==> public constructor And(arrangements: Set<Arrangement>) defined in net.corda.finance.contracts.universal.And[ClassConstructorDescriptorImpl]

'arrangement' @ [159:31] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.replaceNext[ValueParameterDescriptorImpl]

'arrangements' @ [159:43] ==> public final val arrangements: Set<Arrangement> defined in net.corda.finance.contracts.universal.And[PropertyDescriptorImpl]

'map' @ [159:56] ==> public inline fun <T, R> Iterable<Arrangement>.map(transform: (Arrangement) -> Arrangement): List<Arrangement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Arrangement
    <R> -> Arrangement

'replaceNext' @ [159:62] ==> public final fun replaceNext(arrangement: Arrangement, nextReplacement: RollOut): Arrangement defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]

'it' @ [159:74] ==> value-parameter it: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.replaceNext.<anonymous>[ValueParameterDescriptorImpl]

'nextReplacement' @ [159:78] ==> value-parameter nextReplacement: RollOut defined in net.corda.finance.contracts.universal.UniversalContract.replaceNext[ValueParameterDescriptorImpl]

'toSet' @ [159:97] ==> public fun <T> Iterable<Arrangement>.toSet(): Set<Arrangement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Arrangement

'arrangement' @ [160:34] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.replaceNext[ValueParameterDescriptorImpl]

'arrangement' @ [161:28] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.replaceNext[ValueParameterDescriptorImpl]

'nextReplacement' @ [162:36] ==> value-parameter nextReplacement: RollOut defined in net.corda.finance.contracts.universal.UniversalContract.replaceNext[ValueParameterDescriptorImpl]

'NotImplementedError' @ [163:31] ==> public constructor NotImplementedError(message: String = ...) defined in kotlin.NotImplementedError[DeserializedClassConstructorDescriptor]

'+' @ [163:51] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'arrangement' @ [163:68] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.replaceNext[ValueParameterDescriptorImpl]

'javaClass' @ [163:80] ==> public val <T : Any> Arrangement.javaClass: Class<Arrangement> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Arrangement

'name' @ [163:90] ==> public final val <T : (Any..Any?)> Class<Arrangement>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Arrangement

'when (arrangement) {
                is Actions -> Actions(arrangement.actions.map { Action(it.name, it.condition, removeNext(it.arrangement)) }.toSet())
                is And -> {
                    val a = arrangement.arrangements.map { removeNext(it) }.filter { it != zero }
                    if (a.count() > 1)
                        And(a.toSet())
                    else
                        a.single()
                }
                is Obligation -> arrangement
                is Zero -> arrangement
                is Continuation -> zero
                else -> throw NotImplementedError("replaceNext " + arrangement.javaClass.name)
            }' @ [167:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Arrangement, entry1: Arrangement, entry2: Arrangement, entry3: Arrangement, entry4: Arrangement, entry5: Arrangement): Arrangement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Arrangement

'arrangement' @ [167:19] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.removeNext[ValueParameterDescriptorImpl]

'Actions' @ [168:31] ==> public constructor Actions(actions: Set<Action>) defined in net.corda.finance.contracts.universal.Actions[ClassConstructorDescriptorImpl]

'arrangement' @ [168:39] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.removeNext[ValueParameterDescriptorImpl]

'actions' @ [168:51] ==> public final val actions: Set<Action> defined in net.corda.finance.contracts.universal.Actions[PropertyDescriptorImpl]

'map' @ [168:59] ==> public inline fun <T, R> Iterable<Action>.map(transform: (Action) -> Action): List<Action> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Action
    <R> -> Action

'Action' @ [168:65] ==> public constructor Action(name: String, condition: Perceivable<Boolean>, arrangement: Arrangement) defined in net.corda.finance.contracts.universal.Action[ClassConstructorDescriptorImpl]

'it' @ [168:72] ==> value-parameter it: Action defined in net.corda.finance.contracts.universal.UniversalContract.removeNext.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [168:75] ==> public final val name: String defined in net.corda.finance.contracts.universal.Action[PropertyDescriptorImpl]

'it' @ [168:81] ==> value-parameter it: Action defined in net.corda.finance.contracts.universal.UniversalContract.removeNext.<anonymous>[ValueParameterDescriptorImpl]

'condition' @ [168:84] ==> public final val condition: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.Action[PropertyDescriptorImpl]

'removeNext' @ [168:95] ==> public final fun removeNext(arrangement: Arrangement): Arrangement defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]

'it' @ [168:106] ==> value-parameter it: Action defined in net.corda.finance.contracts.universal.UniversalContract.removeNext.<anonymous>[ValueParameterDescriptorImpl]

'arrangement' @ [168:109] ==> public final val arrangement: Arrangement defined in net.corda.finance.contracts.universal.Action[PropertyDescriptorImpl]

'toSet' @ [168:125] ==> public fun <T> Iterable<Action>.toSet(): Set<Action> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Action

'arrangement' @ [170:29] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.removeNext[ValueParameterDescriptorImpl]

'arrangements' @ [170:41] ==> public final val arrangements: Set<Arrangement> defined in net.corda.finance.contracts.universal.And[PropertyDescriptorImpl]

'map' @ [170:54] ==> public inline fun <T, R> Iterable<Arrangement>.map(transform: (Arrangement) -> Arrangement): List<Arrangement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Arrangement
    <R> -> Arrangement

'removeNext' @ [170:60] ==> public final fun removeNext(arrangement: Arrangement): Arrangement defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]

'it' @ [170:71] ==> value-parameter it: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.removeNext.<anonymous>[ValueParameterDescriptorImpl]

'filter' @ [170:77] ==> public inline fun <T> Iterable<Arrangement>.filter(predicate: (Arrangement) -> Boolean): List<Arrangement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Arrangement

'it' @ [170:86] ==> value-parameter it: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.removeNext.<anonymous>[ValueParameterDescriptorImpl]

'zero' @ [170:92] ==> public val zero: Zero defined in net.corda.finance.contracts.universal in file Literal.kt[PropertyDescriptorImpl]

'if (a.count() > 1)
                        And(a.toSet())
                    else
                        a.single()' @ [171:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Arrangement, elseBranch: Arrangement): Arrangement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Arrangement

'a' @ [171:25] ==> val a: List<Arrangement> defined in net.corda.finance.contracts.universal.UniversalContract.removeNext[LocalVariableDescriptor]

'count' @ [171:27] ==> @InlineOnly public inline fun <T> Collection<Arrangement>.count(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Arrangement

'And' @ [172:25] ==> public constructor And(arrangements: Set<Arrangement>) defined in net.corda.finance.contracts.universal.And[ClassConstructorDescriptorImpl]

'a' @ [172:29] ==> val a: List<Arrangement> defined in net.corda.finance.contracts.universal.UniversalContract.removeNext[LocalVariableDescriptor]

'toSet' @ [172:31] ==> public fun <T> Iterable<Arrangement>.toSet(): Set<Arrangement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Arrangement

'a' @ [174:25] ==> val a: List<Arrangement> defined in net.corda.finance.contracts.universal.UniversalContract.removeNext[LocalVariableDescriptor]

'single' @ [174:27] ==> public fun <T> List<Arrangement>.single(): Arrangement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Arrangement

'arrangement' @ [176:34] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.removeNext[ValueParameterDescriptorImpl]

'arrangement' @ [177:28] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.removeNext[ValueParameterDescriptorImpl]

'zero' @ [178:36] ==> public val zero: Zero defined in net.corda.finance.contracts.universal in file Literal.kt[PropertyDescriptorImpl]

'NotImplementedError' @ [179:31] ==> public constructor NotImplementedError(message: String = ...) defined in kotlin.NotImplementedError[DeserializedClassConstructorDescriptor]

'+' @ [179:51] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'arrangement' @ [179:68] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.removeNext[ValueParameterDescriptorImpl]

'javaClass' @ [179:80] ==> public val <T : Any> Arrangement.javaClass: Class<Arrangement> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Arrangement

'name' @ [179:90] ==> public final val <T : (Any..Any?)> Class<Arrangement>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Arrangement

'requireThat' @ [184:9] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'using' @ [185:48] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'tx' @ [185:54] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.verify[ValueParameterDescriptorImpl]

'commands' @ [185:57] ==> public final val commands: List<AuthenticatedObject<CommandData>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'size' @ [185:66] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'tx' @ [188:19] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.verify[ValueParameterDescriptorImpl]

'commands' @ [188:22] ==> public final val commands: List<AuthenticatedObject<CommandData>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'requireSingleCommand' @ [188:31] ==> public inline fun <reified T : CommandData> Collection<AuthenticatedObject<CommandData>>.requireSingleCommand(): AuthenticatedObject<UniversalContract.Commands> defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : CommandData> -> Commands

'cmd' @ [190:21] ==> val cmd: AuthenticatedObject<UniversalContract.Commands> defined in net.corda.finance.contracts.universal.UniversalContract.verify[LocalVariableDescriptor]

'value' @ [190:25] ==> public final val value: UniversalContract.Commands defined in net.corda.core.contracts.AuthenticatedObject[DeserializedPropertyDescriptor]

'when (value) {
            is Commands.Action -> {
                val inState = tx.inputsOfType<State>().single()
                val arr = when (inState.details) {
                    is Actions -> inState.details
                    is RollOut -> reduceRollOut(inState.details)
                    else -> throw IllegalArgumentException("Unexpected arrangement, " + tx.inputs.single())
                }

                val actions = actions(arr)

                val action = actions[value.name] ?: throw IllegalArgumentException("Failed requirement: action must be defined")

                // TODO: not sure this is necessary??
                val rest = extractRemainder(arr, action)

                // for now - let's assume not
                assert(rest is Zero)

                requireThat {
                    "action must have a time-window" using (tx.timeWindow != null)
                    // "action must be authorized" by (cmd.signers.any { action.actors.any { party -> party.owningKey == it } })
                    // todo perhaps merge these two requirements?
                    "condition must be met" using (eval(tx, action.condition))
                }

                // verify that any resulting transfers can be resolved
                //val arrangement = checkAndReduce(tx, action.arrangement)
                val arrangement = validateImmediateTransfers(tx, action.arrangement)

                when (tx.outputs.size) {
                    1 -> {
                        val outState = tx.outputsOfType<State>().single()
                        requireThat {
                            "output state must match action result state" using (arrangement.equals(outState.details))
                            "output state must match action result state" using (rest == zero)
                        }
                    }
                    0 -> throw IllegalArgumentException("must have at least one out state")
                    else -> {
                        val allContracts = And(tx.outputsOfType<State>().map { it.details }.toSet())

                        requireThat {
                            "output states must match action result state" using (arrangement.equals(allContracts))
                        }

                    }
                }
            }
            is Commands.Issue -> {
                val outState = tx.outputsOfType<State>().single()
                requireThat {
                    "the transaction is signed by all liable parties" using (liableParties(outState.details).all { it in cmd.signers })
                    "the transaction has no input states" using tx.inputs.isEmpty()
                }
            }
            is Commands.Move -> {
                val inState = tx.inputsOfType<State>().single()
                val outState = tx.outputsOfType<State>().single()
                requireThat {
                    "the transaction is signed by all liable parties" using
                            (liableParties(outState.details).all { it in cmd.signers })
                    "output state does not reflect move command" using
                            (replaceParty(inState.details, value.from, value.to).equals(outState.details))
                }
            }
            is Commands.Fix -> {
                val inState = tx.inputsOfType<State>().single()
                val arr = when (inState.details) {
                    is Actions -> inState.details
                    is RollOut -> reduceRollOut(inState.details)
                    else -> throw IllegalArgumentException("Unexpected arrangement, " + tx.inputs.single())
                }
                val outState = tx.outputsOfType<State>().single()

                val unusedFixes = value.fixes.map { it.of }.toMutableSet()
                val expectedArr = replaceFixing(tx, arr,
                        value.fixes.associateBy({ it.of }, { it.value }), unusedFixes)

                requireThat {
                    "relevant fixing must be included" using unusedFixes.isEmpty()
                    "output state does not reflect fix command" using
                            (expectedArr.equals(outState.details))
                }
            }
            else -> throw IllegalArgumentException("Unrecognised command")
        }' @ [192:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit, entry4: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'value' @ [192:15] ==> val value: UniversalContract.Commands defined in net.corda.finance.contracts.universal.UniversalContract.verify[LocalVariableDescriptor]

'tx' @ [194:31] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.verify[ValueParameterDescriptorImpl]

'inputsOfType' @ [194:34] ==> public final inline fun <reified T : ContractState> inputsOfType(): List<UniversalContract.State> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'single' @ [194:56] ==> public fun <T> List<UniversalContract.State>.single(): UniversalContract.State defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'when (inState.details) {
                    is Actions -> inState.details
                    is RollOut -> reduceRollOut(inState.details)
                    else -> throw IllegalArgumentException("Unexpected arrangement, " + tx.inputs.single())
                }' @ [195:27] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Arrangement, entry1: Arrangement, entry2: Arrangement): Arrangement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Arrangement

'inState' @ [195:33] ==> val inState: UniversalContract.State defined in net.corda.finance.contracts.universal.UniversalContract.verify[LocalVariableDescriptor]

'details' @ [195:41] ==> public final val details: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.State[PropertyDescriptorImpl]

'inState' @ [196:35] ==> val inState: UniversalContract.State defined in net.corda.finance.contracts.universal.UniversalContract.verify[LocalVariableDescriptor]

'details' @ [196:43] ==> public final val details: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.State[PropertyDescriptorImpl]

'reduceRollOut' @ [197:35] ==> public final fun reduceRollOut(rollOut: RollOut): Arrangement defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]

'inState' @ [197:49] ==> val inState: UniversalContract.State defined in net.corda.finance.contracts.universal.UniversalContract.verify[LocalVariableDescriptor]

'details' @ [197:57] ==> public final val details: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.State[PropertyDescriptorImpl]

'IllegalArgumentException' @ [198:35] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'+' @ [198:60] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'tx' @ [198:89] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.verify[ValueParameterDescriptorImpl]

'inputs' @ [198:92] ==> public open val inputs: List<StateAndRef<ContractState>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'single' @ [198:99] ==> public fun <T> List<StateAndRef<ContractState>>.single(): StateAndRef<ContractState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'actions' @ [201:31] ==> public fun actions(arrangement: Arrangement): Map<String, Action> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]

'arr' @ [201:39] ==> val arr: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.verify[LocalVariableDescriptor]

'actions' @ [203:30] ==> val actions: Map<String, Action> defined in net.corda.finance.contracts.universal.UniversalContract.verify[LocalVariableDescriptor]

'value' @ [203:38] ==> val value: UniversalContract.Commands defined in net.corda.finance.contracts.universal.UniversalContract.verify[LocalVariableDescriptor]

'name' @ [203:44] ==> public final val name: String defined in net.corda.finance.contracts.universal.UniversalContract.Commands.Action[PropertyDescriptorImpl]

'IllegalArgumentException' @ [203:59] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'extractRemainder' @ [206:28] ==> public fun extractRemainder(arrangement: Arrangement, action: Action): Arrangement defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'arr' @ [206:45] ==> val arr: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.verify[LocalVariableDescriptor]

'action' @ [206:50] ==> val action: Action defined in net.corda.finance.contracts.universal.UniversalContract.verify[LocalVariableDescriptor]

'assert' @ [209:17] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'rest' @ [209:24] ==> val rest: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.verify[LocalVariableDescriptor]

'requireThat' @ [211:17] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'using' @ [212:21] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'tx' @ [212:61] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.verify[ValueParameterDescriptorImpl]

'timeWindow' @ [212:64] ==> public final val timeWindow: TimeWindow? defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'using' @ [215:21] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'eval' @ [215:52] ==> public final fun eval(tx: LedgerTransaction, expr: Perceivable<Boolean>): Boolean defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]

'tx' @ [215:57] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.verify[ValueParameterDescriptorImpl]

'action' @ [215:61] ==> val action: Action defined in net.corda.finance.contracts.universal.UniversalContract.verify[LocalVariableDescriptor]

'condition' @ [215:68] ==> public final val condition: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.Action[PropertyDescriptorImpl]

'validateImmediateTransfers' @ [220:35] ==> public final fun validateImmediateTransfers(tx: LedgerTransaction, arrangement: Arrangement): Arrangement defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]

'tx' @ [220:62] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.verify[ValueParameterDescriptorImpl]

'action' @ [220:66] ==> val action: Action defined in net.corda.finance.contracts.universal.UniversalContract.verify[LocalVariableDescriptor]

'arrangement' @ [220:73] ==> public final val arrangement: Arrangement defined in net.corda.finance.contracts.universal.Action[PropertyDescriptorImpl]

'when (tx.outputs.size) {
                    1 -> {
                        val outState = tx.outputsOfType<State>().single()
                        requireThat {
                            "output state must match action result state" using (arrangement.equals(outState.details))
                            "output state must match action result state" using (rest == zero)
                        }
                    }
                    0 -> throw IllegalArgumentException("must have at least one out state")
                    else -> {
                        val allContracts = And(tx.outputsOfType<State>().map { it.details }.toSet())

                        requireThat {
                            "output states must match action result state" using (arrangement.equals(allContracts))
                        }

                    }
                }' @ [222:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'tx' @ [222:23] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.verify[ValueParameterDescriptorImpl]

'outputs' @ [222:26] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'size' @ [222:34] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'tx' @ [224:40] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.verify[ValueParameterDescriptorImpl]

'outputsOfType' @ [224:43] ==> public final inline fun <reified T : ContractState> outputsOfType(): List<UniversalContract.State> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'single' @ [224:66] ==> public fun <T> List<UniversalContract.State>.single(): UniversalContract.State defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'requireThat' @ [225:25] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'using' @ [226:29] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'arrangement' @ [226:82] ==> val arrangement: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.verify[LocalVariableDescriptor]

'equals' @ [226:94] ==> public open fun equals(other: Any?): Boolean defined in net.corda.finance.contracts.universal.Arrangement[DeserializedSimpleFunctionDescriptor]

'outState' @ [226:101] ==> val outState: UniversalContract.State defined in net.corda.finance.contracts.universal.UniversalContract.verify[LocalVariableDescriptor]

'details' @ [226:110] ==> public final val details: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.State[PropertyDescriptorImpl]

'using' @ [227:29] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'rest' @ [227:82] ==> val rest: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.verify[LocalVariableDescriptor]

'zero' @ [227:90] ==> public val zero: Zero defined in net.corda.finance.contracts.universal in file Literal.kt[PropertyDescriptorImpl]

'IllegalArgumentException' @ [230:32] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'And' @ [232:44] ==> public constructor And(arrangements: Set<Arrangement>) defined in net.corda.finance.contracts.universal.And[ClassConstructorDescriptorImpl]

'tx' @ [232:48] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.verify[ValueParameterDescriptorImpl]

'outputsOfType' @ [232:51] ==> public final inline fun <reified T : ContractState> outputsOfType(): List<UniversalContract.State> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'map' @ [232:74] ==> public inline fun <T, R> Iterable<UniversalContract.State>.map(transform: (UniversalContract.State) -> Arrangement): List<Arrangement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State
    <R> -> Arrangement

'it' @ [232:80] ==> value-parameter it: UniversalContract.State defined in net.corda.finance.contracts.universal.UniversalContract.verify.<anonymous>[ValueParameterDescriptorImpl]

'details' @ [232:83] ==> public final val details: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.State[PropertyDescriptorImpl]

'toSet' @ [232:93] ==> public fun <T> Iterable<Arrangement>.toSet(): Set<Arrangement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Arrangement

'requireThat' @ [234:25] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'using' @ [235:29] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'arrangement' @ [235:83] ==> val arrangement: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.verify[LocalVariableDescriptor]

'equals' @ [235:95] ==> public open fun equals(other: Any?): Boolean defined in net.corda.finance.contracts.universal.Arrangement[DeserializedSimpleFunctionDescriptor]

'allContracts' @ [235:102] ==> val allContracts: And defined in net.corda.finance.contracts.universal.UniversalContract.verify[LocalVariableDescriptor]

'tx' @ [242:32] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.verify[ValueParameterDescriptorImpl]

'outputsOfType' @ [242:35] ==> public final inline fun <reified T : ContractState> outputsOfType(): List<UniversalContract.State> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'single' @ [242:58] ==> public fun <T> List<UniversalContract.State>.single(): UniversalContract.State defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'requireThat' @ [243:17] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'using' @ [244:21] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'liableParties' @ [244:78] ==> public fun liableParties(contract: Arrangement): Set<PublicKey> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]

'outState' @ [244:92] ==> val outState: UniversalContract.State defined in net.corda.finance.contracts.universal.UniversalContract.verify[LocalVariableDescriptor]

'details' @ [244:101] ==> public final val details: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.State[PropertyDescriptorImpl]

'all' @ [244:110] ==> public inline fun <T> Iterable<PublicKey>.all(predicate: (PublicKey) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'it' @ [244:116] ==> value-parameter it: PublicKey defined in net.corda.finance.contracts.universal.UniversalContract.verify.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'cmd' @ [244:122] ==> val cmd: AuthenticatedObject<UniversalContract.Commands> defined in net.corda.finance.contracts.universal.UniversalContract.verify[LocalVariableDescriptor]

'signers' @ [244:126] ==> public final val signers: List<PublicKey> defined in net.corda.core.contracts.AuthenticatedObject[DeserializedPropertyDescriptor]

'using' @ [245:21] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'tx' @ [245:65] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.verify[ValueParameterDescriptorImpl]

'inputs' @ [245:68] ==> public open val inputs: List<StateAndRef<ContractState>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'isEmpty' @ [245:75] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'tx' @ [249:31] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.verify[ValueParameterDescriptorImpl]

'inputsOfType' @ [249:34] ==> public final inline fun <reified T : ContractState> inputsOfType(): List<UniversalContract.State> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'single' @ [249:56] ==> public fun <T> List<UniversalContract.State>.single(): UniversalContract.State defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'tx' @ [250:32] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.verify[ValueParameterDescriptorImpl]

'outputsOfType' @ [250:35] ==> public final inline fun <reified T : ContractState> outputsOfType(): List<UniversalContract.State> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'single' @ [250:58] ==> public fun <T> List<UniversalContract.State>.single(): UniversalContract.State defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'requireThat' @ [251:17] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'using' @ [252:21] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'liableParties' @ [253:30] ==> public fun liableParties(contract: Arrangement): Set<PublicKey> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]

'outState' @ [253:44] ==> val outState: UniversalContract.State defined in net.corda.finance.contracts.universal.UniversalContract.verify[LocalVariableDescriptor]

'details' @ [253:53] ==> public final val details: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.State[PropertyDescriptorImpl]

'all' @ [253:62] ==> public inline fun <T> Iterable<PublicKey>.all(predicate: (PublicKey) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'it' @ [253:68] ==> value-parameter it: PublicKey defined in net.corda.finance.contracts.universal.UniversalContract.verify.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'cmd' @ [253:74] ==> val cmd: AuthenticatedObject<UniversalContract.Commands> defined in net.corda.finance.contracts.universal.UniversalContract.verify[LocalVariableDescriptor]

'signers' @ [253:78] ==> public final val signers: List<PublicKey> defined in net.corda.core.contracts.AuthenticatedObject[DeserializedPropertyDescriptor]

'using' @ [254:21] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'replaceParty' @ [255:30] ==> public fun replaceParty(arrangement: Arrangement, from: Party, to: Party): Arrangement defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'inState' @ [255:43] ==> val inState: UniversalContract.State defined in net.corda.finance.contracts.universal.UniversalContract.verify[LocalVariableDescriptor]

'details' @ [255:51] ==> public final val details: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.State[PropertyDescriptorImpl]

'value' @ [255:60] ==> val value: UniversalContract.Commands defined in net.corda.finance.contracts.universal.UniversalContract.verify[LocalVariableDescriptor]

'from' @ [255:66] ==> public final val from: Party defined in net.corda.finance.contracts.universal.UniversalContract.Commands.Move[PropertyDescriptorImpl]

'value' @ [255:72] ==> val value: UniversalContract.Commands defined in net.corda.finance.contracts.universal.UniversalContract.verify[LocalVariableDescriptor]

'to' @ [255:78] ==> public final val to: Party defined in net.corda.finance.contracts.universal.UniversalContract.Commands.Move[PropertyDescriptorImpl]

'equals' @ [255:82] ==> public open fun equals(other: Any?): Boolean defined in net.corda.finance.contracts.universal.Arrangement[DeserializedSimpleFunctionDescriptor]

'outState' @ [255:89] ==> val outState: UniversalContract.State defined in net.corda.finance.contracts.universal.UniversalContract.verify[LocalVariableDescriptor]

'details' @ [255:98] ==> public final val details: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.State[PropertyDescriptorImpl]

'tx' @ [259:31] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.verify[ValueParameterDescriptorImpl]

'inputsOfType' @ [259:34] ==> public final inline fun <reified T : ContractState> inputsOfType(): List<UniversalContract.State> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'single' @ [259:56] ==> public fun <T> List<UniversalContract.State>.single(): UniversalContract.State defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'when (inState.details) {
                    is Actions -> inState.details
                    is RollOut -> reduceRollOut(inState.details)
                    else -> throw IllegalArgumentException("Unexpected arrangement, " + tx.inputs.single())
                }' @ [260:27] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Arrangement, entry1: Arrangement, entry2: Arrangement): Arrangement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Arrangement

'inState' @ [260:33] ==> val inState: UniversalContract.State defined in net.corda.finance.contracts.universal.UniversalContract.verify[LocalVariableDescriptor]

'details' @ [260:41] ==> public final val details: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.State[PropertyDescriptorImpl]

'inState' @ [261:35] ==> val inState: UniversalContract.State defined in net.corda.finance.contracts.universal.UniversalContract.verify[LocalVariableDescriptor]

'details' @ [261:43] ==> public final val details: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.State[PropertyDescriptorImpl]

'reduceRollOut' @ [262:35] ==> public final fun reduceRollOut(rollOut: RollOut): Arrangement defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]

'inState' @ [262:49] ==> val inState: UniversalContract.State defined in net.corda.finance.contracts.universal.UniversalContract.verify[LocalVariableDescriptor]

'details' @ [262:57] ==> public final val details: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.State[PropertyDescriptorImpl]

'IllegalArgumentException' @ [263:35] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'+' @ [263:60] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'tx' @ [263:89] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.verify[ValueParameterDescriptorImpl]

'inputs' @ [263:92] ==> public open val inputs: List<StateAndRef<ContractState>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'single' @ [263:99] ==> public fun <T> List<StateAndRef<ContractState>>.single(): StateAndRef<ContractState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'tx' @ [265:32] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.verify[ValueParameterDescriptorImpl]

'outputsOfType' @ [265:35] ==> public final inline fun <reified T : ContractState> outputsOfType(): List<UniversalContract.State> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'single' @ [265:58] ==> public fun <T> List<UniversalContract.State>.single(): UniversalContract.State defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'value' @ [267:35] ==> val value: UniversalContract.Commands defined in net.corda.finance.contracts.universal.UniversalContract.verify[LocalVariableDescriptor]

'fixes' @ [267:41] ==> public final val fixes: List<Fix> defined in net.corda.finance.contracts.universal.UniversalContract.Commands.Fix[PropertyDescriptorImpl]

'map' @ [267:47] ==> public inline fun <T, R> Iterable<Fix>.map(transform: (Fix) -> FixOf): List<FixOf> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Fix
    <R> -> FixOf

'it' @ [267:53] ==> value-parameter it: Fix defined in net.corda.finance.contracts.universal.UniversalContract.verify.<anonymous>[ValueParameterDescriptorImpl]

'of' @ [267:56] ==> public final val of: FixOf defined in net.corda.finance.contracts.Fix[DeserializedPropertyDescriptor]

'toMutableSet' @ [267:61] ==> public fun <T> Iterable<FixOf>.toMutableSet(): MutableSet<FixOf> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FixOf

'replaceFixing' @ [268:35] ==> public final fun replaceFixing(tx: LedgerTransaction, arr: Arrangement, fixings: Map<FixOf, BigDecimal>, unusedFixings: MutableSet<FixOf>): Arrangement defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]

'tx' @ [268:49] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.verify[ValueParameterDescriptorImpl]

'arr' @ [268:53] ==> val arr: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.verify[LocalVariableDescriptor]

'value' @ [269:25] ==> val value: UniversalContract.Commands defined in net.corda.finance.contracts.universal.UniversalContract.verify[LocalVariableDescriptor]

'fixes' @ [269:31] ==> public final val fixes: List<Fix> defined in net.corda.finance.contracts.universal.UniversalContract.Commands.Fix[PropertyDescriptorImpl]

'associateBy' @ [269:37] ==> public inline fun <T, K, V> Iterable<Fix>.associateBy(keySelector: (Fix) -> FixOf, valueTransform: (Fix) -> BigDecimal): Map<FixOf, BigDecimal> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Fix
    <K> -> FixOf
    <V> -> BigDecimal

'it' @ [269:51] ==> value-parameter it: Fix defined in net.corda.finance.contracts.universal.UniversalContract.verify.<anonymous>[ValueParameterDescriptorImpl]

'of' @ [269:54] ==> public final val of: FixOf defined in net.corda.finance.contracts.Fix[DeserializedPropertyDescriptor]

'it' @ [269:62] ==> value-parameter it: Fix defined in net.corda.finance.contracts.universal.UniversalContract.verify.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [269:65] ==> public final val value: BigDecimal defined in net.corda.finance.contracts.Fix[DeserializedPropertyDescriptor]

'unusedFixes' @ [269:75] ==> val unusedFixes: MutableSet<FixOf> defined in net.corda.finance.contracts.universal.UniversalContract.verify[LocalVariableDescriptor]

'requireThat' @ [271:17] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'using' @ [272:21] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'unusedFixes' @ [272:62] ==> val unusedFixes: MutableSet<FixOf> defined in net.corda.finance.contracts.universal.UniversalContract.verify[LocalVariableDescriptor]

'isEmpty' @ [272:74] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'using' @ [273:21] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'expectedArr' @ [274:30] ==> val expectedArr: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.verify[LocalVariableDescriptor]

'equals' @ [274:42] ==> public open fun equals(other: Any?): Boolean defined in net.corda.finance.contracts.universal.Arrangement[DeserializedSimpleFunctionDescriptor]

'outState' @ [274:49] ==> val outState: UniversalContract.State defined in net.corda.finance.contracts.universal.UniversalContract.verify[LocalVariableDescriptor]

'details' @ [274:58] ==> public final val details: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.State[PropertyDescriptorImpl]

'IllegalArgumentException' @ [277:27] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'Suppress' @ [281:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'when (perceivable) {
                is Const -> perceivable
                is UnaryPlus -> UnaryPlus(replaceFixing(tx, perceivable.arg, fixings, unusedFixings))
                is PerceivableOperation -> PerceivableOperation(replaceFixing(tx, perceivable.left, fixings, unusedFixings),
                        perceivable.op, replaceFixing(tx, perceivable.right, fixings, unusedFixings))
                is Interest -> Interest(replaceFixing(tx, perceivable.amount, fixings, unusedFixings),
                        perceivable.dayCountConvention, replaceFixing(tx, perceivable.interest, fixings, unusedFixings),
                        perceivable.start, perceivable.end) as Perceivable<T>
                is Fixing -> {
                    val dt = eval(tx, perceivable.date)
                    if (dt != null && fixings.containsKey(FixOf(perceivable.source, dt.toLocalDate(), perceivable.tenor))) {
                        unusedFixings.remove(FixOf(perceivable.source, dt.toLocalDate(), perceivable.tenor))
                        Const(fixings[FixOf(perceivable.source, dt.toLocalDate(), perceivable.tenor)]!!) as Perceivable<T>
                    } else perceivable
                }
                else -> throw NotImplementedError("replaceFixing - " + perceivable.javaClass.name)
            }' @ [284:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Perceivable<T>, entry1: Perceivable<T>, entry2: Perceivable<T>, entry3: Perceivable<T>, entry4: Perceivable<T>, entry5: Perceivable<T>): Perceivable<T>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Perceivable<T>

'perceivable' @ [284:19] ==> value-parameter perceivable: Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'perceivable' @ [285:29] ==> value-parameter perceivable: Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'UnaryPlus' @ [286:33] ==> public constructor UnaryPlus<T>(arg: Perceivable<T>) defined in net.corda.finance.contracts.universal.UnaryPlus[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T

'replaceFixing' @ [286:43] ==> @Suppress public final fun <T> replaceFixing(tx: LedgerTransaction, perceivable: Perceivable<T>, fixings: Map<FixOf, BigDecimal>, unusedFixings: MutableSet<FixOf>): Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'tx' @ [286:57] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'perceivable' @ [286:61] ==> value-parameter perceivable: Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'arg' @ [286:73] ==> public final val arg: Perceivable<T> defined in net.corda.finance.contracts.universal.UnaryPlus[PropertyDescriptorImpl]

'fixings' @ [286:78] ==> value-parameter fixings: Map<FixOf, BigDecimal> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'unusedFixings' @ [286:87] ==> value-parameter unusedFixings: MutableSet<FixOf> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'PerceivableOperation' @ [287:44] ==> public constructor PerceivableOperation<T>(left: Perceivable<T>, op: Operation, right: Perceivable<T>) defined in net.corda.finance.contracts.universal.PerceivableOperation[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T

'replaceFixing' @ [287:65] ==> @Suppress public final fun <T> replaceFixing(tx: LedgerTransaction, perceivable: Perceivable<T>, fixings: Map<FixOf, BigDecimal>, unusedFixings: MutableSet<FixOf>): Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'tx' @ [287:79] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'perceivable' @ [287:83] ==> value-parameter perceivable: Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'left' @ [287:95] ==> public final val left: Perceivable<T> defined in net.corda.finance.contracts.universal.PerceivableOperation[PropertyDescriptorImpl]

'fixings' @ [287:101] ==> value-parameter fixings: Map<FixOf, BigDecimal> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'unusedFixings' @ [287:110] ==> value-parameter unusedFixings: MutableSet<FixOf> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'perceivable' @ [288:25] ==> value-parameter perceivable: Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'op' @ [288:37] ==> public final val op: Operation defined in net.corda.finance.contracts.universal.PerceivableOperation[PropertyDescriptorImpl]

'replaceFixing' @ [288:41] ==> @Suppress public final fun <T> replaceFixing(tx: LedgerTransaction, perceivable: Perceivable<T>, fixings: Map<FixOf, BigDecimal>, unusedFixings: MutableSet<FixOf>): Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'tx' @ [288:55] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'perceivable' @ [288:59] ==> value-parameter perceivable: Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'right' @ [288:71] ==> public final val right: Perceivable<T> defined in net.corda.finance.contracts.universal.PerceivableOperation[PropertyDescriptorImpl]

'fixings' @ [288:78] ==> value-parameter fixings: Map<FixOf, BigDecimal> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'unusedFixings' @ [288:87] ==> value-parameter unusedFixings: MutableSet<FixOf> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'Interest' @ [289:32] ==> public constructor Interest(amount: Perceivable<BigDecimal>, dayCountConvention: String, interest: Perceivable<BigDecimal>, start: Perceivable<Instant>, end: Perceivable<Instant>) defined in net.corda.finance.contracts.universal.Interest[ClassConstructorDescriptorImpl]

'replaceFixing' @ [289:41] ==> @Suppress public final fun <T> replaceFixing(tx: LedgerTransaction, perceivable: Perceivable<BigDecimal>, fixings: Map<FixOf, BigDecimal>, unusedFixings: MutableSet<FixOf>): Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> BigDecimal

'tx' @ [289:55] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'perceivable' @ [289:59] ==> value-parameter perceivable: Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'amount' @ [289:71] ==> public final val amount: Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal.Interest[PropertyDescriptorImpl]

'fixings' @ [289:79] ==> value-parameter fixings: Map<FixOf, BigDecimal> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'unusedFixings' @ [289:88] ==> value-parameter unusedFixings: MutableSet<FixOf> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'perceivable' @ [290:25] ==> value-parameter perceivable: Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'dayCountConvention' @ [290:37] ==> public final val dayCountConvention: String defined in net.corda.finance.contracts.universal.Interest[PropertyDescriptorImpl]

'replaceFixing' @ [290:57] ==> @Suppress public final fun <T> replaceFixing(tx: LedgerTransaction, perceivable: Perceivable<BigDecimal>, fixings: Map<FixOf, BigDecimal>, unusedFixings: MutableSet<FixOf>): Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> BigDecimal

'tx' @ [290:71] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'perceivable' @ [290:75] ==> value-parameter perceivable: Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'interest' @ [290:87] ==> public final val interest: Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal.Interest[PropertyDescriptorImpl]

'fixings' @ [290:97] ==> value-parameter fixings: Map<FixOf, BigDecimal> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'unusedFixings' @ [290:106] ==> value-parameter unusedFixings: MutableSet<FixOf> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'perceivable' @ [291:25] ==> value-parameter perceivable: Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'start' @ [291:37] ==> public final val start: Perceivable<Instant> defined in net.corda.finance.contracts.universal.Interest[PropertyDescriptorImpl]

'perceivable' @ [291:44] ==> value-parameter perceivable: Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'end' @ [291:56] ==> public final val end: Perceivable<Instant> defined in net.corda.finance.contracts.universal.Interest[PropertyDescriptorImpl]

'eval' @ [293:30] ==> public final fun eval(@Suppress tx: LedgerTransaction, expr: Perceivable<Instant>): Instant? defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]

'tx' @ [293:35] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'perceivable' @ [293:39] ==> value-parameter perceivable: Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'date' @ [293:51] ==> public final val date: Perceivable<Instant> defined in net.corda.finance.contracts.universal.Fixing[PropertyDescriptorImpl]

'if (dt != null && fixings.containsKey(FixOf(perceivable.source, dt.toLocalDate(), perceivable.tenor))) {
                        unusedFixings.remove(FixOf(perceivable.source, dt.toLocalDate(), perceivable.tenor))
                        Const(fixings[FixOf(perceivable.source, dt.toLocalDate(), perceivable.tenor)]!!) as Perceivable<T>
                    } else perceivable' @ [294:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Perceivable<T>, elseBranch: Perceivable<T>): Perceivable<T>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Perceivable<T>

'dt' @ [294:25] ==> val dt: Instant? defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[LocalVariableDescriptor]

'fixings' @ [294:39] ==> value-parameter fixings: Map<FixOf, BigDecimal> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'containsKey' @ [294:47] ==> public abstract fun containsKey(key: FixOf): Boolean defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'FixOf' @ [294:59] ==> public constructor FixOf(name: String, forDay: LocalDate, ofTenor: Tenor) defined in net.corda.finance.contracts.FixOf[DeserializedClassConstructorDescriptor]

'perceivable' @ [294:65] ==> value-parameter perceivable: Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'source' @ [294:77] ==> public final val source: String defined in net.corda.finance.contracts.universal.Fixing[PropertyDescriptorImpl]

'dt' @ [294:85] ==> val dt: Instant? defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[LocalVariableDescriptor]

'toLocalDate' @ [294:88] ==> public fun Instant.toLocalDate(): LocalDate defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'perceivable' @ [294:103] ==> value-parameter perceivable: Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'tenor' @ [294:115] ==> public final val tenor: Tenor defined in net.corda.finance.contracts.universal.Fixing[PropertyDescriptorImpl]

'unusedFixings' @ [295:25] ==> value-parameter unusedFixings: MutableSet<FixOf> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'remove' @ [295:39] ==> public abstract fun remove(element: FixOf): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'FixOf' @ [295:46] ==> public constructor FixOf(name: String, forDay: LocalDate, ofTenor: Tenor) defined in net.corda.finance.contracts.FixOf[DeserializedClassConstructorDescriptor]

'perceivable' @ [295:52] ==> value-parameter perceivable: Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'source' @ [295:64] ==> public final val source: String defined in net.corda.finance.contracts.universal.Fixing[PropertyDescriptorImpl]

'dt' @ [295:72] ==> val dt: Instant? defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[LocalVariableDescriptor]

'toLocalDate' @ [295:75] ==> public fun Instant.toLocalDate(): LocalDate defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'perceivable' @ [295:90] ==> value-parameter perceivable: Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'tenor' @ [295:102] ==> public final val tenor: Tenor defined in net.corda.finance.contracts.universal.Fixing[PropertyDescriptorImpl]

'Const' @ [296:25] ==> public constructor Const<T>(value: BigDecimal) defined in net.corda.finance.contracts.universal.Const[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> BigDecimal

'fixings' @ [296:31] ==> value-parameter fixings: Map<FixOf, BigDecimal> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'FixOf' @ [296:39] ==> public constructor FixOf(name: String, forDay: LocalDate, ofTenor: Tenor) defined in net.corda.finance.contracts.FixOf[DeserializedClassConstructorDescriptor]

'perceivable' @ [296:45] ==> value-parameter perceivable: Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'source' @ [296:57] ==> public final val source: String defined in net.corda.finance.contracts.universal.Fixing[PropertyDescriptorImpl]

'dt' @ [296:65] ==> val dt: Instant? defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[LocalVariableDescriptor]

'toLocalDate' @ [296:68] ==> public fun Instant.toLocalDate(): LocalDate defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'perceivable' @ [296:83] ==> value-parameter perceivable: Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'tenor' @ [296:95] ==> public final val tenor: Tenor defined in net.corda.finance.contracts.universal.Fixing[PropertyDescriptorImpl]

'perceivable' @ [297:28] ==> value-parameter perceivable: Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'NotImplementedError' @ [299:31] ==> public constructor NotImplementedError(message: String = ...) defined in kotlin.NotImplementedError[DeserializedClassConstructorDescriptor]

'+' @ [299:51] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'perceivable' @ [299:72] ==> value-parameter perceivable: Perceivable<T> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'javaClass' @ [299:84] ==> public val <T : Any> Perceivable<T>.javaClass: Class<Perceivable<T>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Perceivable<T>

'name' @ [299:94] ==> public final val <T : (Any..Any?)> Class<Perceivable<T>>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Perceivable<T>

'Action' @ [304:13] ==> public constructor Action(name: String, condition: Perceivable<Boolean>, arrangement: Arrangement) defined in net.corda.finance.contracts.universal.Action[ClassConstructorDescriptorImpl]

'arr' @ [304:20] ==> value-parameter arr: Action defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'name' @ [304:24] ==> public final val name: String defined in net.corda.finance.contracts.universal.Action[PropertyDescriptorImpl]

'replaceFixing' @ [304:30] ==> @Suppress public final fun <T> replaceFixing(tx: LedgerTransaction, perceivable: Perceivable<Boolean>, fixings: Map<FixOf, BigDecimal>, unusedFixings: MutableSet<FixOf>): Perceivable<Boolean> defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Boolean

'tx' @ [304:44] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'arr' @ [304:48] ==> value-parameter arr: Action defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'condition' @ [304:52] ==> public final val condition: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.Action[PropertyDescriptorImpl]

'fixings' @ [304:63] ==> value-parameter fixings: Map<FixOf, BigDecimal> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'unusedFixings' @ [304:72] ==> value-parameter unusedFixings: MutableSet<FixOf> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'replaceFixing' @ [304:88] ==> public final fun replaceFixing(tx: LedgerTransaction, arr: Arrangement, fixings: Map<FixOf, BigDecimal>, unusedFixings: MutableSet<FixOf>): Arrangement defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]

'tx' @ [304:102] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'arr' @ [304:106] ==> value-parameter arr: Action defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'arrangement' @ [304:110] ==> public final val arrangement: Arrangement defined in net.corda.finance.contracts.universal.Action[PropertyDescriptorImpl]

'fixings' @ [304:123] ==> value-parameter fixings: Map<FixOf, BigDecimal> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'unusedFixings' @ [304:132] ==> value-parameter unusedFixings: MutableSet<FixOf> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'when (arr) {
                is Zero -> arr
                is And -> And(arr.arrangements.map { replaceFixing(tx, it, fixings, unusedFixings) }.toSet())
                is Obligation -> Obligation(replaceFixing(tx, arr.amount, fixings, unusedFixings), arr.currency, arr.from, arr.to)
                is Actions -> Actions(arr.actions.map { Action(it.name, it.condition, replaceFixing(tx, it.arrangement, fixings, unusedFixings)) }.toSet())
                is RollOut -> RollOut(arr.startDate, arr.endDate, arr.frequency, replaceFixing(tx, arr.template, fixings, unusedFixings))
                is Continuation -> arr
                else -> throw NotImplementedError("replaceFixing - " + arr.javaClass.name)
            }' @ [308:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Arrangement, entry1: Arrangement, entry2: Arrangement, entry3: Arrangement, entry4: Arrangement, entry5: Arrangement, entry6: Arrangement): Arrangement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Arrangement

'arr' @ [308:19] ==> value-parameter arr: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'arr' @ [309:28] ==> value-parameter arr: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'And' @ [310:27] ==> public constructor And(arrangements: Set<Arrangement>) defined in net.corda.finance.contracts.universal.And[ClassConstructorDescriptorImpl]

'arr' @ [310:31] ==> value-parameter arr: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'arrangements' @ [310:35] ==> public final val arrangements: Set<Arrangement> defined in net.corda.finance.contracts.universal.And[PropertyDescriptorImpl]

'map' @ [310:48] ==> public inline fun <T, R> Iterable<Arrangement>.map(transform: (Arrangement) -> Arrangement): List<Arrangement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Arrangement
    <R> -> Arrangement

'replaceFixing' @ [310:54] ==> public final fun replaceFixing(tx: LedgerTransaction, arr: Arrangement, fixings: Map<FixOf, BigDecimal>, unusedFixings: MutableSet<FixOf>): Arrangement defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]

'tx' @ [310:68] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'it' @ [310:72] ==> value-parameter it: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing.<anonymous>[ValueParameterDescriptorImpl]

'fixings' @ [310:76] ==> value-parameter fixings: Map<FixOf, BigDecimal> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'unusedFixings' @ [310:85] ==> value-parameter unusedFixings: MutableSet<FixOf> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'toSet' @ [310:102] ==> public fun <T> Iterable<Arrangement>.toSet(): Set<Arrangement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Arrangement

'Obligation' @ [311:34] ==> public constructor Obligation(amount: Perceivable<BigDecimal>, currency: Currency, from: Party, to: Party) defined in net.corda.finance.contracts.universal.Obligation[ClassConstructorDescriptorImpl]

'replaceFixing' @ [311:45] ==> @Suppress public final fun <T> replaceFixing(tx: LedgerTransaction, perceivable: Perceivable<BigDecimal>, fixings: Map<FixOf, BigDecimal>, unusedFixings: MutableSet<FixOf>): Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> BigDecimal

'tx' @ [311:59] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'arr' @ [311:63] ==> value-parameter arr: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'amount' @ [311:67] ==> public final val amount: Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal.Obligation[PropertyDescriptorImpl]

'fixings' @ [311:75] ==> value-parameter fixings: Map<FixOf, BigDecimal> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'unusedFixings' @ [311:84] ==> value-parameter unusedFixings: MutableSet<FixOf> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'arr' @ [311:100] ==> value-parameter arr: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'currency' @ [311:104] ==> public final val currency: Currency defined in net.corda.finance.contracts.universal.Obligation[PropertyDescriptorImpl]

'arr' @ [311:114] ==> value-parameter arr: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'from' @ [311:118] ==> public final val from: Party defined in net.corda.finance.contracts.universal.Obligation[PropertyDescriptorImpl]

'arr' @ [311:124] ==> value-parameter arr: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'to' @ [311:128] ==> public final val to: Party defined in net.corda.finance.contracts.universal.Obligation[PropertyDescriptorImpl]

'Actions' @ [312:31] ==> public constructor Actions(actions: Set<Action>) defined in net.corda.finance.contracts.universal.Actions[ClassConstructorDescriptorImpl]

'arr' @ [312:39] ==> value-parameter arr: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'actions' @ [312:43] ==> public final val actions: Set<Action> defined in net.corda.finance.contracts.universal.Actions[PropertyDescriptorImpl]

'map' @ [312:51] ==> public inline fun <T, R> Iterable<Action>.map(transform: (Action) -> Action): List<Action> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Action
    <R> -> Action

'Action' @ [312:57] ==> public constructor Action(name: String, condition: Perceivable<Boolean>, arrangement: Arrangement) defined in net.corda.finance.contracts.universal.Action[ClassConstructorDescriptorImpl]

'it' @ [312:64] ==> value-parameter it: Action defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [312:67] ==> public final val name: String defined in net.corda.finance.contracts.universal.Action[PropertyDescriptorImpl]

'it' @ [312:73] ==> value-parameter it: Action defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing.<anonymous>[ValueParameterDescriptorImpl]

'condition' @ [312:76] ==> public final val condition: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.Action[PropertyDescriptorImpl]

'replaceFixing' @ [312:87] ==> public final fun replaceFixing(tx: LedgerTransaction, arr: Arrangement, fixings: Map<FixOf, BigDecimal>, unusedFixings: MutableSet<FixOf>): Arrangement defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]

'tx' @ [312:101] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'it' @ [312:105] ==> value-parameter it: Action defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing.<anonymous>[ValueParameterDescriptorImpl]

'arrangement' @ [312:108] ==> public final val arrangement: Arrangement defined in net.corda.finance.contracts.universal.Action[PropertyDescriptorImpl]

'fixings' @ [312:121] ==> value-parameter fixings: Map<FixOf, BigDecimal> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'unusedFixings' @ [312:130] ==> value-parameter unusedFixings: MutableSet<FixOf> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'toSet' @ [312:148] ==> public fun <T> Iterable<Action>.toSet(): Set<Action> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Action

'RollOut' @ [313:31] ==> public constructor RollOut(startDate: LocalDate, endDate: LocalDate, frequency: Frequency, template: Arrangement) defined in net.corda.finance.contracts.universal.RollOut[ClassConstructorDescriptorImpl]

'arr' @ [313:39] ==> value-parameter arr: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'startDate' @ [313:43] ==> public final val startDate: LocalDate defined in net.corda.finance.contracts.universal.RollOut[PropertyDescriptorImpl]

'arr' @ [313:54] ==> value-parameter arr: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'endDate' @ [313:58] ==> public final val endDate: LocalDate defined in net.corda.finance.contracts.universal.RollOut[PropertyDescriptorImpl]

'arr' @ [313:67] ==> value-parameter arr: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'frequency' @ [313:71] ==> public final val frequency: Frequency defined in net.corda.finance.contracts.universal.RollOut[PropertyDescriptorImpl]

'replaceFixing' @ [313:82] ==> public final fun replaceFixing(tx: LedgerTransaction, arr: Arrangement, fixings: Map<FixOf, BigDecimal>, unusedFixings: MutableSet<FixOf>): Arrangement defined in net.corda.finance.contracts.universal.UniversalContract[SimpleFunctionDescriptorImpl]

'tx' @ [313:96] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'arr' @ [313:100] ==> value-parameter arr: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'template' @ [313:104] ==> public final val template: Arrangement defined in net.corda.finance.contracts.universal.RollOut[PropertyDescriptorImpl]

'fixings' @ [313:114] ==> value-parameter fixings: Map<FixOf, BigDecimal> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'unusedFixings' @ [313:123] ==> value-parameter unusedFixings: MutableSet<FixOf> defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'arr' @ [314:36] ==> value-parameter arr: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'NotImplementedError' @ [315:31] ==> public constructor NotImplementedError(message: String = ...) defined in kotlin.NotImplementedError[DeserializedClassConstructorDescriptor]

'+' @ [315:51] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'arr' @ [315:72] ==> value-parameter arr: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.replaceFixing[ValueParameterDescriptorImpl]

'javaClass' @ [315:76] ==> public val <T : Any> Arrangement.javaClass: Class<Arrangement> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Arrangement

'name' @ [315:86] ==> public final val <T : (Any..Any?)> Class<Arrangement>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Arrangement

'check' @ [319:9] ==> @InlineOnly public inline fun check(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'tx' @ [319:15] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.universal.UniversalContract.generateIssue[ValueParameterDescriptorImpl]

'inputStates' @ [319:18] ==> public final fun inputStates(): List<StateRef> defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'isEmpty' @ [319:32] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'tx' @ [320:9] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.universal.UniversalContract.generateIssue[ValueParameterDescriptorImpl]

'addOutputState' @ [320:12] ==> public final fun addOutputState(state: ContractState): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'State' @ [320:27] ==> public constructor State(participants: List<AbstractParty>, details: Arrangement) defined in net.corda.finance.contracts.universal.UniversalContract.State[ClassConstructorDescriptorImpl]

'listOf' @ [320:33] ==> public fun <T> listOf(element: Party): List<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'notary' @ [320:40] ==> value-parameter notary: Party defined in net.corda.finance.contracts.universal.UniversalContract.generateIssue[ValueParameterDescriptorImpl]

'arrangement' @ [320:49] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.UniversalContract.generateIssue[ValueParameterDescriptorImpl]

'tx' @ [321:9] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.universal.UniversalContract.generateIssue[ValueParameterDescriptorImpl]

'addCommand' @ [321:12] ==> public final fun addCommand(data: CommandData, vararg keys: PublicKey): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'Issue' @ [321:32] ==> public constructor Issue() defined in net.corda.finance.contracts.universal.UniversalContract.Commands.Issue[ClassConstructorDescriptorImpl]

'at' @ [321:41] ==> value-parameter at: PartyAndReference defined in net.corda.finance.contracts.universal.UniversalContract.generateIssue[ValueParameterDescriptorImpl]

'party' @ [321:44] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'owningKey' @ [321:50] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

