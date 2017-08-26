'CordaSerializable' @ [14:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'CordaSerializable' @ [17:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'other' @ [27:13] ==> value-parameter other: Any? defined in net.corda.finance.contracts.universal.Const.equals[ValueParameterDescriptorImpl]

'value' @ [30:13] ==> public final val value: T defined in net.corda.finance.contracts.universal.Const[PropertyDescriptorImpl]

'other' @ [33:13] ==> value-parameter other: Any? defined in net.corda.finance.contracts.universal.Const.equals[ValueParameterDescriptorImpl]

'value' @ [34:17] ==> public final val value: T defined in net.corda.finance.contracts.universal.Const[PropertyDescriptorImpl]

'other' @ [34:40] ==> value-parameter other: Any? defined in net.corda.finance.contracts.universal.Const.equals[ValueParameterDescriptorImpl]

'value' @ [34:46] ==> public final val value: Any? defined in net.corda.finance.contracts.universal.Const[PropertyDescriptorImpl]

'this' @ [35:24] ==> <this> defined in net.corda.finance.contracts.universal.Const[LazyClassReceiverParameterDescriptor]

'value' @ [35:29] ==> public final val value: T defined in net.corda.finance.contracts.universal.Const[PropertyDescriptorImpl]

'compareTo' @ [35:35] ==> public open fun compareTo(other: (BigDecimal..BigDecimal?)): Int defined in java.math.BigDecimal[JavaMethodDescriptor]

'other' @ [35:45] ==> value-parameter other: Any? defined in net.corda.finance.contracts.universal.Const.equals[ValueParameterDescriptorImpl]

'value' @ [35:51] ==> public final val value: Any? defined in net.corda.finance.contracts.universal.Const[PropertyDescriptorImpl]

'value' @ [37:20] ==> public final val value: T defined in net.corda.finance.contracts.universal.Const[PropertyDescriptorImpl]

'equals' @ [37:28] ==> public open operator fun equals(other: Any?): Boolean defined in kotlin.Any[DeserializedSimpleFunctionDescriptor]

'other' @ [37:35] ==> value-parameter other: Any? defined in net.corda.finance.contracts.universal.Const.equals[ValueParameterDescriptorImpl]

'value' @ [37:41] ==> public final val value: Any? defined in net.corda.finance.contracts.universal.Const[PropertyDescriptorImpl]

'if (value is BigDecimal)
                value.toDouble().hashCode()
            else
                value!!.hashCode()' @ [43:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'value' @ [43:17] ==> public final val value: T defined in net.corda.finance.contracts.universal.Const[PropertyDescriptorImpl]

'value' @ [44:17] ==> public final val value: T defined in net.corda.finance.contracts.universal.Const[PropertyDescriptorImpl]

'toDouble' @ [44:23] ==> public open fun toDouble(): Double defined in java.math.BigDecimal[JavaMethodDescriptor]

'hashCode' @ [44:34] ==> public open fun hashCode(): Int defined in kotlin.Double[DeserializedSimpleFunctionDescriptor]

'value' @ [46:17] ==> public final val value: T defined in net.corda.finance.contracts.universal.Const[PropertyDescriptorImpl]

'hashCode' @ [46:25] ==> public open fun hashCode(): Int defined in kotlin.Any[DeserializedSimpleFunctionDescriptor]

'Const' @ [49:40] ==> public constructor Const<T>(value: T) defined in net.corda.finance.contracts.universal.Const[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T

'k' @ [49:46] ==> value-parameter k: T defined in net.corda.finance.contracts.universal.const[ValueParameterDescriptorImpl]

'Max' @ [55:49] ==> public constructor Max(args: Set<Perceivable<BigDecimal>>) defined in net.corda.finance.contracts.universal.Max[ClassConstructorDescriptorImpl]

'args' @ [55:53] ==> value-parameter vararg args: Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal.max[ValueParameterDescriptorImpl]

'toSet' @ [55:58] ==> public fun <T> Array<out Perceivable<BigDecimal>>.toSet(): Set<Perceivable<BigDecimal>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Perceivable<BigDecimal>

'Min' @ [59:49] ==> public constructor Min(args: Set<Perceivable<BigDecimal>>) defined in net.corda.finance.contracts.universal.Min[ClassConstructorDescriptorImpl]

'args' @ [59:53] ==> value-parameter vararg args: Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal.min[ValueParameterDescriptorImpl]

'toSet' @ [59:58] ==> public fun <T> Array<out Perceivable<BigDecimal>>.toSet(): Set<Perceivable<BigDecimal>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Perceivable<BigDecimal>

'other' @ [67:16] ==> value-parameter other: Any? defined in net.corda.finance.contracts.universal.StartDate.equals[ValueParameterDescriptorImpl]

'other' @ [77:16] ==> value-parameter other: Any? defined in net.corda.finance.contracts.universal.EndDate.equals[ValueParameterDescriptorImpl]

'ActorPerceivable' @ [82:53] ==> public constructor ActorPerceivable(actor: Party) defined in net.corda.finance.contracts.universal.ActorPerceivable[ClassConstructorDescriptorImpl]

'actor' @ [82:70] ==> value-parameter actor: Party defined in net.corda.finance.contracts.universal.signedBy[ValueParameterDescriptorImpl]

'if (actors.size == 0)
            const(true)
        else
            actors.drop(1).fold(signedBy(actors.first())) { total, next -> total or signedBy(next) }' @ [85:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Perceivable<Boolean>, elseBranch: Perceivable<Boolean>): Perceivable<Boolean>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Perceivable<Boolean>

'actors' @ [85:13] ==> value-parameter actors: Collection<Party> defined in net.corda.finance.contracts.universal.signedByOneOf[ValueParameterDescriptorImpl]

'size' @ [85:20] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'const' @ [86:13] ==> public fun <T> const(k: Boolean): Perceivable<Boolean> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Boolean

'actors' @ [88:13] ==> value-parameter actors: Collection<Party> defined in net.corda.finance.contracts.universal.signedByOneOf[ValueParameterDescriptorImpl]

'drop' @ [88:20] ==> public fun <T> Iterable<Party>.drop(n: Int): List<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'fold' @ [88:28] ==> public inline fun <T, R> Iterable<Party>.fold(initial: Perceivable<Boolean>, operation: (Perceivable<Boolean>, Party) -> Perceivable<Boolean>): Perceivable<Boolean> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party
    <R> -> Perceivable<Boolean>

'signedBy' @ [88:33] ==> public fun signedBy(actor: Party): Perceivable<Boolean> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]

'actors' @ [88:42] ==> value-parameter actors: Collection<Party> defined in net.corda.finance.contracts.universal.signedByOneOf[ValueParameterDescriptorImpl]

'first' @ [88:49] ==> public fun <T> Iterable<Party>.first(): Party defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'total' @ [88:76] ==> value-parameter total: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.signedByOneOf.<anonymous>[ValueParameterDescriptorImpl]

'signedBy' @ [88:85] ==> public fun signedBy(actor: Party): Perceivable<Boolean> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]

'next' @ [88:94] ==> value-parameter next: Party defined in net.corda.finance.contracts.universal.signedByOneOf.<anonymous>[ValueParameterDescriptorImpl]

'BusinessCalendar' @ [95:30] ==> public companion object defined in net.corda.finance.contracts.BusinessCalendar[FakeCallableDescriptorForObject]

'parseDateFromString' @ [95:47] ==> public final fun parseDateFromString(it: String): LocalDate defined in net.corda.finance.contracts.BusinessCalendar.Companion[DeserializedSimpleFunctionDescriptor]

'str' @ [95:67] ==> value-parameter str: String defined in net.corda.finance.contracts.universal.parseDate[ValueParameterDescriptorImpl]

'TimePerceivable' @ [97:44] ==> public constructor TimePerceivable(cmp: Comparison, instant: Perceivable<Instant>) defined in net.corda.finance.contracts.universal.TimePerceivable[ClassConstructorDescriptorImpl]

'LTE' @ [97:71] ==> enum entry LTE defined in net.corda.finance.contracts.universal.Comparison[FakeCallableDescriptorForObject]

'expiry' @ [97:76] ==> value-parameter expiry: Perceivable<Instant> defined in net.corda.finance.contracts.universal.before[ValueParameterDescriptorImpl]

'TimePerceivable' @ [98:43] ==> public constructor TimePerceivable(cmp: Comparison, instant: Perceivable<Instant>) defined in net.corda.finance.contracts.universal.TimePerceivable[ClassConstructorDescriptorImpl]

'GTE' @ [98:70] ==> enum entry GTE defined in net.corda.finance.contracts.universal.Comparison[FakeCallableDescriptorForObject]

'expiry' @ [98:75] ==> value-parameter expiry: Perceivable<Instant> defined in net.corda.finance.contracts.universal.after[ValueParameterDescriptorImpl]

'TimePerceivable' @ [99:31] ==> public constructor TimePerceivable(cmp: Comparison, instant: Perceivable<Instant>) defined in net.corda.finance.contracts.universal.TimePerceivable[ClassConstructorDescriptorImpl]

'LTE' @ [99:58] ==> enum entry LTE defined in net.corda.finance.contracts.universal.Comparison[FakeCallableDescriptorForObject]

'const' @ [99:63] ==> public fun <T> const(k: Instant): Perceivable<Instant> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Instant

'expiry' @ [99:69] ==> value-parameter expiry: Instant defined in net.corda.finance.contracts.universal.before[ValueParameterDescriptorImpl]

'TimePerceivable' @ [100:30] ==> public constructor TimePerceivable(cmp: Comparison, instant: Perceivable<Instant>) defined in net.corda.finance.contracts.universal.TimePerceivable[ClassConstructorDescriptorImpl]

'GTE' @ [100:57] ==> enum entry GTE defined in net.corda.finance.contracts.universal.Comparison[FakeCallableDescriptorForObject]

'const' @ [100:62] ==> public fun <T> const(k: Instant): Perceivable<Instant> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Instant

'expiry' @ [100:68] ==> value-parameter expiry: Instant defined in net.corda.finance.contracts.universal.after[ValueParameterDescriptorImpl]

'TimePerceivable' @ [101:33] ==> public constructor TimePerceivable(cmp: Comparison, instant: Perceivable<Instant>) defined in net.corda.finance.contracts.universal.TimePerceivable[ClassConstructorDescriptorImpl]

'LTE' @ [101:60] ==> enum entry LTE defined in net.corda.finance.contracts.universal.Comparison[FakeCallableDescriptorForObject]

'const' @ [101:65] ==> public fun <T> const(k: Instant): Perceivable<Instant> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Instant

'expiry' @ [101:71] ==> value-parameter expiry: LocalDate defined in net.corda.finance.contracts.universal.before[ValueParameterDescriptorImpl]

'toInstant' @ [101:78] ==> public fun LocalDate.toInstant(): Instant defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'TimePerceivable' @ [102:32] ==> public constructor TimePerceivable(cmp: Comparison, instant: Perceivable<Instant>) defined in net.corda.finance.contracts.universal.TimePerceivable[ClassConstructorDescriptorImpl]

'GTE' @ [102:59] ==> enum entry GTE defined in net.corda.finance.contracts.universal.Comparison[FakeCallableDescriptorForObject]

'const' @ [102:64] ==> public fun <T> const(k: Instant): Perceivable<Instant> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Instant

'expiry' @ [102:70] ==> value-parameter expiry: LocalDate defined in net.corda.finance.contracts.universal.after[ValueParameterDescriptorImpl]

'toInstant' @ [102:77] ==> public fun LocalDate.toInstant(): Instant defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'TimePerceivable' @ [103:30] ==> public constructor TimePerceivable(cmp: Comparison, instant: Perceivable<Instant>) defined in net.corda.finance.contracts.universal.TimePerceivable[ClassConstructorDescriptorImpl]

'LTE' @ [103:57] ==> enum entry LTE defined in net.corda.finance.contracts.universal.Comparison[FakeCallableDescriptorForObject]

'const' @ [103:62] ==> public fun <T> const(k: Instant): Perceivable<Instant> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Instant

'parseDate' @ [103:68] ==> public fun parseDate(str: String): LocalDate defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]

'expiry' @ [103:78] ==> value-parameter expiry: String defined in net.corda.finance.contracts.universal.before[ValueParameterDescriptorImpl]

'toInstant' @ [103:86] ==> public fun LocalDate.toInstant(): Instant defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'TimePerceivable' @ [104:29] ==> public constructor TimePerceivable(cmp: Comparison, instant: Perceivable<Instant>) defined in net.corda.finance.contracts.universal.TimePerceivable[ClassConstructorDescriptorImpl]

'GTE' @ [104:56] ==> enum entry GTE defined in net.corda.finance.contracts.universal.Comparison[FakeCallableDescriptorForObject]

'const' @ [104:61] ==> public fun <T> const(k: Instant): Perceivable<Instant> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Instant

'parseDate' @ [104:67] ==> public fun parseDate(str: String): LocalDate defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]

'expiry' @ [104:77] ==> value-parameter expiry: String defined in net.corda.finance.contracts.universal.after[ValueParameterDescriptorImpl]

'toInstant' @ [104:85] ==> public fun LocalDate.toInstant(): Instant defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'PerceivableAnd' @ [108:65] ==> public constructor PerceivableAnd(left: Perceivable<Boolean>, right: Perceivable<Boolean>) defined in net.corda.finance.contracts.universal.PerceivableAnd[ClassConstructorDescriptorImpl]

'this' @ [108:80] ==> <this> defined in net.corda.finance.contracts.universal.and[ReceiverParameterDescriptorImpl]

'obs' @ [108:86] ==> value-parameter obs: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.and[ValueParameterDescriptorImpl]

'PerceivableOr' @ [112:64] ==> public constructor PerceivableOr(left: Perceivable<Boolean>, right: Perceivable<Boolean>) defined in net.corda.finance.contracts.universal.PerceivableOr[ClassConstructorDescriptorImpl]

'this' @ [112:78] ==> <this> defined in net.corda.finance.contracts.universal.or[ReceiverParameterDescriptorImpl]

'obs' @ [112:84] ==> value-parameter obs: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.or[ValueParameterDescriptorImpl]

'CurrencyCross' @ [116:49] ==> public constructor CurrencyCross(foreign: Currency, domestic: Currency) defined in net.corda.finance.contracts.universal.CurrencyCross[ClassConstructorDescriptorImpl]

'this' @ [116:63] ==> <this> defined in net.corda.finance.contracts.universal.div[ReceiverParameterDescriptorImpl]

'currency' @ [116:69] ==> value-parameter currency: Currency defined in net.corda.finance.contracts.universal.div[ValueParameterDescriptorImpl]

'PerceivableComparison' @ [121:5] ==> public constructor PerceivableComparison<T>(left: Perceivable<T>, cmp: Comparison, right: Perceivable<T>, type: Type) defined in net.corda.finance.contracts.universal.PerceivableComparison[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T

'left' @ [121:27] ==> value-parameter left: Perceivable<T> defined in net.corda.finance.contracts.universal.perceivableComparison[ValueParameterDescriptorImpl]

'cmp' @ [121:33] ==> value-parameter cmp: Comparison defined in net.corda.finance.contracts.universal.perceivableComparison[ValueParameterDescriptorImpl]

'right' @ [121:38] ==> value-parameter right: Perceivable<T> defined in net.corda.finance.contracts.universal.perceivableComparison[ValueParameterDescriptorImpl]

'java' @ [121:54] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'perceivableComparison' @ [123:55] ==> public inline fun <reified T : Any> perceivableComparison(left: Perceivable<BigDecimal>, cmp: Comparison, right: Perceivable<BigDecimal>): PerceivableComparison<BigDecimal> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : Any> -> BigDecimal

'this' @ [123:77] ==> <this> defined in net.corda.finance.contracts.universal.lt[ReceiverParameterDescriptorImpl]

'LT' @ [123:94] ==> enum entry LT defined in net.corda.finance.contracts.universal.Comparison[FakeCallableDescriptorForObject]

'const' @ [123:98] ==> public fun <T> const(k: BigDecimal): Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> BigDecimal

'n' @ [123:104] ==> value-parameter n: BigDecimal defined in net.corda.finance.contracts.universal.lt[ValueParameterDescriptorImpl]

'perceivableComparison' @ [124:55] ==> public inline fun <reified T : Any> perceivableComparison(left: Perceivable<BigDecimal>, cmp: Comparison, right: Perceivable<BigDecimal>): PerceivableComparison<BigDecimal> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : Any> -> BigDecimal

'this' @ [124:77] ==> <this> defined in net.corda.finance.contracts.universal.gt[ReceiverParameterDescriptorImpl]

'GT' @ [124:94] ==> enum entry GT defined in net.corda.finance.contracts.universal.Comparison[FakeCallableDescriptorForObject]

'const' @ [124:98] ==> public fun <T> const(k: BigDecimal): Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> BigDecimal

'n' @ [124:104] ==> value-parameter n: BigDecimal defined in net.corda.finance.contracts.universal.gt[ValueParameterDescriptorImpl]

'perceivableComparison' @ [125:51] ==> public inline fun <reified T : Any> perceivableComparison(left: Perceivable<BigDecimal>, cmp: Comparison, right: Perceivable<BigDecimal>): PerceivableComparison<BigDecimal> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : Any> -> BigDecimal

'this' @ [125:73] ==> <this> defined in net.corda.finance.contracts.universal.lt[ReceiverParameterDescriptorImpl]

'LT' @ [125:90] ==> enum entry LT defined in net.corda.finance.contracts.universal.Comparison[FakeCallableDescriptorForObject]

'const' @ [125:94] ==> public fun <T> const(k: BigDecimal): Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> BigDecimal

'BigDecimal' @ [125:100] ==> public constructor BigDecimal(p0: Double) defined in java.math.BigDecimal[JavaClassConstructorDescriptor]

'n' @ [125:111] ==> value-parameter n: Double defined in net.corda.finance.contracts.universal.lt[ValueParameterDescriptorImpl]

'perceivableComparison' @ [126:51] ==> public inline fun <reified T : Any> perceivableComparison(left: Perceivable<BigDecimal>, cmp: Comparison, right: Perceivable<BigDecimal>): PerceivableComparison<BigDecimal> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : Any> -> BigDecimal

'this' @ [126:73] ==> <this> defined in net.corda.finance.contracts.universal.gt[ReceiverParameterDescriptorImpl]

'GT' @ [126:90] ==> enum entry GT defined in net.corda.finance.contracts.universal.Comparison[FakeCallableDescriptorForObject]

'const' @ [126:94] ==> public fun <T> const(k: BigDecimal): Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> BigDecimal

'BigDecimal' @ [126:100] ==> public constructor BigDecimal(p0: Double) defined in java.math.BigDecimal[JavaClassConstructorDescriptor]

'n' @ [126:111] ==> value-parameter n: Double defined in net.corda.finance.contracts.universal.gt[ValueParameterDescriptorImpl]

'perceivableComparison' @ [128:56] ==> public inline fun <reified T : Any> perceivableComparison(left: Perceivable<BigDecimal>, cmp: Comparison, right: Perceivable<BigDecimal>): PerceivableComparison<BigDecimal> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : Any> -> BigDecimal

'this' @ [128:78] ==> <this> defined in net.corda.finance.contracts.universal.lte[ReceiverParameterDescriptorImpl]

'LTE' @ [128:95] ==> enum entry LTE defined in net.corda.finance.contracts.universal.Comparison[FakeCallableDescriptorForObject]

'const' @ [128:100] ==> public fun <T> const(k: BigDecimal): Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> BigDecimal

'n' @ [128:106] ==> value-parameter n: BigDecimal defined in net.corda.finance.contracts.universal.lte[ValueParameterDescriptorImpl]

'perceivableComparison' @ [129:56] ==> public inline fun <reified T : Any> perceivableComparison(left: Perceivable<BigDecimal>, cmp: Comparison, right: Perceivable<BigDecimal>): PerceivableComparison<BigDecimal> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : Any> -> BigDecimal

'this' @ [129:78] ==> <this> defined in net.corda.finance.contracts.universal.gte[ReceiverParameterDescriptorImpl]

'GTE' @ [129:95] ==> enum entry GTE defined in net.corda.finance.contracts.universal.Comparison[FakeCallableDescriptorForObject]

'const' @ [129:100] ==> public fun <T> const(k: BigDecimal): Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> BigDecimal

'n' @ [129:106] ==> value-parameter n: BigDecimal defined in net.corda.finance.contracts.universal.gte[ValueParameterDescriptorImpl]

'perceivableComparison' @ [130:52] ==> public inline fun <reified T : Any> perceivableComparison(left: Perceivable<BigDecimal>, cmp: Comparison, right: Perceivable<BigDecimal>): PerceivableComparison<BigDecimal> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : Any> -> BigDecimal

'this' @ [130:74] ==> <this> defined in net.corda.finance.contracts.universal.lte[ReceiverParameterDescriptorImpl]

'LTE' @ [130:91] ==> enum entry LTE defined in net.corda.finance.contracts.universal.Comparison[FakeCallableDescriptorForObject]

'const' @ [130:96] ==> public fun <T> const(k: BigDecimal): Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> BigDecimal

'BigDecimal' @ [130:102] ==> public constructor BigDecimal(p0: Double) defined in java.math.BigDecimal[JavaClassConstructorDescriptor]

'n' @ [130:113] ==> value-parameter n: Double defined in net.corda.finance.contracts.universal.lte[ValueParameterDescriptorImpl]

'perceivableComparison' @ [131:52] ==> public inline fun <reified T : Any> perceivableComparison(left: Perceivable<BigDecimal>, cmp: Comparison, right: Perceivable<BigDecimal>): PerceivableComparison<BigDecimal> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : Any> -> BigDecimal

'this' @ [131:74] ==> <this> defined in net.corda.finance.contracts.universal.gte[ReceiverParameterDescriptorImpl]

'GTE' @ [131:91] ==> enum entry GTE defined in net.corda.finance.contracts.universal.Comparison[FakeCallableDescriptorForObject]

'const' @ [131:96] ==> public fun <T> const(k: BigDecimal): Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> BigDecimal

'BigDecimal' @ [131:102] ==> public constructor BigDecimal(p0: Double) defined in java.math.BigDecimal[JavaClassConstructorDescriptor]

'n' @ [131:113] ==> value-parameter n: Double defined in net.corda.finance.contracts.universal.gte[ValueParameterDescriptorImpl]

'CordaSerializable' @ [133:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'PerceivableOperation' @ [142:60] ==> public constructor PerceivableOperation<T>(left: Perceivable<BigDecimal>, op: Operation, right: Perceivable<BigDecimal>) defined in net.corda.finance.contracts.universal.PerceivableOperation[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> BigDecimal

'this' @ [142:81] ==> <this> defined in net.corda.finance.contracts.universal.plus[ReceiverParameterDescriptorImpl]

'PLUS' @ [142:97] ==> enum entry PLUS defined in net.corda.finance.contracts.universal.Operation[FakeCallableDescriptorForObject]

'const' @ [142:103] ==> public fun <T> const(k: BigDecimal): Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> BigDecimal

'n' @ [142:109] ==> value-parameter n: BigDecimal defined in net.corda.finance.contracts.universal.plus[ValueParameterDescriptorImpl]

'UnaryPlus' @ [143:33] ==> public constructor UnaryPlus<T>(arg: Perceivable<T>) defined in net.corda.finance.contracts.universal.UnaryPlus[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T

'this' @ [143:43] ==> <this> defined in net.corda.finance.contracts.universal.plus[ReceiverParameterDescriptorImpl]

'PerceivableOperation' @ [144:74] ==> public constructor PerceivableOperation<T>(left: Perceivable<BigDecimal>, op: Operation, right: Perceivable<BigDecimal>) defined in net.corda.finance.contracts.universal.PerceivableOperation[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> BigDecimal

'this' @ [144:95] ==> <this> defined in net.corda.finance.contracts.universal.minus[ReceiverParameterDescriptorImpl]

'MINUS' @ [144:111] ==> enum entry MINUS defined in net.corda.finance.contracts.universal.Operation[FakeCallableDescriptorForObject]

'n' @ [144:118] ==> value-parameter n: Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal.minus[ValueParameterDescriptorImpl]

'PerceivableOperation' @ [145:61] ==> public constructor PerceivableOperation<T>(left: Perceivable<BigDecimal>, op: Operation, right: Perceivable<BigDecimal>) defined in net.corda.finance.contracts.universal.PerceivableOperation[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> BigDecimal

'this' @ [145:82] ==> <this> defined in net.corda.finance.contracts.universal.minus[ReceiverParameterDescriptorImpl]

'MINUS' @ [145:98] ==> enum entry MINUS defined in net.corda.finance.contracts.universal.Operation[FakeCallableDescriptorForObject]

'const' @ [145:105] ==> public fun <T> const(k: BigDecimal): Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> BigDecimal

'n' @ [145:111] ==> value-parameter n: BigDecimal defined in net.corda.finance.contracts.universal.minus[ValueParameterDescriptorImpl]

'PerceivableOperation' @ [146:56] ==> public constructor PerceivableOperation<T>(left: Perceivable<BigDecimal>, op: Operation, right: Perceivable<BigDecimal>) defined in net.corda.finance.contracts.universal.PerceivableOperation[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> BigDecimal

'this' @ [146:77] ==> <this> defined in net.corda.finance.contracts.universal.plus[ReceiverParameterDescriptorImpl]

'PLUS' @ [146:93] ==> enum entry PLUS defined in net.corda.finance.contracts.universal.Operation[FakeCallableDescriptorForObject]

'const' @ [146:99] ==> public fun <T> const(k: BigDecimal): Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> BigDecimal

'BigDecimal' @ [146:105] ==> public constructor BigDecimal(p0: Double) defined in java.math.BigDecimal[JavaClassConstructorDescriptor]

'n' @ [146:116] ==> value-parameter n: Double defined in net.corda.finance.contracts.universal.plus[ValueParameterDescriptorImpl]

'PerceivableOperation' @ [147:57] ==> public constructor PerceivableOperation<T>(left: Perceivable<BigDecimal>, op: Operation, right: Perceivable<BigDecimal>) defined in net.corda.finance.contracts.universal.PerceivableOperation[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> BigDecimal

'this' @ [147:78] ==> <this> defined in net.corda.finance.contracts.universal.minus[ReceiverParameterDescriptorImpl]

'MINUS' @ [147:94] ==> enum entry MINUS defined in net.corda.finance.contracts.universal.Operation[FakeCallableDescriptorForObject]

'const' @ [147:101] ==> public fun <T> const(k: BigDecimal): Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> BigDecimal

'BigDecimal' @ [147:107] ==> public constructor BigDecimal(p0: Double) defined in java.math.BigDecimal[JavaClassConstructorDescriptor]

'n' @ [147:118] ==> value-parameter n: Double defined in net.corda.finance.contracts.universal.minus[ValueParameterDescriptorImpl]

'PerceivableOperation' @ [148:61] ==> public constructor PerceivableOperation<T>(left: Perceivable<BigDecimal>, op: Operation, right: Perceivable<BigDecimal>) defined in net.corda.finance.contracts.universal.PerceivableOperation[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> BigDecimal

'this' @ [148:82] ==> <this> defined in net.corda.finance.contracts.universal.times[ReceiverParameterDescriptorImpl]

'TIMES' @ [148:98] ==> enum entry TIMES defined in net.corda.finance.contracts.universal.Operation[FakeCallableDescriptorForObject]

'const' @ [148:105] ==> public fun <T> const(k: BigDecimal): Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> BigDecimal

'n' @ [148:111] ==> value-parameter n: BigDecimal defined in net.corda.finance.contracts.universal.times[ValueParameterDescriptorImpl]

'PerceivableOperation' @ [149:59] ==> public constructor PerceivableOperation<T>(left: Perceivable<BigDecimal>, op: Operation, right: Perceivable<BigDecimal>) defined in net.corda.finance.contracts.universal.PerceivableOperation[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> BigDecimal

'this' @ [149:80] ==> <this> defined in net.corda.finance.contracts.universal.div[ReceiverParameterDescriptorImpl]

'DIV' @ [149:96] ==> enum entry DIV defined in net.corda.finance.contracts.universal.Operation[FakeCallableDescriptorForObject]

'const' @ [149:101] ==> public fun <T> const(k: BigDecimal): Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> BigDecimal

'n' @ [149:107] ==> value-parameter n: BigDecimal defined in net.corda.finance.contracts.universal.div[ValueParameterDescriptorImpl]

'PerceivableOperation' @ [150:57] ==> public constructor PerceivableOperation<T>(left: Perceivable<BigDecimal>, op: Operation, right: Perceivable<BigDecimal>) defined in net.corda.finance.contracts.universal.PerceivableOperation[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> BigDecimal

'this' @ [150:78] ==> <this> defined in net.corda.finance.contracts.universal.times[ReceiverParameterDescriptorImpl]

'TIMES' @ [150:94] ==> enum entry TIMES defined in net.corda.finance.contracts.universal.Operation[FakeCallableDescriptorForObject]

'const' @ [150:101] ==> public fun <T> const(k: BigDecimal): Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> BigDecimal

'BigDecimal' @ [150:107] ==> public constructor BigDecimal(p0: Double) defined in java.math.BigDecimal[JavaClassConstructorDescriptor]

'n' @ [150:118] ==> value-parameter n: Double defined in net.corda.finance.contracts.universal.times[ValueParameterDescriptorImpl]

'PerceivableOperation' @ [151:55] ==> public constructor PerceivableOperation<T>(left: Perceivable<BigDecimal>, op: Operation, right: Perceivable<BigDecimal>) defined in net.corda.finance.contracts.universal.PerceivableOperation[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> BigDecimal

'this' @ [151:76] ==> <this> defined in net.corda.finance.contracts.universal.div[ReceiverParameterDescriptorImpl]

'DIV' @ [151:92] ==> enum entry DIV defined in net.corda.finance.contracts.universal.Operation[FakeCallableDescriptorForObject]

'const' @ [151:97] ==> public fun <T> const(k: BigDecimal): Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> BigDecimal

'BigDecimal' @ [151:103] ==> public constructor BigDecimal(p0: Double) defined in java.math.BigDecimal[JavaClassConstructorDescriptor]

'n' @ [151:114] ==> value-parameter n: Double defined in net.corda.finance.contracts.universal.div[ValueParameterDescriptorImpl]

'PerceivableOperation' @ [153:46] ==> public constructor PerceivableOperation<T>(left: Perceivable<Int>, op: Operation, right: Perceivable<Int>) defined in net.corda.finance.contracts.universal.PerceivableOperation[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> Int

'this' @ [153:67] ==> <this> defined in net.corda.finance.contracts.universal.plus[ReceiverParameterDescriptorImpl]

'PLUS' @ [153:83] ==> enum entry PLUS defined in net.corda.finance.contracts.universal.Operation[FakeCallableDescriptorForObject]

'const' @ [153:89] ==> public fun <T> const(k: Int): Perceivable<Int> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Int

'n' @ [153:95] ==> value-parameter n: Int defined in net.corda.finance.contracts.universal.plus[ValueParameterDescriptorImpl]

'PerceivableOperation' @ [154:47] ==> public constructor PerceivableOperation<T>(left: Perceivable<Int>, op: Operation, right: Perceivable<Int>) defined in net.corda.finance.contracts.universal.PerceivableOperation[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> Int

'this' @ [154:68] ==> <this> defined in net.corda.finance.contracts.universal.minus[ReceiverParameterDescriptorImpl]

'MINUS' @ [154:84] ==> enum entry MINUS defined in net.corda.finance.contracts.universal.Operation[FakeCallableDescriptorForObject]

'const' @ [154:91] ==> public fun <T> const(k: Int): Perceivable<Int> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Int

'n' @ [154:97] ==> value-parameter n: Int defined in net.corda.finance.contracts.universal.minus[ValueParameterDescriptorImpl]

'Suppress' @ [162:14] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Suppress' @ [162:64] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Suppress' @ [162:122] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Suppress' @ [163:14] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Suppress' @ [163:59] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Interest' @ [163:129] ==> public constructor Interest(amount: Perceivable<BigDecimal>, dayCountConvention: String, interest: Perceivable<BigDecimal>, start: Perceivable<Instant>, end: Perceivable<Instant>) defined in net.corda.finance.contracts.universal.Interest[ClassConstructorDescriptorImpl]

'Const' @ [163:138] ==> public constructor Const<T>(value: BigDecimal) defined in net.corda.finance.contracts.universal.Const[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> BigDecimal

'amount' @ [163:144] ==> value-parameter @Suppress amount: BigDecimal defined in net.corda.finance.contracts.universal.interest[ValueParameterDescriptorImpl]

'dayCountConvention' @ [163:153] ==> value-parameter @Suppress dayCountConvention: String defined in net.corda.finance.contracts.universal.interest[ValueParameterDescriptorImpl]

'Const' @ [163:173] ==> public constructor Const<T>(value: BigDecimal) defined in net.corda.finance.contracts.universal.Const[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> BigDecimal

'interest' @ [163:179] ==> value-parameter @Suppress interest: BigDecimal defined in net.corda.finance.contracts.universal.interest[ValueParameterDescriptorImpl]

'const' @ [163:190] ==> public fun <T> const(k: Instant): Perceivable<Instant> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Instant

'parseDate' @ [163:196] ==> public fun parseDate(str: String): LocalDate defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]

'start' @ [163:206] ==> value-parameter @Suppress start: String defined in net.corda.finance.contracts.universal.interest[ValueParameterDescriptorImpl]

'toInstant' @ [163:213] ==> public fun LocalDate.toInstant(): Instant defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'const' @ [163:227] ==> public fun <T> const(k: Instant): Perceivable<Instant> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Instant

'parseDate' @ [163:233] ==> public fun parseDate(str: String): LocalDate defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]

'end' @ [163:243] ==> value-parameter @Suppress end: String defined in net.corda.finance.contracts.universal.interest[ValueParameterDescriptorImpl]

'toInstant' @ [163:248] ==> public fun LocalDate.toInstant(): Instant defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'Suppress' @ [165:14] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Suppress' @ [165:64] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Suppress' @ [165:122] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Suppress' @ [166:14] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Suppress' @ [166:59] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Interest' @ [167:9] ==> public constructor Interest(amount: Perceivable<BigDecimal>, dayCountConvention: String, interest: Perceivable<BigDecimal>, start: Perceivable<Instant>, end: Perceivable<Instant>) defined in net.corda.finance.contracts.universal.Interest[ClassConstructorDescriptorImpl]

'Const' @ [167:18] ==> public constructor Const<T>(value: BigDecimal) defined in net.corda.finance.contracts.universal.Const[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> BigDecimal

'amount' @ [167:24] ==> value-parameter @Suppress amount: BigDecimal defined in net.corda.finance.contracts.universal.interest[ValueParameterDescriptorImpl]

'dayCountConvention' @ [167:33] ==> value-parameter @Suppress dayCountConvention: String defined in net.corda.finance.contracts.universal.interest[ValueParameterDescriptorImpl]

'interest' @ [167:53] ==> value-parameter @Suppress interest: Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal.interest[ValueParameterDescriptorImpl]

'const' @ [167:63] ==> public fun <T> const(k: Instant): Perceivable<Instant> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Instant

'parseDate' @ [167:69] ==> public fun parseDate(str: String): LocalDate defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]

'start' @ [167:79] ==> value-parameter @Suppress start: String defined in net.corda.finance.contracts.universal.interest[ValueParameterDescriptorImpl]

'toInstant' @ [167:86] ==> public fun LocalDate.toInstant(): Instant defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'const' @ [167:100] ==> public fun <T> const(k: Instant): Perceivable<Instant> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Instant

'parseDate' @ [167:106] ==> public fun parseDate(str: String): LocalDate defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]

'end' @ [167:116] ==> value-parameter @Suppress end: String defined in net.corda.finance.contracts.universal.interest[ValueParameterDescriptorImpl]

'toInstant' @ [167:121] ==> public fun LocalDate.toInstant(): Instant defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'Suppress' @ [169:14] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Suppress' @ [169:64] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Suppress' @ [169:122] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Suppress' @ [170:14] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Suppress' @ [170:73] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Interest' @ [170:157] ==> public constructor Interest(amount: Perceivable<BigDecimal>, dayCountConvention: String, interest: Perceivable<BigDecimal>, start: Perceivable<Instant>, end: Perceivable<Instant>) defined in net.corda.finance.contracts.universal.Interest[ClassConstructorDescriptorImpl]

'const' @ [170:166] ==> public fun <T> const(k: BigDecimal): Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> BigDecimal

'amount' @ [170:172] ==> value-parameter @Suppress amount: BigDecimal defined in net.corda.finance.contracts.universal.interest[ValueParameterDescriptorImpl]

'dayCountConvention' @ [170:181] ==> value-parameter @Suppress dayCountConvention: String defined in net.corda.finance.contracts.universal.interest[ValueParameterDescriptorImpl]

'const' @ [170:201] ==> public fun <T> const(k: BigDecimal): Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> BigDecimal

'interest' @ [170:207] ==> value-parameter @Suppress interest: BigDecimal defined in net.corda.finance.contracts.universal.interest[ValueParameterDescriptorImpl]

'start' @ [170:218] ==> value-parameter @Suppress start: Perceivable<Instant> defined in net.corda.finance.contracts.universal.interest[ValueParameterDescriptorImpl]

'end' @ [170:225] ==> value-parameter @Suppress end: Perceivable<Instant> defined in net.corda.finance.contracts.universal.interest[ValueParameterDescriptorImpl]

'Suppress' @ [172:14] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Suppress' @ [172:64] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Suppress' @ [172:122] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Suppress' @ [173:14] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Suppress' @ [173:73] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Interest' @ [173:157] ==> public constructor Interest(amount: Perceivable<BigDecimal>, dayCountConvention: String, interest: Perceivable<BigDecimal>, start: Perceivable<Instant>, end: Perceivable<Instant>) defined in net.corda.finance.contracts.universal.Interest[ClassConstructorDescriptorImpl]

'const' @ [173:166] ==> public fun <T> const(k: BigDecimal): Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> BigDecimal

'amount' @ [173:172] ==> value-parameter @Suppress amount: BigDecimal defined in net.corda.finance.contracts.universal.interest[ValueParameterDescriptorImpl]

'dayCountConvention' @ [173:181] ==> value-parameter @Suppress dayCountConvention: String defined in net.corda.finance.contracts.universal.interest[ValueParameterDescriptorImpl]

'interest' @ [173:201] ==> value-parameter @Suppress interest: Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal.interest[ValueParameterDescriptorImpl]

'start' @ [173:211] ==> value-parameter @Suppress start: Perceivable<Instant> defined in net.corda.finance.contracts.universal.interest[ValueParameterDescriptorImpl]

'end' @ [173:218] ==> value-parameter @Suppress end: Perceivable<Instant> defined in net.corda.finance.contracts.universal.interest[ValueParameterDescriptorImpl]

'Fixing' @ [178:94] ==> public constructor Fixing(source: String, date: Perceivable<Instant>, tenor: Tenor) defined in net.corda.finance.contracts.universal.Fixing[ClassConstructorDescriptorImpl]

'source' @ [178:101] ==> value-parameter source: String defined in net.corda.finance.contracts.universal.fix[ValueParameterDescriptorImpl]

'date' @ [178:109] ==> value-parameter date: Perceivable<Instant> defined in net.corda.finance.contracts.universal.fix[ValueParameterDescriptorImpl]

'tenor' @ [178:115] ==> value-parameter tenor: Tenor defined in net.corda.finance.contracts.universal.fix[ValueParameterDescriptorImpl]

'Fixing' @ [179:83] ==> public constructor Fixing(source: String, date: Perceivable<Instant>, tenor: Tenor) defined in net.corda.finance.contracts.universal.Fixing[ClassConstructorDescriptorImpl]

'source' @ [179:90] ==> value-parameter source: String defined in net.corda.finance.contracts.universal.fix[ValueParameterDescriptorImpl]

'const' @ [179:98] ==> public fun <T> const(k: Instant): Perceivable<Instant> defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Instant

'date' @ [179:104] ==> value-parameter date: LocalDate defined in net.corda.finance.contracts.universal.fix[ValueParameterDescriptorImpl]

'toInstant' @ [179:109] ==> public fun LocalDate.toInstant(): Instant defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'tenor' @ [179:123] ==> value-parameter tenor: Tenor defined in net.corda.finance.contracts.universal.fix[ValueParameterDescriptorImpl]

