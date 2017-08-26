'kotlin.jvm.JvmMultifileClass' @ [17:1] ==> public constructor JvmMultifileClass() defined in kotlin.jvm.JvmMultifileClass[ClassConstructorDescriptorImpl]

'kotlin.jvm.JvmName' @ [18:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[ClassConstructorDescriptorImpl]

'SinceKotlin' @ [31:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'Sequence' @ [32:99] ==> @InlineOnly public inline fun <T> Sequence(crossinline iterator: () -> Iterator<T>): Sequence<T> defined in kotlin.sequences[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'buildIterator' @ [32:110] ==> @SinceKotlin public fun <T> buildIterator(builderAction: suspend SequenceBuilder<T>.() -> Unit): Iterator<T> defined in kotlin.coroutines.experimental[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'builderAction' @ [32:124] ==> value-parameter builderAction: suspend SequenceBuilder<T>.() -> Unit defined in kotlin.coroutines.experimental.buildSequence[ValueParameterDescriptorImpl]

'SinceKotlin' @ [39:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'SequenceBuilderIterator' @ [41:20] ==> public constructor SequenceBuilderIterator<T>() defined in kotlin.coroutines.experimental.SequenceBuilderIterator[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T

'iterator' @ [42:5] ==> val iterator: SequenceBuilderIterator<T> defined in kotlin.coroutines.experimental.buildIterator[LocalVariableDescriptor]

'nextStep' @ [42:14] ==> public final var nextStep: Continuation<Unit>? defined in kotlin.coroutines.experimental.SequenceBuilderIterator[PropertyDescriptorImpl]

'builderAction' @ [42:25] ==> value-parameter builderAction: suspend SequenceBuilder<T>.() -> Unit defined in kotlin.coroutines.experimental.buildIterator[ValueParameterDescriptorImpl]

'createCoroutineUnchecked' @ [42:39] ==> @SinceKotlin public fun <R, T> (suspend SequenceBuilderIterator<T>.() -> Unit).createCoroutineUnchecked(receiver: SequenceBuilderIterator<T>, completion: Continuation<Unit>): Continuation<Unit> defined in kotlin.coroutines.experimental.intrinsics[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> SequenceBuilderIterator<T>
    <T> -> Unit

'iterator' @ [42:75] ==> val iterator: SequenceBuilderIterator<T> defined in kotlin.coroutines.experimental.buildIterator[LocalVariableDescriptor]

'iterator' @ [42:98] ==> val iterator: SequenceBuilderIterator<T> defined in kotlin.coroutines.experimental.buildIterator[LocalVariableDescriptor]

'iterator' @ [43:12] ==> val iterator: SequenceBuilderIterator<T> defined in kotlin.coroutines.experimental.buildIterator[LocalVariableDescriptor]

'RestrictsSuspension' @ [55:1] ==> public constructor RestrictsSuspension() defined in kotlin.coroutines.experimental.RestrictsSuspension[ClassConstructorDescriptorImpl]

'SinceKotlin' @ [56:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'elements' @ [81:13] ==> value-parameter elements: Iterable<T> defined in kotlin.coroutines.experimental.SequenceBuilder.yieldAll[ValueParameterDescriptorImpl]

'elements' @ [81:39] ==> value-parameter elements: Iterable<T> defined in kotlin.coroutines.experimental.SequenceBuilder.yieldAll[ValueParameterDescriptorImpl]

'isEmpty' @ [81:48] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[SimpleFunctionDescriptorImpl]

'yieldAll' @ [82:16] ==> public abstract suspend fun yieldAll(iterator: Iterator<T>): Unit defined in kotlin.coroutines.experimental.SequenceBuilder[SimpleFunctionDescriptorImpl]

'elements' @ [82:25] ==> value-parameter elements: Iterable<T> defined in kotlin.coroutines.experimental.SequenceBuilder.yieldAll[ValueParameterDescriptorImpl]

'iterator' @ [82:34] ==> public abstract operator fun iterator(): Iterator<T> defined in kotlin.collections.Iterable[SimpleFunctionDescriptorImpl]

'yieldAll' @ [92:58] ==> public abstract suspend fun yieldAll(iterator: Iterator<T>): Unit defined in kotlin.coroutines.experimental.SequenceBuilder[SimpleFunctionDescriptorImpl]

'sequence' @ [92:67] ==> value-parameter sequence: Sequence<T> defined in kotlin.coroutines.experimental.SequenceBuilder.yieldAll[ValueParameterDescriptorImpl]

'iterator' @ [92:76] ==> public abstract operator fun iterator(): Iterator<T> defined in kotlin.sequences.Sequence[SimpleFunctionDescriptorImpl]

'SequenceBuilder<T>' @ [103:44] ==> internal constructor SequenceBuilder<in T>() defined in kotlin.coroutines.experimental.SequenceBuilder[ClassConstructorDescriptorImpl]
Inferred types:
    <in T> -> T

'State_NotReady' @ [104:25] ==> private const val State_NotReady: State /* = Int */ defined in kotlin.coroutines.experimental in file SequenceBuilder.kt[PropertyDescriptorImpl]

'when (state) {
                State_NotReady -> {}
                State_ManyNotReady ->
                    if (nextIterator!!.hasNext()) {
                        state = State_ManyReady
                        return true
                    } else {
                        nextIterator = null
                    }
                State_Done -> return false
                State_Ready, State_ManyReady -> return true
                else -> throw exceptionalState()
            }' @ [111:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit, entry4: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'state' @ [111:19] ==> private final var state: State /* = Int */ defined in kotlin.coroutines.experimental.SequenceBuilderIterator[PropertyDescriptorImpl]

'State_NotReady' @ [112:17] ==> private const val State_NotReady: State /* = Int */ defined in kotlin.coroutines.experimental in file SequenceBuilder.kt[PropertyDescriptorImpl]

'State_ManyNotReady' @ [113:17] ==> private const val State_ManyNotReady: State /* = Int */ defined in kotlin.coroutines.experimental in file SequenceBuilder.kt[PropertyDescriptorImpl]

'if (nextIterator!!.hasNext()) {
                        state = State_ManyReady
                        return true
                    } else {
                        nextIterator = null
                    }' @ [114:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'nextIterator' @ [114:25] ==> private final var nextIterator: Iterator<T>? defined in kotlin.coroutines.experimental.SequenceBuilderIterator[PropertyDescriptorImpl]

'hasNext' @ [114:40] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[SimpleFunctionDescriptorImpl]

'state' @ [115:25] ==> private final var state: State /* = Int */ defined in kotlin.coroutines.experimental.SequenceBuilderIterator[PropertyDescriptorImpl]

'State_ManyReady' @ [115:33] ==> private const val State_ManyReady: State /* = Int */ defined in kotlin.coroutines.experimental in file SequenceBuilder.kt[PropertyDescriptorImpl]

'nextIterator' @ [118:25] ==> private final var nextIterator: Iterator<T>? defined in kotlin.coroutines.experimental.SequenceBuilderIterator[PropertyDescriptorImpl]

'State_Done' @ [120:17] ==> private const val State_Done: State /* = Int */ defined in kotlin.coroutines.experimental in file SequenceBuilder.kt[PropertyDescriptorImpl]

'State_Ready' @ [121:17] ==> private const val State_Ready: State /* = Int */ defined in kotlin.coroutines.experimental in file SequenceBuilder.kt[PropertyDescriptorImpl]

'State_ManyReady' @ [121:30] ==> private const val State_ManyReady: State /* = Int */ defined in kotlin.coroutines.experimental in file SequenceBuilder.kt[PropertyDescriptorImpl]

'exceptionalState' @ [122:31] ==> private final fun exceptionalState(): Throwable defined in kotlin.coroutines.experimental.SequenceBuilderIterator[SimpleFunctionDescriptorImpl]

'state' @ [125:13] ==> private final var state: State /* = Int */ defined in kotlin.coroutines.experimental.SequenceBuilderIterator[PropertyDescriptorImpl]

'State_Failed' @ [125:21] ==> private const val State_Failed: State /* = Int */ defined in kotlin.coroutines.experimental in file SequenceBuilder.kt[PropertyDescriptorImpl]

'nextStep' @ [126:24] ==> public final var nextStep: Continuation<Unit>? defined in kotlin.coroutines.experimental.SequenceBuilderIterator[PropertyDescriptorImpl]

'nextStep' @ [127:13] ==> public final var nextStep: Continuation<Unit>? defined in kotlin.coroutines.experimental.SequenceBuilderIterator[PropertyDescriptorImpl]

'step' @ [128:13] ==> val step: Continuation<Unit> defined in kotlin.coroutines.experimental.SequenceBuilderIterator.hasNext[LocalVariableDescriptor]

'resume' @ [128:18] ==> public abstract fun resume(value: Unit): Unit defined in kotlin.coroutines.experimental.Continuation[SimpleFunctionDescriptorImpl]

'Unit' @ [128:25] ==> public object Unit defined in kotlin in file Unit.kt[FakeCallableDescriptorForObject]

'when (state) {
            State_NotReady, State_ManyNotReady -> return nextNotReady()
            State_ManyReady -> {
                state = State_ManyNotReady
                return nextIterator!!.next()
            }
            State_Ready -> {
                state = State_NotReady
                @Suppress("UNCHECKED_CAST") 
                val result = nextValue as T
                nextValue = null
                return result
            }
            else -> throw exceptionalState()
        }' @ [133:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing, entry3: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'state' @ [133:15] ==> private final var state: State /* = Int */ defined in kotlin.coroutines.experimental.SequenceBuilderIterator[PropertyDescriptorImpl]

'State_NotReady' @ [134:13] ==> private const val State_NotReady: State /* = Int */ defined in kotlin.coroutines.experimental in file SequenceBuilder.kt[PropertyDescriptorImpl]

'State_ManyNotReady' @ [134:29] ==> private const val State_ManyNotReady: State /* = Int */ defined in kotlin.coroutines.experimental in file SequenceBuilder.kt[PropertyDescriptorImpl]

'nextNotReady' @ [134:58] ==> private final fun nextNotReady(): T defined in kotlin.coroutines.experimental.SequenceBuilderIterator[SimpleFunctionDescriptorImpl]

'State_ManyReady' @ [135:13] ==> private const val State_ManyReady: State /* = Int */ defined in kotlin.coroutines.experimental in file SequenceBuilder.kt[PropertyDescriptorImpl]

'state' @ [136:17] ==> private final var state: State /* = Int */ defined in kotlin.coroutines.experimental.SequenceBuilderIterator[PropertyDescriptorImpl]

'State_ManyNotReady' @ [136:25] ==> private const val State_ManyNotReady: State /* = Int */ defined in kotlin.coroutines.experimental in file SequenceBuilder.kt[PropertyDescriptorImpl]

'nextIterator' @ [137:24] ==> private final var nextIterator: Iterator<T>? defined in kotlin.coroutines.experimental.SequenceBuilderIterator[PropertyDescriptorImpl]

'next' @ [137:39] ==> public abstract operator fun next(): T defined in kotlin.collections.Iterator[SimpleFunctionDescriptorImpl]

'State_Ready' @ [139:13] ==> private const val State_Ready: State /* = Int */ defined in kotlin.coroutines.experimental in file SequenceBuilder.kt[PropertyDescriptorImpl]

'state' @ [140:17] ==> private final var state: State /* = Int */ defined in kotlin.coroutines.experimental.SequenceBuilderIterator[PropertyDescriptorImpl]

'State_NotReady' @ [140:25] ==> private const val State_NotReady: State /* = Int */ defined in kotlin.coroutines.experimental in file SequenceBuilder.kt[PropertyDescriptorImpl]

'Suppress' @ [141:17] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'nextValue' @ [142:30] ==> private final var nextValue: T? defined in kotlin.coroutines.experimental.SequenceBuilderIterator[PropertyDescriptorImpl]

'nextValue' @ [143:17] ==> private final var nextValue: T? defined in kotlin.coroutines.experimental.SequenceBuilderIterator[PropertyDescriptorImpl]

'result' @ [144:24] ==> val result: T defined in kotlin.coroutines.experimental.SequenceBuilderIterator.next[LocalVariableDescriptor]

'exceptionalState' @ [146:27] ==> private final fun exceptionalState(): Throwable defined in kotlin.coroutines.experimental.SequenceBuilderIterator[SimpleFunctionDescriptorImpl]

'if (!hasNext()) throw NoSuchElementException() else return next()' @ [151:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'!' @ [151:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasNext' @ [151:14] ==> public open fun hasNext(): Boolean defined in kotlin.coroutines.experimental.SequenceBuilderIterator[SimpleFunctionDescriptorImpl]

'NoSuchElementException' @ [151:31] ==> public constructor NoSuchElementException(message: String? = ...) defined in kotlin.NoSuchElementException[ClassConstructorDescriptorImpl]

'next' @ [151:68] ==> public open fun next(): T defined in kotlin.coroutines.experimental.SequenceBuilderIterator[SimpleFunctionDescriptorImpl]

'when (state) {
        State_Done -> NoSuchElementException()
        State_Failed -> IllegalStateException("Iterator has failed.")
        else -> IllegalStateException("Unexpected state of the iterator: $state")
    }' @ [154:49] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Throwable, entry1: Throwable, entry2: Throwable): Throwable[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Throwable

'state' @ [154:55] ==> private final var state: State /* = Int */ defined in kotlin.coroutines.experimental.SequenceBuilderIterator[PropertyDescriptorImpl]

'State_Done' @ [155:9] ==> private const val State_Done: State /* = Int */ defined in kotlin.coroutines.experimental in file SequenceBuilder.kt[PropertyDescriptorImpl]

'NoSuchElementException' @ [155:23] ==> public constructor NoSuchElementException(message: String? = ...) defined in kotlin.NoSuchElementException[ClassConstructorDescriptorImpl]

'State_Failed' @ [156:9] ==> private const val State_Failed: State /* = Int */ defined in kotlin.coroutines.experimental in file SequenceBuilder.kt[PropertyDescriptorImpl]

'IllegalStateException' @ [156:25] ==> public constructor IllegalStateException(message: String? = ...) defined in kotlin.IllegalStateException[ClassConstructorDescriptorImpl]

'IllegalStateException' @ [157:17] ==> public constructor IllegalStateException(message: String? = ...) defined in kotlin.IllegalStateException[ClassConstructorDescriptorImpl]

'state' @ [157:75] ==> private final var state: State /* = Int */ defined in kotlin.coroutines.experimental.SequenceBuilderIterator[PropertyDescriptorImpl]

'nextValue' @ [162:9] ==> private final var nextValue: T? defined in kotlin.coroutines.experimental.SequenceBuilderIterator[PropertyDescriptorImpl]

'value' @ [162:21] ==> value-parameter value: T defined in kotlin.coroutines.experimental.SequenceBuilderIterator.yield[ValueParameterDescriptorImpl]

'state' @ [163:9] ==> private final var state: State /* = Int */ defined in kotlin.coroutines.experimental.SequenceBuilderIterator[PropertyDescriptorImpl]

'State_Ready' @ [163:17] ==> private const val State_Ready: State /* = Int */ defined in kotlin.coroutines.experimental in file SequenceBuilder.kt[PropertyDescriptorImpl]

'suspendCoroutineOrReturn' @ [164:16] ==> @SinceKotlin @InlineOnly @Suppress public inline suspend fun <T> suspendCoroutineOrReturn(crossinline block: (Continuation<Unit>) -> Any?): Unit defined in kotlin.coroutines.experimental.intrinsics[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Unit

'nextStep' @ [165:13] ==> public final var nextStep: Continuation<Unit>? defined in kotlin.coroutines.experimental.SequenceBuilderIterator[PropertyDescriptorImpl]

'c' @ [165:24] ==> value-parameter c: Continuation<Unit> defined in kotlin.coroutines.experimental.SequenceBuilderIterator.yield.<anonymous>[ValueParameterDescriptorImpl]

'COROUTINE_SUSPENDED' @ [166:13] ==> @SinceKotlin public val COROUTINE_SUSPENDED: Any defined in kotlin.coroutines.experimental.intrinsics in file Intrinsics.kt[PropertyDescriptorImpl]

'!' @ [171:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'iterator' @ [171:14] ==> value-parameter iterator: Iterator<T> defined in kotlin.coroutines.experimental.SequenceBuilderIterator.yieldAll[ValueParameterDescriptorImpl]

'hasNext' @ [171:23] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[SimpleFunctionDescriptorImpl]

'nextIterator' @ [172:9] ==> private final var nextIterator: Iterator<T>? defined in kotlin.coroutines.experimental.SequenceBuilderIterator[PropertyDescriptorImpl]

'iterator' @ [172:24] ==> value-parameter iterator: Iterator<T> defined in kotlin.coroutines.experimental.SequenceBuilderIterator.yieldAll[ValueParameterDescriptorImpl]

'state' @ [173:9] ==> private final var state: State /* = Int */ defined in kotlin.coroutines.experimental.SequenceBuilderIterator[PropertyDescriptorImpl]

'State_ManyReady' @ [173:17] ==> private const val State_ManyReady: State /* = Int */ defined in kotlin.coroutines.experimental in file SequenceBuilder.kt[PropertyDescriptorImpl]

'suspendCoroutineOrReturn' @ [174:16] ==> @SinceKotlin @InlineOnly @Suppress public inline suspend fun <T> suspendCoroutineOrReturn(crossinline block: (Continuation<Unit>) -> Any?): Unit defined in kotlin.coroutines.experimental.intrinsics[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Unit

'nextStep' @ [175:13] ==> public final var nextStep: Continuation<Unit>? defined in kotlin.coroutines.experimental.SequenceBuilderIterator[PropertyDescriptorImpl]

'c' @ [175:24] ==> value-parameter c: Continuation<Unit> defined in kotlin.coroutines.experimental.SequenceBuilderIterator.yieldAll.<anonymous>[ValueParameterDescriptorImpl]

'COROUTINE_SUSPENDED' @ [176:13] ==> @SinceKotlin public val COROUTINE_SUSPENDED: Any defined in kotlin.coroutines.experimental.intrinsics in file Intrinsics.kt[PropertyDescriptorImpl]

'state' @ [182:9] ==> private final var state: State /* = Int */ defined in kotlin.coroutines.experimental.SequenceBuilderIterator[PropertyDescriptorImpl]

'State_Done' @ [182:17] ==> private const val State_Done: State /* = Int */ defined in kotlin.coroutines.experimental in file SequenceBuilder.kt[PropertyDescriptorImpl]

'exception' @ [186:15] ==> value-parameter exception: Throwable defined in kotlin.coroutines.experimental.SequenceBuilderIterator.resumeWithException[ValueParameterDescriptorImpl]

'EmptyCoroutineContext' @ [190:17] ==> @SinceKotlin public object EmptyCoroutineContext : CoroutineContext defined in kotlin.coroutines.experimental in file CoroutineContextImpl.kt[FakeCallableDescriptorForObject]

