'ofEpochDay' @ [11:50] ==> public open fun ofEpochDay(p0: Long): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'this' @ [11:61] ==> <this> defined in net.corda.finance.contracts.universal.toLocalDate[ReceiverParameterDescriptorImpl]

'epochSecond' @ [11:66] ==> public final val Instant.epochSecond: Long[MyPropertyDescriptor]

'ofEpochSecond' @ [13:46] ==> public open fun ofEpochSecond(p0: Long): (Instant..Instant?) defined in java.time.Instant[JavaMethodDescriptor]

'this' @ [13:60] ==> <this> defined in net.corda.finance.contracts.universal.toInstant[ReceiverParameterDescriptorImpl]

'toEpochDay' @ [13:65] ==> public open fun toEpochDay(): Long defined in java.time.LocalDate[JavaMethodDescriptor]

'when (perceivable) {
        is ActorPerceivable -> ImmutableSet.of( perceivable.actor )
        is PerceivableAnd -> Sets.union( signingParties( perceivable.left ), signingParties(perceivable.right) ).immutableCopy()
        is PerceivableOr -> Sets.union( signingParties( perceivable.left ), signingParties(perceivable.right) ).immutableCopy()
        is TimePerceivable -> ImmutableSet.of<Party>()
        is TerminalEvent -> ImmutableSet.of( perceivable.reference )
        is PerceivableComparison<*> -> ImmutableSet.of<Party>() // todo
        else -> throw IllegalArgumentException("signingParties " + perceivable)
    }' @ [16:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ImmutableSet<Party>, entry1: ImmutableSet<Party>, entry2: ImmutableSet<Party>, entry3: ImmutableSet<Party>, entry4: ImmutableSet<Party>, entry5: ImmutableSet<Party>, entry6: ImmutableSet<Party>): ImmutableSet<Party>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ImmutableSet<Party>

'perceivable' @ [16:11] ==> value-parameter perceivable: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.signingParties[ValueParameterDescriptorImpl]

'of' @ [17:45] ==> public open fun <E : (Any..Any?)> of(p0: (Party..Party?)): (ImmutableSet<(Party..Party?)>..ImmutableSet<(Party..Party?)>?) defined in com.google.common.collect.ImmutableSet[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (net.corda.core.identity.Party..net.corda.core.identity.Party?)

'perceivable' @ [17:49] ==> value-parameter perceivable: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.signingParties[ValueParameterDescriptorImpl]

'actor' @ [17:61] ==> public final val actor: Party defined in net.corda.finance.contracts.universal.ActorPerceivable[PropertyDescriptorImpl]

'union' @ [18:35] ==> public open fun <E : (Any..Any?)> union(p0: (MutableSet<out (Party..Party?)>..Set<(Party..Party?)>?), p1: (MutableSet<out (Party..Party?)>..Set<(Party..Party?)>?)): (Sets.SetView<(Party..Party?)>..Sets.SetView<(Party..Party?)>?) defined in com.google.common.collect.Sets[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (net.corda.core.identity.Party..net.corda.core.identity.Party?)

'signingParties' @ [18:42] ==> private fun signingParties(perceivable: Perceivable<Boolean>): ImmutableSet<Party> defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'perceivable' @ [18:58] ==> value-parameter perceivable: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.signingParties[ValueParameterDescriptorImpl]

'left' @ [18:70] ==> public final val left: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.PerceivableAnd[PropertyDescriptorImpl]

'signingParties' @ [18:78] ==> private fun signingParties(perceivable: Perceivable<Boolean>): ImmutableSet<Party> defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'perceivable' @ [18:93] ==> value-parameter perceivable: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.signingParties[ValueParameterDescriptorImpl]

'right' @ [18:105] ==> public final val right: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.PerceivableAnd[PropertyDescriptorImpl]

'immutableCopy' @ [18:114] ==> public open fun immutableCopy(): (ImmutableSet<(Party..Party?)>..ImmutableSet<(Party..Party?)>?) defined in com.google.common.collect.Sets.SetView[JavaMethodDescriptor]

'union' @ [19:34] ==> public open fun <E : (Any..Any?)> union(p0: (MutableSet<out (Party..Party?)>..Set<(Party..Party?)>?), p1: (MutableSet<out (Party..Party?)>..Set<(Party..Party?)>?)): (Sets.SetView<(Party..Party?)>..Sets.SetView<(Party..Party?)>?) defined in com.google.common.collect.Sets[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (net.corda.core.identity.Party..net.corda.core.identity.Party?)

'signingParties' @ [19:41] ==> private fun signingParties(perceivable: Perceivable<Boolean>): ImmutableSet<Party> defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'perceivable' @ [19:57] ==> value-parameter perceivable: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.signingParties[ValueParameterDescriptorImpl]

'left' @ [19:69] ==> public final val left: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.PerceivableOr[PropertyDescriptorImpl]

'signingParties' @ [19:77] ==> private fun signingParties(perceivable: Perceivable<Boolean>): ImmutableSet<Party> defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'perceivable' @ [19:92] ==> value-parameter perceivable: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.signingParties[ValueParameterDescriptorImpl]

'right' @ [19:104] ==> public final val right: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.PerceivableOr[PropertyDescriptorImpl]

'immutableCopy' @ [19:113] ==> public open fun immutableCopy(): (ImmutableSet<(Party..Party?)>..ImmutableSet<(Party..Party?)>?) defined in com.google.common.collect.Sets.SetView[JavaMethodDescriptor]

'of' @ [20:44] ==> public open fun <E : (Any..Any?)> of(): (ImmutableSet<(Party..Party?)>..ImmutableSet<(Party..Party?)>?) defined in com.google.common.collect.ImmutableSet[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Party

'of' @ [21:42] ==> public open fun <E : (Any..Any?)> of(p0: (Party..Party?)): (ImmutableSet<(Party..Party?)>..ImmutableSet<(Party..Party?)>?) defined in com.google.common.collect.ImmutableSet[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (net.corda.core.identity.Party..net.corda.core.identity.Party?)

'perceivable' @ [21:46] ==> value-parameter perceivable: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.signingParties[ValueParameterDescriptorImpl]

'reference' @ [21:58] ==> public final val reference: Party defined in net.corda.finance.contracts.universal.TerminalEvent[PropertyDescriptorImpl]

'of' @ [22:53] ==> public open fun <E : (Any..Any?)> of(): (ImmutableSet<(Party..Party?)>..ImmutableSet<(Party..Party?)>?) defined in com.google.common.collect.ImmutableSet[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Party

'IllegalArgumentException' @ [23:23] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'+' @ [23:48] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'perceivable' @ [23:68] ==> value-parameter perceivable: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.signingParties[ValueParameterDescriptorImpl]

'when (arrangement) {
            is Zero -> ImmutableSet.of<PublicKey>()
            is Obligation -> ImmutableSet.of(arrangement.from.owningKey)
            is And ->
                arrangement.arrangements.fold(ImmutableSet.builder<PublicKey>(), { builder, k -> builder.addAll(liablePartiesVisitor(k)) }).build()
            is Actions ->
                arrangement.actions.fold(ImmutableSet.builder<PublicKey>(), { builder, k -> builder.addAll(liablePartiesVisitor(k)) }).build()
            is RollOut -> liablePartiesVisitor(arrangement.template)
            is Continuation -> ImmutableSet.of<PublicKey>()
            else -> throw IllegalArgumentException("liableParties " + arrangement)
        }' @ [27:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ImmutableSet<PublicKey>, entry1: ImmutableSet<PublicKey>, entry2: ImmutableSet<PublicKey>, entry3: ImmutableSet<PublicKey>, entry4: ImmutableSet<PublicKey>, entry5: ImmutableSet<PublicKey>, entry6: ImmutableSet<PublicKey>): ImmutableSet<PublicKey>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ImmutableSet<PublicKey>

'arrangement' @ [27:15] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.liablePartiesVisitor[ValueParameterDescriptorImpl]

'of' @ [28:37] ==> public open fun <E : (Any..Any?)> of(): (ImmutableSet<(PublicKey..PublicKey?)>..ImmutableSet<(PublicKey..PublicKey?)>?) defined in com.google.common.collect.ImmutableSet[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PublicKey

'of' @ [29:43] ==> public open fun <E : (Any..Any?)> of(p0: (PublicKey..PublicKey?)): (ImmutableSet<(PublicKey..PublicKey?)>..ImmutableSet<(PublicKey..PublicKey?)>?) defined in com.google.common.collect.ImmutableSet[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (java.security.PublicKey..java.security.PublicKey?)

'arrangement' @ [29:46] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.liablePartiesVisitor[ValueParameterDescriptorImpl]

'from' @ [29:58] ==> public final val from: Party defined in net.corda.finance.contracts.universal.Obligation[PropertyDescriptorImpl]

'owningKey' @ [29:63] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'arrangement' @ [31:17] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.liablePartiesVisitor[ValueParameterDescriptorImpl]

'arrangements' @ [31:29] ==> public final val arrangements: Set<Arrangement> defined in net.corda.finance.contracts.universal.And[PropertyDescriptorImpl]

'fold' @ [31:42] ==> public inline fun <T, R> Iterable<Arrangement>.fold(initial: (ImmutableSet.Builder<(PublicKey..PublicKey?)>..ImmutableSet.Builder<(PublicKey..PublicKey?)>?), operation: (acc: (ImmutableSet.Builder<(PublicKey..PublicKey?)>..ImmutableSet.Builder<(PublicKey..PublicKey?)>?), Arrangement) -> (ImmutableSet.Builder<(PublicKey..PublicKey?)>..ImmutableSet.Builder<(PublicKey..PublicKey?)>?)): (ImmutableSet.Builder<(PublicKey..PublicKey?)>..ImmutableSet.Builder<(PublicKey..PublicKey?)>?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Arrangement
    <R> -> (com.google.common.collect.ImmutableSet.Builder<(java.security.PublicKey..java.security.PublicKey?)>..com.google.common.collect.ImmutableSet.Builder<(java.security.PublicKey..java.security.PublicKey?)>?)

'builder' @ [31:60] ==> public open fun <E : (Any..Any?)> builder(): (ImmutableSet.Builder<(PublicKey..PublicKey?)>..ImmutableSet.Builder<(PublicKey..PublicKey?)>?) defined in com.google.common.collect.ImmutableSet[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PublicKey

'builder' @ [31:98] ==> value-parameter builder: (ImmutableSet.Builder<(PublicKey..PublicKey?)>..ImmutableSet.Builder<(PublicKey..PublicKey?)>?) defined in net.corda.finance.contracts.universal.liablePartiesVisitor.<anonymous>[ValueParameterDescriptorImpl]

'addAll' @ [31:106] ==> @CanIgnoreReturnValue public open fun addAll(p0: (MutableIterable<(PublicKey..PublicKey?)>..Iterable<(PublicKey..PublicKey?)>?)): (ImmutableSet.Builder<(PublicKey..PublicKey?)>..ImmutableSet.Builder<(PublicKey..PublicKey?)>?) defined in com.google.common.collect.ImmutableSet.Builder[JavaMethodDescriptor]

'liablePartiesVisitor' @ [31:113] ==> private fun liablePartiesVisitor(arrangement: Arrangement): ImmutableSet<PublicKey> defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'k' @ [31:134] ==> value-parameter k: Arrangement defined in net.corda.finance.contracts.universal.liablePartiesVisitor.<anonymous>[ValueParameterDescriptorImpl]

'build' @ [31:141] ==> public open fun build(): (ImmutableSet<(PublicKey..PublicKey?)>..ImmutableSet<(PublicKey..PublicKey?)>?) defined in com.google.common.collect.ImmutableSet.Builder[JavaMethodDescriptor]

'arrangement' @ [33:17] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.liablePartiesVisitor[ValueParameterDescriptorImpl]

'actions' @ [33:29] ==> public final val actions: Set<Action> defined in net.corda.finance.contracts.universal.Actions[PropertyDescriptorImpl]

'fold' @ [33:37] ==> public inline fun <T, R> Iterable<Action>.fold(initial: (ImmutableSet.Builder<(PublicKey..PublicKey?)>..ImmutableSet.Builder<(PublicKey..PublicKey?)>?), operation: (acc: (ImmutableSet.Builder<(PublicKey..PublicKey?)>..ImmutableSet.Builder<(PublicKey..PublicKey?)>?), Action) -> (ImmutableSet.Builder<(PublicKey..PublicKey?)>..ImmutableSet.Builder<(PublicKey..PublicKey?)>?)): (ImmutableSet.Builder<(PublicKey..PublicKey?)>..ImmutableSet.Builder<(PublicKey..PublicKey?)>?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Action
    <R> -> (com.google.common.collect.ImmutableSet.Builder<(java.security.PublicKey..java.security.PublicKey?)>..com.google.common.collect.ImmutableSet.Builder<(java.security.PublicKey..java.security.PublicKey?)>?)

'builder' @ [33:55] ==> public open fun <E : (Any..Any?)> builder(): (ImmutableSet.Builder<(PublicKey..PublicKey?)>..ImmutableSet.Builder<(PublicKey..PublicKey?)>?) defined in com.google.common.collect.ImmutableSet[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PublicKey

'builder' @ [33:93] ==> value-parameter builder: (ImmutableSet.Builder<(PublicKey..PublicKey?)>..ImmutableSet.Builder<(PublicKey..PublicKey?)>?) defined in net.corda.finance.contracts.universal.liablePartiesVisitor.<anonymous>[ValueParameterDescriptorImpl]

'addAll' @ [33:101] ==> @CanIgnoreReturnValue public open fun addAll(p0: (MutableIterable<(PublicKey..PublicKey?)>..Iterable<(PublicKey..PublicKey?)>?)): (ImmutableSet.Builder<(PublicKey..PublicKey?)>..ImmutableSet.Builder<(PublicKey..PublicKey?)>?) defined in com.google.common.collect.ImmutableSet.Builder[JavaMethodDescriptor]

'liablePartiesVisitor' @ [33:108] ==> private fun liablePartiesVisitor(action: Action): ImmutableSet<PublicKey> defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'k' @ [33:129] ==> value-parameter k: Action defined in net.corda.finance.contracts.universal.liablePartiesVisitor.<anonymous>[ValueParameterDescriptorImpl]

'build' @ [33:136] ==> public open fun build(): (ImmutableSet<(PublicKey..PublicKey?)>..ImmutableSet<(PublicKey..PublicKey?)>?) defined in com.google.common.collect.ImmutableSet.Builder[JavaMethodDescriptor]

'liablePartiesVisitor' @ [34:27] ==> private fun liablePartiesVisitor(arrangement: Arrangement): ImmutableSet<PublicKey> defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'arrangement' @ [34:48] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.liablePartiesVisitor[ValueParameterDescriptorImpl]

'template' @ [34:60] ==> public final val template: Arrangement defined in net.corda.finance.contracts.universal.RollOut[PropertyDescriptorImpl]

'of' @ [35:45] ==> public open fun <E : (Any..Any?)> of(): (ImmutableSet<(PublicKey..PublicKey?)>..ImmutableSet<(PublicKey..PublicKey?)>?) defined in com.google.common.collect.ImmutableSet[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PublicKey

'IllegalArgumentException' @ [36:27] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'+' @ [36:52] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'arrangement' @ [36:71] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.liablePartiesVisitor[ValueParameterDescriptorImpl]

'signingParties' @ [40:18] ==> private fun signingParties(perceivable: Perceivable<Boolean>): ImmutableSet<Party> defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'action' @ [40:33] ==> value-parameter action: Action defined in net.corda.finance.contracts.universal.liablePartiesVisitor[ValueParameterDescriptorImpl]

'condition' @ [40:40] ==> public final val condition: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.Action[PropertyDescriptorImpl]

'if (actors.size != 1)
        liablePartiesVisitor(action.arrangement)
    else
        Sets.difference(liablePartiesVisitor(action.arrangement), ImmutableSet.of(actors.single())).immutableCopy()' @ [41:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ImmutableSet<PublicKey>, elseBranch: ImmutableSet<PublicKey>): ImmutableSet<PublicKey>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ImmutableSet<PublicKey>

'actors' @ [41:16] ==> val actors: ImmutableSet<Party> defined in net.corda.finance.contracts.universal.liablePartiesVisitor[LocalVariableDescriptor]

'size' @ [41:23] ==> public abstract val size: Int defined in com.google.common.collect.ImmutableSet[JavaPropertyDescriptor]

'liablePartiesVisitor' @ [42:9] ==> private fun liablePartiesVisitor(arrangement: Arrangement): ImmutableSet<PublicKey> defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'action' @ [42:30] ==> value-parameter action: Action defined in net.corda.finance.contracts.universal.liablePartiesVisitor[ValueParameterDescriptorImpl]

'arrangement' @ [42:37] ==> public final val arrangement: Arrangement defined in net.corda.finance.contracts.universal.Action[PropertyDescriptorImpl]

'difference' @ [44:14] ==> public open fun <E : (Any..Any?)> difference(p0: (MutableSet<(PublicKey..PublicKey?)>..Set<(PublicKey..PublicKey?)>?), p1: (MutableSet<*>..Set<*>?)): (Sets.SetView<(PublicKey..PublicKey?)>..Sets.SetView<(PublicKey..PublicKey?)>?) defined in com.google.common.collect.Sets[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (java.security.PublicKey..java.security.PublicKey?)

'liablePartiesVisitor' @ [44:25] ==> private fun liablePartiesVisitor(arrangement: Arrangement): ImmutableSet<PublicKey> defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'action' @ [44:46] ==> value-parameter action: Action defined in net.corda.finance.contracts.universal.liablePartiesVisitor[ValueParameterDescriptorImpl]

'arrangement' @ [44:53] ==> public final val arrangement: Arrangement defined in net.corda.finance.contracts.universal.Action[PropertyDescriptorImpl]

'of' @ [44:80] ==> public open fun <E : (Any..Any?)> of(p0: (Party..Party?)): (ImmutableSet<(Party..Party?)>..ImmutableSet<(Party..Party?)>?) defined in com.google.common.collect.ImmutableSet[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (net.corda.core.identity.Party..net.corda.core.identity.Party?)

'actors' @ [44:83] ==> val actors: ImmutableSet<Party> defined in net.corda.finance.contracts.universal.liablePartiesVisitor[LocalVariableDescriptor]

'single' @ [44:90] ==> public fun <T> Iterable<(Party..Party?)>.single(): (Party..Party?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.core.identity.Party..net.corda.core.identity.Party?)

'immutableCopy' @ [44:101] ==> public open fun immutableCopy(): (ImmutableSet<(PublicKey..PublicKey?)>..ImmutableSet<(PublicKey..PublicKey?)>?) defined in com.google.common.collect.Sets.SetView[JavaMethodDescriptor]

'liablePartiesVisitor' @ [48:60] ==> private fun liablePartiesVisitor(arrangement: Arrangement): ImmutableSet<PublicKey> defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'contract' @ [48:81] ==> value-parameter contract: Arrangement defined in net.corda.finance.contracts.universal.liableParties[ValueParameterDescriptorImpl]

'union' @ [51:10] ==> public open fun <E : (Any..Any?)> union(p0: (MutableSet<out (Party..Party?)>..Set<(Party..Party?)>?), p1: (MutableSet<out (Party..Party?)>..Set<(Party..Party?)>?)): (Sets.SetView<(Party..Party?)>..Sets.SetView<(Party..Party?)>?) defined in com.google.common.collect.Sets[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (net.corda.core.identity.Party..net.corda.core.identity.Party?)

'involvedPartiesVisitor' @ [51:16] ==> private fun involvedPartiesVisitor(arrangement: Arrangement): ImmutableSet<Party> defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'action' @ [51:39] ==> value-parameter action: Action defined in net.corda.finance.contracts.universal.involvedPartiesVisitor[ValueParameterDescriptorImpl]

'arrangement' @ [51:46] ==> public final val arrangement: Arrangement defined in net.corda.finance.contracts.universal.Action[PropertyDescriptorImpl]

'signingParties' @ [51:60] ==> private fun signingParties(perceivable: Perceivable<Boolean>): ImmutableSet<Party> defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'action' @ [51:75] ==> value-parameter action: Action defined in net.corda.finance.contracts.universal.involvedPartiesVisitor[ValueParameterDescriptorImpl]

'condition' @ [51:82] ==> public final val condition: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.Action[PropertyDescriptorImpl]

'immutableCopy' @ [51:94] ==> public open fun immutableCopy(): (ImmutableSet<(Party..Party?)>..ImmutableSet<(Party..Party?)>?) defined in com.google.common.collect.Sets.SetView[JavaMethodDescriptor]

'when (arrangement) {
            is Zero -> ImmutableSet.of<Party>()
            is Obligation -> ImmutableSet.of(arrangement.from, arrangement.to)
            is RollOut -> involvedPartiesVisitor(arrangement.template)
            is Continuation -> ImmutableSet.of<Party>()
            is And ->
                arrangement.arrangements.fold(ImmutableSet.builder<Party>(), { builder, k -> builder.addAll(involvedPartiesVisitor(k)) }).build()
            is Actions ->
                arrangement.actions.fold(ImmutableSet.builder<Party>(), { builder, k -> builder.addAll(involvedPartiesVisitor(k)) }).build()
            else -> throw IllegalArgumentException(arrangement.toString())
        }' @ [54:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ImmutableSet<Party>, entry1: ImmutableSet<Party>, entry2: ImmutableSet<Party>, entry3: ImmutableSet<Party>, entry4: ImmutableSet<Party>, entry5: ImmutableSet<Party>, entry6: ImmutableSet<Party>): ImmutableSet<Party>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ImmutableSet<Party>

'arrangement' @ [54:15] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.involvedPartiesVisitor[ValueParameterDescriptorImpl]

'of' @ [55:37] ==> public open fun <E : (Any..Any?)> of(): (ImmutableSet<(Party..Party?)>..ImmutableSet<(Party..Party?)>?) defined in com.google.common.collect.ImmutableSet[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Party

'of' @ [56:43] ==> public open fun <E : (Any..Any?)> of(p0: (Party..Party?), p1: (Party..Party?)): (ImmutableSet<(Party..Party?)>..ImmutableSet<(Party..Party?)>?) defined in com.google.common.collect.ImmutableSet[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (net.corda.core.identity.Party..net.corda.core.identity.Party?)

'arrangement' @ [56:46] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.involvedPartiesVisitor[ValueParameterDescriptorImpl]

'from' @ [56:58] ==> public final val from: Party defined in net.corda.finance.contracts.universal.Obligation[PropertyDescriptorImpl]

'arrangement' @ [56:64] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.involvedPartiesVisitor[ValueParameterDescriptorImpl]

'to' @ [56:76] ==> public final val to: Party defined in net.corda.finance.contracts.universal.Obligation[PropertyDescriptorImpl]

'involvedPartiesVisitor' @ [57:27] ==> private fun involvedPartiesVisitor(arrangement: Arrangement): ImmutableSet<Party> defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'arrangement' @ [57:50] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.involvedPartiesVisitor[ValueParameterDescriptorImpl]

'template' @ [57:62] ==> public final val template: Arrangement defined in net.corda.finance.contracts.universal.RollOut[PropertyDescriptorImpl]

'of' @ [58:45] ==> public open fun <E : (Any..Any?)> of(): (ImmutableSet<(Party..Party?)>..ImmutableSet<(Party..Party?)>?) defined in com.google.common.collect.ImmutableSet[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Party

'arrangement' @ [60:17] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.involvedPartiesVisitor[ValueParameterDescriptorImpl]

'arrangements' @ [60:29] ==> public final val arrangements: Set<Arrangement> defined in net.corda.finance.contracts.universal.And[PropertyDescriptorImpl]

'fold' @ [60:42] ==> public inline fun <T, R> Iterable<Arrangement>.fold(initial: (ImmutableSet.Builder<(Party..Party?)>..ImmutableSet.Builder<(Party..Party?)>?), operation: (acc: (ImmutableSet.Builder<(Party..Party?)>..ImmutableSet.Builder<(Party..Party?)>?), Arrangement) -> (ImmutableSet.Builder<(Party..Party?)>..ImmutableSet.Builder<(Party..Party?)>?)): (ImmutableSet.Builder<(Party..Party?)>..ImmutableSet.Builder<(Party..Party?)>?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Arrangement
    <R> -> (com.google.common.collect.ImmutableSet.Builder<(net.corda.core.identity.Party..net.corda.core.identity.Party?)>..com.google.common.collect.ImmutableSet.Builder<(net.corda.core.identity.Party..net.corda.core.identity.Party?)>?)

'builder' @ [60:60] ==> public open fun <E : (Any..Any?)> builder(): (ImmutableSet.Builder<(Party..Party?)>..ImmutableSet.Builder<(Party..Party?)>?) defined in com.google.common.collect.ImmutableSet[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Party

'builder' @ [60:94] ==> value-parameter builder: (ImmutableSet.Builder<(Party..Party?)>..ImmutableSet.Builder<(Party..Party?)>?) defined in net.corda.finance.contracts.universal.involvedPartiesVisitor.<anonymous>[ValueParameterDescriptorImpl]

'addAll' @ [60:102] ==> @CanIgnoreReturnValue public open fun addAll(p0: (MutableIterable<(Party..Party?)>..Iterable<(Party..Party?)>?)): (ImmutableSet.Builder<(Party..Party?)>..ImmutableSet.Builder<(Party..Party?)>?) defined in com.google.common.collect.ImmutableSet.Builder[JavaMethodDescriptor]

'involvedPartiesVisitor' @ [60:109] ==> private fun involvedPartiesVisitor(arrangement: Arrangement): ImmutableSet<Party> defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'k' @ [60:132] ==> value-parameter k: Arrangement defined in net.corda.finance.contracts.universal.involvedPartiesVisitor.<anonymous>[ValueParameterDescriptorImpl]

'build' @ [60:139] ==> public open fun build(): (ImmutableSet<(Party..Party?)>..ImmutableSet<(Party..Party?)>?) defined in com.google.common.collect.ImmutableSet.Builder[JavaMethodDescriptor]

'arrangement' @ [62:17] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.involvedPartiesVisitor[ValueParameterDescriptorImpl]

'actions' @ [62:29] ==> public final val actions: Set<Action> defined in net.corda.finance.contracts.universal.Actions[PropertyDescriptorImpl]

'fold' @ [62:37] ==> public inline fun <T, R> Iterable<Action>.fold(initial: (ImmutableSet.Builder<(Party..Party?)>..ImmutableSet.Builder<(Party..Party?)>?), operation: (acc: (ImmutableSet.Builder<(Party..Party?)>..ImmutableSet.Builder<(Party..Party?)>?), Action) -> (ImmutableSet.Builder<(Party..Party?)>..ImmutableSet.Builder<(Party..Party?)>?)): (ImmutableSet.Builder<(Party..Party?)>..ImmutableSet.Builder<(Party..Party?)>?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Action
    <R> -> (com.google.common.collect.ImmutableSet.Builder<(net.corda.core.identity.Party..net.corda.core.identity.Party?)>..com.google.common.collect.ImmutableSet.Builder<(net.corda.core.identity.Party..net.corda.core.identity.Party?)>?)

'builder' @ [62:55] ==> public open fun <E : (Any..Any?)> builder(): (ImmutableSet.Builder<(Party..Party?)>..ImmutableSet.Builder<(Party..Party?)>?) defined in com.google.common.collect.ImmutableSet[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Party

'builder' @ [62:89] ==> value-parameter builder: (ImmutableSet.Builder<(Party..Party?)>..ImmutableSet.Builder<(Party..Party?)>?) defined in net.corda.finance.contracts.universal.involvedPartiesVisitor.<anonymous>[ValueParameterDescriptorImpl]

'addAll' @ [62:97] ==> @CanIgnoreReturnValue public open fun addAll(p0: (MutableIterable<(Party..Party?)>..Iterable<(Party..Party?)>?)): (ImmutableSet.Builder<(Party..Party?)>..ImmutableSet.Builder<(Party..Party?)>?) defined in com.google.common.collect.ImmutableSet.Builder[JavaMethodDescriptor]

'involvedPartiesVisitor' @ [62:104] ==> private fun involvedPartiesVisitor(action: Action): Set<Party> defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'k' @ [62:127] ==> value-parameter k: Action defined in net.corda.finance.contracts.universal.involvedPartiesVisitor.<anonymous>[ValueParameterDescriptorImpl]

'build' @ [62:134] ==> public open fun build(): (ImmutableSet<(Party..Party?)>..ImmutableSet<(Party..Party?)>?) defined in com.google.common.collect.ImmutableSet.Builder[JavaMethodDescriptor]

'IllegalArgumentException' @ [63:27] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'arrangement' @ [63:52] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.involvedPartiesVisitor[ValueParameterDescriptorImpl]

'toString' @ [63:64] ==> public open fun toString(): String defined in net.corda.finance.contracts.universal.Arrangement[DeserializedSimpleFunctionDescriptor]

'involvedPartiesVisitor' @ [67:61] ==> private fun involvedPartiesVisitor(arrangement: Arrangement): ImmutableSet<Party> defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'arrangement' @ [67:84] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.involvedParties[ValueParameterDescriptorImpl]

'when (perceivable) {
            is ActorPerceivable ->
                if (perceivable.actor == from)
                    signedBy(to)
                else
                    perceivable
            is PerceivableAnd -> replaceParty(perceivable.left, from, to) and replaceParty(perceivable.right, from, to)
            is PerceivableOr -> replaceParty(perceivable.left, from, to) or replaceParty(perceivable.right, from, to)
            is TimePerceivable -> perceivable
            else -> throw IllegalArgumentException("replaceParty " + perceivable)
        }' @ [70:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Perceivable<Boolean>, entry1: Perceivable<Boolean>, entry2: Perceivable<Boolean>, entry3: Perceivable<Boolean>, entry4: Perceivable<Boolean>): Perceivable<Boolean>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Perceivable<Boolean>

'perceivable' @ [70:15] ==> value-parameter perceivable: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'if (perceivable.actor == from)
                    signedBy(to)
                else
                    perceivable' @ [72:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Perceivable<Boolean>, elseBranch: Perceivable<Boolean>): Perceivable<Boolean>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Perceivable<Boolean>

'perceivable' @ [72:21] ==> value-parameter perceivable: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'actor' @ [72:33] ==> public final val actor: Party defined in net.corda.finance.contracts.universal.ActorPerceivable[PropertyDescriptorImpl]

'from' @ [72:42] ==> value-parameter from: Party defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'signedBy' @ [73:21] ==> public fun signedBy(actor: Party): Perceivable<Boolean> defined in net.corda.finance.contracts.universal in file Perceivable.kt[SimpleFunctionDescriptorImpl]

'to' @ [73:30] ==> value-parameter to: Party defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'perceivable' @ [75:21] ==> value-parameter perceivable: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'replaceParty' @ [76:34] ==> public fun replaceParty(perceivable: Perceivable<Boolean>, from: Party, to: Party): Perceivable<Boolean> defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'perceivable' @ [76:47] ==> value-parameter perceivable: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'left' @ [76:59] ==> public final val left: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.PerceivableAnd[PropertyDescriptorImpl]

'from' @ [76:65] ==> value-parameter from: Party defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'to' @ [76:71] ==> value-parameter to: Party defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'replaceParty' @ [76:79] ==> public fun replaceParty(perceivable: Perceivable<Boolean>, from: Party, to: Party): Perceivable<Boolean> defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'perceivable' @ [76:92] ==> value-parameter perceivable: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'right' @ [76:104] ==> public final val right: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.PerceivableAnd[PropertyDescriptorImpl]

'from' @ [76:111] ==> value-parameter from: Party defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'to' @ [76:117] ==> value-parameter to: Party defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'replaceParty' @ [77:33] ==> public fun replaceParty(perceivable: Perceivable<Boolean>, from: Party, to: Party): Perceivable<Boolean> defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'perceivable' @ [77:46] ==> value-parameter perceivable: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'left' @ [77:58] ==> public final val left: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.PerceivableOr[PropertyDescriptorImpl]

'from' @ [77:64] ==> value-parameter from: Party defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'to' @ [77:70] ==> value-parameter to: Party defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'replaceParty' @ [77:77] ==> public fun replaceParty(perceivable: Perceivable<Boolean>, from: Party, to: Party): Perceivable<Boolean> defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'perceivable' @ [77:90] ==> value-parameter perceivable: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'right' @ [77:102] ==> public final val right: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.PerceivableOr[PropertyDescriptorImpl]

'from' @ [77:109] ==> value-parameter from: Party defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'to' @ [77:115] ==> value-parameter to: Party defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'perceivable' @ [78:35] ==> value-parameter perceivable: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [79:27] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'+' @ [79:52] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'perceivable' @ [79:70] ==> value-parameter perceivable: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'Action' @ [83:9] ==> public constructor Action(name: String, condition: Perceivable<Boolean>, arrangement: Arrangement) defined in net.corda.finance.contracts.universal.Action[ClassConstructorDescriptorImpl]

'action' @ [83:16] ==> value-parameter action: Action defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'name' @ [83:23] ==> public final val name: String defined in net.corda.finance.contracts.universal.Action[PropertyDescriptorImpl]

'replaceParty' @ [83:29] ==> public fun replaceParty(perceivable: Perceivable<Boolean>, from: Party, to: Party): Perceivable<Boolean> defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'action' @ [83:42] ==> value-parameter action: Action defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'condition' @ [83:49] ==> public final val condition: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.Action[PropertyDescriptorImpl]

'from' @ [83:60] ==> value-parameter from: Party defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'to' @ [83:66] ==> value-parameter to: Party defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'replaceParty' @ [83:71] ==> public fun replaceParty(arrangement: Arrangement, from: Party, to: Party): Arrangement defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'action' @ [83:84] ==> value-parameter action: Action defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'arrangement' @ [83:91] ==> public final val arrangement: Arrangement defined in net.corda.finance.contracts.universal.Action[PropertyDescriptorImpl]

'from' @ [83:104] ==> value-parameter from: Party defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'to' @ [83:110] ==> value-parameter to: Party defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'when (arrangement) {
    is Zero -> arrangement
    is Obligation -> Obligation(arrangement.amount, arrangement.currency,
            if (arrangement.from == from) to else arrangement.from,
            if (arrangement.to == from) to else arrangement.to)
    is And -> And(arrangement.arrangements.map { replaceParty(it, from, to) }.toSet())
    is Actions -> Actions(arrangement.actions.map { replaceParty(it, from, to) }.toSet())
    else -> throw IllegalArgumentException()
}' @ [89:83] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Arrangement, entry1: Arrangement, entry2: Arrangement, entry3: Arrangement, entry4: Arrangement): Arrangement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Arrangement

'arrangement' @ [89:89] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'arrangement' @ [90:16] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'Obligation' @ [91:22] ==> public constructor Obligation(amount: Perceivable<BigDecimal>, currency: Currency, from: Party, to: Party) defined in net.corda.finance.contracts.universal.Obligation[ClassConstructorDescriptorImpl]

'arrangement' @ [91:33] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'amount' @ [91:45] ==> public final val amount: Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal.Obligation[PropertyDescriptorImpl]

'arrangement' @ [91:53] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'currency' @ [91:65] ==> public final val currency: Currency defined in net.corda.finance.contracts.universal.Obligation[PropertyDescriptorImpl]

'if (arrangement.from == from) to else arrangement.from' @ [92:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Party, elseBranch: Party): Party[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Party

'arrangement' @ [92:17] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'from' @ [92:29] ==> public final val from: Party defined in net.corda.finance.contracts.universal.Obligation[PropertyDescriptorImpl]

'from' @ [92:37] ==> value-parameter from: Party defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'to' @ [92:43] ==> value-parameter to: Party defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'arrangement' @ [92:51] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'from' @ [92:63] ==> public final val from: Party defined in net.corda.finance.contracts.universal.Obligation[PropertyDescriptorImpl]

'if (arrangement.to == from) to else arrangement.to' @ [93:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Party, elseBranch: Party): Party[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Party

'arrangement' @ [93:17] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'to' @ [93:29] ==> public final val to: Party defined in net.corda.finance.contracts.universal.Obligation[PropertyDescriptorImpl]

'from' @ [93:35] ==> value-parameter from: Party defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'to' @ [93:41] ==> value-parameter to: Party defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'arrangement' @ [93:49] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'to' @ [93:61] ==> public final val to: Party defined in net.corda.finance.contracts.universal.Obligation[PropertyDescriptorImpl]

'And' @ [94:15] ==> public constructor And(arrangements: Set<Arrangement>) defined in net.corda.finance.contracts.universal.And[ClassConstructorDescriptorImpl]

'arrangement' @ [94:19] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'arrangements' @ [94:31] ==> public final val arrangements: Set<Arrangement> defined in net.corda.finance.contracts.universal.And[PropertyDescriptorImpl]

'map' @ [94:44] ==> public inline fun <T, R> Iterable<Arrangement>.map(transform: (Arrangement) -> Arrangement): List<Arrangement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Arrangement
    <R> -> Arrangement

'replaceParty' @ [94:50] ==> public fun replaceParty(arrangement: Arrangement, from: Party, to: Party): Arrangement defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'it' @ [94:63] ==> value-parameter it: Arrangement defined in net.corda.finance.contracts.universal.replaceParty.<anonymous>[ValueParameterDescriptorImpl]

'from' @ [94:67] ==> value-parameter from: Party defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'to' @ [94:73] ==> value-parameter to: Party defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'toSet' @ [94:79] ==> public fun <T> Iterable<Arrangement>.toSet(): Set<Arrangement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Arrangement

'Actions' @ [95:19] ==> public constructor Actions(actions: Set<Action>) defined in net.corda.finance.contracts.universal.Actions[ClassConstructorDescriptorImpl]

'arrangement' @ [95:27] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'actions' @ [95:39] ==> public final val actions: Set<Action> defined in net.corda.finance.contracts.universal.Actions[PropertyDescriptorImpl]

'map' @ [95:47] ==> public inline fun <T, R> Iterable<Action>.map(transform: (Action) -> Action): List<Action> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Action
    <R> -> Action

'replaceParty' @ [95:53] ==> public fun replaceParty(action: Action, from: Party, to: Party): Action defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'it' @ [95:66] ==> value-parameter it: Action defined in net.corda.finance.contracts.universal.replaceParty.<anonymous>[ValueParameterDescriptorImpl]

'from' @ [95:70] ==> value-parameter from: Party defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'to' @ [95:76] ==> value-parameter to: Party defined in net.corda.finance.contracts.universal.replaceParty[ValueParameterDescriptorImpl]

'toSet' @ [95:82] ==> public fun <T> Iterable<Action>.toSet(): Set<Action> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Action

'IllegalArgumentException' @ [96:19] ==> public final fun <init>(): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'when (arrangement) {
    is Actions -> if (arrangement.actions.contains(action)) zero else arrangement
    is And -> {
        val a = arrangement.arrangements.map { extractRemainder(it, action) }.filter { it != zero }
        when (a.size) {
            0 -> zero
            1 -> a.single()
            else -> And(a.toSet())
        }
    }
    else -> arrangement
}' @ [99:79] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Arrangement, entry1: Arrangement, entry2: Arrangement): Arrangement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Arrangement

'arrangement' @ [99:85] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.extractRemainder[ValueParameterDescriptorImpl]

'if (arrangement.actions.contains(action)) zero else arrangement' @ [100:19] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Arrangement, elseBranch: Arrangement): Arrangement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Arrangement

'arrangement' @ [100:23] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.extractRemainder[ValueParameterDescriptorImpl]

'actions' @ [100:35] ==> public final val actions: Set<Action> defined in net.corda.finance.contracts.universal.Actions[PropertyDescriptorImpl]

'contains' @ [100:43] ==> public abstract fun contains(element: Action): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'action' @ [100:52] ==> value-parameter action: Action defined in net.corda.finance.contracts.universal.extractRemainder[ValueParameterDescriptorImpl]

'zero' @ [100:61] ==> public val zero: Zero defined in net.corda.finance.contracts.universal in file Literal.kt[PropertyDescriptorImpl]

'arrangement' @ [100:71] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.extractRemainder[ValueParameterDescriptorImpl]

'arrangement' @ [102:17] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.extractRemainder[ValueParameterDescriptorImpl]

'arrangements' @ [102:29] ==> public final val arrangements: Set<Arrangement> defined in net.corda.finance.contracts.universal.And[PropertyDescriptorImpl]

'map' @ [102:42] ==> public inline fun <T, R> Iterable<Arrangement>.map(transform: (Arrangement) -> Arrangement): List<Arrangement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Arrangement
    <R> -> Arrangement

'extractRemainder' @ [102:48] ==> public fun extractRemainder(arrangement: Arrangement, action: Action): Arrangement defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'it' @ [102:65] ==> value-parameter it: Arrangement defined in net.corda.finance.contracts.universal.extractRemainder.<anonymous>[ValueParameterDescriptorImpl]

'action' @ [102:69] ==> value-parameter action: Action defined in net.corda.finance.contracts.universal.extractRemainder[ValueParameterDescriptorImpl]

'filter' @ [102:79] ==> public inline fun <T> Iterable<Arrangement>.filter(predicate: (Arrangement) -> Boolean): List<Arrangement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Arrangement

'it' @ [102:88] ==> value-parameter it: Arrangement defined in net.corda.finance.contracts.universal.extractRemainder.<anonymous>[ValueParameterDescriptorImpl]

'zero' @ [102:94] ==> public val zero: Zero defined in net.corda.finance.contracts.universal in file Literal.kt[PropertyDescriptorImpl]

'when (a.size) {
            0 -> zero
            1 -> a.single()
            else -> And(a.toSet())
        }' @ [103:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Arrangement, entry1: Arrangement, entry2: Arrangement): Arrangement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Arrangement

'a' @ [103:15] ==> val a: List<Arrangement> defined in net.corda.finance.contracts.universal.extractRemainder[LocalVariableDescriptor]

'size' @ [103:17] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'zero' @ [104:18] ==> public val zero: Zero defined in net.corda.finance.contracts.universal in file Literal.kt[PropertyDescriptorImpl]

'a' @ [105:18] ==> val a: List<Arrangement> defined in net.corda.finance.contracts.universal.extractRemainder[LocalVariableDescriptor]

'single' @ [105:20] ==> public fun <T> List<Arrangement>.single(): Arrangement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Arrangement

'And' @ [106:21] ==> public constructor And(arrangements: Set<Arrangement>) defined in net.corda.finance.contracts.universal.And[ClassConstructorDescriptorImpl]

'a' @ [106:25] ==> val a: List<Arrangement> defined in net.corda.finance.contracts.universal.extractRemainder[LocalVariableDescriptor]

'toSet' @ [106:27] ==> public fun <T> Iterable<Arrangement>.toSet(): Set<Arrangement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Arrangement

'arrangement' @ [109:13] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.extractRemainder[ValueParameterDescriptorImpl]

'when (arrangement) {
    is Zero -> mapOf()
    is Obligation -> mapOf()
    is Actions -> arrangement.actions.map { it.name to it }.toMap()
    is And -> arrangement.arrangements.map { actions(it) }.fold(mutableMapOf()) { m, x ->
        x.forEach { entry ->
            val (s, action) = entry
            m[s] = action
        }
        m
    }
    is RollOut -> mapOf()
    else -> throw IllegalArgumentException()
}' @ [112:62] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Map<String, Action>, entry1: Map<String, Action>, entry2: Map<String, Action>, entry3: Map<String, Action>, entry4: Map<String, Action>, entry5: Map<String, Action>): Map<String, Action>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Map<String, Action>

'arrangement' @ [112:68] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.actions[ValueParameterDescriptorImpl]

'mapOf' @ [113:16] ==> @InlineOnly public inline fun <K, V> mapOf(): Map<String, Action> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Action

'mapOf' @ [114:22] ==> @InlineOnly public inline fun <K, V> mapOf(): Map<String, Action> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Action

'arrangement' @ [115:19] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.actions[ValueParameterDescriptorImpl]

'actions' @ [115:31] ==> public final val actions: Set<Action> defined in net.corda.finance.contracts.universal.Actions[PropertyDescriptorImpl]

'map' @ [115:39] ==> public inline fun <T, R> Iterable<Action>.map(transform: (Action) -> Pair<String, Action>): List<Pair<String, Action>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Action
    <R> -> Pair<String, Action>

'it' @ [115:45] ==> value-parameter it: Action defined in net.corda.finance.contracts.universal.actions.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [115:48] ==> public final val name: String defined in net.corda.finance.contracts.universal.Action[PropertyDescriptorImpl]

'it' @ [115:56] ==> value-parameter it: Action defined in net.corda.finance.contracts.universal.actions.<anonymous>[ValueParameterDescriptorImpl]

'toMap' @ [115:61] ==> public fun <K, V> Iterable<Pair<String, Action>>.toMap(): Map<String, Action> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Action

'arrangement' @ [116:15] ==> value-parameter arrangement: Arrangement defined in net.corda.finance.contracts.universal.actions[ValueParameterDescriptorImpl]

'arrangements' @ [116:27] ==> public final val arrangements: Set<Arrangement> defined in net.corda.finance.contracts.universal.And[PropertyDescriptorImpl]

'map' @ [116:40] ==> public inline fun <T, R> Iterable<Arrangement>.map(transform: (Arrangement) -> Map<String, Action>): List<Map<String, Action>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Arrangement
    <R> -> Map<String, Action>

'actions' @ [116:46] ==> public fun actions(arrangement: Arrangement): Map<String, Action> defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'it' @ [116:54] ==> value-parameter it: Arrangement defined in net.corda.finance.contracts.universal.actions.<anonymous>[ValueParameterDescriptorImpl]

'fold' @ [116:60] ==> public inline fun <T, R> Iterable<Map<String, Action>>.fold(initial: MutableMap<String, Action>, operation: (acc: MutableMap<String, Action>, Map<String, Action>) -> MutableMap<String, Action>): MutableMap<String, Action> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Map<String, Action>
    <R> -> MutableMap<String, Action>

'mutableMapOf' @ [116:65] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<String, Action> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Action

'x' @ [117:9] ==> value-parameter x: Map<String, Action> defined in net.corda.finance.contracts.universal.actions.<anonymous>[ValueParameterDescriptorImpl]

'forEach' @ [117:11] ==> @HidesMembers public inline fun <K, V> Map<out String, Action>.forEach(action: (Map.Entry<String, Action>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Action

'component1' @ [118:18] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, Action>.component1(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Action

'component2' @ [118:21] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, Action>.component2(): Action defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Action

'entry' @ [118:31] ==> value-parameter entry: Map.Entry<String, Action> defined in net.corda.finance.contracts.universal.actions.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'm' @ [119:13] ==> value-parameter m: MutableMap<String, Action> defined in net.corda.finance.contracts.universal.actions.<anonymous>[ValueParameterDescriptorImpl]

's' @ [119:15] ==> val s: String defined in net.corda.finance.contracts.universal.actions.<anonymous>.<anonymous>[LocalVariableDescriptor]

'action' @ [119:20] ==> val action: Action defined in net.corda.finance.contracts.universal.actions.<anonymous>.<anonymous>[LocalVariableDescriptor]

'm' @ [121:9] ==> value-parameter m: MutableMap<String, Action> defined in net.corda.finance.contracts.universal.actions.<anonymous>[ValueParameterDescriptorImpl]

'mapOf' @ [123:19] ==> @InlineOnly public inline fun <K, V> mapOf(): Map<String, Action> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Action

'IllegalArgumentException' @ [124:19] ==> public final fun <init>(): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'assert' @ [128:5] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'left' @ [128:12] ==> value-parameter left: String defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'right' @ [128:20] ==> value-parameter right: String defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'perLeft' @ [132:9] ==> value-parameter perLeft: Perceivable<T> defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'perRight' @ [132:20] ==> value-parameter perRight: Perceivable<T> defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'when (perLeft) {
        is UnaryPlus -> {
            if (perRight is UnaryPlus) {
                debugCompare(perLeft.arg, perRight.arg)
                return
            }
        }
        is PerceivableOperation -> {
            if (perRight is PerceivableOperation) {
                debugCompare(perLeft.left, perRight.left)
                debugCompare(perLeft.right, perRight.right)
                assert(perLeft.op == perRight.op)
                return
            }
        }
        is Interest -> {
            if (perRight is Interest) {
                debugCompare(perLeft.amount, perRight.amount)
                debugCompare(perLeft.interest, perRight.interest)
                debugCompare(perLeft.start, perRight.start)
                debugCompare(perLeft.end, perRight.end)
                assert(perLeft.dayCountConvention == perRight.dayCountConvention)
                return
            }
        }
        is Fixing -> {
            if (perRight is Fixing) {
                debugCompare(perLeft.date, perRight.date)
                debugCompare(perLeft.source, perRight.source)
                debugCompare(perLeft.date, perRight.date)
                return
            }
        }
    }' @ [134:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'perLeft' @ [134:11] ==> value-parameter perLeft: Perceivable<T> defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'perRight' @ [136:17] ==> value-parameter perRight: Perceivable<T> defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'debugCompare' @ [137:17] ==> public fun <T> debugCompare(perLeft: Perceivable<T>, perRight: Perceivable<T>): Unit defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'perLeft' @ [137:30] ==> value-parameter perLeft: Perceivable<T> defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'arg' @ [137:38] ==> public final val arg: Perceivable<T> defined in net.corda.finance.contracts.universal.UnaryPlus[PropertyDescriptorImpl]

'perRight' @ [137:43] ==> value-parameter perRight: Perceivable<T> defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'arg' @ [137:52] ==> public final val arg: Perceivable<T> defined in net.corda.finance.contracts.universal.UnaryPlus[PropertyDescriptorImpl]

'perRight' @ [142:17] ==> value-parameter perRight: Perceivable<T> defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'debugCompare' @ [143:17] ==> public fun <T> debugCompare(perLeft: Perceivable<T>, perRight: Perceivable<T>): Unit defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'perLeft' @ [143:30] ==> value-parameter perLeft: Perceivable<T> defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'left' @ [143:38] ==> public final val left: Perceivable<T> defined in net.corda.finance.contracts.universal.PerceivableOperation[PropertyDescriptorImpl]

'perRight' @ [143:44] ==> value-parameter perRight: Perceivable<T> defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'left' @ [143:53] ==> public final val left: Perceivable<T> defined in net.corda.finance.contracts.universal.PerceivableOperation[PropertyDescriptorImpl]

'debugCompare' @ [144:17] ==> public fun <T> debugCompare(perLeft: Perceivable<T>, perRight: Perceivable<T>): Unit defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'perLeft' @ [144:30] ==> value-parameter perLeft: Perceivable<T> defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'right' @ [144:38] ==> public final val right: Perceivable<T> defined in net.corda.finance.contracts.universal.PerceivableOperation[PropertyDescriptorImpl]

'perRight' @ [144:45] ==> value-parameter perRight: Perceivable<T> defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'right' @ [144:54] ==> public final val right: Perceivable<T> defined in net.corda.finance.contracts.universal.PerceivableOperation[PropertyDescriptorImpl]

'assert' @ [145:17] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'perLeft' @ [145:24] ==> value-parameter perLeft: Perceivable<T> defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'op' @ [145:32] ==> public final val op: Operation defined in net.corda.finance.contracts.universal.PerceivableOperation[PropertyDescriptorImpl]

'perRight' @ [145:38] ==> value-parameter perRight: Perceivable<T> defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'op' @ [145:47] ==> public final val op: Operation defined in net.corda.finance.contracts.universal.PerceivableOperation[PropertyDescriptorImpl]

'perRight' @ [150:17] ==> value-parameter perRight: Perceivable<T> defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'debugCompare' @ [151:17] ==> public fun <T> debugCompare(perLeft: Perceivable<BigDecimal>, perRight: Perceivable<BigDecimal>): Unit defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> BigDecimal

'perLeft' @ [151:30] ==> value-parameter perLeft: Perceivable<T> defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'amount' @ [151:38] ==> public final val amount: Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal.Interest[PropertyDescriptorImpl]

'perRight' @ [151:46] ==> value-parameter perRight: Perceivable<T> defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'amount' @ [151:55] ==> public final val amount: Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal.Interest[PropertyDescriptorImpl]

'debugCompare' @ [152:17] ==> public fun <T> debugCompare(perLeft: Perceivable<BigDecimal>, perRight: Perceivable<BigDecimal>): Unit defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> BigDecimal

'perLeft' @ [152:30] ==> value-parameter perLeft: Perceivable<T> defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'interest' @ [152:38] ==> public final val interest: Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal.Interest[PropertyDescriptorImpl]

'perRight' @ [152:48] ==> value-parameter perRight: Perceivable<T> defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'interest' @ [152:57] ==> public final val interest: Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal.Interest[PropertyDescriptorImpl]

'debugCompare' @ [153:17] ==> public fun <T> debugCompare(perLeft: Perceivable<Instant>, perRight: Perceivable<Instant>): Unit defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Instant

'perLeft' @ [153:30] ==> value-parameter perLeft: Perceivable<T> defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'start' @ [153:38] ==> public final val start: Perceivable<Instant> defined in net.corda.finance.contracts.universal.Interest[PropertyDescriptorImpl]

'perRight' @ [153:45] ==> value-parameter perRight: Perceivable<T> defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'start' @ [153:54] ==> public final val start: Perceivable<Instant> defined in net.corda.finance.contracts.universal.Interest[PropertyDescriptorImpl]

'debugCompare' @ [154:17] ==> public fun <T> debugCompare(perLeft: Perceivable<Instant>, perRight: Perceivable<Instant>): Unit defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Instant

'perLeft' @ [154:30] ==> value-parameter perLeft: Perceivable<T> defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'end' @ [154:38] ==> public final val end: Perceivable<Instant> defined in net.corda.finance.contracts.universal.Interest[PropertyDescriptorImpl]

'perRight' @ [154:43] ==> value-parameter perRight: Perceivable<T> defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'end' @ [154:52] ==> public final val end: Perceivable<Instant> defined in net.corda.finance.contracts.universal.Interest[PropertyDescriptorImpl]

'assert' @ [155:17] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'perLeft' @ [155:24] ==> value-parameter perLeft: Perceivable<T> defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'dayCountConvention' @ [155:32] ==> public final val dayCountConvention: String defined in net.corda.finance.contracts.universal.Interest[PropertyDescriptorImpl]

'perRight' @ [155:54] ==> value-parameter perRight: Perceivable<T> defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'dayCountConvention' @ [155:63] ==> public final val dayCountConvention: String defined in net.corda.finance.contracts.universal.Interest[PropertyDescriptorImpl]

'perRight' @ [160:17] ==> value-parameter perRight: Perceivable<T> defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'debugCompare' @ [161:17] ==> public fun <T> debugCompare(perLeft: Perceivable<Instant>, perRight: Perceivable<Instant>): Unit defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Instant

'perLeft' @ [161:30] ==> value-parameter perLeft: Perceivable<T> defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'date' @ [161:38] ==> public final val date: Perceivable<Instant> defined in net.corda.finance.contracts.universal.Fixing[PropertyDescriptorImpl]

'perRight' @ [161:44] ==> value-parameter perRight: Perceivable<T> defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'date' @ [161:53] ==> public final val date: Perceivable<Instant> defined in net.corda.finance.contracts.universal.Fixing[PropertyDescriptorImpl]

'debugCompare' @ [162:17] ==> public fun debugCompare(left: String, right: String): Unit defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'perLeft' @ [162:30] ==> value-parameter perLeft: Perceivable<T> defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'source' @ [162:38] ==> public final val source: String defined in net.corda.finance.contracts.universal.Fixing[PropertyDescriptorImpl]

'perRight' @ [162:46] ==> value-parameter perRight: Perceivable<T> defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'source' @ [162:55] ==> public final val source: String defined in net.corda.finance.contracts.universal.Fixing[PropertyDescriptorImpl]

'debugCompare' @ [163:17] ==> public fun <T> debugCompare(perLeft: Perceivable<Instant>, perRight: Perceivable<Instant>): Unit defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Instant

'perLeft' @ [163:30] ==> value-parameter perLeft: Perceivable<T> defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'date' @ [163:38] ==> public final val date: Perceivable<Instant> defined in net.corda.finance.contracts.universal.Fixing[PropertyDescriptorImpl]

'perRight' @ [163:44] ==> value-parameter perRight: Perceivable<T> defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'date' @ [163:53] ==> public final val date: Perceivable<Instant> defined in net.corda.finance.contracts.universal.Fixing[PropertyDescriptorImpl]

'assert' @ [169:5] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'assert' @ [173:5] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'parLeft' @ [173:12] ==> value-parameter parLeft: Party defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'parRight' @ [173:23] ==> value-parameter parRight: Party defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'assert' @ [177:5] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'left' @ [177:12] ==> value-parameter left: Frequency defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'right' @ [177:20] ==> value-parameter right: Frequency defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'assert' @ [181:5] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'left' @ [181:12] ==> value-parameter left: LocalDate defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'right' @ [181:20] ==> value-parameter right: LocalDate defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'parLeft' @ [185:9] ==> value-parameter parLeft: Set<Party> defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'parRight' @ [185:20] ==> value-parameter parRight: Set<Party> defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'assert' @ [187:5] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'parLeft' @ [187:12] ==> value-parameter parLeft: Set<Party> defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'parRight' @ [187:23] ==> value-parameter parRight: Set<Party> defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'arrLeft' @ [191:9] ==> value-parameter arrLeft: Arrangement defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'arrRight' @ [191:20] ==> value-parameter arrRight: Arrangement defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'when (arrLeft) {
        is Obligation -> {
            if (arrRight is Obligation) {

                debugCompare(arrLeft.amount, arrRight.amount)
                debugCompare(arrLeft.from, arrRight.from)
                debugCompare(arrLeft.to, arrRight.to)
                return
            }
        }
        is And -> {
            if (arrRight is And) {
                arrLeft.arrangements.zip(arrRight.arrangements).forEach {
                    debugCompare(it.first, it.second)
                }
                return
            }
        }
        is Actions -> {
            if (arrRight is Actions) {
                arrLeft.actions.zip(arrRight.actions).forEach {
                    debugCompare(it.first.arrangement, it.second.arrangement)
                    debugCompare(it.first.condition, it.second.condition)
                    debugCompare(it.first.name, it.second.name)
                    return
                }
            }
        }
        is RollOut -> {
            if (arrRight is RollOut) {
                debugCompare(arrLeft.template, arrRight.template)
                debugCompare(arrLeft.startDate, arrRight.startDate)
                debugCompare(arrLeft.endDate, arrRight.endDate)
                debugCompare(arrLeft.frequency, arrRight.frequency)
                return
            }
        }
    }' @ [193:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'arrLeft' @ [193:11] ==> value-parameter arrLeft: Arrangement defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'arrRight' @ [195:17] ==> value-parameter arrRight: Arrangement defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'debugCompare' @ [197:17] ==> public fun <T> debugCompare(perLeft: Perceivable<BigDecimal>, perRight: Perceivable<BigDecimal>): Unit defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> BigDecimal

'arrLeft' @ [197:30] ==> value-parameter arrLeft: Arrangement defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'amount' @ [197:38] ==> public final val amount: Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal.Obligation[PropertyDescriptorImpl]

'arrRight' @ [197:46] ==> value-parameter arrRight: Arrangement defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'amount' @ [197:55] ==> public final val amount: Perceivable<BigDecimal> defined in net.corda.finance.contracts.universal.Obligation[PropertyDescriptorImpl]

'debugCompare' @ [198:17] ==> public fun debugCompare(parLeft: Party, parRight: Party): Unit defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'arrLeft' @ [198:30] ==> value-parameter arrLeft: Arrangement defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'from' @ [198:38] ==> public final val from: Party defined in net.corda.finance.contracts.universal.Obligation[PropertyDescriptorImpl]

'arrRight' @ [198:44] ==> value-parameter arrRight: Arrangement defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'from' @ [198:53] ==> public final val from: Party defined in net.corda.finance.contracts.universal.Obligation[PropertyDescriptorImpl]

'debugCompare' @ [199:17] ==> public fun debugCompare(parLeft: Party, parRight: Party): Unit defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'arrLeft' @ [199:30] ==> value-parameter arrLeft: Arrangement defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'to' @ [199:38] ==> public final val to: Party defined in net.corda.finance.contracts.universal.Obligation[PropertyDescriptorImpl]

'arrRight' @ [199:42] ==> value-parameter arrRight: Arrangement defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'to' @ [199:51] ==> public final val to: Party defined in net.corda.finance.contracts.universal.Obligation[PropertyDescriptorImpl]

'arrRight' @ [204:17] ==> value-parameter arrRight: Arrangement defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'arrLeft' @ [205:17] ==> value-parameter arrLeft: Arrangement defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'arrangements' @ [205:25] ==> public final val arrangements: Set<Arrangement> defined in net.corda.finance.contracts.universal.And[PropertyDescriptorImpl]

'zip' @ [205:38] ==> public infix fun <T, R> Iterable<Arrangement>.zip(other: Iterable<Arrangement>): List<Pair<Arrangement, Arrangement>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Arrangement
    <R> -> Arrangement

'arrRight' @ [205:42] ==> value-parameter arrRight: Arrangement defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'arrangements' @ [205:51] ==> public final val arrangements: Set<Arrangement> defined in net.corda.finance.contracts.universal.And[PropertyDescriptorImpl]

'forEach' @ [205:65] ==> @HidesMembers public inline fun <T> Iterable<Pair<Arrangement, Arrangement>>.forEach(action: (Pair<Arrangement, Arrangement>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Arrangement, Arrangement>

'debugCompare' @ [206:21] ==> public fun debugCompare(arrLeft: Arrangement, arrRight: Arrangement): Unit defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'it' @ [206:34] ==> value-parameter it: Pair<Arrangement, Arrangement> defined in net.corda.finance.contracts.universal.debugCompare.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [206:37] ==> public final val first: Arrangement defined in kotlin.Pair[DeserializedPropertyDescriptor]

'it' @ [206:44] ==> value-parameter it: Pair<Arrangement, Arrangement> defined in net.corda.finance.contracts.universal.debugCompare.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [206:47] ==> public final val second: Arrangement defined in kotlin.Pair[DeserializedPropertyDescriptor]

'arrRight' @ [212:17] ==> value-parameter arrRight: Arrangement defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'arrLeft' @ [213:17] ==> value-parameter arrLeft: Arrangement defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'actions' @ [213:25] ==> public final val actions: Set<Action> defined in net.corda.finance.contracts.universal.Actions[PropertyDescriptorImpl]

'zip' @ [213:33] ==> public infix fun <T, R> Iterable<Action>.zip(other: Iterable<Action>): List<Pair<Action, Action>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Action
    <R> -> Action

'arrRight' @ [213:37] ==> value-parameter arrRight: Arrangement defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'actions' @ [213:46] ==> public final val actions: Set<Action> defined in net.corda.finance.contracts.universal.Actions[PropertyDescriptorImpl]

'forEach' @ [213:55] ==> @HidesMembers public inline fun <T> Iterable<Pair<Action, Action>>.forEach(action: (Pair<Action, Action>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Action, Action>

'debugCompare' @ [214:21] ==> public fun debugCompare(arrLeft: Arrangement, arrRight: Arrangement): Unit defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'it' @ [214:34] ==> value-parameter it: Pair<Action, Action> defined in net.corda.finance.contracts.universal.debugCompare.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [214:37] ==> public final val first: Action defined in kotlin.Pair[DeserializedPropertyDescriptor]

'arrangement' @ [214:43] ==> public final val arrangement: Arrangement defined in net.corda.finance.contracts.universal.Action[PropertyDescriptorImpl]

'it' @ [214:56] ==> value-parameter it: Pair<Action, Action> defined in net.corda.finance.contracts.universal.debugCompare.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [214:59] ==> public final val second: Action defined in kotlin.Pair[DeserializedPropertyDescriptor]

'arrangement' @ [214:66] ==> public final val arrangement: Arrangement defined in net.corda.finance.contracts.universal.Action[PropertyDescriptorImpl]

'debugCompare' @ [215:21] ==> public fun <T> debugCompare(perLeft: Perceivable<Boolean>, perRight: Perceivable<Boolean>): Unit defined in net.corda.finance.contracts.universal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Boolean

'it' @ [215:34] ==> value-parameter it: Pair<Action, Action> defined in net.corda.finance.contracts.universal.debugCompare.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [215:37] ==> public final val first: Action defined in kotlin.Pair[DeserializedPropertyDescriptor]

'condition' @ [215:43] ==> public final val condition: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.Action[PropertyDescriptorImpl]

'it' @ [215:54] ==> value-parameter it: Pair<Action, Action> defined in net.corda.finance.contracts.universal.debugCompare.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [215:57] ==> public final val second: Action defined in kotlin.Pair[DeserializedPropertyDescriptor]

'condition' @ [215:64] ==> public final val condition: Perceivable<Boolean> defined in net.corda.finance.contracts.universal.Action[PropertyDescriptorImpl]

'debugCompare' @ [216:21] ==> public fun debugCompare(left: String, right: String): Unit defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'it' @ [216:34] ==> value-parameter it: Pair<Action, Action> defined in net.corda.finance.contracts.universal.debugCompare.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [216:37] ==> public final val first: Action defined in kotlin.Pair[DeserializedPropertyDescriptor]

'name' @ [216:43] ==> public final val name: String defined in net.corda.finance.contracts.universal.Action[PropertyDescriptorImpl]

'it' @ [216:49] ==> value-parameter it: Pair<Action, Action> defined in net.corda.finance.contracts.universal.debugCompare.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [216:52] ==> public final val second: Action defined in kotlin.Pair[DeserializedPropertyDescriptor]

'name' @ [216:59] ==> public final val name: String defined in net.corda.finance.contracts.universal.Action[PropertyDescriptorImpl]

'arrRight' @ [222:17] ==> value-parameter arrRight: Arrangement defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'debugCompare' @ [223:17] ==> public fun debugCompare(arrLeft: Arrangement, arrRight: Arrangement): Unit defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'arrLeft' @ [223:30] ==> value-parameter arrLeft: Arrangement defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'template' @ [223:38] ==> public final val template: Arrangement defined in net.corda.finance.contracts.universal.RollOut[PropertyDescriptorImpl]

'arrRight' @ [223:48] ==> value-parameter arrRight: Arrangement defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'template' @ [223:57] ==> public final val template: Arrangement defined in net.corda.finance.contracts.universal.RollOut[PropertyDescriptorImpl]

'debugCompare' @ [224:17] ==> public fun debugCompare(left: LocalDate, right: LocalDate): Unit defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'arrLeft' @ [224:30] ==> value-parameter arrLeft: Arrangement defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'startDate' @ [224:38] ==> public final val startDate: LocalDate defined in net.corda.finance.contracts.universal.RollOut[PropertyDescriptorImpl]

'arrRight' @ [224:49] ==> value-parameter arrRight: Arrangement defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'startDate' @ [224:58] ==> public final val startDate: LocalDate defined in net.corda.finance.contracts.universal.RollOut[PropertyDescriptorImpl]

'debugCompare' @ [225:17] ==> public fun debugCompare(left: LocalDate, right: LocalDate): Unit defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'arrLeft' @ [225:30] ==> value-parameter arrLeft: Arrangement defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'endDate' @ [225:38] ==> public final val endDate: LocalDate defined in net.corda.finance.contracts.universal.RollOut[PropertyDescriptorImpl]

'arrRight' @ [225:47] ==> value-parameter arrRight: Arrangement defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'endDate' @ [225:56] ==> public final val endDate: LocalDate defined in net.corda.finance.contracts.universal.RollOut[PropertyDescriptorImpl]

'debugCompare' @ [226:17] ==> public fun debugCompare(left: Frequency, right: Frequency): Unit defined in net.corda.finance.contracts.universal in file Util.kt[SimpleFunctionDescriptorImpl]

'arrLeft' @ [226:30] ==> value-parameter arrLeft: Arrangement defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'frequency' @ [226:38] ==> public final val frequency: Frequency defined in net.corda.finance.contracts.universal.RollOut[PropertyDescriptorImpl]

'arrRight' @ [226:49] ==> value-parameter arrRight: Arrangement defined in net.corda.finance.contracts.universal.debugCompare[ValueParameterDescriptorImpl]

'frequency' @ [226:58] ==> public final val frequency: Frequency defined in net.corda.finance.contracts.universal.RollOut[PropertyDescriptorImpl]

'assert' @ [232:5] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

