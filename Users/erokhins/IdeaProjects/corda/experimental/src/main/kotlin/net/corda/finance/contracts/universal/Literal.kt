'BigDecimal' @ [10:31] ==> public constructor BigDecimal(p0: Int) defined in java.math.BigDecimal[JavaClassConstructorDescriptor]

'this' @ [10:42] ==> <this> defined in net.corda.finance.contracts.universal.M[ReceiverParameterDescriptorImpl]

'BigDecimal' @ [10:50] ==> public constructor BigDecimal(p0: Int) defined in java.math.BigDecimal[JavaClassConstructorDescriptor]

'BigDecimal' @ [11:31] ==> public constructor BigDecimal(p0: Int) defined in java.math.BigDecimal[JavaClassConstructorDescriptor]

'this' @ [11:42] ==> <this> defined in net.corda.finance.contracts.universal.K[ReceiverParameterDescriptorImpl]

'BigDecimal' @ [11:50] ==> public constructor BigDecimal(p0: Int) defined in java.math.BigDecimal[JavaClassConstructorDescriptor]

'BigDecimal' @ [13:35] ==> public constructor BigDecimal(p0: Double) defined in java.math.BigDecimal[JavaClassConstructorDescriptor]

'this' @ [13:46] ==> <this> defined in net.corda.finance.contracts.universal.bd[ReceiverParameterDescriptorImpl]

'Zero' @ [15:12] ==> public constructor Zero() defined in net.corda.finance.contracts.universal.Zero[ClassConstructorDescriptorImpl]

'mutableSetOf' @ [18:27] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<Action> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Action

'if (actions.isEmpty())
                zero
            else
                Actions(actions.toSet())' @ [21:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Arrangement, elseBranch: Arrangement): Arrangement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Arrangement

'actions' @ [21:17] ==> private final var actions: MutableSet<Action> defined in net.corda.finance.contracts.universal.ActionsBuilder[PropertyDescriptorImpl]

'isEmpty' @ [21:25] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'zero' @ [22:17] ==> public val zero: Zero defined in net.corda.finance.contracts.universal in file Literal.kt[PropertyDescriptorImpl]

'Actions' @ [24:17] ==> public constructor Actions(actions: Set<Action>) defined in net.corda.finance.contracts.universal.Actions[ClassConstructorDescriptorImpl]

'actions' @ [24:25] ==> private final var actions: MutableSet<Action> defined in net.corda.finance.contracts.universal.ActionsBuilder[PropertyDescriptorImpl]

'toSet' @ [24:33] ==> public fun <T> Iterable<Action>.toSet(): Set<Action> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Action

'ActionBuilder' @ [27:23] ==> public constructor ActionBuilder(actors: Set<Party>) defined in net.corda.finance.contracts.universal.ActionBuilder[ClassConstructorDescriptorImpl]

'setOf' @ [27:37] ==> public fun <T> setOf(element: Party): Set<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'this' @ [27:43] ==> <this> defined in net.corda.finance.contracts.universal.ActionsBuilder.may[ReceiverParameterDescriptorImpl]

'builder' @ [28:9] ==> val builder: ActionBuilder defined in net.corda.finance.contracts.universal.ActionsBuilder.may[LocalVariableDescriptor]

'invoke' @ [28:17] ==> public abstract operator fun ActionBuilder.invoke(): Action defined in kotlin.Function1[FunctionInvokeDescriptor]

'actions' @ [29:9] ==> private final var actions: MutableSet<Action> defined in net.corda.finance.contracts.universal.ActionsBuilder[PropertyDescriptorImpl]

'addAll' @ [29:17] ==> public abstract fun addAll(elements: Collection<Action>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'builder' @ [29:24] ==> val builder: ActionBuilder defined in net.corda.finance.contracts.universal.ActionsBuilder.may[LocalVariableDescriptor]

'actions' @ [29:32] ==> internal final val actions: MutableList<Action> defined in net.corda.finance.contracts.universal.ActionBuilder[PropertyDescriptorImpl]

'builder' @ [30:16] ==> val builder: ActionBuilder defined in net.corda.finance.contracts.universal.ActionsBuilder.may[LocalVariableDescriptor]

'actions' @ [30:24] ==> internal final val actions: MutableList<Action> defined in net.corda.finance.contracts.universal.ActionBuilder[PropertyDescriptorImpl]

'first' @ [30:32] ==> public fun <T> List<Action>.first(): Action defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Action

'ActionBuilder' @ [34:23] ==> public constructor ActionBuilder(actors: Set<Party>) defined in net.corda.finance.contracts.universal.ActionBuilder[ClassConstructorDescriptorImpl]

'this' @ [34:37] ==> <this> defined in net.corda.finance.contracts.universal.ActionsBuilder.may[ReceiverParameterDescriptorImpl]

'builder' @ [35:9] ==> val builder: ActionBuilder defined in net.corda.finance.contracts.universal.ActionsBuilder.may[LocalVariableDescriptor]

'invoke' @ [35:17] ==> public abstract operator fun ActionBuilder.invoke(): Action defined in kotlin.Function1[FunctionInvokeDescriptor]

'actions' @ [36:9] ==> private final var actions: MutableSet<Action> defined in net.corda.finance.contracts.universal.ActionsBuilder[PropertyDescriptorImpl]

'addAll' @ [36:17] ==> public abstract fun addAll(elements: Collection<Action>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'builder' @ [36:24] ==> val builder: ActionBuilder defined in net.corda.finance.contracts.universal.ActionsBuilder.may[LocalVariableDescriptor]

'actions' @ [36:32] ==> internal final val actions: MutableList<Action> defined in net.corda.finance.contracts.universal.ActionBuilder[PropertyDescriptorImpl]

'builder' @ [38:16] ==> val builder: ActionBuilder defined in net.corda.finance.contracts.universal.ActionsBuilder.may[LocalVariableDescriptor]

'actions' @ [38:24] ==> internal final val actions: MutableList<Action> defined in net.corda.finance.contracts.universal.ActionBuilder[PropertyDescriptorImpl]

'first' @ [38:32] ==> public fun <T> List<Action>.first(): Action defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Action

'setOf' @ [41:40] ==> public fun <T> setOf(vararg elements: Party): Set<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'this' @ [41:46] ==> <this> defined in net.corda.finance.contracts.universal.ActionsBuilder.or[ReceiverParameterDescriptorImpl]

'party' @ [41:52] ==> value-parameter party: Party defined in net.corda.finance.contracts.universal.ActionsBuilder.or[ValueParameterDescriptorImpl]

'this' @ [42:45] ==> <this> defined in net.corda.finance.contracts.universal.ActionsBuilder.or[ReceiverParameterDescriptorImpl]

'plus' @ [42:50] ==> public operator fun <T> Set<Party>.plus(element: Party): Set<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'party' @ [42:55] ==> value-parameter party: Party defined in net.corda.finance.contracts.universal.ActionsBuilder.or[ValueParameterDescriptorImpl]

'ContractBuilder' @ [45:17] ==> public constructor ContractBuilder() defined in net.corda.finance.contracts.universal.ContractBuilder[ClassConstructorDescriptorImpl]

'b' @ [46:9] ==> val b: ContractBuilder defined in net.corda.finance.contracts.universal.ActionsBuilder.givenThat[LocalVariableDescriptor]

'invoke' @ [46:11] ==> public abstract operator fun ContractBuilder.invoke(): Arrangement defined in kotlin.Function1[FunctionInvokeDescriptor]

'Action' @ [47:17] ==> public constructor Action(name: String, condition: Perceivable<Boolean>, arrangement: Arrangement) defined in net.corda.finance.contracts.universal.Action[ClassConstructorDescriptorImpl]

'this' @ [47:24] ==> <this> defined in net.corda.finance.contracts.universal.ActionsBuilder.givenThat[ReceiverParameterDescriptorImpl]

'condition' @ [47:30] ==> value-parameter condition: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.ActionsBuilder.givenThat[ValueParameterDescriptorImpl]

'b' @ [47:41] ==> val b: ContractBuilder defined in net.corda.finance.contracts.universal.ActionsBuilder.givenThat[LocalVariableDescriptor]

'final' @ [47:43] ==> public open fun final(): Arrangement defined in net.corda.finance.contracts.universal.ContractBuilder[SimpleFunctionDescriptorImpl]

'actions' @ [48:9] ==> private final var actions: MutableSet<Action> defined in net.corda.finance.contracts.universal.ActionsBuilder[PropertyDescriptorImpl]

'add' @ [48:17] ==> public abstract fun add(element: Action): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'a' @ [48:21] ==> val a: Action defined in net.corda.finance.contracts.universal.ActionsBuilder.givenThat[LocalVariableDescriptor]

'a' @ [49:16] ==> val a: Action defined in net.corda.finance.contracts.universal.ActionsBuilder.givenThat[LocalVariableDescriptor]

'Suppress' @ [53:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'mutableListOf' @ [55:29] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<Arrangement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Arrangement

'contracts' @ [58:9] ==> private final val contracts: MutableList<Arrangement> defined in net.corda.finance.contracts.universal.ContractBuilder[PropertyDescriptorImpl]

'add' @ [58:19] ==> public abstract fun add(element: Arrangement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'this' @ [58:23] ==> <this> defined in net.corda.finance.contracts.universal.ContractBuilder.unaryPlus[ReceiverParameterDescriptorImpl]

'this' @ [59:16] ==> <this> defined in net.corda.finance.contracts.universal.ContractBuilder.unaryPlus[ReceiverParameterDescriptorImpl]

'ActionsBuilder' @ [63:17] ==> public constructor ActionsBuilder() defined in net.corda.finance.contracts.universal.ActionsBuilder[ClassConstructorDescriptorImpl]

'b' @ [64:9] ==> val b: ActionsBuilder defined in net.corda.finance.contracts.universal.ContractBuilder.actions[LocalVariableDescriptor]

'invoke' @ [64:11] ==> public abstract operator fun ActionsBuilder.invoke(): Action defined in kotlin.Function1[FunctionInvokeDescriptor]

'b' @ [65:17] ==> val b: ActionsBuilder defined in net.corda.finance.contracts.universal.ContractBuilder.actions[LocalVariableDescriptor]

'final' @ [65:19] ==> public final fun final(): Arrangement defined in net.corda.finance.contracts.universal.ActionsBuilder[SimpleFunctionDescriptorImpl]

'contracts' @ [66:9] ==> private final val contracts: MutableList<Arrangement> defined in net.corda.finance.contracts.universal.ContractBuilder[PropertyDescriptorImpl]

'add' @ [66:19] ==> public abstract fun add(element: Arrangement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'c' @ [66:23] ==> val c: Arrangement defined in net.corda.finance.contracts.universal.ContractBuilder.actions[LocalVariableDescriptor]

'c' @ [67:16] ==> val c: Arrangement defined in net.corda.finance.contracts.universal.ContractBuilder.actions[LocalVariableDescriptor]

'Obligation' @ [71:17] ==> public constructor Obligation(amount: Perceivable<BigDecimal>, currency: Currency, from: Party, to: Party) defined in net.corda.finance.contracts.universal.Obligation[ClassConstructorDescriptorImpl]

'const' @ [71:28] ==> public fun <T> const(k: BigDecimal): Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> BigDecimal

'amount' @ [71:34] ==> value-parameter amount: BigDecimal defined in net.corda.finance.contracts.universal.ContractBuilder.owes[ValueParameterDescriptorImpl]

'currency' @ [71:43] ==> value-parameter currency: Currency defined in net.corda.finance.contracts.universal.ContractBuilder.owes[ValueParameterDescriptorImpl]

'this' @ [71:53] ==> <this> defined in net.corda.finance.contracts.universal.ContractBuilder.owes[ReceiverParameterDescriptorImpl]

'beneficiary' @ [71:59] ==> value-parameter beneficiary: Party defined in net.corda.finance.contracts.universal.ContractBuilder.owes[ValueParameterDescriptorImpl]

'contracts' @ [72:9] ==> private final val contracts: MutableList<Arrangement> defined in net.corda.finance.contracts.universal.ContractBuilder[PropertyDescriptorImpl]

'add' @ [72:19] ==> public abstract fun add(element: Arrangement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'c' @ [72:23] ==> val c: Obligation defined in net.corda.finance.contracts.universal.ContractBuilder.owes[LocalVariableDescriptor]

'c' @ [73:16] ==> val c: Obligation defined in net.corda.finance.contracts.universal.ContractBuilder.owes[LocalVariableDescriptor]

'Obligation' @ [77:17] ==> public constructor Obligation(amount: Perceivable<BigDecimal>, currency: Currency, from: Party, to: Party) defined in net.corda.finance.contracts.universal.Obligation[ClassConstructorDescriptorImpl]

'amount' @ [77:28] ==> value-parameter amount: Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal.ContractBuilder.owes[ValueParameterDescriptorImpl]

'currency' @ [77:36] ==> value-parameter currency: Currency defined in net.corda.finance.contracts.universal.ContractBuilder.owes[ValueParameterDescriptorImpl]

'this' @ [77:46] ==> <this> defined in net.corda.finance.contracts.universal.ContractBuilder.owes[ReceiverParameterDescriptorImpl]

'beneficiary' @ [77:52] ==> value-parameter beneficiary: Party defined in net.corda.finance.contracts.universal.ContractBuilder.owes[ValueParameterDescriptorImpl]

'contracts' @ [78:9] ==> private final val contracts: MutableList<Arrangement> defined in net.corda.finance.contracts.universal.ContractBuilder[PropertyDescriptorImpl]

'add' @ [78:19] ==> public abstract fun add(element: Arrangement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'c' @ [78:23] ==> val c: Obligation defined in net.corda.finance.contracts.universal.ContractBuilder.owes[LocalVariableDescriptor]

'c' @ [79:16] ==> val c: Obligation defined in net.corda.finance.contracts.universal.ContractBuilder.owes[LocalVariableDescriptor]

'Deprecated' @ [82:5] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'ERROR' @ [82:42] ==> enum entry ERROR defined in kotlin.DeprecationLevel[FakeCallableDescriptorForObject]

'Suppress' @ [83:16] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Suppress' @ [83:60] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Suppress' @ [84:16] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Suppress' @ [84:66] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Deprecated' @ [87:5] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'ERROR' @ [87:42] ==> enum entry ERROR defined in kotlin.DeprecationLevel[FakeCallableDescriptorForObject]

'Suppress' @ [88:28] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Deprecated' @ [91:5] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'ERROR' @ [91:42] ==> enum entry ERROR defined in kotlin.DeprecationLevel[FakeCallableDescriptorForObject]

'Suppress' @ [92:30] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Deprecated' @ [95:5] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'ERROR' @ [95:42] ==> enum entry ERROR defined in kotlin.DeprecationLevel[FakeCallableDescriptorForObject]

'Suppress' @ [96:30] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Suppress' @ [96:72] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Deprecated' @ [99:5] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'ERROR' @ [99:42] ==> enum entry ERROR defined in kotlin.DeprecationLevel[FakeCallableDescriptorForObject]

'Deprecated' @ [103:5] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'ERROR' @ [103:42] ==> enum entry ERROR defined in kotlin.DeprecationLevel[FakeCallableDescriptorForObject]

'StartDate' @ [107:17] ==> public constructor StartDate() defined in net.corda.finance.contracts.universal.StartDate[ClassConstructorDescriptorImpl]

'EndDate' @ [108:15] ==> public constructor EndDate() defined in net.corda.finance.contracts.universal.EndDate[ClassConstructorDescriptorImpl]

'Continuation' @ [111:17] ==> public constructor Continuation() defined in net.corda.finance.contracts.universal.Continuation[ClassConstructorDescriptorImpl]

'contracts' @ [112:9] ==> private final val contracts: MutableList<Arrangement> defined in net.corda.finance.contracts.universal.ContractBuilder[PropertyDescriptorImpl]

'add' @ [112:19] ==> public abstract fun add(element: Arrangement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'c' @ [112:23] ==> val c: Continuation defined in net.corda.finance.contracts.universal.ContractBuilder.next[LocalVariableDescriptor]

'c' @ [113:16] ==> val c: Continuation defined in net.corda.finance.contracts.universal.ContractBuilder.next[LocalVariableDescriptor]

'Suppress' @ [116:19] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Continuation' @ [116:100] ==> public constructor Continuation() defined in net.corda.finance.contracts.universal.Continuation[ClassConstructorDescriptorImpl]

'Suppress' @ [117:23] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Suppress' @ [118:23] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Continuation' @ [118:104] ==> public constructor Continuation() defined in net.corda.finance.contracts.universal.Continuation[ClassConstructorDescriptorImpl]

'Suppress' @ [120:27] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Suppress' @ [121:27] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Suppress' @ [122:27] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Continuation' @ [122:108] ==> public constructor Continuation() defined in net.corda.finance.contracts.universal.Continuation[ClassConstructorDescriptorImpl]

'RollOutBuilder' @ [125:17] ==> public constructor RollOutBuilder<T>(startDate: LocalDate, endDate: LocalDate, frequency: Frequency, vars: Dummy) defined in net.corda.finance.contracts.universal.RollOutBuilder[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> Dummy

'startDate' @ [125:32] ==> value-parameter startDate: LocalDate defined in net.corda.finance.contracts.universal.ContractBuilder.rollOut[ValueParameterDescriptorImpl]

'endDate' @ [125:43] ==> value-parameter endDate: LocalDate defined in net.corda.finance.contracts.universal.ContractBuilder.rollOut[ValueParameterDescriptorImpl]

'frequency' @ [125:52] ==> value-parameter frequency: Frequency defined in net.corda.finance.contracts.universal.ContractBuilder.rollOut[ValueParameterDescriptorImpl]

'Dummy' @ [125:63] ==> public constructor Dummy() defined in net.corda.finance.contracts.universal.Dummy[ClassConstructorDescriptorImpl]

'b' @ [126:9] ==> val b: RollOutBuilder<Dummy> defined in net.corda.finance.contracts.universal.ContractBuilder.rollOut[LocalVariableDescriptor]

'invoke' @ [126:11] ==> public abstract operator fun RollOutBuilder<Dummy>.invoke(): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'b' @ [127:17] ==> val b: RollOutBuilder<Dummy> defined in net.corda.finance.contracts.universal.ContractBuilder.rollOut[LocalVariableDescriptor]

'final' @ [127:19] ==> public open fun final(): RollOut defined in net.corda.finance.contracts.universal.RollOutBuilder[SimpleFunctionDescriptorImpl]

'contracts' @ [128:9] ==> private final val contracts: MutableList<Arrangement> defined in net.corda.finance.contracts.universal.ContractBuilder[PropertyDescriptorImpl]

'add' @ [128:19] ==> public abstract fun add(element: Arrangement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'c' @ [128:23] ==> val c: RollOut defined in net.corda.finance.contracts.universal.ContractBuilder.rollOut[LocalVariableDescriptor]

'c' @ [129:16] ==> val c: RollOut defined in net.corda.finance.contracts.universal.ContractBuilder.rollOut[LocalVariableDescriptor]

'RollOutBuilder' @ [133:17] ==> public constructor RollOutBuilder<T>(startDate: LocalDate, endDate: LocalDate, frequency: Frequency, vars: T) defined in net.corda.finance.contracts.universal.RollOutBuilder[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T

'startDate' @ [133:32] ==> value-parameter startDate: LocalDate defined in net.corda.finance.contracts.universal.ContractBuilder.rollOut[ValueParameterDescriptorImpl]

'endDate' @ [133:43] ==> value-parameter endDate: LocalDate defined in net.corda.finance.contracts.universal.ContractBuilder.rollOut[ValueParameterDescriptorImpl]

'frequency' @ [133:52] ==> value-parameter frequency: Frequency defined in net.corda.finance.contracts.universal.ContractBuilder.rollOut[ValueParameterDescriptorImpl]

'vars' @ [133:63] ==> value-parameter vars: T defined in net.corda.finance.contracts.universal.ContractBuilder.rollOut[ValueParameterDescriptorImpl]

'b' @ [134:9] ==> val b: RollOutBuilder<T> defined in net.corda.finance.contracts.universal.ContractBuilder.rollOut[LocalVariableDescriptor]

'invoke' @ [134:11] ==> public abstract operator fun RollOutBuilder<T>.invoke(): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'b' @ [135:17] ==> val b: RollOutBuilder<T> defined in net.corda.finance.contracts.universal.ContractBuilder.rollOut[LocalVariableDescriptor]

'final' @ [135:19] ==> public open fun final(): RollOut defined in net.corda.finance.contracts.universal.RollOutBuilder[SimpleFunctionDescriptorImpl]

'contracts' @ [136:9] ==> private final val contracts: MutableList<Arrangement> defined in net.corda.finance.contracts.universal.ContractBuilder[PropertyDescriptorImpl]

'add' @ [136:19] ==> public abstract fun add(element: Arrangement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'c' @ [136:23] ==> val c: RollOut defined in net.corda.finance.contracts.universal.ContractBuilder.rollOut[LocalVariableDescriptor]

'c' @ [137:16] ==> val c: RollOut defined in net.corda.finance.contracts.universal.ContractBuilder.rollOut[LocalVariableDescriptor]

'BusinessCalendar' @ [140:38] ==> public companion object defined in net.corda.finance.contracts.BusinessCalendar[FakeCallableDescriptorForObject]

'parseDateFromString' @ [140:55] ==> public final fun parseDateFromString(it: String): LocalDate defined in net.corda.finance.contracts.BusinessCalendar.Companion[DeserializedSimpleFunctionDescriptor]

'this' @ [140:75] ==> <this> defined in net.corda.finance.contracts.universal.ContractBuilder.ld[ReceiverParameterDescriptorImpl]

'when (contracts.size) {
                0 -> zero
                1 -> contracts[0]
                else -> And(contracts.toSet())
            }' @ [143:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Arrangement, entry1: Arrangement, entry2: Arrangement): Arrangement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Arrangement

'contracts' @ [143:19] ==> private final val contracts: MutableList<Arrangement> defined in net.corda.finance.contracts.universal.ContractBuilder[PropertyDescriptorImpl]

'size' @ [143:29] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'zero' @ [144:22] ==> public val zero: Zero defined in net.corda.finance.contracts.universal in file Literal.kt[PropertyDescriptorImpl]

'contracts' @ [145:22] ==> private final val contracts: MutableList<Arrangement> defined in net.corda.finance.contracts.universal.ContractBuilder[PropertyDescriptorImpl]

'And' @ [146:25] ==> public constructor And(arrangements: Set<Arrangement>) defined in net.corda.finance.contracts.universal.And[ClassConstructorDescriptorImpl]

'contracts' @ [146:29] ==> private final val contracts: MutableList<Arrangement> defined in net.corda.finance.contracts.universal.ContractBuilder[PropertyDescriptorImpl]

'toSet' @ [146:39] ==> public fun <T> Iterable<Arrangement>.toSet(): Set<Arrangement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Arrangement

'mutableListOf' @ [156:28] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<Action> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Action

'ContractBuilder' @ [159:17] ==> public constructor ContractBuilder() defined in net.corda.finance.contracts.universal.ContractBuilder[ClassConstructorDescriptorImpl]

'b' @ [160:9] ==> val b: ContractBuilder defined in net.corda.finance.contracts.universal.ActionBuilder.givenThat[LocalVariableDescriptor]

'invoke' @ [160:11] ==> public abstract operator fun ContractBuilder.invoke(): Arrangement defined in kotlin.Function1[FunctionInvokeDescriptor]

'Action' @ [161:17] ==> public constructor Action(name: String, condition: Perceivable<Boolean>, arrangement: Arrangement) defined in net.corda.finance.contracts.universal.Action[ClassConstructorDescriptorImpl]

'this' @ [161:24] ==> <this> defined in net.corda.finance.contracts.universal.ActionBuilder.givenThat[ReceiverParameterDescriptorImpl]

'condition' @ [161:30] ==> value-parameter condition: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.ActionBuilder.givenThat[ValueParameterDescriptorImpl]

'signedByOneOf' @ [161:44] ==> public fun signedByOneOf(actors: Collection<Party>): Perceivable<Boolean> defined in net.corda.finance.contracts.universal in file Perceivable.kt[SimpleFunctionDescriptorImpl]

'actors' @ [161:58] ==> public final val actors: Set<Party> defined in net.corda.finance.contracts.universal.ActionBuilder[PropertyDescriptorImpl]

'b' @ [161:67] ==> val b: ContractBuilder defined in net.corda.finance.contracts.universal.ActionBuilder.givenThat[LocalVariableDescriptor]

'final' @ [161:69] ==> public open fun final(): Arrangement defined in net.corda.finance.contracts.universal.ContractBuilder[SimpleFunctionDescriptorImpl]

'actions' @ [162:9] ==> internal final val actions: MutableList<Action> defined in net.corda.finance.contracts.universal.ActionBuilder[PropertyDescriptorImpl]

'add' @ [162:17] ==> public abstract fun add(element: Action): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'a' @ [162:21] ==> val a: Action defined in net.corda.finance.contracts.universal.ActionBuilder.givenThat[LocalVariableDescriptor]

'a' @ [163:16] ==> val a: Action defined in net.corda.finance.contracts.universal.ActionBuilder.givenThat[LocalVariableDescriptor]

'this' @ [167:20] ==> <this> defined in net.corda.finance.contracts.universal.ActionBuilder.givenThat[ReceiverParameterDescriptorImpl]

'actions' @ [170:17] ==> internal final val actions: MutableList<Action> defined in net.corda.finance.contracts.universal.ActionBuilder[PropertyDescriptorImpl]

'add' @ [170:25] ==> public abstract fun add(element: Action): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'Action' @ [170:29] ==> public constructor Action(name: String, condition: Perceivable<Boolean>, arrangement: Arrangement) defined in net.corda.finance.contracts.universal.Action[ClassConstructorDescriptorImpl]

'This' @ [170:36] ==> val This: String defined in net.corda.finance.contracts.universal.ActionBuilder.givenThat[LocalVariableDescriptor]

'condition' @ [170:42] ==> value-parameter condition: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.ActionBuilder.givenThat[ValueParameterDescriptorImpl]

'signedByOneOf' @ [170:56] ==> public fun signedByOneOf(actors: Collection<Party>): Perceivable<Boolean> defined in net.corda.finance.contracts.universal in file Perceivable.kt[SimpleFunctionDescriptorImpl]

'actors' @ [170:70] ==> public final val actors: Set<Party> defined in net.corda.finance.contracts.universal.ActionBuilder[PropertyDescriptorImpl]

'contract' @ [170:79] ==> value-parameter contract: Arrangement defined in net.corda.finance.contracts.universal.ActionBuilder.givenThat.<no name provided>.resolve[ValueParameterDescriptorImpl]

'ContractBuilder' @ [176:17] ==> public constructor ContractBuilder() defined in net.corda.finance.contracts.universal.ContractBuilder[ClassConstructorDescriptorImpl]

'b' @ [177:9] ==> val b: ContractBuilder defined in net.corda.finance.contracts.universal.ActionBuilder.anytime[LocalVariableDescriptor]

'invoke' @ [177:11] ==> public abstract operator fun ContractBuilder.invoke(): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'Action' @ [178:17] ==> public constructor Action(name: String, condition: Perceivable<Boolean>, arrangement: Arrangement) defined in net.corda.finance.contracts.universal.Action[ClassConstructorDescriptorImpl]

'this' @ [178:24] ==> <this> defined in net.corda.finance.contracts.universal.ActionBuilder.anytime[ReceiverParameterDescriptorImpl]

'signedByOneOf' @ [178:30] ==> public fun signedByOneOf(actors: Collection<Party>): Perceivable<Boolean> defined in net.corda.finance.contracts.universal in file Perceivable.kt[SimpleFunctionDescriptorImpl]

'actors' @ [178:44] ==> public final val actors: Set<Party> defined in net.corda.finance.contracts.universal.ActionBuilder[PropertyDescriptorImpl]

'b' @ [178:53] ==> val b: ContractBuilder defined in net.corda.finance.contracts.universal.ActionBuilder.anytime[LocalVariableDescriptor]

'final' @ [178:55] ==> public open fun final(): Arrangement defined in net.corda.finance.contracts.universal.ContractBuilder[SimpleFunctionDescriptorImpl]

'actions' @ [179:9] ==> internal final val actions: MutableList<Action> defined in net.corda.finance.contracts.universal.ActionBuilder[PropertyDescriptorImpl]

'add' @ [179:17] ==> public abstract fun add(element: Action): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'a' @ [179:21] ==> val a: Action defined in net.corda.finance.contracts.universal.ActionBuilder.anytime[LocalVariableDescriptor]

'a' @ [180:16] ==> val a: Action defined in net.corda.finance.contracts.universal.ActionBuilder.anytime[LocalVariableDescriptor]

'ContractBuilder' @ [185:13] ==> public constructor ContractBuilder() defined in net.corda.finance.contracts.universal.ContractBuilder[ClassConstructorDescriptorImpl]

'b' @ [186:5] ==> val b: ContractBuilder defined in net.corda.finance.contracts.universal.arrange[LocalVariableDescriptor]

'invoke' @ [186:7] ==> public abstract operator fun ContractBuilder.invoke(): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'b' @ [187:12] ==> val b: ContractBuilder defined in net.corda.finance.contracts.universal.arrange[LocalVariableDescriptor]

'final' @ [187:14] ==> public open fun final(): Arrangement defined in net.corda.finance.contracts.universal.ContractBuilder[SimpleFunctionDescriptorImpl]

'Parameter' @ [192:26] ==> public constructor Parameter<T>(initialValue: T) defined in net.corda.finance.contracts.universal.Parameter[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T

'v' @ [192:39] ==> value-parameter v: T defined in net.corda.finance.contracts.universal.variable[ValueParameterDescriptorImpl]

'ContractBuilder' @ [194:116] ==> public constructor ContractBuilder() defined in net.corda.finance.contracts.universal.ContractBuilder[ClassConstructorDescriptorImpl]

'RollOut' @ [196:13] ==> public constructor RollOut(startDate: LocalDate, endDate: LocalDate, frequency: Frequency, template: Arrangement) defined in net.corda.finance.contracts.universal.RollOut[ClassConstructorDescriptorImpl]

'startDate' @ [196:21] ==> public final val startDate: LocalDate defined in net.corda.finance.contracts.universal.RollOutBuilder[PropertyDescriptorImpl]

'endDate' @ [196:32] ==> public final val endDate: LocalDate defined in net.corda.finance.contracts.universal.RollOutBuilder[PropertyDescriptorImpl]

'frequency' @ [196:41] ==> public final val frequency: Frequency defined in net.corda.finance.contracts.universal.RollOutBuilder[PropertyDescriptorImpl]

'super' @ [196:52] ==> <this> defined in net.corda.finance.contracts.universal.RollOutBuilder[LazyClassReceiverParameterDescriptor]

'final' @ [196:58] ==> public open fun final(): Arrangement defined in net.corda.finance.contracts.universal.ContractBuilder[SimpleFunctionDescriptorImpl]

