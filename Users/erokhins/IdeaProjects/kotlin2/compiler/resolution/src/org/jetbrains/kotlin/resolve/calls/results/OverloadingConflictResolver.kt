'if (call1 != null && call2 != null)
                    call1.resultingDescriptor == call2.resultingDescriptor
                else
                    call1 == call2' @ [47:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'call1' @ [47:21] ==> value-parameter call1: C? defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.resolvedCallHashingStrategy.<no name provided>.equals[ValueParameterDescriptorImpl]

'call2' @ [47:38] ==> value-parameter call2: C? defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.resolvedCallHashingStrategy.<no name provided>.equals[ValueParameterDescriptorImpl]

'call1' @ [48:21] ==> value-parameter call1: C? defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.resolvedCallHashingStrategy.<no name provided>.equals[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [48:27] ==> private final val C.resultingDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[PropertyDescriptorImpl]

'call2' @ [48:50] ==> value-parameter call2: C? defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.resolvedCallHashingStrategy.<no name provided>.equals[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [48:56] ==> private final val C.resultingDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[PropertyDescriptorImpl]

'call1' @ [50:21] ==> value-parameter call1: C? defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.resolvedCallHashingStrategy.<no name provided>.equals[ValueParameterDescriptorImpl]

'call2' @ [50:30] ==> value-parameter call2: C? defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.resolvedCallHashingStrategy.<no name provided>.equals[ValueParameterDescriptorImpl]

'call' @ [53:17] ==> value-parameter call: C? defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.resolvedCallHashingStrategy.<no name provided>.computeHashCode[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [53:23] ==> private final val C.resultingDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[PropertyDescriptorImpl]

'hashCode' @ [53:44] ==> public open fun hashCode(): Int defined in org.jetbrains.kotlin.descriptors.CallableDescriptor[DeserializedSimpleFunctionDescriptor]

'invoke' @ [56:67] ==> public abstract operator fun invoke(p1: C): CallableDescriptor defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [56:90] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.resultingDescriptor[ReceiverParameterDescriptorImpl]

'candidates' @ [65:9] ==> value-parameter candidates: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.chooseMaximallySpecificCandidates[ValueParameterDescriptorImpl]

'setIfOneOrEmpty' @ [65:20] ==> private final fun Collection<C>.setIfOneOrEmpty(): Set<C>? defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[SimpleFunctionDescriptorImpl]

'let' @ [65:39] ==> @InlineOnly public inline fun <T, R> Set<C>.let(block: (Set<C>) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Set<C>
    <R> -> Nothing

'it' @ [65:52] ==> value-parameter it: Set<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.chooseMaximallySpecificCandidates.<anonymous>[ValueParameterDescriptorImpl]

'if (getVariableCandidates(candidates.first()) != null) {
            findMaximallySpecificVariableAsFunctionCalls(candidates, isDebuggerContext) ?: return LinkedHashSet(candidates)
        }
        else {
            candidates
        }' @ [67:31] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<C>, elseBranch: Collection<C>): Collection<C>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<C>

'invoke' @ [67:35] ==> public abstract operator fun invoke(p1: C): C? defined in kotlin.Function1[FunctionInvokeDescriptor]

'candidates' @ [67:57] ==> value-parameter candidates: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.chooseMaximallySpecificCandidates[ValueParameterDescriptorImpl]

'first' @ [67:68] ==> public fun <T> Iterable<C>.first(): C defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C

'findMaximallySpecificVariableAsFunctionCalls' @ [68:13] ==> private final fun findMaximallySpecificVariableAsFunctionCalls(candidates: Collection<C>, isDebuggerContext: Boolean): Set<C>? defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[SimpleFunctionDescriptorImpl]

'candidates' @ [68:58] ==> value-parameter candidates: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.chooseMaximallySpecificCandidates[ValueParameterDescriptorImpl]

'isDebuggerContext' @ [68:70] ==> value-parameter isDebuggerContext: Boolean defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.chooseMaximallySpecificCandidates[ValueParameterDescriptorImpl]

'LinkedHashSet' @ [68:99] ==> public constructor LinkedHashSet<E : (Any..Any?)>(p0: (MutableCollection<out (C..C?)>..Collection<(C..C?)>?)) defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> C

'candidates' @ [68:113] ==> value-parameter candidates: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.chooseMaximallySpecificCandidates[ValueParameterDescriptorImpl]

'candidates' @ [71:13] ==> value-parameter candidates: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.chooseMaximallySpecificCandidates[ValueParameterDescriptorImpl]

'filterOutEquivalentCalls' @ [74:33] ==> public final fun filterOutEquivalentCalls(candidates: Collection<C>): Set<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[SimpleFunctionDescriptorImpl]

'fixedCandidates' @ [74:58] ==> val fixedCandidates: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.chooseMaximallySpecificCandidates[LocalVariableDescriptor]

'filterOverrides' @ [75:42] ==> @NotNull public open fun <D : (Any..Any?)> filterOverrides(@NotNull p0: (MutableSet<(C..C?)>..Set<(C..C?)>), @NotNull p1: ((C..C?), (C..C?)) -> (Pair<(CallableDescriptor..CallableDescriptor?), (CallableDescriptor..CallableDescriptor?)>..Pair<(CallableDescriptor..CallableDescriptor?), (CallableDescriptor..CallableDescriptor?)>?)): (MutableSet<(C..C?)>..Set<(C..C?)>) defined in org.jetbrains.kotlin.resolve.OverridingUtil[JavaMethodDescriptor]
Inferred types:
    <D : (Any..Any?)> -> C

'noEquivalentCalls' @ [75:58] ==> val noEquivalentCalls: Set<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.chooseMaximallySpecificCandidates[LocalVariableDescriptor]

'a' @ [76:31] ==> value-parameter a: (C..C?) defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.chooseMaximallySpecificCandidates.<anonymous>[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [76:33] ==> private final val C.resultingDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[PropertyDescriptorImpl]

'b' @ [77:31] ==> value-parameter b: (C..C?) defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.chooseMaximallySpecificCandidates.<anonymous>[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [77:33] ==> private final val C.resultingDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[PropertyDescriptorImpl]

'aDescriptor' @ [82:17] ==> val aDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.chooseMaximallySpecificCandidates.<anonymous>[LocalVariableDescriptor]

'bDescriptor' @ [82:64] ==> val bDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.chooseMaximallySpecificCandidates.<anonymous>[LocalVariableDescriptor]

'aDescriptor' @ [83:39] ==> val aDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.chooseMaximallySpecificCandidates.<anonymous>[LocalVariableDescriptor]

'baseDescriptorForSynthetic' @ [83:51] ==> public abstract val baseDescriptorForSynthetic: DeclarationDescriptor defined in org.jetbrains.kotlin.descriptors.synthetic.SyntheticMemberDescriptor[PropertyDescriptorImpl]

'bDescriptor' @ [84:39] ==> val bDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.chooseMaximallySpecificCandidates.<anonymous>[LocalVariableDescriptor]

'baseDescriptorForSynthetic' @ [84:51] ==> public abstract val baseDescriptorForSynthetic: DeclarationDescriptor defined in org.jetbrains.kotlin.descriptors.synthetic.SyntheticMemberDescriptor[PropertyDescriptorImpl]

'aBaseDescriptor' @ [85:21] ==> val aBaseDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.chooseMaximallySpecificCandidates.<anonymous>[LocalVariableDescriptor]

'bBaseDescriptor' @ [85:68] ==> val bBaseDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.chooseMaximallySpecificCandidates.<anonymous>[LocalVariableDescriptor]

'Pair' @ [86:44] ==> public constructor Pair<out A, out B>(first: CallableMemberDescriptor, second: CallableMemberDescriptor) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> CallableMemberDescriptor
    <out B> -> CallableMemberDescriptor

'aBaseDescriptor' @ [86:49] ==> val aBaseDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.chooseMaximallySpecificCandidates.<anonymous>[LocalVariableDescriptor]

'bBaseDescriptor' @ [86:66] ==> val bBaseDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.chooseMaximallySpecificCandidates.<anonymous>[LocalVariableDescriptor]

'Pair' @ [89:13] ==> public constructor Pair<out A, out B>(first: CallableDescriptor, second: CallableDescriptor) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> CallableDescriptor
    <out B> -> CallableDescriptor

'aDescriptor' @ [89:18] ==> val aDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.chooseMaximallySpecificCandidates.<anonymous>[LocalVariableDescriptor]

'bDescriptor' @ [89:31] ==> val bDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.chooseMaximallySpecificCandidates.<anonymous>[LocalVariableDescriptor]

'noOverrides' @ [91:13] ==> val noOverrides: (MutableSet<(C..C?)>..Set<(C..C?)>) defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.chooseMaximallySpecificCandidates[LocalVariableDescriptor]

'size' @ [91:25] ==> public abstract val size: Int defined in kotlin.collections.MutableSet[DeserializedPropertyDescriptor]

'noOverrides' @ [92:20] ==> val noOverrides: (MutableSet<(C..C?)>..Set<(C..C?)>) defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.chooseMaximallySpecificCandidates[LocalVariableDescriptor]

'findMaximallySpecific' @ [95:33] ==> private final fun findMaximallySpecific(candidates: Set<C>, checkArgumentsMode: CheckArgumentTypesMode, discriminateGenerics: Boolean, isDebuggerContext: Boolean): C? defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[SimpleFunctionDescriptorImpl]

'noOverrides' @ [95:55] ==> val noOverrides: (MutableSet<(C..C?)>..Set<(C..C?)>) defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.chooseMaximallySpecificCandidates[LocalVariableDescriptor]

'checkArgumentsMode' @ [95:68] ==> value-parameter checkArgumentsMode: CheckArgumentTypesMode defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.chooseMaximallySpecificCandidates[ValueParameterDescriptorImpl]

'isDebuggerContext' @ [95:95] ==> value-parameter isDebuggerContext: Boolean defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.chooseMaximallySpecificCandidates[ValueParameterDescriptorImpl]

'maximallySpecific' @ [96:13] ==> val maximallySpecific: C? defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.chooseMaximallySpecificCandidates[LocalVariableDescriptor]

'setOf' @ [97:20] ==> public fun <T> setOf(element: C): Set<C> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C

'maximallySpecific' @ [97:26] ==> val maximallySpecific: C? defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.chooseMaximallySpecificCandidates[LocalVariableDescriptor]

'discriminateGenerics' @ [100:13] ==> value-parameter discriminateGenerics: Boolean defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.chooseMaximallySpecificCandidates[ValueParameterDescriptorImpl]

'findMaximallySpecific' @ [101:58] ==> private final fun findMaximallySpecific(candidates: Set<C>, checkArgumentsMode: CheckArgumentTypesMode, discriminateGenerics: Boolean, isDebuggerContext: Boolean): C? defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[SimpleFunctionDescriptorImpl]

'noOverrides' @ [101:80] ==> val noOverrides: (MutableSet<(C..C?)>..Set<(C..C?)>) defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.chooseMaximallySpecificCandidates[LocalVariableDescriptor]

'checkArgumentsMode' @ [101:93] ==> value-parameter checkArgumentsMode: CheckArgumentTypesMode defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.chooseMaximallySpecificCandidates[ValueParameterDescriptorImpl]

'isDebuggerContext' @ [101:119] ==> value-parameter isDebuggerContext: Boolean defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.chooseMaximallySpecificCandidates[ValueParameterDescriptorImpl]

'maximallySpecificGenericsDiscriminated' @ [102:17] ==> val maximallySpecificGenericsDiscriminated: C? defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.chooseMaximallySpecificCandidates[LocalVariableDescriptor]

'setOf' @ [103:24] ==> public fun <T> setOf(element: C): Set<C> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C

'maximallySpecificGenericsDiscriminated' @ [103:30] ==> val maximallySpecificGenericsDiscriminated: C? defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.chooseMaximallySpecificCandidates[LocalVariableDescriptor]

'noOverrides' @ [107:16] ==> val noOverrides: (MutableSet<(C..C?)>..Set<(C..C?)>) defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.chooseMaximallySpecificCandidates[LocalVariableDescriptor]

'candidates' @ [114:9] ==> value-parameter candidates: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.filterOutEquivalentCalls[ValueParameterDescriptorImpl]

'setIfOneOrEmpty' @ [114:20] ==> private final fun Collection<C>.setIfOneOrEmpty(): Set<C>? defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[SimpleFunctionDescriptorImpl]

'let' @ [114:39] ==> @InlineOnly public inline fun <T, R> Set<C>.let(block: (Set<C>) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Set<C>
    <R> -> Nothing

'it' @ [114:52] ==> value-parameter it: Set<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.filterOutEquivalentCalls.<anonymous>[ValueParameterDescriptorImpl]

'candidates' @ [116:36] ==> value-parameter candidates: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.filterOutEquivalentCalls[ValueParameterDescriptorImpl]

'sortedBy' @ [116:47] ==> public inline fun <T, R : Comparable<{Long & Comparable<{Long & Any & Byte & Short & Int}> & Comparable<Nothing> & Int}>> Iterable<C>.sortedBy(crossinline selector: (C) -> {Long & Comparable<{Long & Any & Byte & Short & Int}> & Comparable<Nothing> & Int}?): List<C> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C
    <R : Comparable<R>> -> {Long & Comparable<{Long & Any & Byte & Short & Int}> & Comparable<Nothing> & Int}

'if (isFromSources(it.resultingDescriptor)) 0 else 1' @ [116:58] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: {Long? & Byte? & Comparable<{Long & Any & Byte & Short & Int}>? & Comparable<{Long & Comparable<{Long & Any & Byte & Short & Int}> & Comparable<Nothing> & Int}>? & Short? & Comparable<Nothing>? & Int?}, elseBranch: {Long? & Byte? & Comparable<{Long & Any & Byte & Short & Int}>? & Comparable<{Long & Comparable<{Long & Any & Byte & Short & Int}> & Comparable<Nothing> & Int}>? & Short? & Comparable<Nothing>? & Int?}): {Long? & Byte? & Comparable<{Long & Any & Byte & Short & Int}>? & Comparable<{Long & Comparable<{Long & Any & Byte & Short & Int}> & Comparable<Nothing> & Int}>? & Short? & Comparable<Nothing>? & Int?}[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> {Long? & Byte? & Comparable<{Long & Any & Byte & Short & Int}>? & Comparable<{Long & Comparable<{Long & Any & Byte & Short & Int}> & Comparable<Nothing> & Int}>? & Short? & Comparable<Nothing>? & Int?}

'invoke' @ [116:62] ==> public abstract operator fun invoke(p1: CallableDescriptor): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [116:76] ==> value-parameter it: C defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.filterOutEquivalentCalls.<anonymous>[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [116:79] ==> private final val C.resultingDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[PropertyDescriptorImpl]

'LinkedHashSet' @ [118:22] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> C

'fromSourcesGoesFirst' @ [119:32] ==> val fromSourcesGoesFirst: List<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.filterOutEquivalentCalls[LocalVariableDescriptor]

'result' @ [120:28] ==> val result: LinkedHashSet<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.filterOutEquivalentCalls[LocalVariableDescriptor]

'meD' @ [121:26] ==> val meD: C defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.filterOutEquivalentCalls[LocalVariableDescriptor]

'resultingDescriptor' @ [121:30] ==> private final val C.resultingDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[PropertyDescriptorImpl]

'otherD' @ [122:29] ==> val otherD: C defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.filterOutEquivalentCalls[LocalVariableDescriptor]

'resultingDescriptor' @ [122:36] ==> private final val C.resultingDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[PropertyDescriptorImpl]

'invoke' @ [123:40] ==> public abstract operator fun invoke(p1: CallableDescriptor): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'me' @ [123:54] ==> val me: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.filterOutEquivalentCalls[LocalVariableDescriptor]

'invoke' @ [123:61] ==> public abstract operator fun invoke(p1: CallableDescriptor): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'other' @ [123:75] ==> val other: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.filterOutEquivalentCalls[LocalVariableDescriptor]

'DescriptorEquivalenceForOverrides' @ [124:21] ==> public object DescriptorEquivalenceForOverrides defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'areCallableDescriptorsEquivalent' @ [124:55] ==> public final fun areCallableDescriptorsEquivalent(a: CallableDescriptor, b: CallableDescriptor, ignoreReturnType: Boolean = ...): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorEquivalenceForOverrides[DeserializedSimpleFunctionDescriptor]

'me' @ [124:88] ==> val me: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.filterOutEquivalentCalls[LocalVariableDescriptor]

'other' @ [124:92] ==> val other: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.filterOutEquivalentCalls[LocalVariableDescriptor]

'ignoreReturnType' @ [124:99] ==> val ignoreReturnType: Boolean defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.filterOutEquivalentCalls[LocalVariableDescriptor]

'result' @ [128:13] ==> val result: LinkedHashSet<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.filterOutEquivalentCalls[LocalVariableDescriptor]

'add' @ [128:20] ==> public open fun add(element: C): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'meD' @ [128:24] ==> val meD: C defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.filterOutEquivalentCalls[LocalVariableDescriptor]

'result' @ [131:16] ==> val result: LinkedHashSet<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.filterOutEquivalentCalls[LocalVariableDescriptor]

'when(size) {
        0 -> emptySet()
        1 -> setOf(single())
        else -> null
    }' @ [134:51] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Set<C>?, entry1: Set<C>?, entry2: Set<C>?): Set<C>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Set<C>?

'size' @ [134:56] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'emptySet' @ [135:14] ==> public fun <T> emptySet(): Set<C> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C

'setOf' @ [136:14] ==> public fun <T> setOf(element: C): Set<C> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C

'single' @ [136:20] ==> public fun <T> Iterable<C>.single(): C defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C

'if (candidates.size <= 1)
                candidates.firstOrNull()
            else when (checkArgumentsMode) {
                CheckArgumentTypesMode.CHECK_CALLABLE_TYPE ->
                    uniquifyCandidatesSet(candidates).singleOrNull {
                        isDefinitelyMostSpecific(it, candidates) { call1, call2 ->
                            isNotLessSpecificCallableReference(call1.resultingDescriptor, call2.resultingDescriptor)
                        }
                    }

                CheckArgumentTypesMode.CHECK_VALUE_ARGUMENTS ->
                    findMaximallySpecificCall(candidates, discriminateGenerics, isDebuggerContext)
                    ?: findMaximallySpecificCall(
                            candidates.filterNotTo(mutableSetOf()) { createFlatSignature(it).isSyntheticMember },
                            discriminateGenerics, isDebuggerContext
                    )
            }' @ [146:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: C?, elseBranch: C?): C?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> C?

'candidates' @ [146:17] ==> value-parameter candidates: Set<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.findMaximallySpecific[ValueParameterDescriptorImpl]

'size' @ [146:28] ==> public abstract val size: Int defined in kotlin.collections.Set[DeserializedPropertyDescriptor]

'candidates' @ [147:17] ==> value-parameter candidates: Set<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.findMaximallySpecific[ValueParameterDescriptorImpl]

'firstOrNull' @ [147:28] ==> public fun <T> Iterable<C>.firstOrNull(): C? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C

'when (checkArgumentsMode) {
                CheckArgumentTypesMode.CHECK_CALLABLE_TYPE ->
                    uniquifyCandidatesSet(candidates).singleOrNull {
                        isDefinitelyMostSpecific(it, candidates) { call1, call2 ->
                            isNotLessSpecificCallableReference(call1.resultingDescriptor, call2.resultingDescriptor)
                        }
                    }

                CheckArgumentTypesMode.CHECK_VALUE_ARGUMENTS ->
                    findMaximallySpecificCall(candidates, discriminateGenerics, isDebuggerContext)
                    ?: findMaximallySpecificCall(
                            candidates.filterNotTo(mutableSetOf()) { createFlatSignature(it).isSyntheticMember },
                            discriminateGenerics, isDebuggerContext
                    )
            }' @ [148:18] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: C?, entry1: C?): C?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> C?

'checkArgumentsMode' @ [148:24] ==> value-parameter checkArgumentsMode: CheckArgumentTypesMode defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.findMaximallySpecific[ValueParameterDescriptorImpl]

'CHECK_CALLABLE_TYPE' @ [149:40] ==> enum entry CHECK_CALLABLE_TYPE defined in org.jetbrains.kotlin.resolve.calls.context.CheckArgumentTypesMode[FakeCallableDescriptorForObject]

'uniquifyCandidatesSet' @ [150:21] ==> private final fun uniquifyCandidatesSet(candidates: Collection<C>): Set<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[SimpleFunctionDescriptorImpl]

'candidates' @ [150:43] ==> value-parameter candidates: Set<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.findMaximallySpecific[ValueParameterDescriptorImpl]

'singleOrNull' @ [150:55] ==> public inline fun <T> Iterable<C>.singleOrNull(predicate: (C) -> Boolean): C? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C

'isDefinitelyMostSpecific' @ [151:25] ==> private final inline fun <C> isDefinitelyMostSpecific(candidate: C, candidates: Collection<C>, isNotLessSpecific: (C, C) -> Boolean): Boolean defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <C> -> C

'it' @ [151:50] ==> value-parameter it: C defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.findMaximallySpecific.<anonymous>[ValueParameterDescriptorImpl]

'candidates' @ [151:54] ==> value-parameter candidates: Set<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.findMaximallySpecific[ValueParameterDescriptorImpl]

'isNotLessSpecificCallableReference' @ [152:29] ==> private final fun isNotLessSpecificCallableReference(f: CallableDescriptor, g: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[SimpleFunctionDescriptorImpl]

'call1' @ [152:64] ==> value-parameter call1: C defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.findMaximallySpecific.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [152:70] ==> private final val C.resultingDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[PropertyDescriptorImpl]

'call2' @ [152:91] ==> value-parameter call2: C defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.findMaximallySpecific.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [152:97] ==> private final val C.resultingDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[PropertyDescriptorImpl]

'CHECK_VALUE_ARGUMENTS' @ [156:40] ==> enum entry CHECK_VALUE_ARGUMENTS defined in org.jetbrains.kotlin.resolve.calls.context.CheckArgumentTypesMode[FakeCallableDescriptorForObject]

'findMaximallySpecificCall' @ [157:21] ==> private final fun findMaximallySpecificCall(candidates: Set<C>, discriminateGenerics: Boolean, isDebuggerContext: Boolean): C? defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[SimpleFunctionDescriptorImpl]

'candidates' @ [157:47] ==> value-parameter candidates: Set<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.findMaximallySpecific[ValueParameterDescriptorImpl]

'discriminateGenerics' @ [157:59] ==> value-parameter discriminateGenerics: Boolean defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.findMaximallySpecific[ValueParameterDescriptorImpl]

'isDebuggerContext' @ [157:81] ==> value-parameter isDebuggerContext: Boolean defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.findMaximallySpecific[ValueParameterDescriptorImpl]

'findMaximallySpecificCall' @ [158:24] ==> private final fun findMaximallySpecificCall(candidates: Set<C>, discriminateGenerics: Boolean, isDebuggerContext: Boolean): C? defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[SimpleFunctionDescriptorImpl]

'candidates' @ [159:29] ==> value-parameter candidates: Set<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.findMaximallySpecific[ValueParameterDescriptorImpl]

'filterNotTo' @ [159:40] ==> public inline fun <T, C : MutableCollection<in C>> Iterable<C>.filterNotTo(destination: MutableSet<C>, predicate: (C) -> Boolean): MutableSet<C> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C
    <C : MutableCollection<in T>> -> MutableSet<C>

'mutableSetOf' @ [159:52] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<C> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C

'invoke' @ [159:70] ==> public abstract operator fun invoke(p1: C): FlatSignature<C> defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [159:90] ==> value-parameter it: C defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.findMaximallySpecific.<anonymous>[ValueParameterDescriptorImpl]

'isSyntheticMember' @ [159:94] ==> public final val isSyntheticMember: Boolean defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature[PropertyDescriptorImpl]

'discriminateGenerics' @ [160:29] ==> value-parameter discriminateGenerics: Boolean defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.findMaximallySpecific[ValueParameterDescriptorImpl]

'isDebuggerContext' @ [160:51] ==> value-parameter isDebuggerContext: Boolean defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.findMaximallySpecific[ValueParameterDescriptorImpl]

'candidates' @ [166:29] ==> value-parameter candidates: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.findMaximallySpecificVariableAsFunctionCalls[ValueParameterDescriptorImpl]

'mapTo' @ [166:40] ==> public inline fun <T, R, C : MutableCollection<in C>> Iterable<C>.mapTo(destination: MutableSet<C>, transform: (C) -> C): MutableSet<C> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C
    <R> -> C
    <C : MutableCollection<in R>> -> MutableSet<C>

'newResolvedCallSet' @ [166:46] ==> private final fun newResolvedCallSet(expectedSize: Int): MutableSet<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[SimpleFunctionDescriptorImpl]

'candidates' @ [166:65] ==> value-parameter candidates: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.findMaximallySpecificVariableAsFunctionCalls[ValueParameterDescriptorImpl]

'size' @ [166:76] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'invoke' @ [167:13] ==> public abstract operator fun invoke(p1: C): C? defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [167:35] ==> value-parameter it: C defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.findMaximallySpecificVariableAsFunctionCalls.<anonymous>[ValueParameterDescriptorImpl]

'AssertionError' @ [167:48] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'it' @ [167:112] ==> value-parameter it: C defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.findMaximallySpecificVariableAsFunctionCalls.<anonymous>[ValueParameterDescriptorImpl]

'chooseMaximallySpecificCandidates' @ [170:40] ==> public final fun chooseMaximallySpecificCandidates(candidates: Collection<C>, checkArgumentsMode: CheckArgumentTypesMode, discriminateGenerics: Boolean, isDebuggerContext: Boolean): Set<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[SimpleFunctionDescriptorImpl]

'variableCalls' @ [170:74] ==> val variableCalls: MutableSet<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.findMaximallySpecificVariableAsFunctionCalls[LocalVariableDescriptor]

'CHECK_VALUE_ARGUMENTS' @ [170:112] ==> enum entry CHECK_VALUE_ARGUMENTS defined in org.jetbrains.kotlin.resolve.calls.context.CheckArgumentTypesMode[FakeCallableDescriptorForObject]

'isDebuggerContext' @ [171:93] ==> value-parameter isDebuggerContext: Boolean defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.findMaximallySpecificVariableAsFunctionCalls[ValueParameterDescriptorImpl]

'maxSpecificVariableCalls' @ [173:39] ==> val maxSpecificVariableCalls: Set<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.findMaximallySpecificVariableAsFunctionCalls[LocalVariableDescriptor]

'singleOrNull' @ [173:64] ==> public fun <T> Iterable<C>.singleOrNull(): C? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C

'candidates' @ [174:16] ==> value-parameter candidates: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.findMaximallySpecificVariableAsFunctionCalls[ValueParameterDescriptorImpl]

'filterTo' @ [174:27] ==> public inline fun <T, C : MutableCollection<in C>> Iterable<C>.filterTo(destination: MutableSet<C>, predicate: (C) -> Boolean): MutableSet<C> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C
    <C : MutableCollection<in T>> -> MutableSet<C>

'newResolvedCallSet' @ [174:36] ==> private final fun newResolvedCallSet(expectedSize: Int): MutableSet<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[SimpleFunctionDescriptorImpl]

'invoke' @ [175:13] ==> public abstract operator fun invoke(p1: C): C? defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [175:35] ==> value-parameter it: C defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.findMaximallySpecificVariableAsFunctionCalls.<anonymous>[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [175:41] ==> private final val C.resultingDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[PropertyDescriptorImpl]

'maxSpecificVariableCall' @ [175:64] ==> val maxSpecificVariableCall: C defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.findMaximallySpecificVariableAsFunctionCalls[LocalVariableDescriptor]

'resultingDescriptor' @ [175:88] ==> private final val C.resultingDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[PropertyDescriptorImpl]

'uniquifyCandidatesSet' @ [184:34] ==> private final fun uniquifyCandidatesSet(candidates: Collection<C>): Set<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[SimpleFunctionDescriptorImpl]

'candidates' @ [184:56] ==> value-parameter candidates: Set<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.findMaximallySpecificCall[ValueParameterDescriptorImpl]

'filteredCandidates' @ [186:13] ==> val filteredCandidates: Set<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.findMaximallySpecificCall[LocalVariableDescriptor]

'size' @ [186:32] ==> public abstract val size: Int defined in kotlin.collections.Set[DeserializedPropertyDescriptor]

'filteredCandidates' @ [186:50] ==> val filteredCandidates: Set<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.findMaximallySpecificCall[LocalVariableDescriptor]

'singleOrNull' @ [186:69] ==> public fun <T> Iterable<C>.singleOrNull(): C? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C

'filteredCandidates' @ [188:37] ==> val filteredCandidates: Set<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.findMaximallySpecificCall[LocalVariableDescriptor]

'map' @ [188:56] ==> public inline fun <T, R> Iterable<C>.map(transform: (C) -> FlatSignature<C>): List<FlatSignature<C>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C
    <R> -> FlatSignature<C>

'invoke' @ [190:13] ==> public abstract operator fun invoke(p1: C): FlatSignature<C> defined in kotlin.Function1[FunctionInvokeDescriptor]

'candidateCall' @ [190:33] ==> value-parameter candidateCall: C defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.findMaximallySpecificCall.<anonymous>[ValueParameterDescriptorImpl]

'conflictingCandidates' @ [193:46] ==> val conflictingCandidates: List<FlatSignature<C>> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.findMaximallySpecificCall[LocalVariableDescriptor]

'filter' @ [193:68] ==> public inline fun <T> Iterable<FlatSignature<C>>.filter(predicate: (FlatSignature<C>) -> Boolean): List<FlatSignature<C>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FlatSignature<C>

'isMostSpecific' @ [195:13] ==> private final inline fun <C> isMostSpecific(candidate: FlatSignature<C>, candidates: Collection<FlatSignature<C>>, isNotLessSpecific: (FlatSignature<C>, FlatSignature<C>) -> Boolean): Boolean defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <C> -> FlatSignature<C>

'candidate' @ [195:28] ==> value-parameter candidate: FlatSignature<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.findMaximallySpecificCall.<anonymous>[ValueParameterDescriptorImpl]

'conflictingCandidates' @ [195:39] ==> val conflictingCandidates: List<FlatSignature<C>> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.findMaximallySpecificCall[LocalVariableDescriptor]

'isNotLessSpecificCallWithArgumentMapping' @ [197:17] ==> private final fun isNotLessSpecificCallWithArgumentMapping(call1: FlatSignature<C>, call2: FlatSignature<C>, discriminateGenerics: Boolean): Boolean defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[SimpleFunctionDescriptorImpl]

'call1' @ [197:58] ==> value-parameter call1: FlatSignature<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.findMaximallySpecificCall.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'call2' @ [197:65] ==> value-parameter call2: FlatSignature<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.findMaximallySpecificCall.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'discriminateGenerics' @ [197:72] ==> value-parameter discriminateGenerics: Boolean defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.findMaximallySpecificCall[ValueParameterDescriptorImpl]

'bestCandidatesByParameterTypes' @ [201:16] ==> val bestCandidatesByParameterTypes: List<FlatSignature<C>> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.findMaximallySpecificCall[LocalVariableDescriptor]

'exactMaxWith' @ [201:47] ==> private final inline fun <C : Any> Collection<FlatSignature<C>>.exactMaxWith(isNotWorse: (FlatSignature<C>, FlatSignature<C>) -> Boolean): FlatSignature<C>? defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <C : Any> -> FlatSignature<C>

'isOfNotLessSpecificShape' @ [203:13] ==> private final fun isOfNotLessSpecificShape(call1: FlatSignature<C>, call2: FlatSignature<C>): Boolean defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[SimpleFunctionDescriptorImpl]

'call1' @ [203:38] ==> value-parameter call1: FlatSignature<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.findMaximallySpecificCall.<anonymous>[ValueParameterDescriptorImpl]

'call2' @ [203:45] ==> value-parameter call2: FlatSignature<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.findMaximallySpecificCall.<anonymous>[ValueParameterDescriptorImpl]

'isOfNotLessSpecificVisibilityForDebugger' @ [203:55] ==> private final fun isOfNotLessSpecificVisibilityForDebugger(call1: FlatSignature<C>, call2: FlatSignature<C>, isDebuggerContext: Boolean): Boolean defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[SimpleFunctionDescriptorImpl]

'call1' @ [203:96] ==> value-parameter call1: FlatSignature<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.findMaximallySpecificCall.<anonymous>[ValueParameterDescriptorImpl]

'call2' @ [203:103] ==> value-parameter call2: FlatSignature<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.findMaximallySpecificCall.<anonymous>[ValueParameterDescriptorImpl]

'isDebuggerContext' @ [203:110] ==> value-parameter isDebuggerContext: Boolean defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.findMaximallySpecificCall[ValueParameterDescriptorImpl]

'origin' @ [204:12] ==> public final val origin: C defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature[PropertyDescriptorImpl]

'this' @ [209:27] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.exactMaxWith[ReceiverParameterDescriptorImpl]

'result' @ [210:17] ==> var result: C? defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.exactMaxWith[LocalVariableDescriptor]

'invoke' @ [210:35] ==> public abstract operator fun invoke(p1: C, p2: C): Boolean defined in kotlin.Function2[FunctionInvokeDescriptor]

'candidate' @ [210:46] ==> val candidate: C defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.exactMaxWith[LocalVariableDescriptor]

'result' @ [210:57] ==> var result: C? defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.exactMaxWith[LocalVariableDescriptor]

'result' @ [211:17] ==> var result: C? defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.exactMaxWith[LocalVariableDescriptor]

'candidate' @ [211:26] ==> val candidate: C defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.exactMaxWith[LocalVariableDescriptor]

'result' @ [214:13] ==> var result: C? defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.exactMaxWith[LocalVariableDescriptor]

'any' @ [215:13] ==> public inline fun <T> Iterable<C>.any(predicate: (C) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C

'it' @ [215:19] ==> value-parameter it: C defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.exactMaxWith.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [215:25] ==> var result: C? defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.exactMaxWith[LocalVariableDescriptor]

'invoke' @ [215:35] ==> public abstract operator fun invoke(p1: C, p2: C): Boolean defined in kotlin.Function2[FunctionInvokeDescriptor]

'it' @ [215:46] ==> value-parameter it: C defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.exactMaxWith.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [215:50] ==> var result: C? defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.exactMaxWith[LocalVariableDescriptor]

'result' @ [218:16] ==> var result: C? defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.exactMaxWith[LocalVariableDescriptor]

'candidates' @ [222:13] ==> value-parameter candidates: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.isMostSpecific[ValueParameterDescriptorImpl]

'all' @ [222:24] ==> public inline fun <T> Iterable<C>.all(predicate: (C) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C

'candidate' @ [224:17] ==> value-parameter candidate: C defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.isMostSpecific[ValueParameterDescriptorImpl]

'other' @ [224:31] ==> value-parameter other: C defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.isMostSpecific.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [225:17] ==> public abstract operator fun invoke(p1: C, p2: C): Boolean defined in kotlin.Function2[FunctionInvokeDescriptor]

'candidate' @ [225:35] ==> value-parameter candidate: C defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.isMostSpecific[ValueParameterDescriptorImpl]

'other' @ [225:46] ==> value-parameter other: C defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.isMostSpecific.<anonymous>[ValueParameterDescriptorImpl]

'candidates' @ [229:13] ==> value-parameter candidates: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.isDefinitelyMostSpecific[ValueParameterDescriptorImpl]

'all' @ [229:24] ==> public inline fun <T> Iterable<C>.all(predicate: (C) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C

'candidate' @ [231:17] ==> value-parameter candidate: C defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.isDefinitelyMostSpecific[ValueParameterDescriptorImpl]

'other' @ [231:31] ==> value-parameter other: C defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.isDefinitelyMostSpecific.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [232:17] ==> public abstract operator fun invoke(p1: C, p2: C): Boolean defined in kotlin.Function2[FunctionInvokeDescriptor]

'candidate' @ [232:35] ==> value-parameter candidate: C defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.isDefinitelyMostSpecific[ValueParameterDescriptorImpl]

'other' @ [232:46] ==> value-parameter other: C defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.isDefinitelyMostSpecific.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [232:56] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'invoke' @ [232:57] ==> public abstract operator fun invoke(p1: C, p2: C): Boolean defined in kotlin.Function2[FunctionInvokeDescriptor]

'other' @ [232:75] ==> value-parameter other: C defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.isDefinitelyMostSpecific.<anonymous>[ValueParameterDescriptorImpl]

'candidate' @ [232:82] ==> value-parameter candidate: C defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.isDefinitelyMostSpecific[ValueParameterDescriptorImpl]

'tryCompareDescriptorsFromScripts' @ [243:16] ==> private final fun tryCompareDescriptorsFromScripts(d1: CallableDescriptor, d2: CallableDescriptor): Boolean? defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[SimpleFunctionDescriptorImpl]

'call1' @ [243:49] ==> value-parameter call1: FlatSignature<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.isNotLessSpecificCallWithArgumentMapping[ValueParameterDescriptorImpl]

'candidateDescriptor' @ [243:55] ==> private final fun FlatSignature<C>.candidateDescriptor(): CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[SimpleFunctionDescriptorImpl]

'call2' @ [243:78] ==> value-parameter call2: FlatSignature<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.isNotLessSpecificCallWithArgumentMapping[ValueParameterDescriptorImpl]

'candidateDescriptor' @ [243:84] ==> private final fun FlatSignature<C>.candidateDescriptor(): CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[SimpleFunctionDescriptorImpl]

'compareCallsByUsedArguments' @ [244:16] ==> private final fun compareCallsByUsedArguments(call1: FlatSignature<C>, call2: FlatSignature<C>, discriminateGenerics: Boolean): Boolean defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[SimpleFunctionDescriptorImpl]

'call1' @ [244:44] ==> value-parameter call1: FlatSignature<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.isNotLessSpecificCallWithArgumentMapping[ValueParameterDescriptorImpl]

'call2' @ [244:51] ==> value-parameter call2: FlatSignature<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.isNotLessSpecificCallWithArgumentMapping[ValueParameterDescriptorImpl]

'discriminateGenerics' @ [244:58] ==> value-parameter discriminateGenerics: Boolean defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.isNotLessSpecificCallWithArgumentMapping[ValueParameterDescriptorImpl]

'discriminateGenerics' @ [256:13] ==> value-parameter discriminateGenerics: Boolean defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.compareCallsByUsedArguments[ValueParameterDescriptorImpl]

'call1' @ [257:30] ==> value-parameter call1: FlatSignature<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.compareCallsByUsedArguments[ValueParameterDescriptorImpl]

'isGeneric' @ [257:36] ==> public final val isGeneric: Boolean defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature[PropertyDescriptorImpl]

'call2' @ [258:30] ==> value-parameter call2: FlatSignature<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.compareCallsByUsedArguments[ValueParameterDescriptorImpl]

'isGeneric' @ [258:36] ==> public final val isGeneric: Boolean defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature[PropertyDescriptorImpl]

'isGeneric1' @ [260:17] ==> val isGeneric1: Boolean defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.compareCallsByUsedArguments[LocalVariableDescriptor]

'!' @ [260:31] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isGeneric2' @ [260:32] ==> val isGeneric2: Boolean defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.compareCallsByUsedArguments[LocalVariableDescriptor]

'!' @ [261:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isGeneric1' @ [261:18] ==> val isGeneric1: Boolean defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.compareCallsByUsedArguments[LocalVariableDescriptor]

'isGeneric2' @ [261:32] ==> val isGeneric2: Boolean defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.compareCallsByUsedArguments[LocalVariableDescriptor]

'isGeneric1' @ [263:17] ==> val isGeneric1: Boolean defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.compareCallsByUsedArguments[LocalVariableDescriptor]

'isGeneric2' @ [263:31] ==> val isGeneric2: Boolean defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.compareCallsByUsedArguments[LocalVariableDescriptor]

'!' @ [266:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'call1' @ [266:14] ==> value-parameter call1: FlatSignature<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.compareCallsByUsedArguments[ValueParameterDescriptorImpl]

'isHeader' @ [266:20] ==> public final val isHeader: Boolean defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature[PropertyDescriptorImpl]

'call2' @ [266:32] ==> value-parameter call2: FlatSignature<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.compareCallsByUsedArguments[ValueParameterDescriptorImpl]

'isHeader' @ [266:38] ==> public final val isHeader: Boolean defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature[PropertyDescriptorImpl]

'call1' @ [267:13] ==> value-parameter call1: FlatSignature<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.compareCallsByUsedArguments[ValueParameterDescriptorImpl]

'isHeader' @ [267:19] ==> public final val isHeader: Boolean defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature[PropertyDescriptorImpl]

'!' @ [267:31] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'call2' @ [267:32] ==> value-parameter call2: FlatSignature<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.compareCallsByUsedArguments[ValueParameterDescriptorImpl]

'isHeader' @ [267:38] ==> public final val isHeader: Boolean defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature[PropertyDescriptorImpl]

'invoke' @ [269:16] ==> public abstract operator fun invoke(): SimpleConstraintSystem defined in kotlin.Function0[FunctionInvokeDescriptor]

'isSignatureNotLessSpecific' @ [269:46] ==> public fun <T> SimpleConstraintSystem.isSignatureNotLessSpecific(specific: FlatSignature<C>, general: FlatSignature<C>, callbacks: SpecificityComparisonCallbacks, specificityComparator: TypeSpecificityComparator): Boolean defined in org.jetbrains.kotlin.resolve.calls.results[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> C

'call1' @ [269:73] ==> value-parameter call1: FlatSignature<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.compareCallsByUsedArguments[ValueParameterDescriptorImpl]

'call2' @ [269:80] ==> value-parameter call2: FlatSignature<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.compareCallsByUsedArguments[ValueParameterDescriptorImpl]

'SpecificityComparisonWithNumerics' @ [269:87] ==> private final val SpecificityComparisonWithNumerics: <no name provided><C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[PropertyDescriptorImpl]

'specificityComparator' @ [269:122] ==> private final val specificityComparator: TypeSpecificityComparator defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[PropertyDescriptorImpl]

'builtIns' @ [274:27] ==> private final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[PropertyDescriptorImpl]

'doubleType' @ [274:36] ==> public final val KotlinBuiltIns.doubleType: SimpleType[MyPropertyDescriptor]

'builtIns' @ [275:26] ==> private final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[PropertyDescriptorImpl]

'floatType' @ [275:35] ==> public final val KotlinBuiltIns.floatType: SimpleType[MyPropertyDescriptor]

'builtIns' @ [276:25] ==> private final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[PropertyDescriptorImpl]

'longType' @ [276:34] ==> public final val KotlinBuiltIns.longType: SimpleType[MyPropertyDescriptor]

'builtIns' @ [277:24] ==> private final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[PropertyDescriptorImpl]

'intType' @ [277:33] ==> public final val KotlinBuiltIns.intType: SimpleType[MyPropertyDescriptor]

'builtIns' @ [278:25] ==> private final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[PropertyDescriptorImpl]

'byteType' @ [278:34] ==> public final val KotlinBuiltIns.byteType: SimpleType[MyPropertyDescriptor]

'builtIns' @ [279:26] ==> private final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[PropertyDescriptorImpl]

'shortType' @ [279:35] ==> public final val KotlinBuiltIns.shortType: SimpleType[MyPropertyDescriptor]

'when {
                TypeUtils.equalTypes(specific, _double) && TypeUtils.equalTypes(general, _float) -> return true
                TypeUtils.equalTypes(specific, _int) -> {
                    when {
                        TypeUtils.equalTypes(general, _long) -> return true
                        TypeUtils.equalTypes(general, _byte) -> return true
                        TypeUtils.equalTypes(general, _short) -> return true
                    }
                }
                TypeUtils.equalTypes(specific, _short) && TypeUtils.equalTypes(general, _byte) -> return true
            }' @ [281:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'equalTypes' @ [282:27] ==> public open fun equalTypes(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'specific' @ [282:38] ==> value-parameter specific: KotlinType defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.SpecificityComparisonWithNumerics.<no name provided>.isNonSubtypeNotLessSpecific[ValueParameterDescriptorImpl]

'_double' @ [282:48] ==> val _double: SimpleType defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.SpecificityComparisonWithNumerics.<no name provided>.isNonSubtypeNotLessSpecific[LocalVariableDescriptor]

'equalTypes' @ [282:70] ==> public open fun equalTypes(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'general' @ [282:81] ==> value-parameter general: KotlinType defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.SpecificityComparisonWithNumerics.<no name provided>.isNonSubtypeNotLessSpecific[ValueParameterDescriptorImpl]

'_float' @ [282:90] ==> val _float: SimpleType defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.SpecificityComparisonWithNumerics.<no name provided>.isNonSubtypeNotLessSpecific[LocalVariableDescriptor]

'equalTypes' @ [283:27] ==> public open fun equalTypes(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'specific' @ [283:38] ==> value-parameter specific: KotlinType defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.SpecificityComparisonWithNumerics.<no name provided>.isNonSubtypeNotLessSpecific[ValueParameterDescriptorImpl]

'_int' @ [283:48] ==> val _int: SimpleType defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.SpecificityComparisonWithNumerics.<no name provided>.isNonSubtypeNotLessSpecific[LocalVariableDescriptor]

'when {
                        TypeUtils.equalTypes(general, _long) -> return true
                        TypeUtils.equalTypes(general, _byte) -> return true
                        TypeUtils.equalTypes(general, _short) -> return true
                    }' @ [284:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'equalTypes' @ [285:35] ==> public open fun equalTypes(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'general' @ [285:46] ==> value-parameter general: KotlinType defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.SpecificityComparisonWithNumerics.<no name provided>.isNonSubtypeNotLessSpecific[ValueParameterDescriptorImpl]

'_long' @ [285:55] ==> val _long: SimpleType defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.SpecificityComparisonWithNumerics.<no name provided>.isNonSubtypeNotLessSpecific[LocalVariableDescriptor]

'equalTypes' @ [286:35] ==> public open fun equalTypes(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'general' @ [286:46] ==> value-parameter general: KotlinType defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.SpecificityComparisonWithNumerics.<no name provided>.isNonSubtypeNotLessSpecific[ValueParameterDescriptorImpl]

'_byte' @ [286:55] ==> val _byte: SimpleType defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.SpecificityComparisonWithNumerics.<no name provided>.isNonSubtypeNotLessSpecific[LocalVariableDescriptor]

'equalTypes' @ [287:35] ==> public open fun equalTypes(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'general' @ [287:46] ==> value-parameter general: KotlinType defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.SpecificityComparisonWithNumerics.<no name provided>.isNonSubtypeNotLessSpecific[ValueParameterDescriptorImpl]

'_short' @ [287:55] ==> val _short: SimpleType defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.SpecificityComparisonWithNumerics.<no name provided>.isNonSubtypeNotLessSpecific[LocalVariableDescriptor]

'equalTypes' @ [290:27] ==> public open fun equalTypes(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'specific' @ [290:38] ==> value-parameter specific: KotlinType defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.SpecificityComparisonWithNumerics.<no name provided>.isNonSubtypeNotLessSpecific[ValueParameterDescriptorImpl]

'_short' @ [290:48] ==> val _short: SimpleType defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.SpecificityComparisonWithNumerics.<no name provided>.isNonSubtypeNotLessSpecific[LocalVariableDescriptor]

'equalTypes' @ [290:69] ==> public open fun equalTypes(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'general' @ [290:80] ==> value-parameter general: KotlinType defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.SpecificityComparisonWithNumerics.<no name provided>.isNonSubtypeNotLessSpecific[ValueParameterDescriptorImpl]

'_byte' @ [290:89] ==> val _byte: SimpleType defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.SpecificityComparisonWithNumerics.<no name provided>.isNonSubtypeNotLessSpecific[LocalVariableDescriptor]

'call1' @ [301:27] ==> value-parameter call1: FlatSignature<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.isOfNotLessSpecificShape[ValueParameterDescriptorImpl]

'hasVarargs' @ [301:33] ==> public final val hasVarargs: Boolean defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature[PropertyDescriptorImpl]

'call2' @ [302:27] ==> value-parameter call2: FlatSignature<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.isOfNotLessSpecificShape[ValueParameterDescriptorImpl]

'hasVarargs' @ [302:33] ==> public final val hasVarargs: Boolean defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature[PropertyDescriptorImpl]

'hasVarargs1' @ [303:13] ==> val hasVarargs1: Boolean defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.isOfNotLessSpecificShape[LocalVariableDescriptor]

'!' @ [303:28] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasVarargs2' @ [303:29] ==> val hasVarargs2: Boolean defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.isOfNotLessSpecificShape[LocalVariableDescriptor]

'!' @ [304:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasVarargs1' @ [304:14] ==> val hasVarargs1: Boolean defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.isOfNotLessSpecificShape[LocalVariableDescriptor]

'hasVarargs2' @ [304:29] ==> val hasVarargs2: Boolean defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.isOfNotLessSpecificShape[LocalVariableDescriptor]

'call1' @ [306:13] ==> value-parameter call1: FlatSignature<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.isOfNotLessSpecificShape[ValueParameterDescriptorImpl]

'numDefaults' @ [306:19] ==> public final val numDefaults: Int defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature[PropertyDescriptorImpl]

'call2' @ [306:33] ==> value-parameter call2: FlatSignature<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.isOfNotLessSpecificShape[ValueParameterDescriptorImpl]

'numDefaults' @ [306:39] ==> public final val numDefaults: Int defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature[PropertyDescriptorImpl]

'isDebuggerContext' @ [318:13] ==> value-parameter isDebuggerContext: Boolean defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.isOfNotLessSpecificVisibilityForDebugger[ValueParameterDescriptorImpl]

'compare' @ [319:47] ==> @Nullable public open fun compare(@NotNull p0: Visibility, @NotNull p1: Visibility): Int? defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaMethodDescriptor]

'call1' @ [319:55] ==> value-parameter call1: FlatSignature<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.isOfNotLessSpecificVisibilityForDebugger[ValueParameterDescriptorImpl]

'descriptorVisibility' @ [319:61] ==> private final fun FlatSignature<C>.descriptorVisibility(): Visibility defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[SimpleFunctionDescriptorImpl]

'call2' @ [319:85] ==> value-parameter call2: FlatSignature<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.isOfNotLessSpecificVisibilityForDebugger[ValueParameterDescriptorImpl]

'descriptorVisibility' @ [319:91] ==> private final fun FlatSignature<C>.descriptorVisibility(): Visibility defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[SimpleFunctionDescriptorImpl]

'isMoreVisible1' @ [320:17] ==> val isMoreVisible1: Int? defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.isOfNotLessSpecificVisibilityForDebugger[LocalVariableDescriptor]

'isMoreVisible1' @ [320:43] ==> val isMoreVisible1: Int? defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.isOfNotLessSpecificVisibilityForDebugger[LocalVariableDescriptor]

'd1' @ [332:38] ==> value-parameter d1: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.tryCompareDescriptorsFromScripts[ValueParameterDescriptorImpl]

'containingDeclaration' @ [332:41] ==> public final val CallableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'd2' @ [333:38] ==> value-parameter d2: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.tryCompareDescriptorsFromScripts[ValueParameterDescriptorImpl]

'containingDeclaration' @ [333:41] ==> public final val CallableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'containingDeclaration1' @ [335:13] ==> val containingDeclaration1: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.tryCompareDescriptorsFromScripts[LocalVariableDescriptor]

'containingDeclaration2' @ [335:59] ==> val containingDeclaration2: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.tryCompareDescriptorsFromScripts[LocalVariableDescriptor]

'when {
                containingDeclaration1.priority > containingDeclaration2.priority -> return true
                containingDeclaration1.priority < containingDeclaration2.priority -> return false
            }' @ [336:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'containingDeclaration1' @ [337:17] ==> val containingDeclaration1: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.tryCompareDescriptorsFromScripts[LocalVariableDescriptor]

'priority' @ [337:40] ==> public final val ScriptDescriptor.priority: Int[MyPropertyDescriptor]

'containingDeclaration2' @ [337:51] ==> val containingDeclaration2: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.tryCompareDescriptorsFromScripts[LocalVariableDescriptor]

'priority' @ [337:74] ==> public final val ScriptDescriptor.priority: Int[MyPropertyDescriptor]

'containingDeclaration1' @ [338:17] ==> val containingDeclaration1: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.tryCompareDescriptorsFromScripts[LocalVariableDescriptor]

'priority' @ [338:40] ==> public final val ScriptDescriptor.priority: Int[MyPropertyDescriptor]

'containingDeclaration2' @ [338:51] ==> val containingDeclaration2: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.tryCompareDescriptorsFromScripts[LocalVariableDescriptor]

'priority' @ [338:74] ==> public final val ScriptDescriptor.priority: Int[MyPropertyDescriptor]

'f' @ [350:13] ==> value-parameter f: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.isNotLessSpecificCallableReferenceDescriptor[ValueParameterDescriptorImpl]

'valueParameters' @ [350:15] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [350:31] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'g' @ [350:39] ==> value-parameter g: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.isNotLessSpecificCallableReferenceDescriptor[ValueParameterDescriptorImpl]

'valueParameters' @ [350:41] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [350:57] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'f' @ [351:13] ==> value-parameter f: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.isNotLessSpecificCallableReferenceDescriptor[ValueParameterDescriptorImpl]

'varargParameterPosition' @ [351:15] ==> public fun CallableDescriptor.varargParameterPosition(): Int defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'g' @ [351:44] ==> value-parameter g: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.isNotLessSpecificCallableReferenceDescriptor[ValueParameterDescriptorImpl]

'varargParameterPosition' @ [351:46] ==> public fun CallableDescriptor.varargParameterPosition(): Int defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'FlatSignature' @ [353:26] ==> public companion object defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature[FakeCallableDescriptorForObject]

'createFromCallableDescriptor' @ [353:40] ==> public final fun <D : CallableDescriptor> createFromCallableDescriptor(descriptor: CallableDescriptor): FlatSignature<CallableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> CallableDescriptor

'f' @ [353:69] ==> value-parameter f: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.isNotLessSpecificCallableReferenceDescriptor[ValueParameterDescriptorImpl]

'FlatSignature' @ [354:26] ==> public companion object defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature[FakeCallableDescriptorForObject]

'createFromCallableDescriptor' @ [354:40] ==> public final fun <D : CallableDescriptor> createFromCallableDescriptor(descriptor: CallableDescriptor): FlatSignature<CallableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> CallableDescriptor

'g' @ [354:69] ==> value-parameter g: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.isNotLessSpecificCallableReferenceDescriptor[ValueParameterDescriptorImpl]

'invoke' @ [355:16] ==> public abstract operator fun invoke(): SimpleConstraintSystem defined in kotlin.Function0[FunctionInvokeDescriptor]

'isSignatureNotLessSpecific' @ [355:46] ==> public fun <T> SimpleConstraintSystem.isSignatureNotLessSpecific(specific: FlatSignature<CallableDescriptor>, general: FlatSignature<CallableDescriptor>, callbacks: SpecificityComparisonCallbacks, specificityComparator: TypeSpecificityComparator): Boolean defined in org.jetbrains.kotlin.resolve.calls.results[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> CallableDescriptor

'fSignature' @ [355:73] ==> val fSignature: FlatSignature<CallableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.isNotLessSpecificCallableReferenceDescriptor[LocalVariableDescriptor]

'gSignature' @ [355:85] ==> val gSignature: FlatSignature<CallableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.isNotLessSpecificCallableReferenceDescriptor[LocalVariableDescriptor]

'SpecificityComparisonWithNumerics' @ [355:97] ==> private final val SpecificityComparisonWithNumerics: <no name provided><C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[PropertyDescriptorImpl]

'specificityComparator' @ [355:132] ==> private final val specificityComparator: TypeSpecificityComparator defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[PropertyDescriptorImpl]

'tryCompareDescriptorsFromScripts' @ [360:13] ==> private final fun tryCompareDescriptorsFromScripts(d1: CallableDescriptor, d2: CallableDescriptor): Boolean? defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[SimpleFunctionDescriptorImpl]

'f' @ [360:46] ==> value-parameter f: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.isNotLessSpecificCallableReference[ValueParameterDescriptorImpl]

'g' @ [360:49] ==> value-parameter g: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.isNotLessSpecificCallableReference[ValueParameterDescriptorImpl]

'isNotLessSpecificCallableReferenceDescriptor' @ [361:13] ==> private final fun isNotLessSpecificCallableReferenceDescriptor(f: CallableDescriptor, g: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[SimpleFunctionDescriptorImpl]

'f' @ [361:58] ==> value-parameter f: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.isNotLessSpecificCallableReference[ValueParameterDescriptorImpl]

'g' @ [361:61] ==> value-parameter g: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.isNotLessSpecificCallableReference[ValueParameterDescriptorImpl]

'THashSet' @ [365:13] ==> public constructor THashSet<E : (Any..Any?)>(p0: Int, p1: (TObjectHashingStrategy<(C..C?)>..TObjectHashingStrategy<(C..C?)>?)) defined in gnu.trove.THashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> C

'candidates' @ [365:22] ==> value-parameter candidates: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.uniquifyCandidatesSet[ValueParameterDescriptorImpl]

'size' @ [365:33] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'resolvedCallHashingStrategy' @ [365:39] ==> private final val resolvedCallHashingStrategy: <no name provided><C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[PropertyDescriptorImpl]

'apply' @ [365:68] ==> @InlineOnly public inline fun <T> THashSet<C>.apply(block: THashSet<C>.() -> Unit): THashSet<C> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> THashSet<C>

'addAll' @ [365:76] ==> public open fun addAll(elements: Collection<(C..C?)>): Boolean defined in gnu.trove.THashSet[JavaMethodDescriptor]

'candidates' @ [365:83] ==> value-parameter candidates: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.uniquifyCandidatesSet[ValueParameterDescriptorImpl]

'THashSet' @ [368:13] ==> public constructor THashSet<E : (Any..Any?)>(p0: Int, p1: (TObjectHashingStrategy<(C..C?)>..TObjectHashingStrategy<(C..C?)>?)) defined in gnu.trove.THashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> C

'expectedSize' @ [368:22] ==> value-parameter expectedSize: Int defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver.newResolvedCallSet[ValueParameterDescriptorImpl]

'resolvedCallHashingStrategy' @ [368:36] ==> private final val resolvedCallHashingStrategy: <no name provided><C> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[PropertyDescriptorImpl]

'origin' @ [371:13] ==> public final val origin: C defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature[PropertyDescriptorImpl]

'resultingDescriptor' @ [371:20] ==> private final val C.resultingDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[PropertyDescriptorImpl]

'original' @ [371:40] ==> public final val CallableDescriptor.original: CallableDescriptor[MyPropertyDescriptor]

'candidateDescriptor' @ [374:13] ==> private final fun FlatSignature<C>.candidateDescriptor(): CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[SimpleFunctionDescriptorImpl]

'visibility' @ [374:35] ==> public final val CallableDescriptor.visibility: Visibility[MyPropertyDescriptor]

